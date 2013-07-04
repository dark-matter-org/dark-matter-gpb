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
package org.dmd.gpb.tools.gpbgen;

import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.gpb.tools.generation.GpbDefGenerator;
import org.dmd.gpb.tools.generation.GpbDocGenerator;
import org.dmd.gpb.tools.parsing.GpbDefParser;
import org.dmd.gpb.tools.parsing.GpbDefinitionManager;
import org.dmd.util.BooleanVar;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.Classifier;
import org.dmd.util.parsing.CommandLine;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.StringArrayList;

/**
 * The GpbGenUtility allows for the generation of Google Protoocl Buffer prtocol specifications and
 * its associated documentation.
 */
public class GpbGenUtility {

	// Our base schema manager
//	SchemaManager		dmsSchema;
	
	// The schema manager that will hold definitions read by the schema parser
//	SchemaManager		readSchemas;
	
	// The definitions we've read
	GpbDefinitionManager	readDefinitions;
	
	// Finds our available schemas
//	DmsSchemaFinder	finder;
	ConfigFinder		finder;
	
	// The thing that parses the available schemas
//	DmsSchemaParser		parser;
	GpbDefParser		parser;
	
	// The thing that will generate our GPB proto specs
	GpbDefGenerator		defGenerator;
	
	GpbDocGenerator		docGenerator;
	
	// Used when formatting the list of schemas
	PrintfFormat	format;
	
	Classifier		classifier;
	
	CommandLine		cl;
	String[]		_args;
	StringBuffer  	help;
	BooleanVar		helpFlag	= new BooleanVar();
	StringArrayList	srcdir 		= new StringArrayList();
	StringBuffer	workspace	= new StringBuffer();
	BooleanVar		autogen 	= new BooleanVar();
	StringBuffer	cfg			= new StringBuffer();
	BooleanVar		debug 		= new BooleanVar();
	StringBuffer	docdir		= new StringBuffer();
	StringArrayList	jars 		= new StringArrayList();
	
	public GpbGenUtility(String[] args) throws ResultException, IOException, DmcValueException, DmcValueExceptionSet {
		initHelp();
		cl = new CommandLine();
        cl.addOption("-h",     		helpFlag,	"Dumps the help message.");
        cl.addOption("-srcdir",		srcdir,  	"The source directories to search.");
        cl.addOption("-workspace", 	workspace, 	"The workspace prefix");
        cl.addOption("-autogen", 	autogen, 	"Indicates that you want to generate from all configs automatically.");
        cl.addOption("-cfg",   		cfg,     	"The configuration file to load.");
        cl.addOption("-docdir",   	docdir,     "The documentation directory.");
        cl.addOption("-debug",   	debug,     	"Dump debug information.");
        cl.addOption("-jars",   	jars,     	"The prefixs of jars to search for .gpb config files.");
        
        _args = args;
		
		cl.parseArgs(args);
		
//		dmsSchema = new SchemaManager();
		
//		readSchemas = null;
		readDefinitions	= null;
		
		if (srcdir.size() > 0){
			StringArrayList search = srcdir;
			if (workspace.length() > 0){
				StringArrayList augmented = new StringArrayList();
				for(String dir: srcdir){
					augmented.add(workspace.toString() + "/" + dir);
				}
				search = augmented;
			}
			finder = new ConfigFinder(search.iterator());
		}
		else
			finder = new ConfigFinder();
		
		// Add additional jars to search for DMS configs
		if (jars.size() > 0){
			for(String jar: jars){
				finder.addJarPrefix(jar);
			}
		}		
		
		if (debug.booleanValue())
			finder.debug(true);
		
		finder.addSuffix(".gpb");
//		finder.addJarEnding("DMSchema.jar");
		finder.findConfigs();
		
		parser  = new GpbDefParser(finder);
		
		defGenerator = new GpbDefGenerator(System.out);
		int longest = finder.getLongestName() + 4;
		
		docGenerator = new GpbDocGenerator();
		
		String f = "%-" + longest + "s";
		format = new PrintfFormat(f);
		
		classifier = new Classifier();
	}
	
	public ConfigFinder getFinder(){
		return(finder);
	}
	
	void initHelp(){
		help = new StringBuffer();
		help.append("gpbgen -h -cfg -workspace -srcdir -autogen\n");
        help.append("\n");
		help.append("The gpbgen tool generates Google Protocol Buffer (GPB) specifications (protospecs) based\n");
        help.append("on a higher level specification called dark-matter GPB (DMGPB). DMGPB allows for the\n");
        help.append("specification of reusable definitions along with comments/descriptions from which GPB \n");
        help.append("protospecs can be composed. The output of gpbgen is one or more GPB protospecs and, \n");
        help.append("if requested, their associated documentation as a set of XHTML pages.\n");
        help.append("\n");
        help.append("DMGPB configurations (that end with a .dmgpb extension) are recursivley discovered\n");
        help.append("in your source path or from jars.\n");
        help.append("\n");
        help.append("\n");
        help.append("The tool can also search .jar files that contain DMGPB defined by others. \n");
        help.append("Just specify a line with the jar file name (or the last part thereof). As long\n");
        help.append("the line ends with .jar, all jars that end with tha suffix will be searched for\n");
        help.append("schema configurations.\n");
        help.append("\n");
        help.append("You can also specify code locations on the command line via the -srcdir option.\n");
        help.append("\n");
        help.append("If you specify the -workspace option, this prefix will be placed in front of all \n");
        help.append("arguments to the -srcdir option.\n");
        help.append("\n");
        help.append("Or you can specify a configuration file (formatted like sourcedirs.txt) to load.\n");
        help.append("via the -cfg option.\n");
        help.append("\n");
        help.append("-h dumps the help information.\n");
        help.append("\n");
        help.append("\n");
        help.append("\n");
        help.append("\n");
        help.append("example: dmogen -workspace C:/eclipse/workspace -srcdir proj1/src proj2/src proj3/src\n");
        help.append("\n");
        help.append("\n");
	}
	
	public void run() throws DmcValueExceptionSet, DmcRuleExceptionSet, ResultException, DmcValueException {
//        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
//        String          currLine    = null;
//        TokenArrayList	tokens		= null;
        
        if (_args.length == 0 || helpFlag.booleanValue()){
        	System.out.println(help.toString());
        	return;
        }

        if (autogen.booleanValue()){
        	
        	for(ConfigVersion version: finder.getVersions().values()){
        		ConfigLocation loc = version.getLatestVersion();
        		if (!loc.isFromJAR()){
        			// Wasn't in a jar, so try to generate
        			generateFromConfig(loc);
        		}
        	}
        	
			try {
				if (docdir.length() > 0){
					if (workspace.length() > 0)
							docGenerator.dumpDocumentation(workspace.toString() + "/" + docdir.toString());
					else
						docGenerator.dumpDocumentation(docdir.toString());
				}
			} catch (IOException e) {
				System.err.println(e.toString());
				e.printStackTrace();
				System.exit(1);
			}
        	
        	System.exit(0);
        }

	}
	
	void generateFromConfig(ConfigLocation location) throws ResultException, DmcValueException, DmcRuleExceptionSet {
//    	try {
    		// Create a new manager into which the parsed definitions will be loaded
    		readDefinitions = new GpbDefinitionManager();
    		
    		// Parse the specified schema
//			SchemaDefinition sd = parser.parseSchema(readSchemas, location.getConfigName(), false);
			parser.parse(location.getConfigName());
						
			if (docdir.length() > 0){
//				if (workspace.length() > 0)
//					docGenerator.dumpSchemaDoc(workspace.toString() + "/" + docdir.toString(), readSchemas);
//				else
//					docGenerator.dumpSchemaDoc(docdir.toString(), readSchemas);
				
//				docGenerator.addReadSchemas(readSchemas);
			}
			else{
				// Generate the code
				
				FileUpdateManager.instance().reportProgress(System.out);
				FileUpdateManager.instance().reportErrors(System.err);
				FileUpdateManager.instance().generationStarting();
				
//				codeGenerator.generateCode(readSchemas, sd, location);
				
				FileUpdateManager.instance().generationComplete();
			}
						
//		} catch (ResultException e) {
//			System.err.println(e.toString());
//			System.exit(1);
//		} catch (DmcValueException e) {
//			System.err.println(e.toString());
//			e.printStackTrace();
//			System.exit(1);
//		} catch (DmcRuleExceptionSet e) {
//			System.err.println(e.toString());
////			e.printStackTrace();
//			System.exit(1);
//		} catch (IOException e) {
//			System.err.println(e.toString());
//			e.printStackTrace();
//			System.exit(1);
			
			
//		}

	}
}
