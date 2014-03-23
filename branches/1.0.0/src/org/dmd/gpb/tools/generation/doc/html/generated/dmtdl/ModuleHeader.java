package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                              // Thrown by formatting - (Section.java:95)
import java.util.TreeMap;                                                                // To store values - (Section.java:102)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DescriptionSection;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                       // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                                // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                          // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class ModuleHeader implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>    values                 = new TreeMap<String,String>();   // Required to store our values
    DescriptionSection        _DescriptionSection;                                     // A single instance of DescriptionSection


    public ModuleHeader(){
    }

    /**
     * Constructs a new ModuleHeader section.
     * @param moduleName_ Just the name of the module
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
     */
    public ModuleHeader(String moduleName_){
        if (moduleName_ != null)
            values.put("moduleName", moduleName_);

    }

    public ModuleHeader setModuleName(String moduleName_){
        if (moduleName_ != null)
            values.put("moduleName", moduleName_);
        return(this);
    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {

        GpbdocTemplateLoader.ModuleHeader.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_DescriptionSection != null)
            _DescriptionSection.format(artifact);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public DescriptionSection addDescriptionSection(){
        if (_DescriptionSection != null)
            throw(new IllegalStateException("Multiple calls to add a DescriptionSection Section. There should only be one of these in a ModuleHeader."));
        _DescriptionSection = new DescriptionSection();
        return(_DescriptionSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public DescriptionSection getDescriptionSection(){
        if (_DescriptionSection == null)
            throw new IllegalStateException("The DescriptionSection Section is optional. You must add the section before you get it.");

        return(_DescriptionSection);
    }

}