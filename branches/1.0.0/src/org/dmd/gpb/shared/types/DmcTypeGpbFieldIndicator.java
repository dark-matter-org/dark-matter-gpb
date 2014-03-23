package org.dmd.gpb.shared.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNameClashResolverIF;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;

@SuppressWarnings("serial")
/**
 * The DmcTypeGpbFieldIndicator provides the standard base type to handle attributes
 * of type GpbFieldIndicator.
 */
abstract public class DmcTypeGpbFieldIndicator extends DmcTypeComplexTypeWithRefs<GpbFieldIndicator>  implements Serializable {
	
	public DmcTypeGpbFieldIndicator(){
		
	}

	public DmcTypeGpbFieldIndicator(DmcAttributeInfo ai) {
		super(ai);
	}

	@Override
	public GpbFieldIndicator typeCheck(Object value) throws DmcValueException {
        GpbFieldIndicator rc = null;

        if (value instanceof GpbFieldIndicator){
            rc = (GpbFieldIndicator)value;
        }
        else if (value instanceof String){
            rc = new GpbFieldIndicator((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbFieldIndicator expected."));
        }
        return(rc);
	}

    /**
     * Returns a clone of a value associated with this type.
     */
	@Override
	public GpbFieldIndicator cloneValue(GpbFieldIndicator original) {
		return(new GpbFieldIndicator(original));
	}

	/**
	 * Writes a GpbFieldInidcator.
	 */
	@Override
	public void serializeValue(DmcOutputStreamIF dos, GpbFieldIndicator value) throws Exception {
        value.serializeIt(dos);
	}

	/**
	 * Reads a GpbFieldIndicator.
	 */
	@Override
	public GpbFieldIndicator deserializeValue(DmcInputStreamIF dis) throws Exception {
		GpbFieldIndicator rc = new GpbFieldIndicator();
		rc.deserializeIt(dis);
		return(rc);
	}

    /**
     * Resolves a GpbFieldIndicator.
     */
	@Override
	public void resolveValue(DmcNameResolverIF resolver, GpbFieldIndicator value, String attrName) throws DmcValueException {
		value.resolve(resolver, attrName);
	}

    /**
     * Resolves a GpbFieldIndicator.
     */
	@Override
	public void resolveValue(DmcNameResolverWithClashSupportIF resolver, GpbFieldIndicator value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
		value.resolve(resolver, object, ncr, ai);
	}

}
