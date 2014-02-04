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
package org.dmd.gpb.tools.generation.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import org.dmd.dmc.DmcAttribute;                                           // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcAttributeInfo;                                       // Auxiliary class - (GenUtility.java:347)
import org.dmd.dmc.DmcObject;                                              // Auxiliary class - (GenUtility.java:346)
import org.dmd.dmc.DmcValueException;                                      // Any attributes - (GenUtility.java:241)
import org.dmd.dms.generated.types.DmcTypeStringSV;                        // Required type - (GenUtility.java:328)
import org.dmd.gpb.tools.generation.generated.dmo.GpbauxtestDMSAG;         // Attribute from gpbauxtest schema - (GenUtility.java:132)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * This class is used to test adding auxiliary information to GPB definitions.
 * <P>
 * Generated from the gpbauxtest schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpAUX(DmoFormatter.java:346)
 */
public class GpbTestAuxInfoDMO  {

    public final static String _auxClass = "GpbTestAuxInfo";

    static {
    }
    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:379)
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(GpbauxtestDMSAG.__otherInfo) != null)
            anyLeft = true;
        if (core.get(GpbauxtestDMSAG.__units) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:397)
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:407)
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:415)
    static private DmcAttribute<?> get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    // org.dmd.dms.util.DmoFormatter.getCommonAUXFunctions(DmoFormatter.java:424)
    static private DmcAttribute<?> set(DmcObject core, DmcAttributeInfo ai, DmcAttribute<?> attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the otherInfo attribute from the object.
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:867)
    static public DmcAttribute<?> remOtherInfo(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(GpbauxtestDMSAG.__otherInfo);
        removeAuxIfRequired(core);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:900)
    static public String getOtherInfo(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, GpbauxtestDMSAG.__otherInfo);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets otherInfo to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:922)
    static public void setOtherInfo(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, GpbauxtestDMSAG.__otherInfo);
        if (attr == null)
            attr = new DmcTypeStringSV(GpbauxtestDMSAG.__otherInfo);
        
        attr.set(value);
        set(core, GpbauxtestDMSAG.__otherInfo,attr);
    }

    /**
     * Sets otherInfo to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:957)
    static public void setOtherInfo(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, GpbauxtestDMSAG.__otherInfo);
        if (attr == null)
            attr = new DmcTypeStringSV(GpbauxtestDMSAG.__otherInfo);
        
        try {
            attr.set(value);
            set(core, GpbauxtestDMSAG.__otherInfo,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }

    /**
     * Removes the units attribute from the object.
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:867)
    static public DmcAttribute<?> remUnits(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute<?> rc = core.rem(GpbauxtestDMSAG.__units);
        removeAuxIfRequired(core);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:900)
    static public String getUnits(DmcObject core){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(core, GpbauxtestDMSAG.__units);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets units to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:922)
    static public void setUnits(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(core, GpbauxtestDMSAG.__units);
        if (attr == null)
            attr = new DmcTypeStringSV(GpbauxtestDMSAG.__units);
        
        attr.set(value);
        set(core, GpbauxtestDMSAG.__units,attr);
    }

    /**
     * Sets units to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.DmoFormatter.formatSVAUX(DmoFormatter.java:957)
    static public void setUnits(DmcObject core, String value){
        DmcAttribute<?> attr = get(core, GpbauxtestDMSAG.__units);
        if (attr == null)
            attr = new DmcTypeStringSV(GpbauxtestDMSAG.__units);
        
        try {
            attr.set(value);
            set(core, GpbauxtestDMSAG.__units,attr);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Type specific modification shouldn't cause an error.", e));
        }
    }




}