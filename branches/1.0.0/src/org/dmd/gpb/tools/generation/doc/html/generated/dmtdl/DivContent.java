package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                        // Thrown by formatting - (Section.java:95)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DivDetails;           // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DivSummary;           // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.ModuleHeader;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                 // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                          // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                    // Standard interface used by Templates - (Section.java:92)
import org.dmd.templates.server.util.TemplateMediator;                             // To access commentContainer - (Section.java:98)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class DivContent implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    ModuleHeader    _ModuleHeader;         // A single static instance of ModuleHeader
    DivSummary      _DivSummary;           // A single static instance of DivSummary
    DivDetails      _DivDetails;           // A single static instance of DivDetails


    public DivContent(){
        _ModuleHeader = new ModuleHeader(); // Static Section
        _DivSummary = new DivSummary(); // Static Section
        _DivDetails = new DivDetails(); // Static Section
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivContent starts with text");
        GpbdocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div id=\"content\">\n");

        GpbdocTemplateLoader.DivContent.format(this,artifact, GpbdocTemplateLoader._Comment);

        _ModuleHeader.format(artifact);

        _DivSummary.format(artifact);

        _DivDetails.format(artifact);

        artifact.addText("</div> <!-- content -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public ModuleHeader getModuleHeader(){
        return(_ModuleHeader);
    }

    public DivSummary getDivSummary(){
        return(_DivSummary);
    }

    public DivDetails getDivDetails(){
        return(_DivDetails);
    }

}