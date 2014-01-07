package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                      // Support for MULTI attribute - (BaseDMWGenerator.java:2150)
import java.util.Iterator;                                       // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.definitions.DmcDefinitionIF;                  // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.types.DefinitionName;                         // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dms.ClassDefinition;                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Attribute description from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.StringIterableDMW;              // For multi-valued String - (BaseDMWGenerator.java:2027)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.gpb.server.extended.GpbElement;                   // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.gpb.server.extended.GpbField;                     // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.gpb.server.extended.GpbType;                      // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.gpb.shared.generated.dmo.GpbFieldDMO;             // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;         // Primitive type - (BaseDMWGenerator.java:1074)
import org.dmd.gpb.shared.generated.types.GpbTypeREF;            // Is reference type REF - (BaseDMWGenerator.java:1039)



/**
 * The GpbField class is used to represent a reusable, named field for use\n
 * within a GpbMessage. If the field has been parsed from an existing .proto
 * file, it will\n have the fieldRule and tag attributes. However, when
 * specified as part of a .gpb file,\n the fieldRule and tag won't be
 * specified.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class GpbFieldDMW extends GpbElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public GpbFieldDMW() {
        super(new GpbFieldDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbField);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public GpbFieldDMW(DmcTypeModifierMV mods) {
        super(new GpbFieldDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbField);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public GpbField getModificationRecorder(){
        GpbField rc = new GpbField();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public GpbFieldDMW(GpbFieldDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbField);
    }

    public GpbField cloneIt() {
        GpbField rc = new GpbField();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbFieldDMO getDMO() {
        return((GpbFieldDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected GpbFieldDMW(GpbFieldDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public DefinitionName getObjectName(){
        return(((GpbFieldDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbFieldDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbFieldDMW){
            return( getObjectName().equals( ((GpbFieldDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getDescriptionSize(){
        return(((GpbFieldDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getDescriptionIsEmpty(){
        if (((GpbFieldDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getDescriptionHasValue(){
        if (((GpbFieldDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((GpbFieldDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addDescription(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addDescription(String value){
        ((GpbFieldDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean descriptionContains(String value){
        return(((GpbFieldDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delDescription(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delDescription(String value){
        ((GpbFieldDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remDescription(){
        ((GpbFieldDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public FieldRuleEnum getFieldRule(){
        return(((GpbFieldDMO) core).getFieldRule());
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value A value compatible with DmcTypeFieldRuleEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setFieldRule(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setFieldRule(value);
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value FieldRuleEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setFieldRule(FieldRuleEnum value){
        ((GpbFieldDMO) core).setFieldRule(value);
    }

    /**
     * Removes the fieldRule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remFieldRule(){
        ((GpbFieldDMO) core).remFieldRule();
    }

    /**
     * @return A GpbType object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1358)
    public GpbType getGpbType(){
        GpbTypeREF ref = ((GpbFieldDMO) core).getGpbType();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((GpbType)ref.getObject().getContainer());
    }

    /**
     * Sets the gpbType to the specified value.
     * @param value A value compatible with GpbTypeREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1443)
    public void setGpbType(GpbType value) {
        ((GpbFieldDMO) core).setGpbType(value.getDMO());
    }

    /**
     * Sets the gpbType to the specified value.
     * @param value A value compatible with GpbTypeREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1452)
    public void setGpbType(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setGpbType(value);
    }

    /**
     * Removes the gpbType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remGpbType(){
        ((GpbFieldDMO) core).remGpbType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public Integer getTag(){
        return(((GpbFieldDMO) core).getTag());
    }

    /**
     * Sets tag to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setTag(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setTag(value);
    }

    /**
     * Sets tag to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setTag(Integer value){
        ((GpbFieldDMO) core).setTag(value);
    }

    /**
     * Removes the tag attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remTag(){
        ((GpbFieldDMO) core).remTag();
    }


}
