//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                  // To support getMVCopy() - (BaseDMWGenerator.java:1181)
import java.util.Iterator;                                                   // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                        // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                              // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                     // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                          // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.dmw.StringIterableDMW;                          // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.gpb.server.extended.GpbCompositeType;                         // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.gpb.server.extended.GpbDefinition;                            // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.gpb.server.extended.GpbProtoFile;                             // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeIterableDMW;         // For multi-valued GpbCompositeType - (BaseDMWGenerator.java:1709)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                         // Attribute import from the dmdgpb schema - (BaseDMWGenerator.java:897)
import org.dmd.gpb.shared.generated.dmo.GpbCompositeTypeDMO;                 // For multi-valued adds of GpbCompositeType - (BaseDMWGenerator.java:1767)
import org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO;                     // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                      // Required to access defined in module name - (DMWGenerator.java:180)



/**
 * The GpbProtoFile is used to represent a single .proto file. It may be
 * parsed\n from an existing .proto file by the GpbDotProtoParser utility.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class GpbProtoFileDMW extends GpbDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public GpbProtoFileDMW() {
        super(new GpbProtoFileDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbProtoFile);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public GpbProtoFileDMW(DmcTypeModifierMV mods) {
        super(new GpbProtoFileDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbProtoFile);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public GpbProtoFile getModificationRecorder(){
        GpbProtoFile rc = new GpbProtoFile();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected GpbProtoFileDMW(GpbProtoFileDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getGeneratedFileName(){
        return(((GpbProtoFileDMO) core).getGeneratedFileName());
    }

    /**
     * Sets generatedFileName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setGeneratedFileName(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setGeneratedFileName(value);
    }

    /**
     * Sets generatedFileName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setGeneratedFileName(String value){
        ((GpbProtoFileDMO) core).setGeneratedFileName(value);
    }

    /**
     * Removes the generatedFileName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGeneratedFileName(){
        ((GpbProtoFileDMO) core).remGeneratedFileName();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getImportSize(){
        return(((GpbProtoFileDMO) core).getImportSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getImportIsEmpty(){
        if (((GpbProtoFileDMO) core).getImportSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getImportHasValue(){
        if (((GpbProtoFileDMO) core).getImportSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addImport(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).addImport(value);
    }

    /**
     * Adds another import value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addImport(String value){
        ((GpbProtoFileDMO) core).addImport(value);
    }

    /**
     * Returns true if the collection contains the import value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean importContains(String value){
        return(((GpbProtoFileDMO) core).importContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delImport(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).delImport(value);
    }

    /**
     * Deletes a import value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delImport(String value){
        ((GpbProtoFileDMO) core).delImport(value);
    }

    /**
     * Removes the import attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remImport(){
        ((GpbProtoFileDMO) core).remImport();
    }

    /**
     * @return The number of GpbCompositeType items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getMainElementsSize(){
        return(((GpbProtoFileDMO) core).getMainElementsSize());
    }

    /**
     * @return true if there are no GpbCompositeTypeDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getMainElementsIsEmpty(){
        if (((GpbProtoFileDMO) core).getMainElementsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any GpbCompositeTypeDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getMainElementsHasValue(){
        if (((GpbProtoFileDMO) core).getMainElementsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of GpbCompositeTypeDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public GpbCompositeTypeIterableDMW getMainElementsIterable(){
        DmcAttribute<?> attr = core.get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            return(GpbCompositeTypeIterableDMW.emptyList);
        
        return(new GpbCompositeTypeIterableDMW(((GpbProtoFileDMO) core).getMainElements()));
    }

    /**
     * Adds another mainElements value.
     * @param value A value compatible with GpbCompositeType
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addMainElements(GpbCompositeType value){
        DmcAttribute<?> attr = ((GpbProtoFileDMO) core).addMainElements(((GpbCompositeTypeDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mainElements value.
     * @param value The GpbCompositeType to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delMainElements(GpbCompositeType value){
        ((GpbProtoFileDMO) core).delMainElements(value.getDMO());
    }

    /**
     * @return A COPY of the collection of GpbCompositeType objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<GpbCompositeType> getMainElementsCopy(){
        DmcAttribute<?> attr = ((GpbProtoFileDMO) core).get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            return(new ArrayList<GpbCompositeType>());
        
        ArrayList<GpbCompositeType> rc = new ArrayList<GpbCompositeType>(attr.getMVSize());
        
        GpbCompositeTypeIterableDMW it = getMainElementsIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mainElements attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remMainElements(){
        ((GpbProtoFileDMO) core).remMainElements();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((GpbProtoFileDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((GpbProtoFileDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((GpbProtoFileDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getPackage(){
        return(((GpbProtoFileDMO) core).getPackage());
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setPackage(Object value) throws DmcValueException {
        ((GpbProtoFileDMO) core).setPackage(value);
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setPackage(String value){
        ((GpbProtoFileDMO) core).setPackage(value);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remPackage(){
        ((GpbProtoFileDMO) core).remPackage();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:221)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        GpbModuleREF ref = ((GpbProtoFileDMO) core).getDefinedInGpbModule();
        return(ref.getName().getNameString());
    }


}
