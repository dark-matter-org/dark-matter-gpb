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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:392)
import java.io.Serializable;                                      // Always required - (GenUtility.java:220)
import java.util.*;                                               // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                                  // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcNamedObjectIF;                              // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcSliceInfo;                                  // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                             // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.StringName;                              // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeEnumValueMV;            // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeStringSV;               // Required type - (GenUtility.java:324)
import org.dmd.dms.types.EnumValue;                               // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;         // Base class - (GenUtility.java:351)

/**
 * The GpbEnum allows for the definition of enumerations. One thing to be
 * aware\n of with enums is that, if you're generating C++, the names of enum
 * elements must be globally\n unique. The dark-matter GPB utility will warn
 * you if you have clashing enum value names.\n <p/>\n May want to allow for
 * mapping between DMS enum definitions and GpbEnums. Provide a basedOnEnum\n
 * attribute that refers to a DMS enum. A GpbDefinitionSet could use the
 * schemaToLoad attribute\n to specify a DMS schema from which definitions
 * can be pulled.\n <p/>\n When you're defining a message type, you might
 * want one of its fields to only have one of a\n pre-defined list of values.
 * For example, let's say you want to add a corpus field for each\n
 * SearchRequest, where the corpus can be UNIVERSAL, WEB, IMAGES, LOCAL,
 * NEWS, PRODUCTS or VIDEO.\n You can do this very simply by adding an enum
 * to your message definition - a field with an enum\n type can only have one
 * of a specified set of constants as its value (if you try to provide a\n
 * different value, the parser will treat it like an unknown field). In the
 * following\n example we've added an enum called Corpus with all the
 * possible values, and a field of type Corpus:
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbEnumDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbEnum";


    static {
    }

    public GpbEnumDMO() {
        super("GpbEnum");
    }

    protected GpbEnumDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbEnumDMO getNew(){
        GpbEnumDMO rc = new GpbEnumDMO();
        return(rc);
    }

    @Override
    public GpbEnumDMO getSlice(DmcSliceInfo info){
        GpbEnumDMO rc = new GpbEnumDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbEnumDMO(DmcTypeModifierMV mods) {
        super("GpbEnum");
        modrec(true);
        setModifier(mods);
    }

    public GpbEnumDMO getModificationRecorder(){
        GpbEnumDMO rc = new GpbEnumDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof GpbEnumDMO){
            return( getObjectName().equals( ((GpbEnumDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        StringName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public String getDefaultValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__defaultValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:815)
    public void setDefaultValue(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__defaultValue);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__defaultValue);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__defaultValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void setDefaultValue(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__defaultValue);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__defaultValue);
        
        attr.set(value);
        set(DmdgpbDMSAG.__defaultValue,attr);
    }

    /**
     * Removes the defaultValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:888)
    public void remDefaultValue(){
         rem(DmdgpbDMSAG.__defaultValue);
    }

    /**
     * @return An Iterator of EnumValue objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1103)
    public Iterator<EnumValue> getEnumValue(){
        DmcTypeEnumValueMV attr = (DmcTypeEnumValueMV) get(MetaDMSAG.__enumValue);
        if (attr == null)
            return( ((List<EnumValue>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EnumValue value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1115)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1129)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1204)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1236)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1311)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1327)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1346)
    public void remEnumValue(){
         rem(MetaDMSAG.__enumValue);
    }




}
