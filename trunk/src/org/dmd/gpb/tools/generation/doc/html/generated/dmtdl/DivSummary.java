package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                          // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                                          // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                           // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummarySection;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                   // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                            // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                      // Standard interface used by Templates - (Section.java:92)
import org.dmd.templates.server.util.TemplateMediator;                               // To access commentContainer - (Section.java:98)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class DivSummary implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    ArrayList<SummarySection>    _SummarySection    = new ArrayList<SummarySection>();   // Multiple instances of SummarySection


    public DivSummary(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        TemplateMediator.commentContainer.setValue("comment", "DivSummary starts with text");
        GpbdocTemplateLoader._Comment.format(TemplateMediator.commentContainer, artifact);
        artifact.addText("<div class=\"summary\">\n");

        GpbdocTemplateLoader.DivSummary.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_SummarySection != null){
            for(SummarySection entry: _SummarySection){
                entry.format(artifact);
            }
        }

        artifact.addText("</div> <!-- summary -->\n");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public SummarySection addSummarySection(){
        if (_SummarySection == null)
            _SummarySection = new ArrayList<SummarySection>();
        SummarySection rc = new SummarySection();
        _SummarySection.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:400)
    public Iterator<SummarySection> getSummarySectionSet(){
        return(_SummarySection.iterator());
    }

}