package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbTypeDMW;
import org.dmd.gpb.shared.generated.dmo.GpbTypeDMO;

public class GpbType extends GpbTypeDMW {
	
	public GpbType(){
		super();
	}
	
	public GpbType(GpbTypeDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}

}
