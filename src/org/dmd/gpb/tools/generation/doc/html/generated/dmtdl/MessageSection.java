package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                          // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                                          // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                           // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageDetails;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                   // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                            // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                      // Standard interface used by Templates - (Section.java:92)
import org.dmd.templates.server.util.TemplateMediator;                               // To access commentContainer - (Section.java:98)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class MessageSection implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    ArrayList<MessageDetails>    _MessageDetails    = new ArrayList<MessageDetails>();   // Multiple instances of MessageDetails


    public MessageSection(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "MessageSection starts with text");
        GpbdocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div class=\"messages\">\n");

        GpbdocTemplateLoader.MessageSection.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_MessageDetails != null){
            for(MessageDetails entry: _MessageDetails){
                entry.format(artifact);
            }
        }

        artifact.addText("</div> <!-- messages -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public MessageDetails addMessageDetails(){
        if (_MessageDetails == null)
            _MessageDetails = new ArrayList<MessageDetails>();
        MessageDetails rc = new MessageDetails();
        _MessageDetails.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:400)
    public Iterator<MessageDetails> getMessageDetailsSet(){
        return(_MessageDetails.iterator());
    }

}