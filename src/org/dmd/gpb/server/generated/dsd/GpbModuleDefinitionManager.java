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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:105)
import org.dmd.dmc.definitions.DmcDefinitionSet;          // Our base to provide definition set storage - (DSDArtifactFormatter.java:103)
import org.dmd.gpb.server.extended.GpbArtifact;           // A definition from the GpbModule Module - (DSDArtifactFormatter.java:138)
import org.dmd.gpb.server.extended.GpbDefinition;         // A definition from the GpbModule Module - (DSDArtifactFormatter.java:135)
import org.dmd.gpb.server.extended.GpbEnum;               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:138)
import org.dmd.gpb.server.extended.GpbField;              // A definition from the GpbModule Module - (DSDArtifactFormatter.java:138)
import org.dmd.gpb.server.extended.GpbMessage;            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:138)
import org.dmd.gpb.server.extended.GpbType;               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:138)

// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:109)
public class GpbModuleDefinitionManager {

    DmcDefinitionSet<GpbDefinition> GpbDefinitionDefs;
    DmcDefinitionSet<GpbType> GpbTypeDefs;
    DmcDefinitionSet<GpbEnum> GpbEnumDefs;
    DmcDefinitionSet<GpbField> GpbFieldDefs;
    DmcDefinitionSet<GpbMessage> GpbMessageDefs;
    DmcDefinitionSet<GpbArtifact> GpbArtifactDefs;

    GpbModuleDefinitionManager(){

        GpbDefinitionDefs = new DmcDefinitionSet<GpbDefinition>();
        GpbTypeDefs = new DmcDefinitionSet<GpbType>();
        GpbEnumDefs = new DmcDefinitionSet<GpbEnum>();
        GpbFieldDefs = new DmcDefinitionSet<GpbField>();
        GpbMessageDefs = new DmcDefinitionSet<GpbMessage>();
        GpbArtifactDefs = new DmcDefinitionSet<GpbArtifact>();

    }

}

