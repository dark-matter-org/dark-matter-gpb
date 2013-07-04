package org.dmd.gpb.tools.parsing;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.MetaSchemaAG;
import org.dmd.dms.SchemaManager;
import org.dmd.gpb.server.generated.DmdgpbSchemaAG;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;

/**
 * The GpbDefParser parses dark-matter Google Protocol Buffer specifications from files ending
 * with .dmgpb and returns a GpbModule
 * @author peter
 *
 */
public class GpbDefParser implements DmcUncheckedOIFHandlerIF {
	
	SchemaManager	schema;
	
	ConfigFinder	finder;
	
    // The parser that will read basic objects from our information model
    // definition files that contain the other types of definitions.
    DmcUncheckedOIFParser       defParser;

    public GpbDefParser(ConfigFinder cf) throws ResultException, DmcValueException {
		schema = new SchemaManager();
		
		DmdgpbSchemaAG s = new DmdgpbSchemaAG();
		
		schema.manageSchema(s);
		
		finder = cf;
		
		defParser = new DmcUncheckedOIFParser(this);
		
        for (AttributeDefinition def: MetaSchemaAG._metaSchema.getAttributeDefList()){
        	if (def.getPreserveNewlines()){
        		defParser.addPreserveNewlinesAttribute(def.getName().getNameString());
        	}
        }

	}
	
	public void parse(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet {
    	ConfigVersion		config		= finder.getConfig(configName);
    	ConfigLocation		location	= null;
        String          	currFile 	= null;

        if (config == null){
        	ResultException ex = new ResultException();
        	ex.addError("The specified dark-matter GPB spec couldn't be found: " + configName);
        	throw(ex);
        }
        
        location = config.getLatestVersion();
        currFile = location.getFileName();

    	defParser.parseFile(currFile, location.isFromJAR());

	}

	@Override
	public void handleObject(DmcUncheckedObject obj, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet {
		System.out.println(obj.toOIF());
		
	}

}
