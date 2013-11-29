package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbElementDMW;
import org.dmd.gpb.shared.generated.dmo.GpbElementDMO;

abstract public class GpbElement extends GpbElementDMW {

	public GpbElement(){
		
	}
	
	protected GpbElement(GpbElementDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
}
