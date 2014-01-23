package org.dmd.gpb.tools.gpbgen;

import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.util.parsing.ConfigLocation;

public class ProtoGenerator extends GpbModuleGenUtility {

	@Override
	public void generate(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) {
		
		
	}

	@Override
	public void displayHelp() {
		System.out.println("\nHELP!\n\n");
	}
	
	

}
