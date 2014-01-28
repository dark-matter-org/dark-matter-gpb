package org.dmd.gpb.server.extended;

import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
import org.dmd.dms.generated.dmw.EnumValueIterableDMW;
import org.dmd.dms.types.EnumValue;
import org.dmd.gpb.server.generated.dmw.GpbEnumDMW;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class GpbEnum extends GpbEnumDMW {

	/**
	 * @return the enumeration formatted in .proto format.
	 */
	public String toDotProtoFormat(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("enum " + this.getName() + "\n");
		sb.append("{\n");
		
		int longestName = getLongestValueNameLength();
		int npadding = longestName + 4;
		PrintfFormat 	nformat 	= new PrintfFormat("%-" + npadding + "s");

		EnumValueIterableDMW values = this.getEnumValueIterable();
		while(values.hasNext()){
			EnumValue value = values.getNext();
			sb.append("    " + nformat.sprintf(value.getName()) + " = " + value.getId() + ";");
			if (value.getDescription() != null)
				sb.append(" // " + value.getDescription());
			sb.append("\n");
		}
		
		sb.append("}\n\n");
		
		return(sb.toString());
	}
	
	public int getLongestValueNameLength(){
		int longestName = 0;
		// Determine the longest value name
		EnumValueIterableDMW values = this.getEnumValueIterable();
		while(values.hasNext()){
			EnumValue value = values.getNext();
			if (value.getName().length() > longestName)
				longestName = value.getName().length();
		}
		return(longestName);
	}

	@Override
	public String toDotGPBFormat() {
		StringBuffer sb = new StringBuffer();
		
		int longestName = getLongestValueNameLength();
		int npadding = longestName + 4;
		PrintfFormat 	nformat 	= new PrintfFormat("%-" + npadding + "s");

		sb.append("GpbEnum\n");
		sb.append("name        " + getName() + "\n");
		
		EnumValueIterableDMW values = this.getEnumValueIterable();
		while(values.hasNext()){
			EnumValue value = values.getNext();
			sb.append("enumValue   " + nformat.sprintf(value.getName()) + " " + value.getId());
			if (value.getDescription() != null)
				sb.append(" " + value.getDescription());
			sb.append("\n");
		}
		
		if (this.getDescriptionSize() > 0){
			Iterator<String> it = getDescription();
			while(it.hasNext()){
				sb.append("description " + it.next() + "\n");
			}
		}
		
		return(sb.toString());
//		return(this.toOIF());
	}

	@Override
	public void createTypeIfRequired(GpbModuleDefinitionManager definitions) throws DmcValueException {
		DebugInfo.debug(this.toOIF());
		
		DotName dotname = new DotName(getDefinedInGpbModule().getName() + "." + getName() + "." + DmdgpbDMSAG.__GpbType.name);
		GpbType type = definitions.getGpbType(dotname);
		
		if (type == null){
			DotName nameAndTypeName = new DotName(getName() + "." + DmdgpbDMSAG.__GpbType.name);
			type = new GpbType();
			type.setName(getName());
			type.setDotName(dotname);
			type.setNameAndTypeName(nameAndTypeName);
			
			type.setDefinedInGpbModule(getDefinedInGpbModule());
			type.setInternallyGenerated(true);
			type.setBasedOnMainElement(this);
			
			definitions.addGpbType(type);
			getDefinedInGpbModule().addGpbType(type);
			
			DebugInfo.debug("ADDED TYPE \n\n" + type.toOIF());
		}
		
		
	}
}
