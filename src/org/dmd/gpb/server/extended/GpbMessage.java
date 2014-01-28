package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbMessageDMW;
import org.dmd.gpb.shared.generated.dmo.GpbMessageDMO;

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
