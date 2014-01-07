package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                                // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.Iterator;                                                 // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.definitions.DmcDefinitionIF;                            // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.types.DefinitionName;                                   // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.dmw.StringIterableDMW;                        // For multi-valued String - (BaseDMWGenerator.java:2027)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.gpb.server.extended.GpbDefinition;                          // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.gpb.server.extended.GpbMainElement;                         // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.gpb.server.extended.GpbProtoFile;                           // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.gpb.server.generated.dmw.GpbMainElementIterableDMW;         // For multi-valued GpbMainElement - (BaseDMWGenerator.java:1633)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                       // Attribute import from the dmdgpb schema - (BaseDMWGenerator.java:821)
import org.dmd.gpb.shared.generated.dmo.GpbMainElementDMO;                 // For multi-valued adds of GpbMainElement - (BaseDMWGenerator.java:1691)
import org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO;                   // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)



/**
 * The GpbProtoFile is used to represent a single .proto file. It may be
 * parsed\n from an existing .proto file by the GpbDotProtoParser utility.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class GpbProtoFileDMW extends GpbDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public GpbProtoFileDMW() {
        super(new GpbProtoFileDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbProtoFile);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public GpbProtoFileDMW(DmcTypeModifierMV mods) {
        super(new GpbProtoFileDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbProtoFile);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public GpbProtoFile getModificationRecorder(){
        GpbProtoFile rc = new GpbProtoFile();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public GpbProtoFileDMW(GpbProtoFileDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbProtoFile);
    }

    public GpbProtoFile cloneIt() {
        GpbProtoFile rc = new GpbProtoFile();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbProtoFileDMO getDMO() {
        return((GpbProtoFileDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected GpbProtoFileDMW(GpbProtoFileDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public DefinitionName getObjectName(){
        return(((GpbProtoFileDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbProtoFileDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbProtoFileDMW){
            return( getObjectName().equals( ((GpbProtoFileDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getImportSize(){
        return(((GpbProtoFileDMO) core).getImportSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getImportIsEmpty(){
        if (((GpbProtoFileDMO) core).getImportSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getImportHasValue(){
        if (((GpbProtoFileDMO) core).getImportSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public StringIterableDMW getImportIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__import);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((GpbProtoFileDMO) core).getImport()));
    }

    /**
     * Adds another import value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addImport(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).addImport(value);
    }

    /**
     * Adds another import value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addImport(String value){
        ((GpbProtoFileDMO) core).addImport(value);
    }

    /**
     * Returns true if the collection contains the import value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean importContains(String value){
        return(((GpbProtoFileDMO) core).importContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getImportCopy(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__import);
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
     * Deletes a import value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delImport(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).delImport(value);
    }

    /**
     * Deletes a import value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delImport(String value){
        ((GpbProtoFileDMO) core).delImport(value);
    }

    /**
     * Removes the import attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remImport(){
        ((GpbProtoFileDMO) core).remImport();
    }

    /**
     * @return The number of GpbMainElement items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getMainElementsSize(){
        return(((GpbProtoFileDMO) core).getMainElementsSize());
    }

    /**
     * @return true if there are no GpbMainElementDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getMainElementsIsEmpty(){
        if (((GpbProtoFileDMO) core).getMainElementsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbMainElementDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getMainElementsHasValue(){
        if (((GpbProtoFileDMO) core).getMainElementsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbMainElementDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1640)
    public GpbMainElementIterableDMW getMainElementsIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            return(GpbMainElementIterableDMW.emptyList);
        
        return(new GpbMainElementIterableDMW(((GpbProtoFileDMO) core).getMainElements()));
    }

    /**
     * Adds another mainElements value.
     * @param value A value compatible with GpbMainElement
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1697)
    public DmcAttribute<?> addMainElements(GpbMainElement value){
        DmcAttribute<?> attr = ((GpbProtoFileDMO) core).addMainElements(((GpbMainElementDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mainElements value.
     * @param value The GpbMainElement to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1747)
    public void delMainElements(GpbMainElement value){
        ((GpbProtoFileDMO) core).delMainElements(value.getDMO());
    }

    /**
     * @return A COPY of the collection of GpbMainElement objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1811)
    public ArrayList<GpbMainElement> getMainElementsCopy(){
        DmcAttribute<?> attr = ((GpbProtoFileDMO) core).get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            return(new ArrayList<GpbMainElement>());
        
        ArrayList<GpbMainElement> rc = new ArrayList<GpbMainElement>(attr.getMVSize());
        
        GpbMainElementIterableDMW it = getMainElementsIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mainElements attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remMainElements(){
        ((GpbProtoFileDMO) core).remMainElements();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public DefinitionName getName(){
        return(((GpbProtoFileDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setName(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setName(DefinitionName value){
        ((GpbProtoFileDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remName(){
        ((GpbProtoFileDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public String getPackage(){
        return(((GpbProtoFileDMO) core).getPackage());
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setPackage(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setPackage(value);
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setPackage(String value){
        ((GpbProtoFileDMO) core).setPackage(value);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remPackage(){
        ((GpbProtoFileDMO) core).remPackage();
    }


}
