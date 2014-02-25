//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3094)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3076)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3080)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3077)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3086)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3087)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3085)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3088)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3078)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3081)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3089)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3084)



@SuppressWarnings("serial")
/**
 * The DmcTypeGpbFieldIndicatorBase class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3101)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:731)
 */
abstract public class DmcTypeGpbFieldIndicatorBase extends DmcTypeComplexTypeWithRefs<GpbFieldIndicatorBase> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeGpbFieldIndicatorBase(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeGpbFieldIndicatorBase(DmcAttributeInfo ai){
        super(ai);
    }

    protected GpbFieldIndicatorBase typeCheck(Object value) throws DmcValueException {
        GpbFieldIndicatorBase rc = null;

        if (value instanceof GpbFieldIndicatorBase){
            rc = (GpbFieldIndicatorBase)value;
        }
        else if (value instanceof String){
            rc = new GpbFieldIndicatorBase((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbFieldIndicatorBase expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public GpbFieldIndicatorBase cloneValue(GpbFieldIndicatorBase val){
        return(new GpbFieldIndicatorBase(val));
    }

    /**
     * Writes a GpbFieldIndicatorBase.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbFieldIndicatorBase value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a GpbFieldIndicatorBase.
     */
    @Override
    public GpbFieldIndicatorBase deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbFieldIndicatorBase rc = new GpbFieldIndicatorBase();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a GpbFieldIndicatorBase.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, GpbFieldIndicatorBase value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a GpbFieldIndicatorBase.
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, GpbFieldIndicatorBase value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }



}
