package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:91)
import java.util.TreeMap;                                         // To store values - (Section.java:98)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:88)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class ModuleTitle implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public ModuleTitle(){
    }

    /**
     * Constructs a new ModuleTitle section.
     * @param moduleName_ Just the name of the module
     * @param moduleDescription_ The description of the module
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:139)
     */
    public ModuleTitle(String moduleName_, String moduleDescription_){
        if (moduleName_ != null)
            values.put("moduleName", moduleName_);

        if (moduleDescription_ != null)
            values.put("moduleDescription", moduleDescription_);

    }

    public ModuleTitle setModuleName(String moduleName_){
        if (moduleName_ != null)
            values.put("moduleName", moduleName_);
        return(this);
    }

    public ModuleTitle setModuleDescription(String moduleDescription_){
        if (moduleDescription_ != null)
            values.put("moduleDescription", moduleDescription_);
        return(this);
    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {

        GpbdocTemplateLoader.ModuleTitle.format(this,artifact, GpbdocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}