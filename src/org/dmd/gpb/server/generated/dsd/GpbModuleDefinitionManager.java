//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:130)
import java.util.Iterator;                                                // To allow access to our definitions - (DSDArtifactFormatter.java:128)
import org.dmd.dmc.definitions.DmcDefinitionSet;                          // Our base to provide definition set storage - (DSDArtifactFormatter.java:127)
import org.dmd.dms.DSDefinition;                                          // The base of all definitions - (DSDArtifactFormatter.java:126)
import org.dmd.gpb.server.extended.GpbArtifact;                           // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbDefinition;                         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:169)
import org.dmd.gpb.server.extended.GpbElement;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbEnum;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbField;                              // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbMainElement;                        // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbMessage;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbModule;                             // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbProtoFile;                          // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.extended.GpbType;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:173)
import org.dmd.gpb.server.generated.dsd.GpbModuleGlobalInterface;         // Interface for GpbModule definitions - (DSDArtifactFormatter.java:166)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:134)
public class GpbModuleDefinitionManager implements GpbModuleGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:192)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:217)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:213)
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

    public Iterator<GpbDefinition> getAllGpbDefinition(){
        return(GpbDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbArtifact(GpbArtifact def){
        GpbArtifactDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbArtifactCount(){
        return(GpbArtifactDefs.size());
    }

    public Iterator<GpbArtifact> getAllGpbArtifact(){
        return(GpbArtifactDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbElement(GpbElement def){
        GpbElementDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbElementCount(){
        return(GpbElementDefs.size());
    }

    public Iterator<GpbElement> getAllGpbElement(){
        return(GpbElementDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbEnum(GpbEnum def){
        GpbEnumDefs.add(def);
        addGpbMainElement(def);
    }

    public int getGpbEnumCount(){
        return(GpbEnumDefs.size());
    }

    public Iterator<GpbEnum> getAllGpbEnum(){
        return(GpbEnumDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbField(GpbField def){
        GpbFieldDefs.add(def);
        addGpbElement(def);
    }

    public int getGpbFieldCount(){
        return(GpbFieldDefs.size());
    }

    public Iterator<GpbField> getAllGpbField(){
        return(GpbFieldDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbMainElement(GpbMainElement def){
        GpbMainElementDefs.add(def);
        addGpbElement(def);
    }

    public int getGpbMainElementCount(){
        return(GpbMainElementDefs.size());
    }

    public Iterator<GpbMainElement> getAllGpbMainElement(){
        return(GpbMainElementDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbMessage(GpbMessage def){
        GpbMessageDefs.add(def);
        addGpbMainElement(def);
    }

    public int getGpbMessageCount(){
        return(GpbMessageDefs.size());
    }

    public Iterator<GpbMessage> getAllGpbMessage(){
        return(GpbMessageDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbModule(GpbModule def){
        GpbModuleDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbModuleCount(){
        return(GpbModuleDefs.size());
    }

    public Iterator<GpbModule> getAllGpbModule(){
        return(GpbModuleDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbProtoFile(GpbProtoFile def){
        GpbProtoFileDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbProtoFileCount(){
        return(GpbProtoFileDefs.size());
    }

    public Iterator<GpbProtoFile> getAllGpbProtoFile(){
        return(GpbProtoFileDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:248)
    public void addGpbType(GpbType def){
        GpbTypeDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbTypeCount(){
        return(GpbTypeDefs.size());
    }

    public Iterator<GpbType> getAllGpbType(){
        return(GpbTypeDefs.values().iterator());
    }


}

