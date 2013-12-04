package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import org.dmd.dmc.*;                                         // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.definitions.DmcDefinitionIF;               // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.types.DefinitionName;                      // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dms.ClassDefinition;                           // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.gpb.server.extended.GpbDefinition;             // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.gpb.server.extended.GpbType;                   // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.gpb.shared.generated.dmo.GpbTypeDMO;           // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)



/**
 * The GpbType class is use to define the types of attributes in the GPB\n
 * specification. All GpbMessages and GpbEnum will have GpbTypes generated
 * for\n them so that they can be used as types for GpbAttributes.\n <p/>\n
 * GpbType definitions cannot be specified in .dmgpb files; they are strictly
 * for\n internal use. If you specify one in a .dmgpb file, you'll get an
 * error.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class GpbTypeDMW extends GpbDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public GpbTypeDMW() {
        super(new GpbTypeDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbType);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public GpbTypeDMW(DmcTypeModifierMV mods) {
        super(new GpbTypeDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbType);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public GpbType getModificationRecorder(){
        GpbType rc = new GpbType();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public GpbTypeDMW(GpbTypeDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbType);
    }

    public GpbType cloneIt() {
        GpbType rc = new GpbType();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbTypeDMO getDMO() {
        return((GpbTypeDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected GpbTypeDMW(GpbTypeDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public DefinitionName getObjectName(){
        return(((GpbTypeDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbTypeDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbTypeDMW){
            return( getObjectName().equals( ((GpbTypeDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getCplusplusType(){
        return(((GpbTypeDMO) core).getCplusplusType());
    }

    /**
     * Sets cplusplusType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setCplusplusType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setCplusplusType(value);
    }

    /**
     * Sets cplusplusType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setCplusplusType(String value){
        ((GpbTypeDMO) core).setCplusplusType(value);
    }

    /**
     * Removes the cplusplusType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remCplusplusType(){
        ((GpbTypeDMO) core).remCplusplusType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getDefaultValue(){
        return(((GpbTypeDMO) core).getDefaultValue());
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setDefaultValue(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setDefaultValue(value);
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setDefaultValue(String value){
        ((GpbTypeDMO) core).setDefaultValue(value);
    }

    /**
     * Removes the defaultValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remDefaultValue(){
        ((GpbTypeDMO) core).remDefaultValue();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public Boolean isInternallyGenerated(){
        return(((GpbTypeDMO) core).isInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setInternallyGenerated(value);
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setInternallyGenerated(Boolean value){
        ((GpbTypeDMO) core).setInternallyGenerated(value);
    }

    /**
     * Removes the internallyGenerated attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remInternallyGenerated(){
        ((GpbTypeDMO) core).remInternallyGenerated();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public Boolean isIsEnumType(){
        return(((GpbTypeDMO) core).isIsEnumType());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setIsEnumType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setIsEnumType(value);
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setIsEnumType(Boolean value){
        ((GpbTypeDMO) core).setIsEnumType(value);
    }

    /**
     * Removes the isEnumType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remIsEnumType(){
        ((GpbTypeDMO) core).remIsEnumType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public Boolean isIsMessageType(){
        return(((GpbTypeDMO) core).isIsMessageType());
    }

    /**
     * Sets isMessageType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setIsMessageType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setIsMessageType(value);
    }

    /**
     * Sets isMessageType to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setIsMessageType(Boolean value){
        ((GpbTypeDMO) core).setIsMessageType(value);
    }

    /**
     * Removes the isMessageType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remIsMessageType(){
        ((GpbTypeDMO) core).remIsMessageType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getJavaType(){
        return(((GpbTypeDMO) core).getJavaType());
    }

    /**
     * Sets javaType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setJavaType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setJavaType(value);
    }

    /**
     * Sets javaType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setJavaType(String value){
        ((GpbTypeDMO) core).setJavaType(value);
    }

    /**
     * Removes the javaType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remJavaType(){
        ((GpbTypeDMO) core).remJavaType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getPythonType(){
        return(((GpbTypeDMO) core).getPythonType());
    }

    /**
     * Sets pythonType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setPythonType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setPythonType(value);
    }

    /**
     * Sets pythonType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setPythonType(String value){
        ((GpbTypeDMO) core).setPythonType(value);
    }

    /**
     * Removes the pythonType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remPythonType(){
        ((GpbTypeDMO) core).remPythonType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public Integer getSizeInBytes(){
        return(((GpbTypeDMO) core).getSizeInBytes());
    }

    /**
     * Sets sizeInBytes to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setSizeInBytes(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setSizeInBytes(value);
    }

    /**
     * Sets sizeInBytes to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setSizeInBytes(Integer value){
        ((GpbTypeDMO) core).setSizeInBytes(value);
    }

    /**
     * Removes the sizeInBytes attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remSizeInBytes(){
        ((GpbTypeDMO) core).remSizeInBytes();
    }


}
