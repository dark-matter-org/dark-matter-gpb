package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbFieldIndicatorIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbMessageDMW;
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
	public String toDotProtoFormat(String indent) {
		StringBuffer sb = new StringBuffer();
		
		int fieldWidth	= getMaxFieldNameLength();
		int typeWidth	= getMaxFieldTypeLength();
		
		sb.append(indent + "// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		
		if (getGenerateAs() == null)
			sb.append(indent + "message " + getName() + "\n");
		else
			sb.append(indent + "message " + getGenerateAs() + "\n");
		
		sb.append(indent + "{\n");
		
		if (getEmbedHasValue()){
			GpbCompositeTypeIterableDMW it = getEmbedIterable();
			while(it.hasNext()){
				GpbCompositeType ct = it.next();
				sb.append(ct.toDotProtoFormat(indent + "    "));
			}
		}
		
		if (getFieldHasValue()){
			GpbFieldIndicatorIterableDMW it = getFieldIterable();
			while(it.hasNext()){
				GpbFieldIndicator fi = it.next();
				sb.append(formatField(indent, fi, fieldWidth, typeWidth));
			}
		}
		
		sb.append("}\n\n");
		return(sb.toString());
	}
	
	public int getMaxFieldNameLength(){
		int rc = 0;
		
		if (getFieldHasValue()){
			GpbFieldIndicatorIterableDMW it = getFieldIterable();
			while(it.hasNext()){
				GpbFieldIndicator fi = it.next();
				
				if (fi.getFieldRef().getName().getNameString().length() > rc)
					rc = fi.getFieldRef().getName().getNameString().length();
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
	
	String formatField(String indent, GpbFieldIndicator fi, int fw, int tw){
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
			sb.append(nameFormat.sprintf(fi.getFieldRef().getObjectName()) + " ");
		else
			sb.append(nameFormat.sprintf(fi.getFieldRef().getObject().getGenerateAs()) + " ");
		
		sb.append("= " + fi.getFieldTag() + ";\n");
		
		return(sb.toString());
	}

//	@Override
//	public void createTypeIfRequired(GpbModuleDefinitionManager definitions) throws DmcValueException {
//		DebugInfo.debug(this.toOIF());
//
//		DotName dotname = new DotName(getDefinedInGpbModule().getName() + "." + getName() + "." + DmdgpbDMSAG.__GpbType.name);
//		GpbType type = definitions.getGpbType(dotname);
//		
//		if (type == null){
//			DotName nameAndTypeName = new DotName(getName() + "." + DmdgpbDMSAG.__GpbType.name);
//			type = new GpbType();
//			type.setName(getName());
//			type.setDotName(dotname);
//			type.setNameAndTypeName(nameAndTypeName);
//			type.setDefinedInGpbModule(getDefinedInGpbModule());
//			type.setInternallyGenerated(true);
//			type.setBasedOnMainElement(this);
//			
//			definitions.addGpbType(type);
//			getDefinedInGpbModule().addGpbType(type);
//			
//			DebugInfo.debug("ADDED TYPE \n\n" + type.toOIF());
//		}
//		
//
//	}

}
