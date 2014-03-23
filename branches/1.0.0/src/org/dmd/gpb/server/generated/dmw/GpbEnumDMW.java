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
package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                              // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                               // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                          // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                 // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.gpb.server.extended.GpbCompositeType;                     // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.gpb.server.extended.GpbEnum;                              // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.server.generated.dmw.GpbEnumValueIterableDMW;         // For multi-valued GpbEnumValue - (BaseDMWGenerator.java:2103)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                     // Attribute gpbEnumValue from the dmdgpb schema - (BaseDMWGenerator.java:897)
import org.dmd.gpb.shared.generated.dmo.GpbEnumDMO;                      // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.gpb.shared.generated.types.GpbEnumValue;                  // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                  // Required to access defined in module name - (DMWGenerator.java:181)



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
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class GpbEnumDMW extends GpbCompositeType implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public GpbEnumDMW() {
        super(new GpbEnumDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbEnum);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public GpbEnumDMW(DmcTypeModifierMV mods) {
        super(new GpbEnumDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbEnum);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public GpbEnum getModificationRecorder(){
        GpbEnum rc = new GpbEnum();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public GpbEnumDMW(GpbEnumDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbEnum);
    }

    public GpbEnum cloneIt() {
        GpbEnum rc = new GpbEnum();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbEnumDMO getDMO() {
        return((GpbEnumDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected GpbEnumDMW(GpbEnumDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((GpbEnumDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbEnumDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbEnumDMW){
            return( getObjectName().equals( ((GpbEnumDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getDefaultValue(){
        return(((GpbEnumDMO) core).getDefaultValue());
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setDefaultValue(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).setDefaultValue(value);
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setDefaultValue(String value){
        ((GpbEnumDMO) core).setDefaultValue(value);
    }

    /**
     * Removes the defaultValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDefaultValue(){
        ((GpbEnumDMO) core).remDefaultValue();
    }

    /**
     * @return The number of GpbEnumValue items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getGpbEnumValueSize(){
        return(((GpbEnumDMO) core).getGpbEnumValueSize());
    }

    /**
     * @return true if there are no GpbEnumValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getGpbEnumValueIsEmpty(){
        if (((GpbEnumDMO) core).getGpbEnumValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbEnumValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getGpbEnumValueHasValue(){
        if (((GpbEnumDMO) core).getGpbEnumValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbEnumValue objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public GpbEnumValueIterableDMW getGpbEnumValueIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__gpbEnumValue);
        if (attr == null)
            return(GpbEnumValueIterableDMW.emptyList);
        
        return(new GpbEnumValueIterableDMW(((GpbEnumDMO) core).getGpbEnumValue()));
    }

    /**
     * Adds another gpbEnumValue value.
     * @param value A value compatible with GpbEnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addGpbEnumValue(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).addGpbEnumValue(value);
    }

    /**
     * Adds another gpbEnumValue value.
     * @param value A value compatible with GpbEnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addGpbEnumValue(GpbEnumValue value){
        ((GpbEnumDMO) core).addGpbEnumValue(value);
    }

    /**
     * Returns true if the collection contains the gpbEnumValue value.
     * @param value A value compatible with GpbEnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean gpbEnumValueContains(GpbEnumValue value){
        return(((GpbEnumDMO) core).gpbEnumValueContains(value));
    }

    /**
     * @return A COPY of the collection of GpbEnumValue objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<GpbEnumValue> getGpbEnumValueCopy(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__gpbEnumValue);
        if (attr == null)
            return(new ArrayList<GpbEnumValue>());
        
        ArrayList<GpbEnumValue> rc = new ArrayList<GpbEnumValue>(attr.getMVSize());
        
        Iterator<GpbEnumValue> it = (Iterator<GpbEnumValue>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a gpbEnumValue value.
     * @param value The GpbEnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delGpbEnumValue(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).delGpbEnumValue(value);
    }

    /**
     * Deletes a gpbEnumValue value.
     * @param value The GpbEnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delGpbEnumValue(GpbEnumValue value){
        ((GpbEnumDMO) core).delGpbEnumValue(value);
    }

    /**
     * Removes the gpbEnumValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remGpbEnumValue(){
        ((GpbEnumDMO) core).remGpbEnumValue();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((GpbEnumDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((GpbEnumDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((GpbEnumDMO) core).remName();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:222)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        GpbModuleREF ref = ((GpbEnumDMO) core).getDefinedInGpbModule();
        return(ref.getName().getNameString());
    }


}
