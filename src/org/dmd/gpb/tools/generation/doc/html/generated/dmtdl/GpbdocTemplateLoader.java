package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:139)
import java.io.IOException;                                              // May occur when finding/reading the templates - (TdlModule.java:84)
import java.util.ArrayList;                                              // To store file search paths - (TdlModule.java:83)
import java.util.TreeMap;                                                // To store SectionInfo - (TdlModule.java:82)
import org.dmd.dmc.DmcNameClashException;                                // May be thrown when instantiating objects - (TdlModule.java:91)
import org.dmd.dmc.DmcValueException;                                    // May be thrown when parsing objects - (TdlModule.java:90)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                            // May be thrown by rule manager - (TdlModule.java:93)
import org.dmd.dmc.rules.SourceInfo;                                     // To indicate the source of rule problems - (TdlModule.java:95)
import org.dmd.dmc.util.DmcUncheckedObject;                              // Basic parsing of objects - (TdlModule.java:88)
import org.dmd.dms.AttributeDefinition;                                  // To allow addition of preserve newline attributes - (TdlModule.java:102)
import org.dmd.dms.SchemaManager;                                        // Manages the schemas we use - (TdlModule.java:85)
import org.dmd.dms.generated.dmw.AttributeDefinitionIterableDMW;         // To allow addition of preserve newline attributes - (TdlModule.java:103)
import org.dmd.dmv.shared.DmvRuleManager;                                // The injected rule manager used for initializations - (TdlModule.java:94)
import org.dmd.dmw.DmwObjectFactory;                                     // Constructs wrapped objects - (TdlModule.java:89)
import org.dmd.dmw.DmwWrapper;                                           // To handle factory created objects - (TdlModule.java:96)
import org.dmd.templates.server.extended.Template;                       // The Template - (TdlModule.java:97)
import org.dmd.templates.server.generated.DmtdlSchemaAG;                 // The dmtdl schema - (TdlModule.java:98)
import org.dmd.templates.server.util.TemplateMediator;                   // Allows us to access loaded templates - (TdlModule.java:104)
import org.dmd.util.exceptions.ResultException;                          // May be thrown by schema management - (TdlModule.java:92)
import org.dmd.util.parsing.ConfigFinder;                                // Finds configs we may need to parse - (TdlModule.java:99)
import org.dmd.util.parsing.ConfigLocation;                              // Handle to a discovered configuration - (TdlModule.java:100)
import org.dmd.util.parsing.ConfigVersion;                               // Handle to a particular config version - (TdlModule.java:101)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                    // Basic parsing of objects - (TdlModule.java:87)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                       // Basic parsing of objects - (TdlModule.java:86)



// Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:142)
public class GpbdocTemplateLoader implements DmcUncheckedOIFHandlerIF {

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:145)
    SchemaManager                                     schema;                                                               // Manages the schema for this DSD
    DmcUncheckedOIFParser                             parser                = new DmcUncheckedOIFParser(this);              // Parses objects from the config file
    DmwObjectFactory                                  factory;                                                              // Instantiates wrapped objects
    DmvRuleManager                                    rules                 = new DmvRuleManager();                         // Rule manager
    ConfigFinder                                      finder                = new ConfigFinder(".dmt");                     // Config finder for template files ending with .dmt
    ConfigLocation                                    location;                                                             // The location of the config being parsed
    TreeMap<String,TemplateMediator>                  mediators             = new TreeMap<String,TemplateMediator>();       // The mediators by name
                                                                                                                            // 
    public static TemplateMediator                    AttributeInfo         = new TemplateMediator("AttributeInfo");        // Mediator for the AttributeInfo template
    public static TemplateMediator                    Body                  = new TemplateMediator("Body");                 // Mediator for the Body template
    public static TemplateMediator                    DescriptionEnd        = new TemplateMediator("DescriptionEnd");       // Mediator for the DescriptionEnd template
    public static TemplateMediator                    DescriptionSection    = new TemplateMediator("DescriptionSection");   // Mediator for the DescriptionSection template
    public static TemplateMediator                    DescriptionStart      = new TemplateMediator("DescriptionStart");     // Mediator for the DescriptionStart template
    public static TemplateMediator                    DetailEnd             = new TemplateMediator("DetailEnd");            // Mediator for the DetailEnd template
    public static TemplateMediator                    DetailStart           = new TemplateMediator("DetailStart");          // Mediator for the DetailStart template
    public static TemplateMediator                    DetailTitle           = new TemplateMediator("DetailTitle");          // Mediator for the DetailTitle template
    public static TemplateMediator                    DivContent            = new TemplateMediator("DivContent");           // Mediator for the DivContent template
    public static TemplateMediator                    DivDetails            = new TemplateMediator("DivDetails");           // Mediator for the DivDetails template
    public static TemplateMediator                    DivHeader             = new TemplateMediator("DivHeader");            // Mediator for the DivHeader template
    public static TemplateMediator                    DivMain               = new TemplateMediator("DivMain");              // Mediator for the DivMain template
    public static TemplateMediator                    DivSeparator          = new TemplateMediator("DivSeparator");         // Mediator for the DivSeparator template
    public static TemplateMediator                    DivSummary            = new TemplateMediator("DivSummary");           // Mediator for the DivSummary template
    public static TemplateMediator                    DocType               = new TemplateMediator("DocType");              // Mediator for the DocType template
    public static TemplateMediator                    EnumerationDetails    = new TemplateMediator("EnumerationDetails");   // Mediator for the EnumerationDetails template
    public static TemplateMediator                    EnumerationFooter     = new TemplateMediator("EnumerationFooter");    // Mediator for the EnumerationFooter template
    public static TemplateMediator                    EnumerationSection    = new TemplateMediator("EnumerationSection");   // Mediator for the EnumerationSection template
    public static TemplateMediator                    EnumerationValue      = new TemplateMediator("EnumerationValue");     // Mediator for the EnumerationValue template
    public static TemplateMediator                    FieldDetailSection    = new TemplateMediator("FieldDetailSection");   // Mediator for the FieldDetailSection template
    public static TemplateMediator                    FieldDetails          = new TemplateMediator("FieldDetails");         // Mediator for the FieldDetails template
    public static TemplateMediator                    FieldReference        = new TemplateMediator("FieldReference");       // Mediator for the FieldReference template
    public static TemplateMediator                    FieldSection          = new TemplateMediator("FieldSection");         // Mediator for the FieldSection template
    public static TemplateMediator                    FieldSectionEnd       = new TemplateMediator("FieldSectionEnd");      // Mediator for the FieldSectionEnd template
    public static TemplateMediator                    FieldSectionStart     = new TemplateMediator("FieldSectionStart");    // Mediator for the FieldSectionStart template
    public static TemplateMediator                    HtmlContent           = new TemplateMediator("HtmlContent");          // Mediator for the HtmlContent template
    public static TemplateMediator                    HtmlHead              = new TemplateMediator("HtmlHead");             // Mediator for the HtmlHead template
    public static TemplateMediator                    MessageDetails        = new TemplateMediator("MessageDetails");       // Mediator for the MessageDetails template
    public static TemplateMediator                    MessageSection        = new TemplateMediator("MessageSection");       // Mediator for the MessageSection template
    public static TemplateMediator                    ModuleHeader          = new TemplateMediator("ModuleHeader");         // Mediator for the ModuleHeader template
    public static TemplateMediator                    SummaryFooter         = new TemplateMediator("SummaryFooter");        // Mediator for the SummaryFooter template
    public static TemplateMediator                    SummaryHeader         = new TemplateMediator("SummaryHeader");        // Mediator for the SummaryHeader template
    public static TemplateMediator                    SummaryItem           = new TemplateMediator("SummaryItem");          // Mediator for the SummaryItem template
    public static TemplateMediator                    SummarySection        = new TemplateMediator("SummarySection");       // Mediator for the SummarySection template
    public static TemplateMediator                    ValueSection          = new TemplateMediator("ValueSection");         // Mediator for the ValueSection template
    public static TemplateMediator                    ValueSectionEnd       = new TemplateMediator("ValueSectionEnd");      // Mediator for the ValueSectionEnd template
    public static TemplateMediator                    ValueSectionStart     = new TemplateMediator("ValueSectionStart");    // Mediator for the ValueSectionStart template
                                                                                                                            // 
    public static Template                            _Comment;                                                             // Used to display debug comments in formatted output
                                                                                                                            // 
    public static ArrayList<GpbdocExtensionHookIF>    _extensionHooks       = new ArrayList<GpbdocExtensionHookIF>();       // Used to access extension hook objects

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:147)
    /**
     * Creates a new template loader for templates associated with the gpbdoc TdlModule.
     * @param paths the paths that we'll search for the template definition file.
     * @param jars the prefixes of jars on the classpath that we'll search for configs
     */
    public GpbdocTemplateLoader(ArrayList<String> paths, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        DmtdlSchemaAG sd = new DmtdlSchemaAG();
        schema.manageSchema(sd);
        // Templates can be used to generate OIF files as well and we don't want the leading spaces on lines
        parser.dropLineContinuations();
        if (sd.getAttributeDefListSize() > 0){
            AttributeDefinitionIterableDMW attrs = sd.getAttributeDefList();
            while(attrs.hasNext()){
                AttributeDefinition ad = attrs.getNext();
                if (ad.getPreserveNewlines()){
                    parser.addPreserveNewlinesAttribute(ad.getName().getNameString());
                }
            }
        }
        
        finder.setSourceAndJarInfo(paths, jars);

        mediators.put("AttributeInfo",AttributeInfo);
        mediators.put("Body",Body);
        mediators.put("DescriptionEnd",DescriptionEnd);
        mediators.put("DescriptionSection",DescriptionSection);
        mediators.put("DescriptionStart",DescriptionStart);
        mediators.put("DetailEnd",DetailEnd);
        mediators.put("DetailStart",DetailStart);
        mediators.put("DetailTitle",DetailTitle);
        mediators.put("DivContent",DivContent);
        mediators.put("DivDetails",DivDetails);
        mediators.put("DivHeader",DivHeader);
        mediators.put("DivMain",DivMain);
        mediators.put("DivSeparator",DivSeparator);
        mediators.put("DivSummary",DivSummary);
        mediators.put("DocType",DocType);
        mediators.put("EnumerationDetails",EnumerationDetails);
        mediators.put("EnumerationFooter",EnumerationFooter);
        mediators.put("EnumerationSection",EnumerationSection);
        mediators.put("EnumerationValue",EnumerationValue);
        mediators.put("FieldDetailSection",FieldDetailSection);
        mediators.put("FieldDetails",FieldDetails);
        mediators.put("FieldReference",FieldReference);
        mediators.put("FieldSection",FieldSection);
        mediators.put("FieldSectionEnd",FieldSectionEnd);
        mediators.put("FieldSectionStart",FieldSectionStart);
        mediators.put("HtmlContent",HtmlContent);
        mediators.put("HtmlHead",HtmlHead);
        mediators.put("MessageDetails",MessageDetails);
        mediators.put("MessageSection",MessageSection);
        mediators.put("ModuleHeader",ModuleHeader);
        mediators.put("SummaryFooter",SummaryFooter);
        mediators.put("SummaryHeader",SummaryHeader);
        mediators.put("SummaryItem",SummaryItem);
        mediators.put("SummarySection",SummarySection);
        mediators.put("ValueSection",ValueSection);
        mediators.put("ValueSectionEnd",ValueSectionEnd);
        mediators.put("ValueSectionStart",ValueSectionStart);
        
        factory      = new DmwObjectFactory(schema);
        
        _Comment = new Template();
        _Comment.setFile("GpbdocTemplateLoader");
        _Comment.setLineNumber(1);
        _Comment.setFormat("\n<!-- ::comment:: -->");
        _Comment.initialize("::");
        
    }

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:194)
    /**
     * We attempt to find and load the gpbdoc.dmt file.
     */
    public void findAndLoadTemplate() throws ResultException, IOException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        for(TemplateMediator tm: mediators.values()){
            tm.reset();
        }
        
        finder.findConfigs();
        ConfigVersion version = finder.getConfig("gpbdoc");
        if (version == null){
            ResultException ex = new ResultException("Could not find template definition file: gpbdoc.dmt");
            ex.moreMessages(finder.getSearchInfo());
            throw(ex);
        }

        location = version.getLatestVersion();

        // How we read the file will depend on whether or not it's in a JAR
        parser.parseFile(location.getFileName(),location.isFromJAR());
    }

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:220)
    /**
     * We attempt to load the classes that provide extension hooks.
     */
    public void loadExtensionHooks(ArrayList<String> hooks) throws ResultException {
        Class<?> hookClass = null;
        GpbdocExtensionHookIF hook	= null;

        for(String hc: hooks){
		       try {
                hookClass = Class.forName(hc);
            } catch (ClassNotFoundException e) {
                ResultException ex = new ResultException(e);
                ex.addError("Couldn't load extension hook class: " + hc);
                throw(ex);
            }

            try {
                Object obj = hookClass.newInstance();

                if (obj instanceof GpbdocExtensionHookIF){
                    hook = (GpbdocExtensionHookIF) obj;
                    _extensionHooks.add(hook);
                }
                else{
                    ResultException ex = new ResultException("The specified class does not implement the GpbdocExtensionHookIF interface: " + hc);
                    throw(ex);
                }
            } catch (Exception e) {
                ResultException ex = new ResultException(e);
                ex.addError("Couldn't instantiate GpbdocExtensionHookIF class: " + hc);
                throw(ex);
            }
        }
    }

    // Generated from: org.dmd.templates.server.extended.TdlModule.generateTemplateLoader(TdlModule.java:257)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        Template template = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            template = (Template) wrapper;
        } catch (ClassNotFoundException e) {
            ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
            ex.result.lastResult().fileName(infile);
            ex.result.lastResult().lineNumber(lineNumber);
            throw(ex);
        }
        catch (ResultException ex){
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(DmcValueException e){
            ResultException ex = new ResultException();
            ex.addError(e.getMessage());
            if (e.getAttributeName() != null)
                ex.result.lastResult().moreMessages("Attribute: " + e.getAttributeName());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(ClassCastException e){
            ResultException ex = new ResultException();
            ex.addError("The following object is not valid in a .dmt file:\n\n" + wrapper.toOIF());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }

        template.setLineNumber(lineNumber);
        template.setFile(infile);

        try{
            // Run the rules against the definition
            rules.executeInitializers(template.getDmcObject());
            rules.executeAttributeValidation(template.getDmcObject());
            rules.executeObjectValidation(template.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

        TemplateMediator tm = mediators.get(template.getName().getNameString());
        if (tm == null){
            ResultException ex = new ResultException("Template for an unknown Section: " + template.getName());
            ex.moreMessages("The Template must use one of the following names:");
            for (String n : mediators.keySet()){
                ex.moreMessages(n);
            }
            ex.setLocationInfo(template.getFile(), template.getLineNumber());
            throw(ex);
        }
        
        if (tm.getTemplate() != null){
            ResultException ex = new ResultException("Duplicate Template for Section: " + template.getName());
            ex.moreMessages("Previously defined at line: " + tm.getTemplate().getLineNumber());
            ex.setLocationInfo(template.getFile(), template.getLineNumber());
            throw(ex);
        }
        
        template.initialize("::");
        
        tm.setTemplate(template);

    }

}
