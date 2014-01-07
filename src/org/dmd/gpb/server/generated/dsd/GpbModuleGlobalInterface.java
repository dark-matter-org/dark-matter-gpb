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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:247)
import java.util.Iterator;                                // To provide iterators over definitions - (DSDArtifactFormatter.java:244)
import org.dmd.gpb.server.extended.GpbArtifact;           // A definition from the GpbModule Module - (DSDefinitionModule.java:171)
import org.dmd.gpb.server.extended.GpbDefinition;         // A definition from the GpbModule Module - (DSDefinitionModule.java:160)
import org.dmd.gpb.server.extended.GpbElement;            // A definition from the GpbModule Module - (DSDefinitionModule.java:171)
import org.dmd.gpb.server.extended.GpbModule;             // A definition from the GpbModule Module - (DSDefinitionModule.java:171)
import org.dmd.gpb.server.extended.GpbProtoFile;          // A definition from the GpbModule Module - (DSDefinitionModule.java:171)
import org.dmd.gpb.server.extended.GpbType;               // A definition from the GpbModule Module - (DSDefinitionModule.java:171)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:251)
/**
 * This interface is implemented by definition managers that store definitions from the GpbModule module.
 */
public interface GpbModuleGlobalInterface {

    public int getGpbDefinitionCount();
    public Iterator<GpbDefinition> getAllGpbDefinition();

    public void addGpbType(GpbType def);
    public int getGpbTypeCount();
    public Iterator<GpbType> getAllGpbType();

    public void addGpbElement(GpbElement def);
    public int getGpbElementCount();
    public Iterator<GpbElement> getAllGpbElement();

    public void addGpbArtifact(GpbArtifact def);
    public int getGpbArtifactCount();
    public Iterator<GpbArtifact> getAllGpbArtifact();

    public void addGpbProtoFile(GpbProtoFile def);
    public int getGpbProtoFileCount();
    public Iterator<GpbProtoFile> getAllGpbProtoFile();

    public void addGpbModule(GpbModule def);
    public int getGpbModuleCount();
    public Iterator<GpbModule> getAllGpbModule();

}
