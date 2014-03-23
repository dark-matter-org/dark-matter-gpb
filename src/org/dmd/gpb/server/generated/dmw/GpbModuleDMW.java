package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                         // To support getMVCopy() - (BaseDMWGenerator.java:1181)
import java.util.Iterator;                                                          // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.concinnity.server.extended.ConcinnityModule;                         // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.concinnity.server.generated.dmw.ConcinnityModuleIterableDMW;         // For multi-valued ConcinnityModule - (BaseDMWGenerator.java:1709)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO;                 // For multi-valued adds of ConcinnityModule - (BaseDMWGenerator.java:1767)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;                   // Attribute dependsOnConcinnityModule from the dmconcinnity schema - (BaseDMWGenerator.java:897)
import org.dmd.dmc.*;                                                               // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                     // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                    // Our base to provide definition set storage - (DMWGenerator.java:171)
import org.dmd.dmc.types.DefinitionName;                                            // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dmc.types.DotName;                                                   // To support the find method for definitions - (DSDefinitionModule.java:163)
import org.dmd.dms.ClassDefinition;                                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Attribute defFiles from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.SchemaAndReasonIterableDMW;                        // For multi-valued SchemaAndReason - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                 // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dms.generated.types.SchemaAndReason;                                 // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.gpb.server.extended.GpbCompositeType;                                // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbDefinition;                                   // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.gpb.server.extended.GpbEnum;                                         // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbField;                                        // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbMessage;                                      // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbModule;                                       // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.server.extended.GpbProtoFile;                                    // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbScalarType;                                   // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbType;                                         // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.generated.dmw.GpbModuleIterableDMW;                       // For multi-valued GpbModule - (BaseDMWGenerator.java:1709)
import org.dmd.gpb.server.generated.dsd.GpbModuleScopedInterface;                   // Required to manage module definition - (DMWGenerator.java:170)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                                // Attribute dependsOnGpbModule from the dmdgpb schema - (BaseDMWGenerator.java:897)
import org.dmd.gpb.shared.generated.dmo.GpbModuleDMO;                               // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                             // Required to access defined in module name - (DMWGenerator.java:181)



/**
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class GpbModuleDMW extends GpbDefinition implements DmcDefinitionIF, DmcNamedObjectIF, GpbModuleScopedInterface {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperDefinitions(DMWGenerator.java:204)
    DmcDefinitionSet<GpbDefinition>        GpbDefinitionDefs       = new DmcDefinitionSet<GpbDefinition>("GpbModule-allDefinitions");            // All definitions associated with this module
    DmcDefinitionSet<GpbCompositeType>     GpbCompositeTypeDefs    = new DmcDefinitionSet<GpbCompositeType>("GpbModule-GpbCompositeTypeDefs");   // All GpbCompositeType definitions
    DmcDefinitionSet<GpbEnum>              GpbEnumDefs             = new DmcDefinitionSet<GpbEnum>("GpbModule-GpbEnumDefs");                     // All GpbEnum definitions
    DmcDefinitionSet<GpbField>             GpbFieldDefs            = new DmcDefinitionSet<GpbField>("GpbModule-GpbFieldDefs");                   // All GpbField definitions
    DmcDefinitionSet<GpbMessage>           GpbMessageDefs          = new DmcDefinitionSet<GpbMessage>("GpbModule-GpbMessageDefs");               // All GpbMessage definitions
    DmcDefinitionSet<GpbModule>            GpbModuleDefs           = new DmcDefinitionSet<GpbModule>("GpbModule-GpbModuleDefs");                 // All GpbModule definitions
    DmcDefinitionSet<GpbProtoFile>         GpbProtoFileDefs        = new DmcDefinitionSet<GpbProtoFile>("GpbModule-GpbProtoFileDefs");           // All GpbProtoFile definitions
    DmcDefinitionSet<GpbScalarType>        GpbScalarTypeDefs       = new DmcDefinitionSet<GpbScalarType>("GpbModule-GpbScalarTypeDefs");         // All GpbScalarType definitions
    DmcDefinitionSet<GpbType>              GpbTypeDefs             = new DmcDefinitionSet<GpbType>("GpbModule-GpbTypeDefs");                     // All GpbType definitions

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public GpbModuleDMW() {
        super(new GpbModuleDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbModule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public GpbModuleDMW(DmcTypeModifierMV mods) {
        super(new GpbModuleDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbModule);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public GpbModule getModificationRecorder(){
        GpbModule rc = new GpbModule();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public GpbModuleDMW(GpbModuleDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbModule);
    }

    public GpbModule cloneIt() {
        GpbModule rc = new GpbModule();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbModuleDMO getDMO() {
        return((GpbModuleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected GpbModuleDMW(GpbModuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((GpbModuleDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbModuleDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbModuleDMW){
            return( getObjectName().equals( ((GpbModuleDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDefFilesSize(){
        return(((GpbModuleDMO) core).getDefFilesSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDefFilesIsEmpty(){
        if (((GpbModuleDMO) core).getDefFilesSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDefFilesHasValue(){
        if (((GpbModuleDMO) core).getDefFilesSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getDefFilesIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((GpbModuleDMO) core).getDefFiles()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDefFiles(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).addDefFiles(value);
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDefFiles(String value){
        ((GpbModuleDMO) core).addDefFiles(value);
    }

    /**
     * Returns true if the collection contains the defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean defFilesContains(String value){
        return(((GpbModuleDMO) core).defFilesContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDefFilesCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__defFiles);
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
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delDefFiles(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).delDefFiles(value);
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDefFiles(String value){
        ((GpbModuleDMO) core).delDefFiles(value);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDefFiles(){
        ((GpbModuleDMO) core).remDefFiles();
    }

    /**
     * @return The number of ConcinnityModule items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDependsOnConcinnityModuleSize(){
        return(((GpbModuleDMO) core).getDependsOnConcinnityModuleSize());
    }

    /**
     * @return true if there are no ConcinnityModuleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDependsOnConcinnityModuleIsEmpty(){
        if (((GpbModuleDMO) core).getDependsOnConcinnityModuleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ConcinnityModuleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDependsOnConcinnityModuleHasValue(){
        if (((GpbModuleDMO) core).getDependsOnConcinnityModuleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ConcinnityModuleDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public ConcinnityModuleIterableDMW getDependsOnConcinnityModuleIterable(){
        DmcAttribute<?> attr = core.get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null)
            return(ConcinnityModuleIterableDMW.emptyList);
        
        return(new ConcinnityModuleIterableDMW(((GpbModuleDMO) core).getDependsOnConcinnityModule()));
    }

    /**
     * Adds another dependsOnConcinnityModule value.
     * @param value A value compatible with ConcinnityModule
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addDependsOnConcinnityModule(ConcinnityModule value){
        DmcAttribute<?> attr = ((GpbModuleDMO) core).addDependsOnConcinnityModule(((ConcinnityModuleDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnConcinnityModule value.
     * @param value The ConcinnityModule to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delDependsOnConcinnityModule(ConcinnityModule value){
        ((GpbModuleDMO) core).delDependsOnConcinnityModule(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ConcinnityModule objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<ConcinnityModule> getDependsOnConcinnityModuleCopy(){
        DmcAttribute<?> attr = ((GpbModuleDMO) core).get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null)
            return(new ArrayList<ConcinnityModule>());
        
        ArrayList<ConcinnityModule> rc = new ArrayList<ConcinnityModule>(attr.getMVSize());
        
        ConcinnityModuleIterableDMW it = getDependsOnConcinnityModuleIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnConcinnityModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDependsOnConcinnityModule(){
        ((GpbModuleDMO) core).remDependsOnConcinnityModule();
    }

    /**
     * @return The number of GpbModule items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDependsOnGpbModuleSize(){
        return(((GpbModuleDMO) core).getDependsOnGpbModuleSize());
    }

    /**
     * @return true if there are no GpbModuleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDependsOnGpbModuleIsEmpty(){
        if (((GpbModuleDMO) core).getDependsOnGpbModuleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbModuleDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDependsOnGpbModuleHasValue(){
        if (((GpbModuleDMO) core).getDependsOnGpbModuleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbModuleDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public GpbModuleIterableDMW getDependsOnGpbModuleIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null)
            return(GpbModuleIterableDMW.emptyList);
        
        return(new GpbModuleIterableDMW(((GpbModuleDMO) core).getDependsOnGpbModule()));
    }

    /**
     * Adds another dependsOnGpbModule value.
     * @param value A value compatible with GpbModule
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addDependsOnGpbModule(GpbModule value){
        DmcAttribute<?> attr = ((GpbModuleDMO) core).addDependsOnGpbModule(((GpbModuleDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a dependsOnGpbModule value.
     * @param value The GpbModule to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delDependsOnGpbModule(GpbModule value){
        ((GpbModuleDMO) core).delDependsOnGpbModule(value.getDMO());
    }

    /**
     * @return A COPY of the collection of GpbModule objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<GpbModule> getDependsOnGpbModuleCopy(){
        DmcAttribute<?> attr = ((GpbModuleDMO) core).get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null)
            return(new ArrayList<GpbModule>());
        
        ArrayList<GpbModule> rc = new ArrayList<GpbModule>(attr.getMVSize());
        
        GpbModuleIterableDMW it = getDependsOnGpbModuleIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the dependsOnGpbModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDependsOnGpbModule(){
        ((GpbModuleDMO) core).remDependsOnGpbModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((GpbModuleDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((GpbModuleDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((GpbModuleDMO) core).getDescriptionSize() == 0)
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
        
        return(new StringIterableDMW(((GpbModuleDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((GpbModuleDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((GpbModuleDMO) core).descriptionContains(value));
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
        ((GpbModuleDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((GpbModuleDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((GpbModuleDMO) core).remDescription();
    }

    /**
     * @return The number of SchemaAndReason items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getLoadSchemaClassSize(){
        return(((GpbModuleDMO) core).getLoadSchemaClassSize());
    }

    /**
     * @return true if there are no SchemaAndReasonDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getLoadSchemaClassIsEmpty(){
        if (((GpbModuleDMO) core).getLoadSchemaClassSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SchemaAndReasonDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getLoadSchemaClassHasValue(){
        if (((GpbModuleDMO) core).getLoadSchemaClassSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SchemaAndReason objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public SchemaAndReasonIterableDMW getLoadSchemaClassIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return(SchemaAndReasonIterableDMW.emptyList);
        
        return(new SchemaAndReasonIterableDMW(((GpbModuleDMO) core).getLoadSchemaClass()));
    }

    /**
     * Adds another loadSchemaClass value.
     * @param value A value compatible with SchemaAndReason
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addLoadSchemaClass(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).addLoadSchemaClass(value);
    }

    /**
     * Adds another loadSchemaClass value.
     * @param value A value compatible with SchemaAndReason
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addLoadSchemaClass(SchemaAndReason value){
        ((GpbModuleDMO) core).addLoadSchemaClass(value);
    }

    /**
     * Returns true if the collection contains the loadSchemaClass value.
     * @param value A value compatible with SchemaAndReason
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean loadSchemaClassContains(SchemaAndReason value){
        return(((GpbModuleDMO) core).loadSchemaClassContains(value));
    }

    /**
     * @return A COPY of the collection of SchemaAndReason objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<SchemaAndReason> getLoadSchemaClassCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return(new ArrayList<SchemaAndReason>());
        
        ArrayList<SchemaAndReason> rc = new ArrayList<SchemaAndReason>(attr.getMVSize());
        
        Iterator<SchemaAndReason> it = (Iterator<SchemaAndReason>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a loadSchemaClass value.
     * @param value The SchemaAndReason to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delLoadSchemaClass(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).delLoadSchemaClass(value);
    }

    /**
     * Deletes a loadSchemaClass value.
     * @param value The SchemaAndReason to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delLoadSchemaClass(SchemaAndReason value){
        ((GpbModuleDMO) core).delLoadSchemaClass(value);
    }

    /**
     * Removes the loadSchemaClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remLoadSchemaClass(){
        ((GpbModuleDMO) core).remLoadSchemaClass();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((GpbModuleDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((GpbModuleDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((GpbModuleDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getPackage(){
        return(((GpbModuleDMO) core).getPackage());
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setPackage(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).setPackage(value);
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setPackage(String value){
        ((GpbModuleDMO) core).setPackage(value);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remPackage(){
        ((GpbModuleDMO) core).remPackage();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getVersion(){
        return(((GpbModuleDMO) core).getVersion());
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setVersion(Object value) throws DmcValueException {
        ((GpbModuleDMO) core).setVersion(value);
    }

    /**
     * Sets version to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setVersion(String value){
        ((GpbModuleDMO) core).setVersion(value);
    }

    /**
     * Removes the version attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remVersion(){
        ((GpbModuleDMO) core).remVersion();
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:212)
    /**
     * All definitions are added to the base definition collection.
     */
    void addGpbDefinition(GpbDefinition def){
        GpbDefinitionDefs.add(def);
    }

    public int getGpbDefinitionCount(){
        return(GpbDefinitionDefs.size());
    }

    public GpbDefinition getGpbDefinition(DotName name){
        return(GpbDefinitionDefs.getDefinition(name));
    }

    public Iterator<GpbDefinition> getAllGpbDefinition(){
        return(GpbDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbCompositeType(GpbCompositeType def){
        GpbCompositeTypeDefs.add(def);
        addGpbType(def);
    }

    public int getGpbCompositeTypeCount(){
        return(GpbCompositeTypeDefs.size());
    }

    public GpbCompositeType getGpbCompositeType(DotName name){
        return(GpbCompositeTypeDefs.getDefinition(name));
    }

    public Iterator<GpbCompositeType> getAllGpbCompositeType(){
        return(GpbCompositeTypeDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbEnum(GpbEnum def){
        GpbEnumDefs.add(def);
        addGpbCompositeType(def);
    }

    public int getGpbEnumCount(){
        return(GpbEnumDefs.size());
    }

    public GpbEnum getGpbEnum(DotName name){
        return(GpbEnumDefs.getDefinition(name));
    }

    public Iterator<GpbEnum> getAllGpbEnum(){
        return(GpbEnumDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbField(GpbField def){
        GpbFieldDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbFieldCount(){
        return(GpbFieldDefs.size());
    }

    public GpbField getGpbField(DotName name){
        return(GpbFieldDefs.getDefinition(name));
    }

    public Iterator<GpbField> getAllGpbField(){
        return(GpbFieldDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbMessage(GpbMessage def){
        GpbMessageDefs.add(def);
        addGpbCompositeType(def);
    }

    public int getGpbMessageCount(){
        return(GpbMessageDefs.size());
    }

    public GpbMessage getGpbMessage(DotName name){
        return(GpbMessageDefs.getDefinition(name));
    }

    public Iterator<GpbMessage> getAllGpbMessage(){
        return(GpbMessageDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbProtoFile(GpbProtoFile def){
        GpbProtoFileDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbProtoFileCount(){
        return(GpbProtoFileDefs.size());
    }

    public GpbProtoFile getGpbProtoFile(DotName name){
        return(GpbProtoFileDefs.getDefinition(name));
    }

    public Iterator<GpbProtoFile> getAllGpbProtoFile(){
        return(GpbProtoFileDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbScalarType(GpbScalarType def){
        GpbScalarTypeDefs.add(def);
        addGpbType(def);
    }

    public int getGpbScalarTypeCount(){
        return(GpbScalarTypeDefs.size());
    }

    public GpbScalarType getGpbScalarType(DotName name){
        return(GpbScalarTypeDefs.getDefinition(name));
    }

    public Iterator<GpbScalarType> getAllGpbScalarType(){
        return(GpbScalarTypeDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbType(GpbType def){
        GpbTypeDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbTypeCount(){
        return(GpbTypeDefs.size());
    }

    public GpbType getGpbType(DotName name){
        return(GpbTypeDefs.getDefinition(name));
    }

    public Iterator<GpbType> getAllGpbType(){
        return(GpbTypeDefs.values().iterator());
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:222)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        GpbModuleREF ref = ((GpbModuleDMO) core).getDefinedInGpbModule();
        return(ref.getName().getNameString());
    }


}
