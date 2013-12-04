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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:129)
import java.util.Iterator;                                                // To allow access to our definitions - (DSDArtifactFormatter.java:127)
import org.dmd.dmc.definitions.DmcDefinitionSet;                          // Our base to provide definition set storage - (DSDArtifactFormatter.java:126)
import org.dmd.dms.DSDefinition;                                          // The base of all definitions - (DSDArtifactFormatter.java:125)
import org.dmd.gpb.server.extended.GpbArtifact;                           // A definition from the GpbModule Module - (DSDArtifactFormatter.java:171)
import org.dmd.gpb.server.extended.GpbDefinition;                         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:168)
import org.dmd.gpb.server.extended.GpbElement;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:171)
import org.dmd.gpb.server.extended.GpbModule;                             // A definition from the GpbModule Module - (DSDArtifactFormatter.java:171)
import org.dmd.gpb.server.extended.GpbProtoFile;                          // A definition from the GpbModule Module - (DSDArtifactFormatter.java:171)
import org.dmd.gpb.server.extended.GpbType;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:171)
import org.dmd.gpb.server.generated.dsd.GpbModuleGlobalInterface;         // Interface for GpbModule definitions - (DSDArtifactFormatter.java:165)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:133)
public class GpbModuleDefinitionManager implements GpbModuleGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:190)
    DmcDefinitionSet<GpbDefinition> GpbDefinitionDefs;
    DmcDefinitionSet<GpbType> GpbTypeDefs;
    DmcDefinitionSet<GpbElement> GpbElementDefs;
    DmcDefinitionSet<GpbArtifact> GpbArtifactDefs;
    DmcDefinitionSet<GpbProtoFile> GpbProtoFileDefs;
    DmcDefinitionSet<GpbModule> GpbModuleDefs;

    public GpbModuleDefinitionManager(){

        allDefinitions = new DmcDefinitionSet<DSDefinition>();

        GpbDefinitionDefs = new DmcDefinitionSet<GpbDefinition>();
        GpbTypeDefs = new DmcDefinitionSet<GpbType>();
        GpbElementDefs = new DmcDefinitionSet<GpbElement>();
        GpbArtifactDefs = new DmcDefinitionSet<GpbArtifact>();
        GpbProtoFileDefs = new DmcDefinitionSet<GpbProtoFile>();
        GpbModuleDefs = new DmcDefinitionSet<GpbModule>();

    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:213)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:208)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:243)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:243)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:243)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:243)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:243)
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

