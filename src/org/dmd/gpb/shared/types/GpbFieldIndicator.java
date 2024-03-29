package org.dmd.gpb.shared.types;

import java.io.Serializable;
import java.util.ArrayList;

import org.dmd.concinnity.shared.generated.types.ConceptREF;
import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;
import org.dmd.gpb.shared.generated.enums.OptionEnum;
import org.dmd.gpb.shared.generated.types.GpbFieldIndicatorBase;
import org.dmd.gpb.shared.generated.types.GpbFieldREF;

@SuppressWarnings("serial")
public class GpbFieldIndicator extends GpbFieldIndicatorBase implements Serializable {

	public GpbFieldIndicator(){
		super();
	}
	
	public GpbFieldIndicator(GpbFieldIndicator original){
		super(original);
	}
	
    public GpbFieldIndicator(FieldRuleEnum fieldRule_, GpbFieldREF fieldRef_, Integer fieldTag_, OptionEnum option_, String default_, String hint_, String version_, String obsolete_, String note_, ArrayList<String> skipV_, ArrayList<ConceptREF> why_, Integer order_) throws DmcValueException {
    	super(fieldRule_, fieldRef_, fieldTag_, option_, default_, hint_, version_, obsolete_, note_, skipV_, why_, order_);	
    }
    
    public GpbFieldIndicator(String initialInput) throws DmcValueException {
    	super(initialInput);
    	
    	// Additional checking that isn't supported by the ComplexTypeDefinition
    	
    	if (getOption() != null){
    		if (getOption() == OptionEnum.PACKED){
    			if (getDefault() != null){
    				DmcValueException ex = new DmcValueException("Extraneous information after the PACKED option");
    				throw(ex);
    			}
    		}
    	}
    }

}
