//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.gpb.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;
import org.dmd.dmc.DmcNameResolverIF;
@SuppressWarnings("serial")
/**
 * The DmcTypeGpbFieldIndicator class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3078)
 *    Called from: Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:374)
 */
abstract public class DmcTypeGpbFieldIndicator extends DmcTypeComplexTypeWithRefs<GpbFieldIndicator> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeGpbFieldIndicator(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeGpbFieldIndicator(DmcAttributeInfo ai){
        super(ai);
    }

    protected GpbFieldIndicator typeCheck(Object value) throws DmcValueException {
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
    public GpbFieldIndicator cloneValue(GpbFieldIndicator val){
        return(new GpbFieldIndicator(val));
    }

    /**
     * Writes a GpbFieldIndicator.
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
        value.resolve(resolver,attrName);
    }



}
