package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                              // Thrown by formatting - (Section.java:95)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumerationSection;         // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageSection;             // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                       // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                                // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                          // Standard interface used by Templates - (Section.java:92)
import org.dmd.templates.server.util.TemplateMediator;                                   // To access commentContainer - (Section.java:98)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class DivDetails implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    EnumerationSection    _EnumerationSection;         // A single instance of EnumerationSection
    MessageSection        _MessageSection;             // A single instance of MessageSection


    public DivDetails(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivDetails starts with text");
        GpbdocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div class=\"details\">\n");

        GpbdocTemplateLoader.DivDetails.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_EnumerationSection != null)
            _EnumerationSection.format(artifact);

        if (_MessageSection != null)
            _MessageSection.format(artifact);

        artifact.addText("</div> <!-- details -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public EnumerationSection addEnumerationSection(){
        if (_EnumerationSection != null)
            throw(new IllegalStateException("Multiple calls to add a EnumerationSection Section. There should only be one of these in a DivDetails."));
        _EnumerationSection = new EnumerationSection();
        return(_EnumerationSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public EnumerationSection getEnumerationSection(){
        if (_EnumerationSection == null)
            throw new IllegalStateException("The EnumerationSection Section is optional. You must add the section before you get it.");

        return(_EnumerationSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public MessageSection addMessageSection(){
        if (_MessageSection != null)
            throw(new IllegalStateException("Multiple calls to add a MessageSection Section. There should only be one of these in a DivDetails."));
        _MessageSection = new MessageSection();
        return(_MessageSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public MessageSection getMessageSection(){
        if (_MessageSection == null)
            throw new IllegalStateException("The MessageSection Section is optional. You must add the section before you get it.");

        return(_MessageSection);
    }

}