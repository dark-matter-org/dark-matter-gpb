package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbDefinitionDMW;
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;

public class GpbDefinition extends GpbDefinitionDMW {
	
	protected GpbDefinition(GpbDefinitionDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}

	@Override
	public GpbDefinition getModificationRecorder() {
		// TODO Auto-generated method stub
		return null;
	}

}
