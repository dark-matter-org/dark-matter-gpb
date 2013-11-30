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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                              // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                          // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcOmni;                                               // Lazy resolution - (GenUtility.java:317)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.DefinitionName;                                  // Naming attribute type - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                      // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.gpb.shared.generated.dmo.GpbElementDMO;                    // Base class - (GenUtility.java:352)
import org.dmd.gpb.shared.generated.dmo.GpbTypeDMO;                       // Type specific set/add - (GenUtility.java:304)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;                  // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.gpb.shared.generated.types.DmcTypeFieldRuleEnumSV;         // Required type - (GenUtility.java:325)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbTypeREFSV;            // Reference type - (GenUtility.java:297)
import org.dmd.gpb.shared.generated.types.GpbTypeREF;                     // Helper class - (GenUtility.java:332)

/**
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbFieldDMO  extends GpbElementDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbField";


    static {
    }

    public GpbFieldDMO() {
        super("GpbField");
    }

    protected GpbFieldDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbFieldDMO getNew(){
        GpbFieldDMO rc = new GpbFieldDMO();
        return(rc);
    }

    @Override
    public GpbFieldDMO getSlice(DmcSliceInfo info){
        GpbFieldDMO rc = new GpbFieldDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbFieldDMO(DmcTypeModifierMV mods) {
        super("GpbField");
        modrec(true);
        setModifier(mods);
    }

    public GpbFieldDMO getModificationRecorder(){
        GpbFieldDMO rc = new GpbFieldDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof GpbFieldDMO){
            return( getObjectName().equals( ((GpbFieldDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public FieldRuleEnum getFieldRule(){
        DmcTypeFieldRuleEnumSV attr = (DmcTypeFieldRuleEnumSV) get(DmdgpbDMSAG.__fieldRule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value FieldRuleEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setFieldRule(FieldRuleEnum value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__fieldRule);
        if (attr == null)
            attr = new DmcTypeFieldRuleEnumSV(DmdgpbDMSAG.__fieldRule);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__fieldRule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value A value compatible with DmcTypeFieldRuleEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setFieldRule(Object value) throws DmcValueException {
        DmcTypeFieldRuleEnumSV attr  = (DmcTypeFieldRuleEnumSV) get(DmdgpbDMSAG.__fieldRule);
        if (attr == null)
            attr = new DmcTypeFieldRuleEnumSV(DmdgpbDMSAG.__fieldRule);
        
        attr.set(value);
        set(DmdgpbDMSAG.__fieldRule,attr);
    }

    /**
     * Removes the fieldRule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remFieldRule(){
         rem(DmdgpbDMSAG.__fieldRule);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remGpbType(){
         rem(DmdgpbDMSAG.__gpbType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Integer getTag(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmdgpbDMSAG.__tag);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets tag to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setTag(Integer value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__tag);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmdgpbDMSAG.__tag);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__tag,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets tag to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setTag(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmdgpbDMSAG.__tag);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmdgpbDMSAG.__tag);
        
        attr.set(value);
        set(DmdgpbDMSAG.__tag,attr);
    }

    /**
     * Removes the tag attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remTag(){
         rem(DmdgpbDMSAG.__tag);
    }




}
