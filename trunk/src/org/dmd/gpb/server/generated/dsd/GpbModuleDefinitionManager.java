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
package org.dmd.gpb.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:146)
import java.util.Iterator;                                                // To allow access to our definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcAttributeInfo;                                      // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashException;                                 // Used when resolving clashes - (DSDArtifactFormatter.java:144)
import org.dmd.dmc.DmcNameClashObjectSet;                                 // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashResolverIF;                                // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                     // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcNamedObjectIF;                                      // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObject;                                             // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcObjectName;                                         // To support object resolution - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueException;                                     // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcValueExceptionSet;                                  // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.definitions.DmcDefinitionSet;                          // Our base to provide definition set storage - (DSDArtifactFormatter.java:132)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDArtifactFormatter.java:134)
import org.dmd.dms.DSDefinition;                                          // The base of all definitions - (DSDArtifactFormatter.java:131)
import org.dmd.gpb.server.extended.GpbCompositeType;                      // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbDefinition;                         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:279)
import org.dmd.gpb.server.extended.GpbEnum;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbField;                              // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbMessage;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbModule;                             // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbProtoFile;                          // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbScalarType;                         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.extended.GpbType;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:283)
import org.dmd.gpb.server.generated.dsd.GpbModuleGlobalInterface;         // Interface for GpbModule definitions - (DSDArtifactFormatter.java:276)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:150)
public class GpbModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, GpbModuleGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:302)
    DmcDefinitionSet<GpbDefinition> GpbDefinitionDefs;
    DmcDefinitionSet<GpbCompositeType> GpbCompositeTypeDefs;
    DmcDefinitionSet<GpbEnum> GpbEnumDefs;
    DmcDefinitionSet<GpbField> GpbFieldDefs;
    DmcDefinitionSet<GpbMessage> GpbMessageDefs;
    DmcDefinitionSet<GpbModule> GpbModuleDefs;
    DmcDefinitionSet<GpbProtoFile> GpbProtoFileDefs;
    DmcDefinitionSet<GpbScalarType> GpbScalarTypeDefs;
    DmcDefinitionSet<GpbType> GpbTypeDefs;

    public GpbModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:329)
        GpbDefinitionDefs = new DmcDefinitionSet<GpbDefinition>("GpbDefinition", allDefinitions);
        GpbCompositeTypeDefs = new DmcDefinitionSet<GpbCompositeType>("GpbCompositeType", allDefinitions);
        GpbEnumDefs = new DmcDefinitionSet<GpbEnum>("GpbEnum", allDefinitions);
        GpbFieldDefs = new DmcDefinitionSet<GpbField>("GpbField", allDefinitions);
        GpbMessageDefs = new DmcDefinitionSet<GpbMessage>("GpbMessage", allDefinitions);
        GpbModuleDefs = new DmcDefinitionSet<GpbModule>("GpbModule", allDefinitions);
        GpbProtoFileDefs = new DmcDefinitionSet<GpbProtoFile>("GpbProtoFile", allDefinitions);
        GpbScalarTypeDefs = new DmcDefinitionSet<GpbScalarType>("GpbScalarType", allDefinitions);
        GpbTypeDefs = new DmcDefinitionSet<GpbType>("GpbType", allDefinitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:166)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:174)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:191)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:197)
    @Override
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:217)
    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DotName dn = new DotName(name.getNameString() + "." + ai.type);
    
        // The name might contain module.defname, in which case we'll try to look it up
        // using a fully qualified DotName of the form module.defname.type. Otherwise,
        // we use the getDefinitionByNameAndType() form of the lookup.
        if (name.getNameString().indexOf(".") == -1){
            try{
                rc = allDefinitions.getDefinitionByNameAndType(dn);
            } catch (DmcNameClashException e) {
                rc = resolver.resolveClash(object, ai, e.getClashSet());
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:240)
    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinition resolving = (DSDefinition) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:323)
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
    public void addGpbModule(GpbModule def){
        GpbModuleDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbModuleCount(){
        return(GpbModuleDefs.size());
    }

    public GpbModule getGpbModule(DotName name){
        return(GpbModuleDefs.getDefinition(name));
    }

    public Iterator<GpbModule> getAllGpbModule(){
        return(GpbModuleDefs.values().iterator());
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


}

