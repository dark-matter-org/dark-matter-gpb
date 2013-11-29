package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                            // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.definitions.DmcDefinitionIF;                        // The object is a domain specific definition - (BaseDMWGenerator.java:335)
import org.dmd.dmc.types.DefinitionName;                               // Is named by - (BaseDMWGenerator.java:985)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.gpb.server.extended.GpbDefinition;                      // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.gpb.server.extended.GpbElement;                         // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.gpb.server.extended.GpbProtoFile;                       // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.gpb.server.generated.dmw.GpbElementIterableDMW;         // For multi-valued GpbElement - (BaseDMWGenerator.java:1628)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                   // Attribute element from the dmdgpb schema - (BaseDMWGenerator.java:821)
import org.dmd.gpb.shared.generated.dmo.GpbElementDMO;                 // For multi-valued adds of GpbElement - (BaseDMWGenerator.java:1686)
import org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO;               // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)



/**
 * The GpbProtoFile is used to represent a single .proto file.
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

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
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
     * @return The number of GpbElement items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getElementSize(){
        return(((GpbProtoFileDMO) core).getElementSize());
    }

    /**
     * @return true if there are no GpbElementDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getElementIsEmpty(){
        if (((GpbProtoFileDMO) core).getElementSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbElementDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getElementHasValue(){
        if (((GpbProtoFileDMO) core).getElementSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbElementDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1635)
    public GpbElementIterableDMW getElementIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__element);
        if (attr == null)
            return(GpbElementIterableDMW.emptyList);
        
        return(new GpbElementIterableDMW(((GpbProtoFileDMO) core).getElement()));
    }

    /**
     * Adds another element value.
     * @param value A value compatible with GpbElement
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1692)
    public DmcAttribute<?> addElement(GpbElement value){
        DmcAttribute<?> attr = ((GpbProtoFileDMO) core).addElement(((GpbElementDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a element value.
     * @param value The GpbElement to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1742)
    public void delElement(GpbElement value){
        ((GpbProtoFileDMO) core).delElement(value.getDMO());
    }

    /**
     * @return A COPY of the collection of GpbElement objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1806)
    public ArrayList<GpbElement> getElementCopy(){
        DmcAttribute<?> attr = ((GpbProtoFileDMO) core).get(DmdgpbDMSAG.__element);
        if (attr == null)
            return(new ArrayList<GpbElement>());
        
        ArrayList<GpbElement> rc = new ArrayList<GpbElement>(attr.getMVSize());
        
        GpbElementIterableDMW it = getElementIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the element attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remElement(){
        ((GpbProtoFileDMO) core).remElement();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DefinitionName getName(){
        return(((GpbProtoFileDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setName(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setName(DefinitionName value){
        ((GpbProtoFileDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remName(){
        ((GpbProtoFileDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getPackage(){
        return(((GpbProtoFileDMO) core).getPackage());
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setPackage(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setPackage(value);
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setPackage(String value){
        ((GpbProtoFileDMO) core).setPackage(value);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remPackage(){
        ((GpbProtoFileDMO) core).remPackage();
    }


}