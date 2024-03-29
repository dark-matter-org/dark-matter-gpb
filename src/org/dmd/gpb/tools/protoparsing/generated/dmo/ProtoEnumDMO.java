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
package org.dmd.gpb.tools.protoparsing.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                     // Always required - (GenUtility.java:224)
import java.util.*;                                                              // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                                 // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                             // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcSliceInfo;                                                 // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                            // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                         // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                      // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeEnumValueMV;                           // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.types.EnumValue;                                              // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoMainElementDMO;         // Base class - (GenUtility.java:355)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmdproto schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ProtoEnumDMO  extends ProtoMainElementDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ProtoEnum";


    static {
    }

    public ProtoEnumDMO() {
        super("ProtoEnum");
    }

    protected ProtoEnumDMO(String oc) {
        super(oc);
    }

    @Override
    public ProtoEnumDMO getNew(){
        ProtoEnumDMO rc = new ProtoEnumDMO();
        return(rc);
    }

    @Override
    public ProtoEnumDMO getSlice(DmcSliceInfo info){
        ProtoEnumDMO rc = new ProtoEnumDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ProtoEnumDMO(DmcTypeModifierMV mods) {
        super("ProtoEnum");
        modrec(true);
        setModifier(mods);
    }

    public ProtoEnumDMO getModificationRecorder(){
        ProtoEnumDMO rc = new ProtoEnumDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof ProtoEnumDMO){
            return( getObjectName().equals( ((ProtoEnumDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    /**
     * @return An Iterator of EnumValue objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<EnumValue> getEnumValue(){
        DmcTypeEnumValueMV attr = (DmcTypeEnumValueMV) get(MetaDMSAG.__enumValue);
        if (attr == null)
            return( ((List<EnumValue>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EnumValue value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public EnumValue getNthEnumValue(int i){
        DmcTypeEnumValueMV attr = (DmcTypeEnumValueMV) get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another enumValue to the specified value.
     * @param value EnumValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addEnumValue(EnumValue value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumValue);
        if (attr == null)
            attr = new DmcTypeEnumValueMV(MetaDMSAG.__enumValue);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__enumValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified EnumValue.
     * @param value EnumValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean enumValueContains(EnumValue value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addEnumValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumValue);
        if (attr == null)
            attr = new DmcTypeEnumValueMV(MetaDMSAG.__enumValue);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__enumValue,attr);
        return(attr);
    }

    /**
     * Returns the number of values in enumValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getEnumValueSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__enumValue);
        if (attr == null){
            if (MetaDMSAG.__enumValue.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__enumValue.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a enumValue value.
     * @param value The EnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delEnumValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumValue);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEnumValueMV(MetaDMSAG.__enumValue), value);
        else
            attr = del(MetaDMSAG.__enumValue, value);
        
        return(attr);
    }

    /**
     * Deletes a enumValue from the specified value.
     * @param value EnumValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delEnumValue(EnumValue value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumValue);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEnumValueMV(MetaDMSAG.__enumValue), value);
        else
            attr = del(MetaDMSAG.__enumValue, value);
        
        return(attr);
    }

    /**
     * Removes the enumValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remEnumValue(){
         rem(MetaDMSAG.__enumValue);
    }




}
