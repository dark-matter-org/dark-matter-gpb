package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                   // To support getMVCopy() - (BaseDMWGenerator.java:1181)
import java.util.Iterator;                                                    // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                               // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                      // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                           // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.gpb.server.extended.GpbCompositeType;                          // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.gpb.server.extended.GpbMessage;                                // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeIterableDMW;          // For multi-valued GpbCompositeType - (BaseDMWGenerator.java:1709)
import org.dmd.gpb.server.generated.dmw.GpbFieldIndicatorIterableDMW;         // For multi-valued GpbFieldIndicator - (BaseDMWGenerator.java:2103)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                          // Attribute embed from the dmdgpb schema - (BaseDMWGenerator.java:897)
import org.dmd.gpb.shared.generated.dmo.GpbCompositeTypeDMO;                  // For multi-valued adds of GpbCompositeType - (BaseDMWGenerator.java:1767)
import org.dmd.gpb.shared.generated.dmo.GpbMessageDMO;                        // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                       // Required to access defined in module name - (DMWGenerator.java:181)
import org.dmd.gpb.shared.types.GpbFieldIndicator;                            // Primitive type - (BaseDMWGenerator.java:1150)



/**
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class GpbMessageDMW extends GpbCompositeType implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public GpbMessageDMW() {
        super(new GpbMessageDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public GpbMessageDMW(DmcTypeModifierMV mods) {
        super(new GpbMessageDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public GpbMessage getModificationRecorder(){
        GpbMessage rc = new GpbMessage();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected GpbMessageDMW(GpbMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
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
     * @return The number of GpbCompositeType items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getEmbedSize(){
        return(((GpbMessageDMO) core).getEmbedSize());
    }

    /**
     * @return true if there are no GpbCompositeTypeDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getEmbedIsEmpty(){
        if (((GpbMessageDMO) core).getEmbedSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbCompositeTypeDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getEmbedHasValue(){
        if (((GpbMessageDMO) core).getEmbedSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbCompositeTypeDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public GpbCompositeTypeIterableDMW getEmbedIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__embed);
        if (attr == null)
            return(GpbCompositeTypeIterableDMW.emptyList);
        
        return(new GpbCompositeTypeIterableDMW(((GpbMessageDMO) core).getEmbed()));
    }

    /**
     * Adds another embed value.
     * @param value A value compatible with GpbCompositeType
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addEmbed(GpbCompositeType value){
        DmcAttribute<?> attr = ((GpbMessageDMO) core).addEmbed(((GpbCompositeTypeDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a embed value.
     * @param value The GpbCompositeType to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delEmbed(GpbCompositeType value){
        ((GpbMessageDMO) core).delEmbed(value.getDMO());
    }

    /**
     * @return A COPY of the collection of GpbCompositeType objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<GpbCompositeType> getEmbedCopy(){
        DmcAttribute<?> attr = ((GpbMessageDMO) core).get(DmdgpbDMSAG.__embed);
        if (attr == null)
            return(new ArrayList<GpbCompositeType>());
        
        ArrayList<GpbCompositeType> rc = new ArrayList<GpbCompositeType>(attr.getMVSize());
        
        GpbCompositeTypeIterableDMW it = getEmbedIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the embed attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remEmbed(){
        ((GpbMessageDMO) core).remEmbed();
    }

    /**
     * @return The number of GpbFieldIndicator items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getFieldSize(){
        return(((GpbMessageDMO) core).getFieldSize());
    }

    /**
     * @return true if there are no GpbFieldIndicatorDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getFieldIsEmpty(){
        if (((GpbMessageDMO) core).getFieldSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbFieldIndicatorDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getFieldHasValue(){
        if (((GpbMessageDMO) core).getFieldSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbFieldIndicator objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public GpbFieldIndicatorIterableDMW getFieldIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__field);
        if (attr == null)
            return(GpbFieldIndicatorIterableDMW.emptyList);
        
        return(new GpbFieldIndicatorIterableDMW(((GpbMessageDMO) core).getField()));
    }

    /**
     * Adds another field value.
     * @param value A value compatible with GpbFieldIndicator
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addField(Object value) throws DmcValueException {
        ((GpbMessageDMO) core).addField(value);
    }

    /**
     * Adds another field value.
     * @param value A value compatible with GpbFieldIndicator
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addField(GpbFieldIndicator value){
        ((GpbMessageDMO) core).addField(value);
    }

    /**
     * Returns true if the collection contains the field value.
     * @param value A value compatible with GpbFieldIndicator
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean fieldContains(GpbFieldIndicator value){
        return(((GpbMessageDMO) core).fieldContains(value));
    }

    /**
     * @return A COPY of the collection of GpbFieldIndicator objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<GpbFieldIndicator> getFieldCopy(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__field);
        if (attr == null)
            return(new ArrayList<GpbFieldIndicator>());
        
        ArrayList<GpbFieldIndicator> rc = new ArrayList<GpbFieldIndicator>(attr.getMVSize());
        
        Iterator<GpbFieldIndicator> it = (Iterator<GpbFieldIndicator>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a field value.
     * @param value The GpbFieldIndicator to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delField(Object value) throws DmcValueException {
        ((GpbMessageDMO) core).delField(value);
    }

    /**
     * Deletes a field value.
     * @param value The GpbFieldIndicator to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delField(GpbFieldIndicator value){
        ((GpbMessageDMO) core).delField(value);
    }

    /**
     * Removes the field attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remField(){
        ((GpbMessageDMO) core).remField();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((GpbMessageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((GpbMessageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((GpbMessageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((GpbMessageDMO) core).remName();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:222)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        GpbModuleREF ref = ((GpbMessageDMO) core).getDefinedInGpbModule();
        return(ref.getName().getNameString());
    }


}
