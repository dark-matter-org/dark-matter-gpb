package org.dmd.gpb.tools.parsing;

import java.io.IOException;

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
	
	/**
	 * Constructs a new .proto parser.
	 * @param sd the source directories to search for .proto files.
	 */
	public GpbDotProtoParser(StringArrayList sd){
		finder = new ConfigFinder("proto",sd, false);
	}
	
	public void run() throws ResultException, IOException {
		finder.findConfigs();
		
	}
	
	public void debug(boolean f){
		finder.debug(f);
	}

	public ConfigLocation getConfig(String cn){
		ConfigVersion cv = finder.getConfig(cn);
		
		if (cv == null)
			return(null);
		
		return(cv.getLatestVersion());
	}
}
