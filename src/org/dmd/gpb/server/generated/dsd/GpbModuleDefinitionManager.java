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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:114)
import java.util.Iterator;                                                // To allow access to our definitions - (DSDArtifactFormatter.java:112)
import org.dmd.dmc.definitions.DmcDefinitionSet;                          // Our base to provide definition set storage - (DSDArtifactFormatter.java:111)
import org.dmd.gpb.server.extended.GpbArtifact;                           // A definition from the GpbModule Module - (DSDArtifactFormatter.java:152)
import org.dmd.gpb.server.extended.GpbDefinition;                         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:149)
import org.dmd.gpb.server.extended.GpbEnum;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:152)
import org.dmd.gpb.server.extended.GpbField;                              // A definition from the GpbModule Module - (DSDArtifactFormatter.java:152)
import org.dmd.gpb.server.extended.GpbMessage;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:152)
import org.dmd.gpb.server.extended.GpbModule;                             // A definition from the GpbModule Module - (DSDArtifactFormatter.java:152)
import org.dmd.gpb.server.extended.GpbType;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:152)
import org.dmd.gpb.server.generated.dsd.GpbModuleGlobalInterface;         // Interface for GpbModule definitions - (DSDArtifactFormatter.java:146)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:118)
public class GpbModuleDefinitionManager implements GpbModuleGlobalInterface {

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:171)
    DmcDefinitionSet<GpbDefinition> GpbDefinitionDefs;
    DmcDefinitionSet<GpbType> GpbTypeDefs;
    DmcDefinitionSet<GpbEnum> GpbEnumDefs;
    DmcDefinitionSet<GpbField> GpbFieldDefs;
    DmcDefinitionSet<GpbMessage> GpbMessageDefs;
    DmcDefinitionSet<GpbArtifact> GpbArtifactDefs;
    DmcDefinitionSet<GpbModule> GpbModuleDefs;

    public GpbModuleDefinitionManager(){

        GpbDefinitionDefs = new DmcDefinitionSet<GpbDefinition>();
        GpbTypeDefs = new DmcDefinitionSet<GpbType>();
        GpbEnumDefs = new DmcDefinitionSet<GpbEnum>();
        GpbFieldDefs = new DmcDefinitionSet<GpbField>();
        GpbMessageDefs = new DmcDefinitionSet<GpbMessage>();
        GpbArtifactDefs = new DmcDefinitionSet<GpbArtifact>();
        GpbModuleDefs = new DmcDefinitionSet<GpbModule>();

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:191)
    /**
     * All definitions are added to the base definition collection.
     */
    void addGpbDefinition(GpbDefinition def){
        GpbDefinitionDefs.add(def);
    }

    public int getGpbDefinitionCount(){
        return(GpbDefinitionDefs.size());
    }

    public Iterator<GpbDefinition> getAllGpbDefinition(){
        return(GpbDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
    public void addGpbEnum(GpbEnum def){
        GpbEnumDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbEnumCount(){
        return(GpbEnumDefs.size());
    }

    public Iterator<GpbEnum> getAllGpbEnum(){
        return(GpbEnumDefs.values().iterator());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
    public void addGpbField(GpbField def){
        GpbFieldDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbFieldCount(){
        return(GpbFieldDefs.size());
    }

    public Iterator<GpbField> getAllGpbField(){
        return(GpbFieldDefs.values().iterator());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
    public void addGpbMessage(GpbMessage def){
        GpbMessageDefs.add(def);
        addGpbDefinition(def);
    }

    public int getGpbMessageCount(){
        return(GpbMessageDefs.size());
    }

    public Iterator<GpbMessage> getAllGpbMessage(){
        return(GpbMessageDefs.values().iterator());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
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


}

