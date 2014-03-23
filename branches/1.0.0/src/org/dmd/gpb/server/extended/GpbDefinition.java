package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbDefinitionDMW;
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;

abstract public class GpbDefinition extends GpbDefinitionDMW {
	
	public GpbDefinition(){
		
	}
	
	protected GpbDefinition(GpbDefinitionDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}


	public String getHref(GpbDefinition from){
		if (getDefinedInGpbModule() == from.getDefinedInGpbModule()){
			return("#" + getName());
		}
		else{
			return(getDefinedInGpbModule().getName() + ".html#" + getName());
		}
	}
}
