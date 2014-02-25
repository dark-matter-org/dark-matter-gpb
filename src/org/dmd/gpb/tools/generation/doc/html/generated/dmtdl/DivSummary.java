package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                                          // Thrown by formatting - (Section.java:91)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumSummary;            // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageSummary;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                   // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;                            // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                                      // Standard interface used by Templates - (Section.java:88)
import org.dmd.templates.server.util.TemplateMediator;                               // To access commentContainer - (Section.java:94)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class DivSummary implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    MessageSummary    _MessageSummary;         // A single instance of MessageSummary
    EnumSummary       _EnumSummary;            // A single instance of EnumSummary


    public DivSummary(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivSummary starts with text");
        GpbdocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div class=\"summary\">\n");

        GpbdocTemplateLoader.DivSummary.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_MessageSummary != null)
            _MessageSummary.format(artifact);

        if (_EnumSummary != null)
            _EnumSummary.format(artifact);

        artifact.addText("</div> <!-- summary -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public MessageSummary addMessageSummary(){
        if (_MessageSummary != null)
            throw(new IllegalStateException("Multiple calls to add a MessageSummary Section. There should only be one of these in a DivSummary."));
        _MessageSummary = new MessageSummary();
        return(_MessageSummary);
    }

    public MessageSummary getMessageSummary(){
        return(_MessageSummary);
    }

    public EnumSummary addEnumSummary(){
        if (_EnumSummary != null)
            throw(new IllegalStateException("Multiple calls to add a EnumSummary Section. There should only be one of these in a DivSummary."));
        _EnumSummary = new EnumSummary();
        return(_EnumSummary);
    }

    public EnumSummary getEnumSummary(){
        return(_EnumSummary);
    }

}