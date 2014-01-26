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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:757)
import java.io.IOException;                                                  // If we run it to problems finding configs - (DSDArtifactFormatter.java:717)
import java.util.ArrayList;                                                  // To handle lists of things - (DSDArtifactFormatter.java:719)
import java.util.Iterator;                                                   // To iterate over collections - (DSDArtifactFormatter.java:718)
import java.util.TreeMap;                                                    // To handle loaded configs - (DSDArtifactFormatter.java:720)
import org.dmd.dmc.DmcNameClashException;                                    // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:725)
import org.dmd.dmc.DmcValueException;                                        // To handle exceptions from value handling - (DSDArtifactFormatter.java:724)
import org.dmd.dmc.DmcValueExceptionSet;                                     // May occur when resolving objects - (DSDArtifactFormatter.java:732)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                // In case we have rule failures - (DSDArtifactFormatter.java:727)
import org.dmd.dmc.types.DefinitionName;                                     // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:722)
import org.dmd.dms.DSDefinition;                                             // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:723)
import org.dmd.dmv.shared.DmvRuleManager;                                    // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:734)
import org.dmd.gpb.server.extended.GpbModule;                                // One of the DDS modules we might load - (DSDArtifactFormatter.java:746)
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;          // Maintains all parsed definitions - (DSDArtifactFormatter.java:737)
import org.dmd.gpb.server.generated.dsd.GpbModuleGeneratorInterface;         // The generator we call - (DSDArtifactFormatter.java:740)
import org.dmd.gpb.server.generated.dsd.GpbModuleParser;                     // Required to parse GpbModule definitions - (DSDArtifactFormatter.java:750)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                         // To allow loading of rules from the dmdgpb schema - (DSDArtifactFormatter.java:752)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                      // To access references to GpbModule - (DSDArtifactFormatter.java:748)
import org.dmd.util.exceptions.ResultException;                              // To handle processing exceptions - (DSDArtifactFormatter.java:726)
import org.dmd.util.parsing.ConfigFinder;                                    // Finds configs we may need to parse - (DSDArtifactFormatter.java:729)
import org.dmd.util.parsing.ConfigLocation;                                  // Handle to a discovered configuration - (DSDArtifactFormatter.java:730)
import org.dmd.util.parsing.ConfigVersion;                                   // Handle to a particular config version - (DSDArtifactFormatter.java:731)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:761)
/**
 * The parsing coordinator will find all config files associated with the GpbModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class GpbModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:768)
    DmvRuleManager                            rules                     = new DmvRuleManager();                           // Rule manager
    GpbModuleDefinitionManager                definitions               = new GpbModuleDefinitionManager();               // Maintains all parsed definitions
    GpbModuleGeneratorInterface               generator;                                                                  // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>           loadedConfigs             = new TreeMap<String, ModuleInfoBase>();          // Stores all loaded configs based on the name of the file that was parsed.
    GpbModuleParser                           parserForGpbModule;                                                         // Parser for GpbModule definitions
    ConfigFinder                              finderForGpbModule        = new ConfigFinder("gpb");                        // Config finder for GpbModule config files ending with .gpb
    TreeMap<DefinitionName, GpbModuleInfo>    loadedGpbModuleConfigs    = new TreeMap<DefinitionName, GpbModuleInfo>();   // The names/location of the GpbModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:770)
    public GpbModuleParsingCoordinator(GpbModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        rules.loadRules(DmdgpbDMSAG.instance());
        parserForGpbModule = new GpbModuleParser(definitions, rules);
        finderForGpbModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForGpbModule.findConfigs();

        loadBaseModuleGpbModule("gpbbase");
    }



    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:790)
    void loadBaseModuleGpbModule(String config) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {
        ConfigVersion version = finderForGpbModule.getConfig(config);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified base configuration file: " + config);
            ex.moreMessages("This is a base module required by the GpbModule DSD");
            ex.moreMessages(finderForGpbModule.getSearchInfo());
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        loadGpbModuleModule(location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:822)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
        ConfigVersion version = finderForGpbModule.getConfig(configName);
        
        if (version == null){
            ResultException ex = new ResultException("Could not find the specified configuration file: " + configName);
            throw(ex);
        }
        
        ConfigLocation location = version.getLatestVersion();
        
        GpbModule loaded = loadGpbModuleModule(location);
        
        if (location.isFromJAR()){
            ResultException ex = new ResultException("We can't run generation for a config loaded from a JAR: " + configName);
            ex.moreMessages(location.toString());
            throw(ex);
        }
        
        generator.parsingComplete(loaded, location, definitions);
        
        definitions.resolveReferences();
        
        generator.generate(loaded,location,definitions);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:848)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        GpbModule loaded = null;
        GpbModuleInfo loadedInfo = null;

        Iterator<ConfigLocation> it = finderForGpbModule.getLocations();
        while(it.hasNext()){
            ConfigLocation location = it.next();

            loadedInfo = (GpbModuleInfo)loadedConfigs.get(location.getFileName());

            if (loadedInfo == null){
                loaded = loadGpbModuleModule(location);
            }
            else{
                loaded = loadedInfo.module;
            }

            generator.parsingComplete(loaded, location, definitions);

            if (!location.isFromJAR())
                generator.generate(loaded,location,definitions);

        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:883)
    GpbModule loadGpbModuleModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        GpbModuleInfo info = loadedGpbModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        GpbModule loaded = parserForGpbModule.parseConfig(location);
        GpbModuleInfo loadedInfo = new GpbModuleInfo(loaded,location);
        loadedGpbModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:901)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof GpbModuleInfo){
            GpbModuleInfo info = (GpbModuleInfo)mi;
            if (info.module.getDependsOnGpbModuleHasValue()){
                Iterator<GpbModuleREF> it = info.module.getDMO().getDependsOnGpbModule();
                while(it.hasNext()){
                    GpbModuleREF ref = it.next();
                    ConfigVersion version = finderForGpbModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".gpb");
            
                    loadGpbModuleModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:931)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:937)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:945)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class GpbModuleInfo extends ModuleInfoBase {
        GpbModule module;

        GpbModuleInfo(GpbModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

