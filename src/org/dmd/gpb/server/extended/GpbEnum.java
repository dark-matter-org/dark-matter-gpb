package org.dmd.gpb.server.extended;

import java.util.Iterator;

import org.dmd.dms.generated.dmw.EnumValueIterableDMW;
import org.dmd.dms.types.EnumValue;
import org.dmd.gpb.server.generated.dmw.GpbEnumDMW;
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
}
