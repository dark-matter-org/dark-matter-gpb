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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:399)
import java.util.Iterator;                                   // To provide iterators over definitions - (DSDArtifactFormatter.java:396)
import org.dmd.dmc.types.DotName;                            // To support the find method for definitions - (DSDefinitionModule.java:163)
import org.dmd.gpb.server.extended.GpbCompositeType;         // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbDefinition;            // A definition from the GpbModule Module - (DSDefinitionModule.java:161)
import org.dmd.gpb.server.extended.GpbEnum;                  // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbField;                 // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbMessage;               // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbProtoFile;             // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbScalarType;            // A definition from the GpbModule Module - (DSDefinitionModule.java:174)
import org.dmd.gpb.server.extended.GpbType;                  // A definition from the GpbModule Module - (DSDefinitionModule.java:174)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:403)
/**
 * This interface is implemented by the generated wrapper class for the GpbModule module.
 */
public interface GpbModuleScopedInterface {

    public int getGpbDefinitionCount();
    public GpbDefinition getGpbDefinition(DotName name);
    public Iterator<GpbDefinition> getAllGpbDefinition();

    public void addGpbCompositeType(GpbCompositeType def);
    public int getGpbCompositeTypeCount();
    public GpbCompositeType getGpbCompositeType(DotName name);
    public Iterator<GpbCompositeType> getAllGpbCompositeType();

    public void addGpbEnum(GpbEnum def);
    public int getGpbEnumCount();
    public GpbEnum getGpbEnum(DotName name);
    public Iterator<GpbEnum> getAllGpbEnum();

    public void addGpbField(GpbField def);
    public int getGpbFieldCount();
    public GpbField getGpbField(DotName name);
    public Iterator<GpbField> getAllGpbField();

    public void addGpbMessage(GpbMessage def);
    public int getGpbMessageCount();
    public GpbMessage getGpbMessage(DotName name);
    public Iterator<GpbMessage> getAllGpbMessage();

    public void addGpbProtoFile(GpbProtoFile def);
    public int getGpbProtoFileCount();
    public GpbProtoFile getGpbProtoFile(DotName name);
    public Iterator<GpbProtoFile> getAllGpbProtoFile();

    public void addGpbScalarType(GpbScalarType def);
    public int getGpbScalarTypeCount();
    public GpbScalarType getGpbScalarType(DotName name);
    public Iterator<GpbScalarType> getAllGpbScalarType();

    public void addGpbType(GpbType def);
    public int getGpbTypeCount();
    public GpbType getGpbType(DotName name);
    public Iterator<GpbType> getAllGpbType();

}

