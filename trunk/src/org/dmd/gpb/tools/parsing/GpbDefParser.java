package org.dmd.gpb.tools.parsing;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.gpb.server.generated.DmdgpbSchemaAG;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;

/**
 * The GpbDefParser parses dark-matter Google Protocol Buffer specifications from files ending
 * with .dmgpb and returns a GpbModule
 * @author peter
 *
 */
public class GpbDefParser {
	
	SchemaManager	schema;
	
	ConfigFinder	finder;
	
	public GpbDefParser(ConfigFinder cf) throws ResultException, DmcValueException {
		schema = new SchemaManager();
		
		DmdgpbSchemaAG s = new DmdgpbSchemaAG();
		
		schema.manageSchema(s);
		
		finder = cf;
	}
	
	public void parse(String configName){
		
	}

}
