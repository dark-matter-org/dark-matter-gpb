package org.dmd.gpb.tools.protoparsing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.types.EnumValue;
import org.dmd.gpb.tools.protoparsing.extended.ProtoElement;
import org.dmd.gpb.tools.protoparsing.extended.ProtoEnum;
import org.dmd.gpb.tools.protoparsing.extended.ProtoField;
import org.dmd.gpb.tools.protoparsing.extended.ProtoFile;
import org.dmd.gpb.tools.protoparsing.extended.ProtoMessage;
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFieldDMO;
import org.dmd.gpb.tools.protoparsing.generated.enums.ProtoFieldRuleEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.Classifier;
import org.dmd.util.parsing.Token;
import org.dmd.util.parsing.TokenArrayList;

/**
 * The ProtoFileParser is used to parse individual .proto files and represent its
 * contents as a a single ProtoFile object. This object can be subsequently dumped 
 * as a .gpb file that allows for the addition of descriptions and other sementic 
 * information.
 * <p/>
 * The ProtoFileParse is very light on format checking; it assumes that the files are
 * already parsable by the standard GPB parser.
 * <p/>
 * The only additional level of checking that's done it to ensure that fields with the
 * same names in different messages have the same type. This is because we will generate
 * a single GpbField definition for each uniquely named field. If the types don't
 * match, it indicates a fundamental semantic anomaly.
 */
public class ProtoFileParser {
	
	static String PACKAGE_STR 	= "package";
	static String MESSAGE_STR 	= "message";
	static String ENUM_STR 		= "enum";
	static String LCURLY_STR 	= "{";
	static String RCURLY_STR 	= "}";
	static String OPTIONAL_STR 	= "optional";
	static String REQUIRED_STR 	= "required";
	static String REPEATED_STR 	= "repeated";
	static String IMPORT_STR 	= "import";
	
	final static int ENUM 		= Token.CUSTOM+1;
	final static int MESSAGE 	= Token.CUSTOM+2;
	final static int OPTIONAL 	= Token.CUSTOM+3;
	final static int REQUIRED 	= Token.CUSTOM+4;
	final static int REPEATED 	= Token.CUSTOM+5;
	final static int EQUALS 	= Token.CUSTOM+6;
	final static int SEMICOLON 	= Token.CUSTOM+7;
	final static int LCURLY 	= Token.CUSTOM+8;
	final static int RCURLY 	= Token.CUSTOM+9;
	final static int QUOTE 		= Token.CUSTOM+10;
	
	LineNumberReader	in;
	String				currFN;
	
	ProtoFile	protoFile;
	
	State			state;
	
	Classifier		classifier;
	
	// Key: field name
	// Value: the collection of all fields with the same name
	// We maintain this so that we can warning of fields with the same name but different types.
	TreeMap<String,ArrayList<ProtoField>> fields;
	
	// Key: enum name
	// Value: the collection of all enums with the same name
	// We maintain this so that we can warn of clashing enum names
	TreeMap<String, ArrayList<ProtoEnum>> enums;
	
	public ProtoFileParser(){
		classifier = new Classifier();
		
		classifier.addKeyword(ENUM_STR, ENUM);
		classifier.addKeyword(MESSAGE_STR, MESSAGE);
		classifier.addKeyword(OPTIONAL_STR, OPTIONAL);
		classifier.addKeyword(REPEATED_STR, REPEATED);
		classifier.addKeyword(REQUIRED_STR, REQUIRED);
		
		classifier.addSeparator("=", EQUALS);
		classifier.addSeparator(";", SEMICOLON);
		classifier.addSeparator("{", LCURLY);
		classifier.addSeparator("}", RCURLY);
		classifier.addSeparator("\"", QUOTE);
		
		fields = new TreeMap<String, ArrayList<ProtoField>>();
		
		enums = new TreeMap<String, ArrayList<ProtoEnum>>();
	}
	
	void init(String fn) throws DmcValueException {
		protoFile	= new ProtoFile();
		protoFile.setFile(fn);
		
		int lastSlash = fn.lastIndexOf(File.separatorChar);
		int lastDot = fn.lastIndexOf(".");
		protoFile.setName(fn.substring(lastSlash+1, lastDot));
		
		state		= State.PACKAGE;
	}

	public ProtoFile parseFromProto(String fn) throws IOException, DmcValueException, ResultException {
		init(fn);
        in	= new LineNumberReader(new FileReader(fn));
        currFN = fn;
		
        String line;
        while ((line = getNextLine()) != null) {
    		if (line.length() == 0)
    			continue;
    		if (line.startsWith("//"))
    			continue;

    		switch(state){
        	case ELEMENT:
        		if (line.startsWith(MESSAGE_STR)){
        			protoFile.addMainElements(parseMessage(fn, line));
        		}
        		else if (line.startsWith(ENUM_STR)){
        			protoFile.addMainElements(parseEnum(fn, line));
        		}
        		else if (line.startsWith(IMPORT_STR)){
        			protoFile.addImport(parseImport(line));
        		}
        		else{
        			ResultException ex = new ResultException("Expecting the start of a message or enum");
        			ex.setLocationInfo(fn, in.getLineNumber());
        			throw(ex);
        		}
        		break;
        	case FIELD:
        		break;
        	case PACKAGE:
        		if (line.startsWith("//"))
        			continue;
        		if (line.startsWith(PACKAGE_STR)){
        			protoFile.setPackage(getPackage(fn,in.getLineNumber(),line));
        			state = State.ELEMENT;
        		}
        		break;
        	}
        }
        
        in.close();
        
//        checkFields();
        
        return(protoFile);
	}
	
	/**
	 * We check to see if we have fields with the same name but different types. Ideally,
	 * fields with the same name will lead back to a common GpbField with common semantics.
	 * If fields with clashing types are found in the same file, we generate a warning. If
	 * the fields are in different files, we generate a warning.
	 * @throws DmcValueException 
	 */
	void checkFields() throws DmcValueException{
		for(ArrayList<ProtoField> list: fields.values()){
			
			if (list.size() == 1)
				continue;
			
			// We have to use the DMO because we haven't resolved the GpbTypes
			ProtoFieldDMO first = list.get(0).getDMO();
			
			boolean anyClash = false;
			
			for(int i=1; i<list.size(); i++){
				ProtoFieldDMO current = list.get(i).getDMO();
				if (!first.getGpbType().equals(current.getGpbType())){
					anyClash = true;
					if (first.getFile().equals(current.getFile())){
						// We have a type clash
						System.err.println("ERROR: Clashing type for field with name: " + first.getName());
						System.err.println("                                          " + first.getGpbType() + " " + first.getFile() + " : " + first.getLineNumber());
						System.err.println("                                          " + current.getGpbType() + " " + current.getFile() + " : " + current.getLineNumber());
						
					}
					else{
						// We have a type clash
						System.err.println("WARNING: Clashing type for field with name: " + first.getName());
						System.err.println("                                            " + first.getGpbType() + " " + first.getFile() + " : " + first.getLineNumber());
						System.err.println("                                            " + current.getGpbType() + " " + current.getFile() + " : " + current.getLineNumber());
						
					}
				}
			}
			
			if (anyClash){
				int instanceSuffix = 1;
				
				String originalName = first.getName().getNameString();
				
				if (first.getGenerateAs() != null)
					originalName = first.getGenerateAs();
				
				for(int i=0; i<list.size(); i++){
					ProtoFieldDMO current = list.get(i).getDMO();
					if (current.getGenerateAs() == null){
						// Only rename if we haven't already done so
						current.setName(originalName + instanceSuffix);
						instanceSuffix++;
						current.setGenerateAs(originalName);
					}
				}				
			}
			
			System.out.println("FIELD: " + list.size() + "  - " + first.getName());
		}
	}
	
	String parseImport(String line){
		TokenArrayList tokens = classifier.classify(line, false);
		return(tokens.nth(1).getValue());
	}
	
	String getNextLine() throws IOException {
		String str = in.readLine();
DebugInfo.debug(currFN + "  " + in.getLineNumber() + "    " + str);
		if (str == null)
			return(null);
		return(str.trim());
	}
	
	ProtoMessage parseMessage(String fn, String first) throws ResultException, DmcValueException, IOException {
		ProtoMessage message = new ProtoMessage();
        StringTokenizer t = new StringTokenizer(first);
        boolean wantLCurly = true;
        
        if (t.countTokens() == 1){
			ResultException ex = new ResultException("Malformed message specification: " + first);
			ex.setLocationInfo(fn, in.getLineNumber());
			throw(ex);
        }
        else if (t.countTokens() == 2){
        	t.nextToken();	// skip the message
        	message.setName(t.nextToken());
        }
        else if (t.countTokens() == 3){
        	if (!first.endsWith("{")){
    			ResultException ex = new ResultException("Malformed message specification: " + first);
        		throw(ex);
        	}
        	t.nextToken();	// skip the message
        	message.setName(t.nextToken());
        	wantLCurly = false;
        }
        else{
			ResultException ex = new ResultException("Too many tokens on a message start line: " + first);
			ex.setLocationInfo(fn, in.getLineNumber());
			throw(ex);
        }
        
        // Parse the body
        String line;
        while ((line = getNextLine()) != null) {
        	if (line.length() == 0)
        		continue;
        	if (line.startsWith("//"))
        		continue;
        	
        	if (wantLCurly){
        		if (!line.equals(LCURLY_STR)){
        			ResultException ex = new ResultException("Missing open curly bracket for message definition.");
            		throw(ex);
        		}
        		wantLCurly = false;
        		continue;
        	}
        	if (line.equals(RCURLY_STR))
        		break;
        	message.addElements(parseElement(in,fn,line));
        }        
		
		return(message);
	}
	
	ProtoElement parseElement(LineNumberReader in, String fn, String line) throws ResultException, DmcValueException, IOException {
		ProtoElement rc = null;
		
		if (line.startsWith("required"))
			rc = parseField(fn, line);
		else if (line.startsWith("optional"))
			rc = parseField(fn, line);
		else if (line.startsWith("repeated"))
			rc = parseField(fn, line);
		else if (line.startsWith("message"))
			rc = parseMessage(fn, line);
		else if (line.startsWith("enum"))
			rc = parseEnum(fn, line);
		
		return(rc);
	}
	
	ProtoField parseField(String fn, String line) throws DmcValueException {
		ProtoField field = new ProtoField();
		field.setFile(fn);
		field.setLineNumber(in.getLineNumber());
		
		String descr = "";
		
		if (line.contains("//")){
			int commentpos = line.indexOf("//");
			descr = line.substring(commentpos+2).trim();
			line = line.substring(0, commentpos);
		}
		
		TokenArrayList tokens = classifier.classify(line, true);
		
		if (tokens.size() == 6){
			switch(tokens.nth(0).getType()){
			case OPTIONAL:
				field.setFieldRule(ProtoFieldRuleEnum.OPTIONAL);
				break;
			case REQUIRED:
				field.setFieldRule(ProtoFieldRuleEnum.REQUIRED);
				break;
			case REPEATED:
				field.setFieldRule(ProtoFieldRuleEnum.REPEATED);
				break;
			}

			field.setGpbType(tokens.nth(1).getValue());
			
			field.setName(tokens.nth(2).getValue());
			
			field.setTag(tokens.nth(4).getValue());
			
			if (descr.length() > 0)
				field.addDescription(descr);
			
			DebugInfo.debug("\n" + field.toOIF());
		}
	
		addField(field);
		
		// Fields will be split out as separate definitions in the generated .gpb file
		protoFile.addFields(field);
		
		return(field);
	}
	
	void addField(ProtoField field){
		ArrayList<ProtoField> list = fields.get(field.getName().getNameString());
		
		if (list == null){
			list = new ArrayList<ProtoField>();
			fields.put(field.getName().getNameString(), list);
		}
		list.add(field);
	}

	ProtoEnum parseEnum(String fn, String first) throws DmcValueException, IOException {
		ProtoEnum enumDef = new ProtoEnum();
		enumDef.addDescription("Add a description");
		String line;
		TokenArrayList tokens = classifier.classify(first, true);
		
		enumDef.setName(tokens.nth(1).getValue());
		
		// If only two tokens, the next line should have the opening curly
		if (tokens.size() == 2){
			line = getNextLine();
		}
		
		while((line = getNextLine()) != null){
			tokens = classifier.classify(line, true);
			
			if (tokens.size() >= 4){
				EnumValue ev = new EnumValue();
				String descr = "Add a description";
				if (line.contains("//")){
					int commentpos = line.indexOf("//");
					descr = line.substring(commentpos+2).trim();
				}
				ev.set(tokens.nth(2).getValue() + " " + tokens.nth(0).getValue() + " " + descr);
				enumDef.addEnumValue(ev);
			}
			
			if (line.contains("}"))
				break;
		}
		
		DebugInfo.debug(enumDef.toOIF());
		
		DebugInfo.debug(enumDef.toDotProtoFormat());
		
		return(enumDef);
	}

	void addEnum(ProtoEnum penum){
		ArrayList<ProtoEnum> list = enums.get(penum.getName().getNameString());
		
		if (list == null){
			list = new ArrayList<ProtoEnum>();
			enums.put(penum.getName().getNameString(), list);
		}
		list.add(penum);
	}

	String getPackage(String fn, int ln, String line) throws ResultException{
		int semipos = line.indexOf(";");
		if (semipos == -1){
			ResultException ex = new ResultException("Missing ; in package statement.");
			throw(ex);
		}
			
		return(line.substring(8, semipos).trim());
	}
	
	enum State {
		PACKAGE,
		ELEMENT,
		FIELD
	}

//	class FieldInfo {
//		int instanceSuffix;
//		ArrayList<ProtoField> fields;
//		
//		FieldInfo(){
//			instanceSuffix = 1;
//			fields = new ArrayList<ProtoField>();
//		}
//		
//		void addField(ProtoField f){
//			if (fields.size() == 1){
//				
//			}
//		}
//	}

}

