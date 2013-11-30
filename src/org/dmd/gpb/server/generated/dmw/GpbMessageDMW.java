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
import org.dmd.gpb.server.extended.GpbElement;                         // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.gpb.server.extended.GpbMainElement;                     // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.gpb.server.extended.GpbMessage;                         // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.gpb.server.generated.dmw.GpbElementIterableDMW;         // For multi-valued GpbElement - (BaseDMWGenerator.java:1628)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                   // Attribute elements from the dmdgpb schema - (BaseDMWGenerator.java:821)
import org.dmd.gpb.shared.generated.dmo.GpbElementDMO;                 // For multi-valued adds of GpbElement - (BaseDMWGenerator.java:1686)
import org.dmd.gpb.shared.generated.dmo.GpbMessageDMO;                 // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)



/**
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class GpbMessageDMW extends GpbMainElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public GpbMessageDMW() {
        super(new GpbMessageDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public GpbMessageDMW(DmcTypeModifierMV mods) {
        super(new GpbMessageDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public GpbMessage getModificationRecorder(){
        GpbMessage rc = new GpbMessage();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public GpbMessageDMW(GpbMessageDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    public GpbMessage cloneIt() {
        GpbMessage rc = new GpbMessage();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbMessageDMO getDMO() {
        return((GpbMessageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected GpbMessageDMW(GpbMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1216)
    public DefinitionName getObjectName(){
        return(((GpbMessageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbMessageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbMessageDMW){
            return( getObjectName().equals( ((GpbMessageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of GpbElement items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getElementsSize(){
        return(((GpbMessageDMO) core).getElementsSize());
    }

    /**
     * @return true if there are no GpbElementDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getElementsIsEmpty(){
        if (((GpbMessageDMO) core).getElementsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbElementDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getElementsHasValue(){
        if (((GpbMessageDMO) core).getElementsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbElementDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1635)
    public GpbElementIterableDMW getElementsIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__elements);
        if (attr == null)
            return(GpbElementIterableDMW.emptyList);
        
        return(new GpbElementIterableDMW(((GpbMessageDMO) core).getElements()));
    }

    /**
     * Adds another elements value.
     * @param value A value compatible with GpbElement
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1692)
    public DmcAttribute<?> addElements(GpbElement value){
        DmcAttribute<?> attr = ((GpbMessageDMO) core).addElements(((GpbElementDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a elements value.
     * @param value The GpbElement to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1742)
    public void delElements(GpbElement value){
        ((GpbMessageDMO) core).delElements(value.getDMO());
    }

    /**
     * @return A COPY of the collection of GpbElement objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1806)
    public ArrayList<GpbElement> getElementsCopy(){
        DmcAttribute<?> attr = ((GpbMessageDMO) core).get(DmdgpbDMSAG.__elements);
        if (attr == null)
            return(new ArrayList<GpbElement>());
        
        ArrayList<GpbElement> rc = new ArrayList<GpbElement>(attr.getMVSize());
        
        GpbElementIterableDMW it = getElementsIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the elements attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remElements(){
        ((GpbMessageDMO) core).remElements();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DefinitionName getName(){
        return(((GpbMessageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setName(Object value) throws DmcValueException {
        ((GpbMessageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setName(DefinitionName value){
        ((GpbMessageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remName(){
        ((GpbMessageDMO) core).remName();
    }


}
