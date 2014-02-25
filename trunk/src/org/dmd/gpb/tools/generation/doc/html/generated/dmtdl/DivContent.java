package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                                       // Thrown by formatting - (Section.java:91)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DivSummary;          // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.ModuleTitle;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;                         // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                                   // Standard interface used by Templates - (Section.java:88)
import org.dmd.templates.server.util.TemplateMediator;                            // To access commentContainer - (Section.java:94)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class DivContent implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    ModuleTitle    _ModuleTitle;         // A single static instance of ModuleTitle
    DivSummary     _DivSummary;          // A single static instance of DivSummary


    public DivContent(){
        _ModuleTitle = new ModuleTitle(); // Static Section
        _DivSummary = new DivSummary(); // Static Section
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivContent starts with text");
        GpbdocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div id=\"content\">\n");

        GpbdocTemplateLoader.DivContent.format(this,artifact, GpbdocTemplateLoader._Comment);

        _ModuleTitle.format(artifact);

        _DivSummary.format(artifact);

        artifact.addText("</div> <!-- content -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public ModuleTitle getModuleTitle(){
        return(_ModuleTitle);
    }

    public DivSummary getDivSummary(){
        return(_DivSummary);
    }

}