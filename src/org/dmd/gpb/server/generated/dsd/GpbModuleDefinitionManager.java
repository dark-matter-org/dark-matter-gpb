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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:144)
import java.util.Iterator;                                                // To allow access to our definitions - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.DmcAttributeInfo;                                      // Used when resolving clashes - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcNameClashException;                                 // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashObjectSet;                                 // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcNameClashResolverIF;                                // To support object resolution - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                     // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNamedObjectIF;                                      // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcObject;                                             // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObjectName;                                         // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcValueException;                                     // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueExceptionSet;                                  // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.definitions.DmcDefinitionSet;                          // Our base to provide definition set storage - (DSDArtifactFormatter.java:130)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDArtifactFormatter.java:132)
import org.dmd.dms.DSDefinition;                                          // The base of all definitions - (DSDArtifactFormatter.java:129)
import org.dmd.gpb.server.extended.GpbArtifact;                           // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbDefinition;                         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:256)
import org.dmd.gpb.server.extended.GpbElement;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbEnum;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbField;                              // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbMainElement;                        // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbMessage;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbModule;                             // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbProtoFile;                          // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.extended.GpbType;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:260)
import org.dmd.gpb.server.generated.dsd.GpbModuleGlobalInterface;         // Interface for GpbModule definitions - (DSDArtifactFormatter.java:253)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:148)
public class GpbModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, GpbModuleGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:279)
    DmcDefinitionSet<GpbDefinition> GpbDefinitionDefs;
    DmcDefinitionSet<GpbArtifact> GpbArtifactDefs;
    DmcDefinitionSet<GpbElement> GpbElementDefs;
    DmcDefinitionSet<GpbEnum> GpbEnumDefs;
    DmcDefinitionSet<GpbField> GpbFieldDefs;
    DmcDefinitionSet<GpbMainElement> GpbMainElementDefs;
    DmcDefinitionSet<GpbMessage> GpbMessageDefs;
    DmcDefinitionSet<GpbModule> GpbModuleDefs;
    DmcDefinitionSet<GpbProtoFile> GpbProtoFileDefs;
    DmcDefinitionSet<GpbType> GpbTypeDefs;

    public GpbModuleDefinitionManager(){

        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        GpbDefinitionDefs = new DmcDefinitionSet<GpbDefinition>("GpbDefinitionDefs");
        GpbArtifactDefs = new DmcDefinitionSet<GpbArtifact>("GpbArtifactDefs");
        GpbElementDefs = new DmcDefinitionSet<GpbElement>("GpbElementDefs");
        GpbEnumDefs = new DmcDefinitionSet<GpbEnum>("GpbEnumDefs");
        GpbFieldDefs = new DmcDefinitionSet<GpbField>("GpbFieldDefs");
        GpbMainElementDefs = new DmcDefinitionSet<GpbMainElement>("GpbMainElementDefs");
        GpbMessageDefs = new DmcDefinitionSet<GpbMessage>("GpbMessageDefs");
        GpbModuleDefs = new DmcDefinitionSet<GpbModule>("GpbModuleDefs");
        GpbProtoFileDefs = new DmcDefinitionSet<GpbProtoFile>("GpbProtoFileDefs");
        GpbTypeDefs = new DmcDefinitionSet<GpbType>("GpbTypeDefs");

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:163)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

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

    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

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

    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        try{
            rc = allDefinitions.getDefinition(name.getNameString());
        } catch (DmcNameClashException e) {
            rc = resolver.resolveClash(object, ai, e.getClashSet());
        }
    
        return(rc);
    }

    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        System.out.println("***********\n\n");
        System.out.println(obj.toOIF() + "\n\n");
        System.out.println("***********\n\n");
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            System.out.println(def.toOIF() + "\n");
        }
        return null;
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:300)
    /**
     * All definitions are added to the base definition collection.
     */
    void addGpbDefinition(GpbDefinition def){
        GpbDefinitionDefs.add(def);
        allDefinitions.add(def);
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
    public void addGpbArtifact(GpbArtifact def){
        GpbArtifactDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbArtifactCount(){
        return(GpbArtifactDefs.size());
    }

    public GpbArtifact getGpbArtifact(DotName name){
        return(GpbArtifactDefs.getDefinition(name));
    }

    public Iterator<GpbArtifact> getAllGpbArtifact(){
        return(GpbArtifactDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbElement(GpbElement def){
        GpbElementDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbElementCount(){
        return(GpbElementDefs.size());
    }

    public GpbElement getGpbElement(DotName name){
        return(GpbElementDefs.getDefinition(name));
    }

    public Iterator<GpbElement> getAllGpbElement(){
        return(GpbElementDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbEnum(GpbEnum def){
        GpbEnumDefs.add(def);
        addGpbMainElement(def);
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
        addGpbElement(def);
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
    public void addGpbMainElement(GpbMainElement def){
        GpbMainElementDefs.add(def);
        addGpbElement(def);
    }

    public int getGpbMainElementCount(){
        return(GpbMainElementDefs.size());
    }

    public GpbMainElement getGpbMainElement(DotName name){
        return(GpbMainElementDefs.getDefinition(name));
    }

    public Iterator<GpbMainElement> getAllGpbMainElement(){
        return(GpbMainElementDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addGpbMessage(GpbMessage def){
        GpbMessageDefs.add(def);
        addGpbMainElement(def);
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

