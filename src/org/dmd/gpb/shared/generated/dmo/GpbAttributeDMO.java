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
package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                           // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                       // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcNamedObjectIF;                                   // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcOmni;                                            // Lazy resolution - (GenUtility.java:316)
import org.dmd.dmc.DmcSliceInfo;                                       // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                  // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.CamelCaseName;                                // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;             // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;              // Base class - (GenUtility.java:351)
import org.dmd.gpb.shared.generated.dmo.GpbTypeDMO;                    // Type specific set/add - (GenUtility.java:303)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbTypeREFSV;         // Reference type - (GenUtility.java:296)
import org.dmd.gpb.shared.generated.types.GpbTypeREF;                  // Helper class - (GenUtility.java:331)

/**
 * null
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbAttributeDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbAttribute";


    static {
    }

    public GpbAttributeDMO() {
        super("GpbAttribute");
    }

    protected GpbAttributeDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbAttributeDMO getNew(){
        GpbAttributeDMO rc = new GpbAttributeDMO();
        return(rc);
    }

    @Override
    public GpbAttributeDMO getSlice(DmcSliceInfo info){
        GpbAttributeDMO rc = new GpbAttributeDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbAttributeDMO(DmcTypeModifierMV mods) {
        super("GpbAttribute");
        modrec(true);
        setModifier(mods);
    }

    public GpbAttributeDMO getModificationRecorder(){
        GpbAttributeDMO rc = new GpbAttributeDMO();
        rc.setCamelCaseName(getCamelCaseName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__camelCaseName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__camelCaseName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof GpbAttributeDMO){
            return( getObjectName().equals( ((GpbAttributeDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public CamelCaseName getCamelCaseName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setCamelCaseName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__camelCaseName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setCamelCaseName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        attr.set(value);
        set(MetaDMSAG.__camelCaseName,attr);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remCamelCaseName(){
         rem(MetaDMSAG.__camelCaseName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:645)
    public GpbTypeREF getGpbType(){
        DmcTypeGpbTypeREFSV attr = (DmcTypeGpbTypeREFSV) get(DmdgpbDMSAG.__gpbType);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to GpbType without attempting lazy resolution (if turned on).
     */
    public GpbTypeREF getGpbTypeREF(){
        DmcTypeGpbTypeREFSV attr = (DmcTypeGpbTypeREFSV) get(DmdgpbDMSAG.__gpbType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets gpbType to the specified value.
     * @param value GpbTypeDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:699)
    public void setGpbType(GpbTypeDMO value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__gpbType);
        if (attr == null)
            attr = new DmcTypeGpbTypeREFSV(DmdgpbDMSAG.__gpbType);
        else
            ((DmcTypeGpbTypeREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__gpbType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets gpbType to the specified value.
     * @param value A value compatible with DmcTypeGpbTypeREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setGpbType(Object value) throws DmcValueException {
        DmcTypeGpbTypeREFSV attr  = (DmcTypeGpbTypeREFSV) get(DmdgpbDMSAG.__gpbType);
        if (attr == null)
            attr = new DmcTypeGpbTypeREFSV(DmdgpbDMSAG.__gpbType);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmdgpbDMSAG.__gpbType,attr);
    }

    /**
     * Removes the gpbType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remGpbType(){
         rem(DmdgpbDMSAG.__gpbType);
    }




}
