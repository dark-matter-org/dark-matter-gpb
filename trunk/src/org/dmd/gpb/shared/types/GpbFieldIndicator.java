package org.dmd.gpb.shared.types;

import java.io.Serializable;

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
	
    public GpbFieldIndicator(GpbFieldREF f1, Integer f2, FieldRuleEnum f3, OptionEnum f4, String f5) throws DmcValueException {
    	super(f1, f2, f3, f4, f5);	
    }
    
    public GpbFieldIndicator(String initialInput) throws DmcValueException {
    	super(initialInput);
    	
    	// Additional checking that isn't supported by the ComplexTypeDefinition
    	
    	if (getOption() != null){
    		if (getOption() == OptionEnum.DEFAULT){
    			if (getDefaultValue() == null){
    				DmcValueException ex = new DmcValueException("Missing default value");
    				throw(ex);
    			}
    		}
    		if (getOption() == OptionEnum.PACKED){
    			if (getDefaultValue() != null){
    				DmcValueException ex = new DmcValueException("Extraneous information after the PACKED option");
    				throw(ex);
    			}
    		}
    	}
    }
    
    @Override
    public String toString(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append(getFieldRef().toString() + " " + getFieldTag().toString() + " " + getFieldRule().toString());
    	
    	if (getOption() != null)
    		sb.append(" " + getOption());
    	
    	if (getDefaultValue() != null)
    		sb.append(" " + getDefaultValue());
    	
    	return(sb.toString());
    }

}
