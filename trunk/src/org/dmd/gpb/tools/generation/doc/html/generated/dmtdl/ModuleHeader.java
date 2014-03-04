package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:95)
import java.util.TreeMap;                                         // To store values - (Section.java:102)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class ModuleHeader implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public ModuleHeader(){
    }

    /**
     * Constructs a new ModuleHeader section.
     * @param moduleName_ Just the name of the module
     * @param moduleDescription_ The description of the module
     * @param version_ The version at which the module was introduced
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
     */
    public ModuleHeader(String moduleName_, String moduleDescription_, String version_){
        if (moduleName_ != null)
            values.put("moduleName", moduleName_);

        if (moduleDescription_ != null)
            values.put("moduleDescription", moduleDescription_);

        if (version_ != null)
            values.put("version", version_);

    }

    public ModuleHeader setModuleName(String moduleName_){
        if (moduleName_ != null)
            values.put("moduleName", moduleName_);
        return(this);
    }

    public ModuleHeader setModuleDescription(String moduleDescription_){
        if (moduleDescription_ != null)
            values.put("moduleDescription", moduleDescription_);
        return(this);
    }

    public ModuleHeader setVersion(String version_){
        if (version_ != null)
            values.put("version", version_);
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

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}