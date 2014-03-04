package org.dmd.gpb.tools.generation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.dmd.gpb.server.extended.GpbEnum;
import org.dmd.gpb.server.extended.GpbMessage;
import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.extended.GpbScalarType;
import org.dmd.gpb.server.generated.dmw.GpbEnumValueIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbFieldIndicatorIterableDMW;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.gpb.shared.generated.types.GpbEnumValue;
import org.dmd.gpb.shared.types.GpbFieldIndicator;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumerationDetails;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumerationSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.GpbHtmlDoc;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.GpbdocTemplateLoader;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageDetails;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummarySection;
import org.dmd.templates.server.util.FormattedFile;
import org.dmd.util.exceptions.DebugInfo;
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
		commandLine.addOption("-extensions", 	extensions, "Classes that implement the GpbdocExtensionsHookIF interface");
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
		URL url = this.getClass().getResource("dmgpb.css");
		DebugInfo.debug("url: " + url.getFile());
		FileUtils.copyURLToFile(url, new File(outdir + File.separator + "dmgpb.css"));

		String outfn = module.getName() + ".html";
		FormattedFile artifact = new FormattedFile(new FileWriter(outdir + File.separator + outfn));
		
		GpbHtmlDoc doc = new GpbHtmlDoc();
		
		// Set the module name and style sheet
		doc.getHtmlHead().setStyleSheet("dmgpb.css");
		doc.getHtmlHead().setModuleName(module.getName().getNameString());
		
		if (module.getVersion() != null)
			doc.getModuleHeader().setVersion(module.getVersion());

		doc.getModuleHeader().setModuleName(module.getName().getNameString());
		if (module.getDescriptionHasValue()){
			Iterator<String> descr = module.getDescriptionWithNewlines();
			StringBuffer sb = new StringBuffer();
			while(descr.hasNext()){
				sb.append(descr.next() + "\n");
			}
			doc.getModuleHeader().setModuleDescription(sb.toString());
		}
		
		///////////////////////////////////////////////////////////////////////
		
		// Add the scalar type summary
		if (module.getGpbScalarTypeCount() > 0){
			SummarySection summary = doc.getDivSummary().addSummarySection();
			summary.getSummaryHeader().setSummaryTitle("Scalar types");
			
			Iterator<GpbScalarType> types = module.getAllGpbScalarType();
			while(types.hasNext()){
				GpbScalarType type = types.next();
				summary.fastAddSummaryItem(type.getName().getNameString(),type.getHint(),null,null);
			}
		}

		// Add the enum summary
		if (module.getGpbEnumCount() > 0){
			SummarySection summary = doc.getDivSummary().addSummarySection();
			summary.getSummaryHeader().setSummaryTitle("Enumerations");
			
			Iterator<GpbEnum> enums = module.getAllGpbEnum();
			while(enums.hasNext()){
				GpbEnum gpbenum = enums.next();
				
				summary.fastAddSummaryItem(gpbenum.getName().getNameString(),gpbenum.getHint(),gpbenum.getVersion(),gpbenum.getObsolete());
			}
		}
		
		// Add the message summary
		if (module.getGpbMessageCount() > 0){
			SummarySection summary = doc.getDivSummary().addSummarySection();
			summary.getSummaryHeader().setSummaryTitle("Messages");
			
			Iterator<GpbMessage> messages = module.getAllGpbMessage();
			while(messages.hasNext()){
				GpbMessage message = messages.next();
				
				summary.fastAddSummaryItem(message.getName().getNameString(),message.getHint(), message.getVersion(), message.getObsolete());
			}
		}

		///////////////////////////////////////////////////////////////////////
		// Details
		
		// Add the enum details
		if (module.getGpbEnumCount() > 0){
			EnumerationSection enumSection = doc.getDivDetails().addEnumerationSection();
			
			Iterator<GpbEnum> enums = module.getAllGpbEnum();
			while(enums.hasNext()){
				GpbEnum gpbenum = enums.next();

				EnumerationDetails details = enumSection.addEnumerationDetails();
				details.getEnumerationHeader().setEnumTitle(gpbenum.getName().getNameString());
				
				GpbEnumValueIterableDMW it = gpbenum.getGpbEnumValueIterable();
				while(it.hasNext()){
					GpbEnumValue value = it.getNext();
					details.fastAddEnumerationValue(value.getName(), value.getValue().toString(), value.getDescription(), value.getVersion(), value.getObsolete());
				}
			}
		}
		
		// Add the message details
		if (module.getGpbMessageCount() > 0){
			MessageSection section = doc.getDivDetails().addMessageSection();
			
			Iterator<GpbMessage> messages = module.getAllGpbMessage();
			while(messages.hasNext()){
				GpbMessage message = messages.next();
				
				MessageDetails details = section.addMessageDetails();
				details.getMessageHeader().setMessageTitle(message.getName().getNameString());
				
				GpbFieldIndicatorIterableDMW it = message.getFieldIterable();
				while(it.hasNext()){
					GpbFieldIndicator field = it.getNext();
					
					String skip = null;
					Iterator<String> skipit = field.getSkip();
					if (skipit != null){
						StringBuffer sb = new StringBuffer();
						while(skipit.hasNext()){
							if (sb.length() > 0)
								sb.append(" ");
							sb.append(skipit.next());
						}
						skip = sb.toString();
					}
					
					String genAs = field.getFieldRef().getObject().getGenerateAs();
					String hint = field.getFieldRef().getObject().getHint();
					String fn = field.getFieldRef().getObject().getName().getNameString();
					details.fastAddFieldReference(fn, genAs, field.getFieldTag().toString(), hint, field.getVersion(), skip, field.getObsolete());
				}
			}
		}


		
		doc.format(artifact);
		
		artifact.close();
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub
		
	}
	
	
}
