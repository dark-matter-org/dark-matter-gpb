package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbMainElementDMW;
import org.dmd.gpb.shared.generated.dmo.GpbMainElementDMO;

abstract public class GpbMainElement extends GpbMainElementDMW {

	public GpbMainElement(){
		
	}
	
	protected GpbMainElement(GpbMainElementDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
}
