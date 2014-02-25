package org.dmd.gpb.tools.generation;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.extended.GpbProtoFile;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

public class GpbDefGenerator extends GpbModuleGenUtility {

	// Where we report progress
	PrintStream	progress;
	
	// Indicates the version for which we want to generate .proto files
	StringBuffer		genversion = new StringBuffer();
	
	public GpbDefGenerator(){
		commandLine.addOption("-genversion", genversion, "The version for  which we'll generated the .proto files");
	}
	
	public GpbDefGenerator(PrintStream p){
		commandLine.addOption("-genversion", genversion, "The version for  which we'll generated the .proto files");
	}

	@Override
	public void generate(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws IOException {
		System.out.println("HERE");
		String gv = null;
		
		if (genversion.length() > 0)
			gv = genversion.toString();
		
		Iterator<GpbProtoFile> it = module.getAllGpbProtoFile();
		while(it.hasNext()){
			GpbProtoFile pf = it.next();
			pf.dumpProtoFile(location.getDirectory(),gv);
		}
		
	}

	@Override
	public void displayHelp() {
		System.out.println("\nHELP!\n\n");
		
	}

	@Override
	public void parsingComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException {
		System.out.println("\nPARSING COMPLETE\n\n");
				
	}
	
	@Override
	public void initialize() throws ResultException {
		
	}

	@Override
	public void objectResolutionComplete(GpbModule module,
			ConfigLocation location, GpbModuleDefinitionManager definitions)
			throws ResultException {
		// TODO Auto-generated method stub
		
	}
	
}
