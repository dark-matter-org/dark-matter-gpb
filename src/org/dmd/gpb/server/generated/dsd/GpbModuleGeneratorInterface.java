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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:1208)
import java.io.IOException;                                                 // May occur during artifact generation - (DSDArtifactFormatter.java:1203)
import org.dmd.gpb.server.extended.GpbModule;                               // The base module for generation - (DSDArtifactFormatter.java:1201)
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;         // All parsed definition - (DSDArtifactFormatter.java:1206)
import org.dmd.util.exceptions.ResultException;                             // For problems found after parsing - (DSDArtifactFormatter.java:1205)
import org.dmd.util.parsing.ConfigLocation;                                 // Where the config was loaded from - (DSDArtifactFormatter.java:1204)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGeneratorInterface(DSDArtifactFormatter.java:1210)
public interface GpbModuleGeneratorInterface {

    /**
     * Called prior to the object resolution phase so that derived classes can perform intermediate 
     * processing such as generation of internal types.
     * @param module the module that was just parsed
     * @param location the module's location
     * @param definitions the current set of definitions
     */
    public void parsingComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException;

    /**
     * Called after object resolution has completely succsessfully. This allows for 
     * application of business logic not defined as part of rules etc.
     * @param module the module that was just parsed
     * @param location the module's location
     * @param definitions the current set of definitions
     */
    public void objectResolutionComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException;

    /**
     * Derived classes should overload this method to perform artifact generation.
     * @param module the module for which generation is being performed
     * @param location where the module was found
     * @param definitions the current set of definitions
     */
    public void generate(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws IOException;

    /**
     * Derived classes should overload this method to perform artifact generation when no target module
     * has been specified on the commandline. This is useful when doing things like generating documentation 
     * where you want to load and resolve objects across many modules.
     * @param definitions the current set of definitions
     */
    public void generate(GpbModuleDefinitionManager definitions) throws IOException;

    /**
     * Called if the help flag is found anywhere on the commandline.
     */
    public void displayHelp();

}



