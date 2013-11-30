package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.definitions.DmcDefinitionIF;                  // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.types.DefinitionName;                         // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.ClassDefinition;                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.gpb.server.extended.GpbElement;                   // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.gpb.server.extended.GpbField;                     // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.gpb.server.extended.GpbType;                      // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.gpb.shared.generated.dmo.GpbFieldDMO;             // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;         // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.gpb.shared.generated.types.GpbTypeREF;            // Is reference type REF - (BaseDMWGenerator.java:1034)



/**
 * null
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

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public FieldRuleEnum getFieldRule(){
        return(((GpbFieldDMO) core).getFieldRule());
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value A value compatible with DmcTypeFieldRuleEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setFieldRule(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setFieldRule(value);
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value FieldRuleEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setFieldRule(FieldRuleEnum value){
        ((GpbFieldDMO) core).setFieldRule(value);
    }

    /**
     * Removes the fieldRule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remFieldRule(){
        ((GpbFieldDMO) core).remFieldRule();
    }

    /**
     * @return A GpbType object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setGpbType(GpbType value) {
        ((GpbFieldDMO) core).setGpbType(value.getDMO());
    }

    /**
     * Sets the gpbType to the specified value.
     * @param value A value compatible with GpbTypeREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setGpbType(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setGpbType(value);
    }

    /**
     * Removes the gpbType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remGpbType(){
        ((GpbFieldDMO) core).remGpbType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Integer getTag(){
        return(((GpbFieldDMO) core).getTag());
    }

    /**
     * Sets tag to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setTag(Object value) throws DmcValueException {
        ((GpbFieldDMO) core).setTag(value);
    }

    /**
     * Sets tag to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setTag(Integer value){
        ((GpbFieldDMO) core).setTag(value);
    }

    /**
     * Removes the tag attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remTag(){
        ((GpbFieldDMO) core).remTag();
    }


}
