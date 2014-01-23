package org.dmd.gpb.tools.generation;

import java.io.PrintStream;

import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.util.parsing.ConfigLocation;

public class GpbDefGenerator extends GpbModuleGenUtility {

	// Where we report progress
	PrintStream	progress;
	
	public GpbDefGenerator(){
		
	}
	
	public GpbDefGenerator(PrintStream p){
		
	}

	@Override
	public void generate(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) {
		System.out.println("HERE");
		
	}

	@Override
	public void displayHelp() {
		System.out.println("\nHELP!\n\n");
		
	}
}
