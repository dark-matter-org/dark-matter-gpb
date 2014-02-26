package org.dmd.gpb.tools.generation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.gpb.server.extended.GpbMessage;
import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.GpbHtmlDoc;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.GpbdocTemplateLoader;
import org.dmd.templates.server.util.FormattedFile;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.StringArrayList;

public class GpbDocGenerator extends GpbModuleGenUtility{
	
	// Indicates the version for which we want to generate the documentation files
	StringBuffer		genversion = new StringBuffer();

	// The directory where we'll dump the generated docs
	StringBuffer		outdir = new StringBuffer();
	
	// The set of extension classes that we'll load. These must be the fully qualified
	// names of classes that implement the GpbdocExtensionHookIF
    StringArrayList		extensions         = new StringArrayList();

    GpbdocTemplateLoader	loader;

	public GpbDocGenerator(){
		commandLine.addOption("-genversion", 	genversion, "The version for  which we'll generated the .proto files");
		commandLine.addOption("-outdir", 		outdir, 	"The base directory where we'll dump the docs");
		commandLine.addOption("-extensions", 		extensions, 	"Classes that implement the GpbdocExtensionsHookIF interface");
	}

	@Override
    public void initialize() throws ResultException {
		ResultException ex = null;
		
		if (srcdir.size() == 0){
			
		}
		
		if (outdir.length() == 0){
			ex = new ResultException("You must specify the outdir argument to indicate where the generated documents should be placed.");
		}
		
		ArrayList<String>	paths = new ArrayList<String>();
		paths.add(workspace + "/src/org/dmd/gpb/tools/generation");
		
		try {
			loader = new GpbdocTemplateLoader(paths);
			loader.findAndLoadTemplate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (ex == null)
				ex = new ResultException(e.toString());
			else
				ex.addError(e.toString());
		}
		
		if (ex != null)
			throw(ex);
		
    }

	@Override
	public void parsingComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException {
		// Nothing to do
	}

	@Override
	public void objectResolutionComplete(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws ResultException {
		// Nothing to do
	}

	@Override
	public void generate(GpbModule module, ConfigLocation location, GpbModuleDefinitionManager definitions) throws IOException {
		String outfn = module.getName() + ".html";
		FormattedFile artifact = new FormattedFile(new FileWriter(outdir + File.separator + outfn));
		
		GpbHtmlDoc doc = new GpbHtmlDoc();
		
		// Set the module name and style sheet
		doc.getHtmlContent().getHtmlHead().setModuleName(module.getName().getNameString()).setStyleSheet("gpbdoc.css");
		
		Iterator<GpbMessage> messages = module.getAllGpbMessage();
		while(messages.hasNext()){
			
		}		
		
		artifact.close();
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub
		
	}
}
