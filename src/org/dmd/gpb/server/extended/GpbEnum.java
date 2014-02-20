package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbEnumDMW;
import org.dmd.gpb.server.generated.dmw.GpbEnumValueIterableDMW;
import org.dmd.gpb.shared.generated.dmo.GpbEnumDMO;
import org.dmd.gpb.shared.generated.types.GpbEnumValue;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class GpbEnum extends GpbEnumDMW {
	
	public GpbEnum(){
		super();
	}
	
	public GpbEnum(GpbEnumDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}

	/**
	 * @return the enumeration formatted in .proto format.
	 */
	public String toDotProtoFormat(String indent, String genversion){
		if (!shouldBeIncluded(genversion))
			return("");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(indent + "// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		
		if (getGenerateAs() == null)
			sb.append(indent + "enum " + this.getName() + "\n");
		else
			sb.append(indent + "enum " + this.getGenerateAs() + "\n");
		
		sb.append(indent + "{\n");
		
		int longestName = getLongestValueNameLength();
		int npadding = longestName + 4;
		PrintfFormat 	nformat 	= new PrintfFormat("%-" + npadding + "s");

		GpbEnumValueIterableDMW values = this.getGpbEnumValueIterable();
		while(values.hasNext()){
			GpbEnumValue value = values.getNext();
			
			if (shouldBeIncluded(genversion, value.getVersion(), value.getSkip())){
				sb.append(indent + "    " + nformat.sprintf(value.getName()) + " = " + value.getValue() + ";");
				if (value.getDescription() != null)
					sb.append(" // " + value.getDescription());
				sb.append("\n");
			}
		}
		
		sb.append(indent + "}\n\n");
		
		return(sb.toString());
	}
	
	public int getLongestValueNameLength(){
		int longestName = 0;
		// Determine the longest value name
		GpbEnumValueIterableDMW values = this.getGpbEnumValueIterable();
		while(values.hasNext()){
			GpbEnumValue value = values.getNext();
			if (value.getName().length() > longestName)
				longestName = value.getName().length();
		}
		return(longestName);
	}

//	public String toDotGPBFormat() {
//		StringBuffer sb = new StringBuffer();
//		
//		int longestName = getLongestValueNameLength();
//		int npadding = longestName + 4;
//		PrintfFormat 	nformat 	= new PrintfFormat("%-" + npadding + "s");
//
//		sb.append("GpbEnum\n");
//		sb.append("name        " + getName() + "\n");
//		
//		EnumValueIterableDMW values = this.getEnumValueIterable();
//		while(values.hasNext()){
//			EnumValue value = values.getNext();
//			sb.append("enumValue   " + nformat.sprintf(value.getName()) + " " + value.getId());
//			if (value.getDescription() != null)
//				sb.append(" " + value.getDescription());
//			sb.append("\n");
//		}
//		
//		if (this.getDescriptionSize() > 0){
//			Iterator<String> it = getDescription();
//			while(it.hasNext()){
//				sb.append("description " + it.next() + "\n");
//			}
//		}
//		
//		return(sb.toString());
////		return(this.toOIF());
//	}

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
//			
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
