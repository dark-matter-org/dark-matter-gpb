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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:363)
import org.dmd.dmc.DmcValueException;                                     // May be thrown by schema management - (DSDArtifactFormatter.java:348)
import org.dmd.dmc.definitions.DsdParserInterface;                        // Standard parser interface - (DSDArtifactFormatter.java:337)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                             // May be thrown by rule manager - (DSDArtifactFormatter.java:350)
import org.dmd.dmc.util.DmcUncheckedObject;                               // Basic parsing of objects - (DSDArtifactFormatter.java:336)
import org.dmd.dms.SchemaManager;                                         // Manages the schemas we use - (DSDArtifactFormatter.java:332)
import org.dmd.dms.generated.dmw.StringIterableDMW;                       // To iterate over defFiles - (DSDArtifactFormatter.java:352)
import org.dmd.dmv.shared.DmvRuleManager;                                 // The injected rule manager used for initializations - (DSDArtifactFormatter.java:351)
import org.dmd.dmw.DmwObjectFactory;                                      // Constructs wrapped objects - (DSDArtifactFormatter.java:339)
import org.dmd.gpb.server.extended.GpbArtifact;                           // A definition from the GpbModule Module - (DSDArtifactFormatter.java:528)
import org.dmd.gpb.server.extended.GpbDefinition;                         // The base definition from the GpbModule Module - (DSDArtifactFormatter.java:522)
import org.dmd.gpb.server.extended.GpbEnum;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:528)
import org.dmd.gpb.server.extended.GpbField;                              // A definition from the GpbModule Module - (DSDArtifactFormatter.java:528)
import org.dmd.gpb.server.extended.GpbMessage;                            // A definition from the GpbModule Module - (DSDArtifactFormatter.java:528)
import org.dmd.gpb.server.extended.GpbModule;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:356)
import org.dmd.gpb.server.extended.GpbType;                               // A definition from the GpbModule Module - (DSDArtifactFormatter.java:528)
import org.dmd.gpb.server.generated.DmdgpbSchemaAG;                       // The schema recognized by this parser - (DSDArtifactFormatter.java:347)
import org.dmd.gpb.server.generated.dsd.GpbModuleGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:340)
import org.dmd.util.exceptions.ResultException;                           // May be thrown by schema management - (DSDArtifactFormatter.java:349)
import org.dmd.util.parsing.ConfigLocation;                               // Config file location info - (DSDArtifactFormatter.java:338)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                     // Basic parsing of objects - (DSDArtifactFormatter.java:335)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                        // Basic parsing of objects - (DSDArtifactFormatter.java:334)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:366)
public class GpbModuleParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "gpb";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:380)
    SchemaManager               schema         = new SchemaManager();               // Manages the schema for this DSD
    DmcUncheckedOIFParser       parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory            factory        = new DmwObjectFactory(schema);      // Instantiates wrapped objects
    GpbModuleGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager              rules;                                              // The overall rule manager
    ConfigLocation              location;                                           // The location of the config being parsed
    GpbModule                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:383)
    public GpbModuleParser(GpbModuleGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException {
        schema.manageSchema(new DmdgpbSchemaAG());
        definitions  = d;
        rules        = r;
    }

    public String getFileExtension(){
        return(fileExtension);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:394)
    public GpbModule parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        location = l;

        // We're starting to parse a new config. Reset the module to null so that we only parse one module per config.
        module = null;

        if (location.isFromJAR()){
            System.out.println("Reading: " + location.getFileName() + " - from " + location.getJarFilename());
            parser.parseFile(location.getFileName(),true);
        }
        else{
            System.out.println("Reading: " + location.getFileName());
            parser.parseFile(location.getFileName());
        }

        if (module.getDefFilesHasValue()){
            StringIterableDMW it = module.getDefFilesIterable();
            while(it.hasNext()){
                String fn = location.getDirectory() + "/" + it.next();

                if (location.isFromJAR())
                    parser.parseFile(fn,true);
                else
                    parser.parseFile(fn);
            }
        }

        return(module);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:427)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet {
        GpbDefinition definition = null;

        try{
            definition = (GpbDefinition) factory.createWrapper(uco);
        } catch (ClassNotFoundException e) {
            ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
            ex.result.lastResult().fileName(infile);
            ex.result.lastResult().lineNumber(lineNumber);
            throw(ex);
        }
        catch (ResultException ex){
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(DmcValueException e){
            ResultException ex = new ResultException();
            ex.addError(e.getMessage());
            if (e.getAttributeName() != null)
                ex.result.lastResult().moreMessages("Attribute: " + e.getAttributeName());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }

        definition.setLineNumber(lineNumber);
        definition.setFile(infile);

        // Run the rules against the definition
        rules.executeInitializers(definition.getDmcObject());
        rules.executeAttributeValidation(definition.getDmcObject());
        rules.executeObjectValidation(definition.getDmcObject());

        // The first definition we expect is the module definition
        if (module == null){
            if (definition instanceof GpbModule){
                module = (GpbModule)definition;
            
                definition.setDotName(module.getName() + "." + definition.getConstructionClassName());
            
                definitions.addGpbModule(module);
                module.setDefinedInGpbModule(module);
            }
            else{
                ResultException ex = new ResultException("Expecting a GpbModule module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:479)
            if (definition instanceof GpbModule){
                ResultException ex = new ResultException("Multiple GpbModule definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInGpbModule(module);
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            
            if (definition instanceof GpbType){
                definitions.addGpbType((GpbType)definition);
                module.addGpbType((GpbType)definition);
            }
            else if (definition instanceof GpbEnum){
                definitions.addGpbEnum((GpbEnum)definition);
                module.addGpbEnum((GpbEnum)definition);
            }
            else if (definition instanceof GpbField){
                definitions.addGpbField((GpbField)definition);
                module.addGpbField((GpbField)definition);
            }
            else if (definition instanceof GpbMessage){
                definitions.addGpbMessage((GpbMessage)definition);
                module.addGpbMessage((GpbMessage)definition);
            }
            else if (definition instanceof GpbArtifact){
                definitions.addGpbArtifact((GpbArtifact)definition);
                module.addGpbArtifact((GpbArtifact)definition);
            }

        }

    }
}

