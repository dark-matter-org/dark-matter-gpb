package org.dmd.gpb.tools.generation;

import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.server.extended.GpbMainElement;
import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.util.exceptions.ResultException;
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

	@Override
	public void parsingComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException {
		System.out.println("\nPARSING COMPLETE\n\n");
		
		// We create types for all enums and messages
		Iterator<GpbMainElement> it = definitions.getAllGpbMainElement();
		while(it.hasNext()){
			GpbMainElement element = it.next();
			try {
				element.createTypeIfRequired(definitions);
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
