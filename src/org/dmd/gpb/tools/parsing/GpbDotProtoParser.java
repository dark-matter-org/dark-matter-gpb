package org.dmd.gpb.tools.parsing;

import java.io.IOException;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.gpb.server.extended.GpbProtoFile;
import org.dmd.gpb.server.generated.DmdgpbSchemaAG;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.StringArrayList;

/**
 * The GpbDotProtoParser is used to parse existing Google Protocol Buffer .proto
 * files and generate the dark-matter GPB (dmgpb) equivalent specification that can then
 * be augmented with documentation.
 * <p>
 * This approach allows for a quickstart usage of the extended concepts of dmgpb.
 */
public class GpbDotProtoParser {
	
	ConfigFinder	finder;			// Our .proto file finder
	ProtoFileParser	parser;
	SchemaManager	schema;
	
	/**
	 * Constructs a new .proto parser.
	 * @param sd the source directories to search for .proto files.
	 * @throws DmcValueException  
	 * @throws ResultException 
	 */
	public GpbDotProtoParser(StringArrayList sd) throws ResultException, DmcValueException {
		finder = new ConfigFinder("proto",sd, false);
		parser = new ProtoFileParser();
		schema = new SchemaManager();
		schema.manageSchema(new DmdgpbSchemaAG());
	}
	
	public void run() throws ResultException, IOException, DmcValueException {
		finder.findConfigs();
		
		Iterator<ConfigLocation> it = finder.getLocations();
		while(it.hasNext()){
			ConfigLocation location = it.next();
			GpbProtoFile proto = parser.parseFromProto(location.getFileName());
			
			DebugInfo.debug("\n\n" + proto.toOIF());
		}
	}
	
	/**
	 * @param f set to true to provide debug tracing.
	 */
	public void debug(boolean f){
		finder.debug(f);
	}

	/**
	 * @param cn the name of the config to retrieve without the .proto suffix
	 * @return the location of the config or null if it wasn't found.
	 */
	public ConfigLocation getConfig(String cn){
		ConfigVersion cv = finder.getConfig(cn);
		
		if (cv == null)
			return(null);
		
		return(cv.getLatestVersion());
	}
}
