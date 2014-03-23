package org.dmd.gpb.tools.generation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.dmd.concinnity.shared.generated.dmo.ConceptDMO;
import org.dmd.dmc.DmcOmni;
import org.dmd.dms.generated.dmw.SchemaAndReasonIterableDMW;
import org.dmd.dms.generated.types.ConcinnityREF;
import org.dmd.dms.generated.types.Example;
import org.dmd.dms.generated.types.SchemaAndReason;
import org.dmd.dmw.DmwWrapper;
import org.dmd.gpb.server.extended.GpbDefinition;
import org.dmd.gpb.server.extended.GpbEnum;
import org.dmd.gpb.server.extended.GpbField;
import org.dmd.gpb.server.extended.GpbMessage;
import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.server.extended.GpbProtoFile;
import org.dmd.gpb.server.extended.GpbScalarType;
import org.dmd.gpb.server.generated.dmw.GpbEnumValueIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbFieldIndicatorIterableDMW;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.server.generated.dsd.GpbModuleGenUtility;
import org.dmd.gpb.shared.generated.types.GpbEnumValue;
import org.dmd.gpb.shared.types.GpbFieldIndicator;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DescriptionSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumerationDetails;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumerationSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.FieldDetailSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.FieldDetails;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.FieldReference;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.FieldSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.GpbHtmlDoc;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.GpbdocTemplateLoader;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageDetails;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageSection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummarySection;
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.ValueSection;
import org.dmd.templates.server.util.FormattedFile;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.StringArrayList;

public class GpbDocGenerator extends GpbModuleGenUtility{
	
	// Indicates the version for which we want to generate the documentation files
	StringBuffer		genversion = new StringBuffer();

	// The root directory of generated documents 
	StringBuffer		outdir = new StringBuffer();
	
	// The subdirectory where beneath outdir where we'll dump our docs
	String				outdirDMGPB;
	
	// The set of extension classes that we'll load. These must be the fully qualified
	// names of classes that implement the GpbdocExtensionHookIF
    StringArrayList		extensions         = new StringArrayList();

    GpbdocTemplateLoader	loader;

	public GpbDocGenerator(){
		commandLine.addOption("-genversion", 	genversion, "The version for  which we'll generated the .proto files");
		commandLine.addOption("-outdir", 		outdir, 	"The base directory where we'll dump the docs - we'll create the dmgpb subdirectory");
		commandLine.addOption("-extensions", 	extensions, "Classes that implement the GpbdocExtensionsHookIF interface");
	}

	@Override
    public void initialize() throws ResultException {
		ResultException ex = null;
		
		DmcOmni.instance().backRefTracking(true);
		DmcOmni.instance().setTrackSchemaReferences(true);
		
		if (srcdir.size() == 0){
			
		}
		
		if (outdir.length() == 0){
			ex = new ResultException("You must specify the outdir argument to indicate the base documentation directory. The generated docs will be placed in subfolder dmgpb beneath that directory.");
		}
		
		outdirDMGPB = outdir + File.separator + "dmgpb";
		createDir(outdirDMGPB);
		
		try {
			loader = new GpbdocTemplateLoader(searchPaths);
			loader.findAndLoadTemplate();
			
			// Load any extension hooks
			if (extensions.size() > 0){
				loader.loadExtensionHooks(extensions);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (ex == null)
				ex = new ResultException(e.toString());
			else
				ex.addError(e.toString());
		}
		
		try {
			copyResource("dmgpb.css");
			copyResource("fieldOptional.png");
			copyResource("fieldRepeated.png");
			copyResource("fieldRequired.png");
		} catch (IOException e) {
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
	}
		
	private void generateDoc(GpbModule module) throws IOException {
		String outfn = module.getName() + ".html";
		FormattedFile artifact = new FormattedFile(new FileWriter(outdirDMGPB + File.separator + outfn));
		
		GpbHtmlDoc doc = new GpbHtmlDoc();
		
		// Set the module name and style sheet
		doc.getHtmlHead().setStyleSheet("dmgpb.css");
		doc.getHtmlHead().setModuleName(module.getName().getNameString());
		
		DescriptionSection modDescription = doc.getModuleHeader().addDescriptionSection();
		
		if (module.getVersion() != null)
			modDescription.fastAddAttributeInfo("Introduced in:", module.getVersion());
		
		
		if (module.getLoadSchemaClassHasValue()){
			SchemaAndReasonIterableDMW it =  module.getLoadSchemaClassIterable();
			while(it.hasNext()){
				SchemaAndReason sandr = it.getNext();
				String c = Manipulator.getClassFromImport(sandr.getSchema());
				modDescription.fastAddAttributeInfo("Augmented by:", c + "<p/>" + sandr.getHint());
			}
		}
		
		doc.getModuleHeader().setModuleName(module.getName().getNameString());
		if (module.getDescriptionHasValue()){
			Iterator<String> descr = module.getDescriptionWithNewlines();
			boolean first = true;
			while(descr.hasNext()){
				if (first){
					modDescription.fastAddAttributeInfo("Description:", descr.next() + "\n");
					first = false;
				}
				else
					modDescription.fastAddAttributeInfo("", descr.next() + "\n");
			}

		}
		
		// Allow extenders to add their information
		modDescription.extensionDescriptionExtension(module);
		
		if (module.getExampleSize() > 0){
			Iterator<Example> it = module.getExample();
			while(it.hasNext()){
				Example example = it.next();
				modDescription.fastAddAttributeInfo("", example.getTitle() + "<p/>" + example.getContent().replaceAll("\\\\n","\\\n"));
			}
		}
		
		///////////////////////////////////////////////////////////////////////
		
		doc.getDivSeparator().setTitle("Summary");
		
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
		
		if (module.getGpbProtoFileCount() > 0){
			SummarySection summary = doc.getDivSummary().addSummarySection();
			summary.getSummaryHeader().setSummaryTitle("Generated Proto Files");
			Iterator<GpbProtoFile> pfiles = module.getAllGpbProtoFile();
			while(pfiles.hasNext()){
				GpbProtoFile file = pfiles.next();
				
				summary.fastAddSummaryItem(file.getGeneratedFileName(),file.getHint(), null, null);
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
		
		if (module.getGpbFieldCount() > 0){
			SummarySection summary = doc.getDivSummary().addSummarySection();
			summary.getSummaryHeader().setSummaryTitle("Fields");
			
			Iterator<GpbField> fields = module.getAllGpbField();
			while(fields.hasNext()){
				GpbField field = fields.next();
				summary.fastAddSummaryItem(field.getName().getNameString(),field.getHint(), null, null);
			}
		}

		///////////////////////////////////////////////////////////////////////
		// Details
		
		// Add the enum details
		if (module.getGpbEnumCount() > 0){
			EnumerationSection enumSection = doc.getDivDetails().addEnumerationSection();
			enumSection.getDivSeparator().setTitle("Enumeration Details");
			
			Iterator<GpbEnum> enums = module.getAllGpbEnum();
			while(enums.hasNext()){
				GpbEnum gpbenum = enums.next();

				EnumerationDetails details = enumSection.addEnumerationDetails();
				details.fastAddDetailTitle(gpbenum.getName().getNameString(), "enum");
				
				DescriptionSection description = details.addDescriptionSection();
				if (gpbenum.getHint() != null){
					description.fastAddAttributeInfo("Summary:", gpbenum.getHint());
				}
				if (gpbenum.isReferenced()){
					description.fastAddAttributeInfo("Used in:", getReferences(gpbenum, gpbenum.getReferringObjects()));
				}
				
				ValueSection valueSection = details.addValueSection();
				
				GpbEnumValueIterableDMW it = gpbenum.getGpbEnumValueIterable();
				while(it.hasNext()){
					GpbEnumValue value = it.getNext();
					valueSection.fastAddEnumerationValue(value.getName(), value.getValue().toString(), value.getDescription(), value.getVersion(), value.getObsolete());
				}
			}
		}
		
		///////////////////////////////////////////////////////////////////////
		// Add the message details
		if (module.getGpbMessageCount() > 0){
			MessageSection section = doc.getDivDetails().addMessageSection();
			section.getDivSeparator().setTitle("Message Details");
			
			Iterator<GpbMessage> messages = module.getAllGpbMessage();
			while(messages.hasNext()){
				GpbMessage message = messages.next();
				
				MessageDetails details = section.addMessageDetails();
				details.fastAddDetailTitle(message.getName().getNameString(), "message");
				
				DescriptionSection description = details.addDescriptionSection();
				if (message.getHint() != null){
					description.fastAddAttributeInfo("Summary:", message.getHint());
				}
				if (message.isReferenced()){
					description.fastAddAttributeInfo("Used in:", getReferences(message, message.getReferringObjects()));
				}
				addDescription(description, message);
				
				// References to Concepts are weak references, they may or may not be
				// resolved, so we drop down to the DMO level to check things out. If it's
				// resolved, we try to get the hint, otherwise, we just wind up with the
				// name of the Concept (or some random string that somebody whacked in there!)
				if (message.getDMO().getWhy() != null){
					
//					ConceptREF ref = (message.getDMO().getWhy();
					ConcinnityREF cref = (message.getDMO().getWhy());
					if (cref.isResolved()){
						if (cref.getObject() instanceof ConceptDMO){
							ConceptDMO concept = (ConceptDMO) cref.getObject();
//						String reference = "<a name=\"::messageTitle::\"> The ::messageTitle:: message </a>";
							String info = concept.getName().getNameString();
							String name = concept.getName().getNameString();
							String from = concept.getDefinedInConcinnityModule().getName().getNameString();
							if (concept.getHint() != null)
								info = concept.getHint();
							
							String reference = "<a href=\"../dmcm/" + from + ".html#" + name + "\"> " + info + " </a>";
							
							description.fastAddAttributeInfo("Why", reference);
						}
					}
					else{
						description.fastAddAttributeInfo("Why", cref.getObjectName().getNameString());
					}
					
						
				}
				
				// Allow extenders to add their information
				description.extensionDescriptionExtension(message);
				
				FieldSection fieldSection = details.addFieldSection();
				
				GpbFieldIndicatorIterableDMW it = message.getFieldIterable();
				while(it.hasNext()){
					GpbFieldIndicator field = it.getNext();
					
					String icon = "";
					String tooltip = "";
					switch(field.getFieldRule()){
					case OPTIONAL:
						icon = "fieldOptional.png";
						tooltip = "Optional";
						break;
					case REPEATED:
						icon = "fieldRepeated.png";
						tooltip = "Repeated";
						break;
					case REQUIRED:
						icon = "fieldRequired.png";
						tooltip = "Required";
						break;
					}
					
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
					
					GpbField gpbfield = (GpbField) field.getFieldRef().getObject().getContainer();
					
					String genAs = gpbfield.getGenerateAs();
					String hint = gpbfield.getHint();
					String typeRef = gpbfield.getTypeHref(message);
					String tn = gpbfield.getGpbType().getName().getNameString();
					
					// The hint may be overridden at the field level
					if (field.getHint() != null)
						hint = field.getHint();
					
					FieldReference fieldReference = fieldSection.addFieldReference();
					fieldReference.setIcon(icon).setTooltip(tooltip);
					fieldReference.setFieldRef(gpbfield.getHref(message)).setFieldName(gpbfield.getName().getNameString());
					fieldReference.setTypeRef(typeRef).setTypeName(tn).setGenerateAs(genAs);
					fieldReference.setFieldTag(field.getFieldTag().toString());
					fieldReference.setHint(hint).setVersion(field.getVersion()).setSkip(skip).setObsolete(field.getObsolete());
				}
			}
		}
		
		if (module.getGpbFieldCount() > 0){
			FieldDetailSection section = doc.getDivDetails().addFieldDetailSection();
			section.getDivSeparator().setTitle("Field Details");
			
			Iterator<GpbField> fields = module.getAllGpbField();
			while(fields.hasNext()){
				GpbField field = fields.next();
				
				FieldDetails details = section.addFieldDetails();
				details.fastAddDetailTitle(field.getName().getNameString(), "Field");
				DescriptionSection description = details.addDescriptionSection();
				
				if (field.getHint() != null){
					description.fastAddAttributeInfo("Summary:", field.getHint());
				}
				if (field.getGpbType() != null){
					String ref = "<a href=\"" + field.getGpbType().getHref(field) + "\"> " + field.getGpbType().getName() + " </a>";
					description.fastAddAttributeInfo("Type:", ref);
				}
				if (field.isReferenced()){
					description.fastAddAttributeInfo("Used in:", getReferences(field, field.getReferringObjects()));
				}
				if (field.getDescriptionHasValue()){
					Iterator<String> it = field.getDescriptionWithNewlines();
					boolean first = true;
					while(it.hasNext()){
						if (first){
							description.fastAddAttributeInfo("Description", it.next());
							first = false;
						}
						else{
							description.fastAddAttributeInfo("", it.next());
						}
					}
				}
				
				// Allow extenders to add their information
				description.extensionDescriptionExtension(field);

			}
		}



		
		doc.format(artifact);
		
		artifact.close();
	}
	
	/**
	 * @param from the definition being referenced
	 * @param refs the references to it
	 * @return a string contain hrefs pointing to things that point to the definition
	 */
	String getReferences(GpbDefinition from, ArrayList<DmwWrapper> refs){
		StringBuffer sb = new StringBuffer();
		for(DmwWrapper wrapper: refs){
			GpbDefinition def = (GpbDefinition) wrapper;
			
			if (sb.length() > 0)
				sb.append(", ");
			
			if (def instanceof GpbProtoFile){
				GpbProtoFile file = (GpbProtoFile) def;
				sb.append("<a href=\"" + file.getHref(from) + "\">" + file.getGeneratedFileName() + "</a>");
			}
			else{
				sb.append("<a href=\"" + def.getHref(from) + "\">" + def.getName().getNameString());
			}
		}
		return(sb.toString());
	}
	
	void copyResource(String name) throws IOException{
		URL url = this.getClass().getResource(name);
		FileUtils.copyURLToFile(url, new File(outdirDMGPB + File.separator + name));
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generate(GpbModuleDefinitionManager definitions) throws IOException {
		Iterator<GpbModule> modules = definitions.getAllGpbModule();
		while(modules.hasNext()){
			generateDoc(modules.next());
		}
		
	}
	
	void addDescription(DescriptionSection section, GpbDefinition def){
		if (def.getDescriptionHasValue()){
			Iterator<String> descr = def.getDescriptionWithNewlines();
			boolean first = true;
			while(descr.hasNext()){
				if (first){
					section.fastAddAttributeInfo("Description:", descr.next() + "\n");
					first = false;
				}
				else
					section.fastAddAttributeInfo("", descr.next() + "\n");
			}

		}

	}
	
	void createDir(String dir) throws ResultException {
		File folder = new File(dir);
		
		if (!folder.exists()){
			if (!folder.mkdirs()){
				ResultException rc = new ResultException("Couldn't create directory: " + dir);
				throw(rc);
			}
		}
	}

}
