package org.dmd.gpb.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DotName;
import org.dmd.gpb.server.generated.dmw.GpbMessageDMW;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;
import org.dmd.util.exceptions.DebugInfo;

public class GpbMessage extends GpbMessageDMW {

	@Override
	public String toDotGPBFormat() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void createTypeIfRequired(GpbModuleDefinitionManager definitions) throws DmcValueException {
		DebugInfo.debug(this.toOIF());

		DotName dotname = new DotName(getDefinedInGpbModule().getName() + "." + getName() + "." + DmdgpbDMSAG.__GpbType.name);
		GpbType type = definitions.getGpbType(dotname);
		
		if (type == null){
			type = new GpbType();
			type.setName(getName());
			type.setDotName(dotname);
			type.setDefinedInGpbModule(getDefinedInGpbModule());
			type.setInternallyGenerated(true);
			type.setBasedOnMainElement(this);
			
			definitions.addGpbType(type);
			getDefinedInGpbModule().addGpbType(type);
			
			DebugInfo.debug("ADDED TYPE \n\n" + type.toOIF());
		}
		

	}

}
