package org.dmd.gpb.tools.parsing;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.StringTokenizer;

import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.server.extended.GpbElement;
import org.dmd.gpb.server.extended.GpbEnum;
import org.dmd.gpb.server.extended.GpbField;
import org.dmd.gpb.server.extended.GpbMessage;
import org.dmd.gpb.server.extended.GpbProtoFile;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class ProtoFileParser {
	
	static String PACKAGE 	= "package";
	static String MESSAGE 	= "message";
	static String ENUM 		= "enum";
	static String LCURLY 	= "{";
	static String RCURLY 	= "}";
	
	GpbProtoFile	protoFile;
	
	State			state;
	
	public ProtoFileParser(){
		
	}
	
	void init(String fn) throws DmcValueException {
		protoFile	= new GpbProtoFile();
		protoFile.setFile(fn);
		state		= State.PACKAGE;
	}

	public GpbProtoFile parseFromProto(String fn) throws IOException, DmcValueException, ResultException {
		init(fn);
        LineNumberReader	in	= new LineNumberReader(new FileReader(fn));
		
        String str;
        while ((str = in.readLine()) != null) {
        	String line = str.trim();
        	
        	DebugInfo.debug(line);
        	
    		if (line.length() == 0)
    			continue;

    		switch(state){
        	case ELEMENT:
        		if (line.startsWith(MESSAGE)){
        			protoFile.addMainElements(parseMessage(in, fn, line));
        		}
        		else if (line.startsWith(ENUM)){
        			protoFile.addMainElements(parseEnum(in, fn, line));
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
        		if (line.startsWith(PACKAGE)){
        			protoFile.setPackage(getPackage(fn,in.getLineNumber(),line));
        			state = State.ELEMENT;
        		}
        		break;
        	}
        }
        
        return(protoFile);
	}
	
	GpbMessage parseMessage(LineNumberReader in, String fn, String first) throws ResultException, DmcValueException, IOException {
		GpbMessage message = new GpbMessage();
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
        String str;
        while ((str = in.readLine()) != null) {
        	String line = str.trim();
        	
        	if (wantLCurly){
        		if (!line.equals(LCURLY)){
        			ResultException ex = new ResultException("Missing open curly bracket for message definition.");
            		throw(ex);
        		}
        		wantLCurly = false;
        		continue;
        	}
        	if (line.equals(RCURLY))
        		break;
        	message.addElements(parseElement(in,fn,line));
        }        
		
		return(message);
	}
	
	GpbElement parseElement(LineNumberReader in, String fn, String line) throws ResultException, DmcValueException, IOException {
		GpbElement rc = null;
		
		if (line.startsWith("required"))
			rc = parseField(fn, line);
		else if (line.startsWith("optional"))
			rc = parseField(fn, line);
		else if (line.startsWith("repeated"))
			rc = parseField(fn, line);
		else if (line.startsWith("message"))
			rc = parseMessage(in, fn, line);
		else if (line.startsWith("enum"))
			rc = parseEnum(in, fn, line);
		
		return(rc);
	}
	
	GpbField parseField(String fn, String line){
		GpbField field = new GpbField();
		
		return(field);
	}

	GpbEnum parseEnum(LineNumberReader in, String fn, String first){
		GpbEnum enumDef = new GpbEnum();
		
		
		return(enumDef);
	}

	String getPackage(String fn, int ln, String line) throws ResultException{
		int semipos = line.indexOf(";");
		if (semipos == -1){
			ResultException ex = new ResultException("Missing ; in package statement.");
			throw(ex);
		}
			
		return(line.substring(8, semipos).trim());
	}
}

enum State {
	PACKAGE,
	ELEMENT,
	FIELD
}
