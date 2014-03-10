package org.dmd.gpb.server.extended;

import org.dmd.gpb.server.generated.dmw.GpbFieldDMW;

public class GpbField extends GpbFieldDMW {
	
	public String toDotProtoFormat(int maxFieldNameLangth, String indent){
		StringBuffer sb = new StringBuffer();
		
		return(sb.toString());
	}
	
	/**
	 * @param message the message in which the field is referenced
	 * @return the href for the type of the field
	 */
	public String getTypeHref(GpbMessage message){
		GpbType type = getGpbType();
		
		if (type.getDefinedInGpbModule() == message.getDefinedInGpbModule()){
			return("#" + type.getName());
		}
		else{
			return(type.getDefinedInGpbModule().getName() + ".html#" + type.getName());
		}
	}

}
