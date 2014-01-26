package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                     // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                 // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                        // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                             // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Attribute description from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.StringIterableDMW;             // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.gpb.server.extended.GpbElement;                  // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.gpb.server.extended.GpbField;                    // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.server.extended.GpbType;                     // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.gpb.shared.generated.dmo.GpbFieldDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;         // Required to access defined in module name - (DMWGenerator.java:180)
import org.dmd.gpb.shared.generated.types.GpbTypeREF;           // Is reference type REF - (BaseDMWGenerator.java:1115)



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
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class GpbFieldDMW extends GpbElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public GpbFieldDMW() {
        super(new GpbFieldDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbField);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public GpbFieldDMW(DmcTypeModifierMV mods) {
        super(new GpbFieldDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbField);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public GpbField getModificationRecorder(){
        GpbField rc = new GpbField();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected GpbFieldDMW(GpbFieldDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((GpbFieldDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((GpbFieldDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((GpbFieldDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((GpbFieldDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((GpbFieldDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delDescription(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((GpbFieldDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((GpbFieldDMO) core).remDescription();
    }

    /**
     * @return A GpbType object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setGpbType(GpbType value) {
        ((GpbFieldDMO) core).setGpbType(value.getDMO());
    }

    /**
     * Sets the gpbType to the specified value.
     * @param value A value compatible with GpbTypeREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setGpbType(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setGpbType(value);
    }

    /**
     * Removes the gpbType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGpbType(){
        ((GpbFieldDMO) core).remGpbType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((GpbFieldDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((GpbFieldDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((GpbFieldDMO) core).remName();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:221)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        GpbModuleREF ref = ((GpbFieldDMO) core).getDefinedInGpbModule();
        return(ref.getName().getNameString());
    }


}
