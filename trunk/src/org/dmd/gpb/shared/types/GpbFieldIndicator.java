package org.dmd.gpb.shared.types;

import java.io.Serializable;

import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;
import org.dmd.gpb.shared.generated.types.GpbElementREF;
import org.dmd.gpb.shared.generated.types.GpbFieldIndicatorBase;

@SuppressWarnings("serial")
public class GpbFieldIndicator extends GpbFieldIndicatorBase implements Serializable {

	public GpbFieldIndicator(){
		super();
	}
	
	public GpbFieldIndicator(GpbFieldIndicator original){
		super(original);
	}
	
    public GpbFieldIndicator(GpbElementREF f1, Integer f2, FieldRuleEnum f3, String f4) throws DmcValueException {
    	super(f1, f2, f3, f4);
    }
    
    public GpbFieldIndicator(String initialInput) throws DmcValueException {
    	super(initialInput);
    	
    	// Do additional checking
    }

}
