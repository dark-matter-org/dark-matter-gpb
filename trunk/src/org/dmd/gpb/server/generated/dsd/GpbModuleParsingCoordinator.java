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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:812)
import java.io.IOException;                                                    // If we run it to problems finding configs - (DSDArtifactFormatter.java:772)
import java.util.ArrayList;                                                    // To handle lists of things - (DSDArtifactFormatter.java:774)
import java.util.Iterator;                                                     // To iterate over collections - (DSDArtifactFormatter.java:773)
import java.util.TreeMap;                                                      // To handle loaded configs - (DSDArtifactFormatter.java:775)
import org.dmd.concinnity.server.extended.ConcinnityModule;                    // One of the DDS modules we might load - (DSDArtifactFormatter.java:801)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleParser;         // Required to parse ConcinnityModule definitions - (DSDArtifactFormatter.java:805)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;              // To allow loading of rules from the dmconcinnity schema - (DSDArtifactFormatter.java:807)
import org.dmd.concinnity.shared.generated.types.ConcinnityModuleREF;          // To access references to GpbModule - (DSDArtifactFormatter.java:803)
import org.dmd.dmc.DmcNameClashException;                                      // To handle exceptions from parsing objects - (DSDArtifactFormatter.java:780)
import org.dmd.dmc.DmcValueException;                                          // To handle exceptions from value handling - (DSDArtifactFormatter.java:779)
import org.dmd.dmc.DmcValueExceptionSet;                                       // May occur when resolving objects - (DSDArtifactFormatter.java:787)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                                  // In case we have rule failures - (DSDArtifactFormatter.java:782)
import org.dmd.dmc.types.DefinitionName;                                       // Allows storage of parsed configs by name - (DSDArtifactFormatter.java:777)
import org.dmd.dms.DSDefinition;                                               // The common base for all modules - so that we can get error location info - (DSDArtifactFormatter.java:778)
import org.dmd.dmv.shared.DmvRuleManager;                                      // Allows for application of rules to our definitions - (DSDArtifactFormatter.java:789)
import org.dmd.gpb.server.extended.GpbModule;                                  // One of the DDS modules we might load - (DSDArtifactFormatter.java:801)
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;            // Maintains all parsed definitions - (DSDArtifactFormatter.java:792)
import org.dmd.gpb.server.generated.dsd.GpbModuleGeneratorInterface;           // The generator we call - (DSDArtifactFormatter.java:795)
import org.dmd.gpb.server.generated.dsd.GpbModuleParser;                       // Required to parse GpbModule definitions - (DSDArtifactFormatter.java:805)
import org.dmd.gpb.shared.generated.dmo.DmdgpbDMSAG;                           // To allow loading of rules from the dmdgpb schema - (DSDArtifactFormatter.java:807)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                        // To access references to GpbModule - (DSDArtifactFormatter.java:803)
import org.dmd.util.exceptions.ResultException;                                // To handle processing exceptions - (DSDArtifactFormatter.java:781)
import org.dmd.util.parsing.ConfigFinder;                                      // Finds configs we may need to parse - (DSDArtifactFormatter.java:784)
import org.dmd.util.parsing.ConfigLocation;                                    // Handle to a discovered configuration - (DSDArtifactFormatter.java:785)
import org.dmd.util.parsing.ConfigVersion;                                     // Handle to a particular config version - (DSDArtifactFormatter.java:786)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:816)
/**
 * The parsing coordinator will find all config files associated with the GpbModule DSD
 * and coordinate the parsing of the initial config file and all files on which it depends.
 */
public class GpbModuleParsingCoordinator {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:823)
    DmvRuleManager                                   rules                            = new DmvRuleManager();                                  // Rule manager
    GpbModuleDefinitionManager                       definitions                      = new GpbModuleDefinitionManager();                      // Maintains all parsed definitions
    GpbModuleGeneratorInterface                      generator;                                                                                // Injected generator that we call when config loading is complete
    TreeMap<String, ModuleInfoBase>                  loadedConfigs                    = new TreeMap<String, ModuleInfoBase>();                 // Stores all loaded configs based on the name of the file that was parsed.
    ConcinnityModuleParser                           parserForConcinnityModule;                                                                // Parser for ConcinnityModule definitions
    ConfigFinder                                     finderForConcinnityModule        = new ConfigFinder("dmcm");                              // Config finder for ConcinnityModule config files ending with .dmcm
    TreeMap<DefinitionName, ConcinnityModuleInfo>    loadedConcinnityModuleConfigs    = new TreeMap<DefinitionName, ConcinnityModuleInfo>();   // The names/location of the ConcinnityModule modules that have been loaded

    GpbModuleParser                                  parserForGpbModule;                                                                       // Parser for GpbModule definitions
    ConfigFinder                                     finderForGpbModule               = new ConfigFinder("dmgpb");                             // Config finder for GpbModule config files ending with .dmgpb
    TreeMap<DefinitionName, GpbModuleInfo>           loadedGpbModuleConfigs           = new TreeMap<DefinitionName, GpbModuleInfo>();          // The names/location of the GpbModule modules that have been loaded


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:825)
    public GpbModuleParsingCoordinator(GpbModuleGeneratorInterface g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {

        generator = g;

        rules.loadRules(DmconcinnityDMSAG.instance());
        parserForConcinnityModule = new ConcinnityModuleParser(definitions, rules);
        finderForConcinnityModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForConcinnityModule.findConfigs();

        rules.loadRules(DmdgpbDMSAG.instance());
        parserForGpbModule = new GpbModuleParser(definitions, rules);
        finderForGpbModule.setSourceAndJarInfo(sourceDirs,jars);
        finderForGpbModule.findConfigs();

        loadBaseModuleGpbModule("gpbbase");
    }



    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:845)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:877)
    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:903)
    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet, IOException {
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

            definitions.resolveReferences();

            generator.objectResolutionComplete(loaded, location, definitions);

        }

        generator.generate(definitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:935)
    ConcinnityModule loadConcinnityModuleModule(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        // If we've already loaded the file, skip it
        ConcinnityModuleInfo info = loadedConcinnityModuleConfigs.get(new DefinitionName(location.getConfigName()));
        if (info != null)
            return(info.module);

        ConcinnityModule loaded = parserForConcinnityModule.parseConfig(location);
        ConcinnityModuleInfo loadedInfo = new ConcinnityModuleInfo(loaded,location);
        loadedConcinnityModuleConfigs.put(loaded.getName(), loadedInfo);
        loadedConfigs.put(location.getFileName(), loadedInfo);

        loadModuleDependencies(loadedInfo);

        return(loaded);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:952)
    public ConfigLocation getLocation(ConcinnityModule module){
        ConcinnityModuleInfo info = loadedConcinnityModuleConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:935)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:952)
    public ConfigLocation getLocation(GpbModule module){
        GpbModuleInfo info = loadedGpbModuleConfigs.get(module.getName());
        if (info == null)
            throw(new IllegalStateException("Couldn't find ConfigLocation for module: \n\n" + module.toOIF()));

        return(info.location);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:963)
    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

        if (mi.dependenciesLoaded)
            return;

        if (mi instanceof ConcinnityModuleInfo){
            ConcinnityModuleInfo info = (ConcinnityModuleInfo)mi;
            if (info.module.getDependsOnConcinnityModuleHasValue()){
                Iterator<ConcinnityModuleREF> it = info.module.getDMO().getDependsOnConcinnityModule();
                while(it.hasNext()){
                    ConcinnityModuleREF ref = it.next();
                    ConfigVersion version = finderForConcinnityModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmcm");
            
                    loadConcinnityModuleModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }
        else if (mi instanceof GpbModuleInfo){
            GpbModuleInfo info = (GpbModuleInfo)mi;
            if (info.module.getDependsOnConcinnityModuleHasValue()){
                Iterator<ConcinnityModuleREF> it = info.module.getDMO().getDependsOnConcinnityModule();
                while(it.hasNext()){
                    ConcinnityModuleREF ref = it.next();
                    ConfigVersion version = finderForConcinnityModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmcm");
            
                    loadConcinnityModuleModule(version.getLatestVersion());
                }
            }
            if (info.module.getDependsOnGpbModuleHasValue()){
                Iterator<GpbModuleREF> it = info.module.getDMO().getDependsOnGpbModule();
                while(it.hasNext()){
                    GpbModuleREF ref = it.next();
                    ConfigVersion version = finderForGpbModule.getConfig(ref.toString());
                    
                    if (version == null)
                        missingConfigError(info.module,ref.toString() + ".dmgpb");
            
                    loadGpbModuleModule(version.getLatestVersion());
                }
            }
            info.dependenciesLoaded = true;
        }




    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:993)
    void missingConfigError(String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:999)
    void missingConfigError(DSDefinition module, String missing) throws ResultException {
        ResultException ex = new ResultException("Could not find config: " + missing);
        ex.setLocationInfo(module.getFile(), module.getLineNumber());
        throw(ex);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParsingCoordinator(DSDArtifactFormatter.java:1007)
    class ModuleInfoBase {
        ConfigLocation location;
        boolean        dependenciesLoaded;
    }

    class ConcinnityModuleInfo extends ModuleInfoBase {
        ConcinnityModule module;

        ConcinnityModuleInfo(ConcinnityModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

    class GpbModuleInfo extends ModuleInfoBase {
        GpbModule module;

        GpbModuleInfo(GpbModule m, ConfigLocation l){
            module   = m;
            location = l;
        }
    }

}

