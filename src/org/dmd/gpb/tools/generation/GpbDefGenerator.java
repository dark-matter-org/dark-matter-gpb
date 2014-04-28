package org.dmd.gpb.tools.generation;

import java.io.File;
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
	
	// Indicates that we want to rename obsolete fields with the specified suffix
	// For example if you have an obsolete field called flag, and you specify
	// -renameobsolete _deprecated, the field would be renamed flag_deprecated
	// in the generated .proto file. 
	StringBuffer		renameobsolete = new StringBuffer();
	
	public GpbDefGenerator(){
		commandLine.addOption("-genversion", genversion, "The version for which we'll generated the .proto files");
		commandLine.addOption("-renameobsolete", renameobsolete, "The suffix to be added to obsolete fields");
	}
	
	public GpbDefGenerator(PrintStream p){
		commandLine.addOption("-genversion", genversion, "The version for which we'll generated the .proto files");
		commandLine.addOption("-renameobsolete", renameobsolete, "The suffix to be added to obsolete fields");
	}

	@Override
	public void generate(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws IOException {
//		System.out.println("HERE");
		String gv = null;
		String rename = null;
		
		if (genversion.length() > 0){
			gv = genversion.toString();
			System.out.println("Generating .proto for version: " + gv);
		}
		
		if (renameobsolete.length() > 0)
			rename = renameobsolete.toString();
		
		Iterator<GpbProtoFile> it = module.getAllGpbProtoFile();
		while(it.hasNext()){
			GpbProtoFile pf = it.next();
			pf.dumpProtoFile(outdir.toString(),gv,rename);
		}
		
	}

	@Override
	public void displayHelp() {
		System.out.println("\nHELP!\n\n");
		
	}

	@Override
	public void parsingComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException {
//		System.out.println("\nPARSING COMPLETE\n\n");
				
	}
	
	@Override
	public void initialize() throws ResultException {
		if (outdir.length() == 0){
			throw(new ResultException("You must specify the -outdir argument to indicate where to dump the .proto files."));
		}
		
		File od = new File(outdir.toString());
		
		if (!od.exists()){
			throw(new ResultException("The directory specified by -outdir doesn't exist: ." + outdir.toString()));
		}
	}

	@Override
	public void objectResolutionComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generate(GpbModuleDefinitionManager definitions) throws IOException {		
		Iterator<GpbModule> modules = definitions.getAllGpbModule();
		while(modules.hasNext()){
			GpbModule module = modules.next();
			ConfigLocation location = getLocation(module);
			generate(module, location, definitions);
		}
	}
	
}
