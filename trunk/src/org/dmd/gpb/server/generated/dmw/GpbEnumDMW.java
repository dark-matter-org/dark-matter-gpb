package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                    // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Iterator;                                     // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.definitions.DmcDefinitionIF;                // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.types.DefinitionName;                       // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.ClassDefinition;                            // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Attribute enumValue from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.EnumValueIterableDMW;         // For multi-valued EnumValue - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dms.types.EnumValue;                            // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.gpb.server.extended.GpbEnum;                    // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.gpb.server.extended.GpbMainElement;             // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.gpb.shared.generated.dmo.GpbEnumDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)



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
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class GpbEnumDMW extends GpbMainElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public GpbEnumDMW() {
        super(new GpbEnumDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbEnum);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public GpbEnumDMW(DmcTypeModifierMV mods) {
        super(new GpbEnumDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbEnum);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public GpbEnum getModificationRecorder(){
        GpbEnum rc = new GpbEnum();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected GpbEnumDMW(GpbEnumDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getDefaultValue(){
        return(((GpbEnumDMO) core).getDefaultValue());
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setDefaultValue(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).setDefaultValue(value);
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setDefaultValue(String value){
        ((GpbEnumDMO) core).setDefaultValue(value);
    }

    /**
     * Removes the defaultValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remDefaultValue(){
        ((GpbEnumDMO) core).remDefaultValue();
    }

    /**
     * @return The number of EnumValue items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getEnumValueSize(){
        return(((GpbEnumDMO) core).getEnumValueSize());
    }

    /**
     * @return true if there are no EnumValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getEnumValueIsEmpty(){
        if (((GpbEnumDMO) core).getEnumValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any EnumValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getEnumValueHasValue(){
        if (((GpbEnumDMO) core).getEnumValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of EnumValue objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public EnumValueIterableDMW getEnumValueIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(EnumValueIterableDMW.emptyList);
        
        return(new EnumValueIterableDMW(((GpbEnumDMO) core).getEnumValue()));
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addEnumValue(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).addEnumValue(value);
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addEnumValue(EnumValue value){
        ((GpbEnumDMO) core).addEnumValue(value);
    }

    /**
     * Returns true if the collection contains the enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean enumValueContains(EnumValue value){
        return(((GpbEnumDMO) core).enumValueContains(value));
    }

    /**
     * @return A COPY of the collection of EnumValue objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public ArrayList<EnumValue> getEnumValueCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(new ArrayList<EnumValue>());
        
        ArrayList<EnumValue> rc = new ArrayList<EnumValue>(attr.getMVSize());
        
        Iterator<EnumValue> it = (Iterator<EnumValue>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a enumValue value.
     * @param value The EnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delEnumValue(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).delEnumValue(value);
    }

    /**
     * Deletes a enumValue value.
     * @param value The EnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delEnumValue(EnumValue value){
        ((GpbEnumDMO) core).delEnumValue(value);
    }

    /**
     * Removes the enumValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remEnumValue(){
        ((GpbEnumDMO) core).remEnumValue();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DefinitionName getName(){
        return(((GpbEnumDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setName(Object value) throws DmcValueException {
        ((GpbEnumDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setName(DefinitionName value){
        ((GpbEnumDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remName(){
        ((GpbEnumDMO) core).remName();
    }


}
