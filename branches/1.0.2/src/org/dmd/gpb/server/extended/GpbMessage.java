package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbFieldIndicatorIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbMessageDMW;
import org.dmd.gpb.server.util.VersionChecker;
import org.dmd.gpb.shared.generated.dmo.GpbMessageDMO;
import org.dmd.gpb.shared.types.GpbFieldIndicator;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class GpbMessage extends GpbMessageDMW {
	
	public GpbMessage(){
		super();
	}
	
	public GpbMessage(GpbMessageDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}

	public String toDotGPBFormat() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String toDotProtoFormat(String indent, String genversion, String renameobsolete) {
		if (!shouldBeIncluded(genversion))
			return("");
		
		StringBuffer sb = new StringBuffer();
		
		int fieldWidth	= getMaxFieldNameLength(renameobsolete);
		int typeWidth	= getMaxFieldTypeLength();
		String hint = "";
		
		if (getHint() != null)
			hint = "\n//\n// " + getHint() + "\n//\n";
		
		sb.append(indent + "// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		
		sb.append(hint);
		
		if (getGenerateAs() == null)
			sb.append(indent + "message " + getName() + "\n");
		else
			sb.append(indent + "message " + getGenerateAs() + "\n");
		
		sb.append(indent + "{\n");
		
		if (getEmbedHasValue()){
			GpbCompositeTypeIterableDMW it = getEmbedIterable();
			while(it.hasNext()){
				GpbCompositeType ct = it.next();
				sb.append(ct.toDotProtoFormat(indent + "    ", genversion, renameobsolete));
			}
		}
		
		if (getFieldHasValue()){
			GpbFieldIndicatorIterableDMW it = getFieldIterable();
			while(it.hasNext()){
				GpbFieldIndicator fi = it.next();

				if(VersionChecker.shouldBeIncluded(genversion, fi.getVersion(), fi.getSkip())){
					sb.append(formatField(indent, fi, fieldWidth, typeWidth, renameobsolete));
				}
			}
		}
		
		sb.append("}\n\n");
		return(sb.toString());
	}
	
	public int getMaxFieldNameLength(String renameobsolete){
		int rc = 0;
		int suffix = 0;
		
		if (renameobsolete != null){
			suffix = renameobsolete.length();
		}
		
		if (getFieldHasValue()){
			GpbFieldIndicatorIterableDMW it = getFieldIterable();
			while(it.hasNext()){
				GpbFieldIndicator fi = it.next();
				
				int length = fi.getFieldRef().getName().getNameString().length();
				
				if (fi.getObsolete() != null)
					length = length + suffix;
				
				if (length > rc)
					rc = length;
			}
		}
		
		return(rc);
	}
	
	public int getMaxFieldTypeLength(){
		int rc = 0;
		
		if (getFieldHasValue()){
			GpbFieldIndicatorIterableDMW it = getFieldIterable();
			while(it.hasNext()){
				GpbFieldIndicator fi = it.next();
				
				if (fi.getFieldRef().getObject().getGpbType().getName().getNameString().length() > rc)
					rc = fi.getFieldRef().getObject().getGpbType().getName().getNameString().length();
			}
		}
		
		return(rc);
	}
	
	String formatField(String indent, GpbFieldIndicator fi, int fw, int tw, String renameobsolete){
		String hint = "";
		String suffix = "";
		
		if (fi.getFieldRef().getObject().getHint() != null){
			hint = " // " + fi.getFieldRef().getObject().getHint();
		}
		
		// The hint can be overridden in the field indicator
		if (fi.getHint() != null)
			hint = " // " + fi.getHint();
		
		if (renameobsolete != null){
			if (fi.getObsolete() != null)
				suffix = renameobsolete;
		}
			
		StringBuffer sb = new StringBuffer();
		PrintfFormat ruleFormat = new PrintfFormat("%-9s");
		PrintfFormat nameFormat = new PrintfFormat("%-" + fw + "s");
		PrintfFormat typeFormat = new PrintfFormat("%-" + tw + "s");
		
		
		sb.append(indent);
		sb.append("    ");
		switch(fi.getFieldRule()){
		case OPTIONAL:
			sb.append(ruleFormat.sprintf("optional"));
			break;
		case REPEATED:
			sb.append(ruleFormat.sprintf("repeated"));
			break;
		case REQUIRED:
			sb.append(ruleFormat.sprintf("required"));
			break;
		}
		
		sb.append(typeFormat.sprintf(fi.getFieldRef().getObject().getGpbType().getName()) + " ");
		
		if (fi.getFieldRef().getObject().getGenerateAs() == null)
			sb.append(nameFormat.sprintf(fi.getFieldRef().getObjectName() + suffix) + " ");
		else
			sb.append(nameFormat.sprintf(fi.getFieldRef().getObject().getGenerateAs() + suffix) + " ");
		
		sb.append("= " + fi.getFieldTag() + ";");
		
		sb.append(hint);
		
		sb.append("\n");
		
		return(sb.toString());
	}

}
