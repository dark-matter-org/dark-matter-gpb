package org.dmd.gpb.server.extended;

import org.dmd.gpb.server.generated.dmw.GpbMessageDMW;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.util.exceptions.DebugInfo;

public class GpbMessage extends GpbMessageDMW {

	@Override
	public String toDotGPBFormat() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void createTypeIfRequired(GpbModuleDefinitionManager definitions) {
		DebugInfo.debug(this.toOIF());
		
	}

}
