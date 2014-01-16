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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:582)
import java.io.IOException;                                                  // If we run it to problems finding configs - (DSDArtifactFormatter.java:545)
import java.util.ArrayList;                                                  // To handle lists of things - (DSDArtifactFormatter.java:547)
import java.util.Iterator;                                                   // To iterate over collections - (DSDArtifactFormatter.java:546)
import java.util.TreeMap;                                                    // To handle loaded configs - (DSDArtifactFormatter.java:548)
import org.dmd.dmc.DmcNameClashException;                                    // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:552)
import org.dmd.dmc.DmcValueException;                                        // To handle exceptions from value handling - (DSDArtifactFormatter.java:551)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                // In case we have rule failures - (DSDArtifactFormatter.java:554)
import org.dmd.dmc.types.DefinitionName;                                     // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:550)
import org.dmd.dmv.shared.DmvRuleManager;                                    // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:560)
import org.dmd.gpb.server.extended.GpbModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:571)
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:563)
import org.dmd.gpb.server.generated.dsd.GpbModuleGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:566)
import org.dmd.gpb.server.generated.dsd.GpbModuleParser;                     // Required to parse GpbModule definitions - (DSDArtifactFormatter.java:575)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                         // To allow loading of rules from the dmdgpb schema - (DSDArtifactFormatter.java:577)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                      // To access references to GpbModule - (DSDArtifactFormatter.java:573)
import org.dmd.util.exceptions.ResultException;                              // To handle processing exceptions - (DSDArtifactFormatter.java:553)
import org.dmd.util.parsing.ConfigFinder;                                    // Finds configs we may need to parse - (DSDArtifactFormatter.java:556)
import org.dmd.util.parsing.ConfigLocation;                                  // Handle to a discovered configuration - (DSDArtifactFormatter.java:557)
import org.dmd.util.parsing.ConfigVersion;                                   // Handle to a particular config version - (DSDArtifactFormatter.java:558)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:586)
/**
 * The generation coordinator will find all config files associated with the GpbModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class GpbModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:593)
    DmvRuleManager                            rules                     = new DmvRuleManager();                           // Rule manager
    GpbModuleDefinitionManager                definitions               = new GpbModuleDefinitionManager();               // Maintains all parsed definitions
    GpbModuleGeneratorInterface               generator;                                                                  // Injected generator that we call when config loading is complete
    GpbModuleParser                           parserForGpbModule;                                                         // Parser for GpbModule definitions
    ConfigFinder                              finderForGpbModule        = new ConfigFinder("gpb");                        // Config finder for GpbModule config files ending with .gpb
    TreeMap<DefinitionName, GpbModuleInfo>    loadedGpbModuleConfigs    = new TreeMap<DefinitionName, GpbModuleInfo>();   // The names/location of the GpbModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:595)
    public GpbModuleParsingCoordinator(GpbModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, IOException {

        generator = g;

        rules.loadRules(DmdgpbDMSAG.instance());
        parserForGpbModule = new GpbModuleParser(definitions, rules);
        finderForGpbModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForGpbModule.findConfigs();

    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:612)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        ConfigVersion version = finderForGpbModule.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        GpbModule loaded = parserForGpbModule.parseConfig(location);
        loadedGpbModuleConfigs.put(loaded.getName(), new GpbModuleInfo(loaded,location));

        // We've loaded the base configuration file, now load any other modules on which it depends
        loadModuleDependencies(loaded);
        
        generator.generate(loaded,location,definitions);
        

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:634)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        Iterator<ConfigLocation> it = finderForGpbModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();
            GpbModule loaded = parserForGpbModule.parseConfig(location);
            loadedGpbModuleConfigs.put(loaded.getName(), new GpbModuleInfo(loaded,location));

            // We've loaded the base configuration file, now load any other modules on which it depends
            loadModuleDependencies(loaded);

            generator.generate(loaded,location,definitions);

        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:651)
    void loadModuleDependencies(Object obj) throws ResultException {
        if (obj instanceof GpbModule){
            GpbModule module = (GpbModule)obj;
            if (module.getDependsOnGpbModuleHasValue()){
                Iterator<GpbModuleREF> it = module.getDMO().getDependsOnGpbModule();
                while(it.hasNext()){
                    GpbModuleREF ref = it.next();
                    ConfigVersion version = finderForGpbModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(ref.toString() + ".gpb");
            
                }
            }
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:676)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:683)
    class GpbModuleInfo {
        GpbModule module;
        ConfigLocation location;

        GpbModuleInfo(GpbModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

