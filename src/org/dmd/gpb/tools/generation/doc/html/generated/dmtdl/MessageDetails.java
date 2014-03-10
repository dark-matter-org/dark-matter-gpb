package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                              // Thrown by formatting - (Section.java:95)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DescriptionSection;         // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DetailEnd;                  // Ends with one of these - (Section.java:83)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DetailStart;                // Starts with one of these - (Section.java:50)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DetailTitle;                // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.FieldSection;               // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                       // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                                // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                          // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class MessageDetails implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    DetailStart           _DetailStart;                // Starts with a DetailStart
    DetailTitle           _DetailTitle;                // A single instance of DetailTitle
    DescriptionSection    _DescriptionSection;         // A single instance of DescriptionSection
    FieldSection          _FieldSection;               // A single instance of FieldSection
    DetailEnd             _DetailEnd;                  // Ends with a DetailEnd


    public MessageDetails(){
        _DetailStart = new DetailStart(); // Starts with
        _DetailEnd = new DetailEnd(); // Ends with
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _DetailStart.format(artifact);

        GpbdocTemplateLoader.MessageDetails.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_DetailTitle != null)
            _DetailTitle.format(artifact);

        if (_DescriptionSection != null)
            _DescriptionSection.format(artifact);

        if (_FieldSection != null)
            _FieldSection.format(artifact);

        _DetailEnd.format(artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public DetailStart getDetailStart(){
        return(_DetailStart);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public DetailTitle addDetailTitle(){
        if (_DetailTitle != null)
            throw(new IllegalStateException("Multiple calls to add a DetailTitle Section. There should only be one of these in a MessageDetails."));
        _DetailTitle = new DetailTitle();
        return(_DetailTitle);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public DetailTitle getDetailTitle(){
        if (_DetailTitle == null)
            throw new IllegalStateException("The DetailTitle Section is optional. You must add the section before you get it.");

        return(_DetailTitle);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:379)
    public DetailTitle fastAddDetailTitle(String title_, String type_){
        if (_DetailTitle != null)
            throw(new IllegalStateException("Multiple calls to add a DetailTitle Section. There should only be one of these in a MessageDetails."));
        _DetailTitle = new DetailTitle(title_, type_);
        return(_DetailTitle);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public DescriptionSection addDescriptionSection(){
        if (_DescriptionSection != null)
            throw(new IllegalStateException("Multiple calls to add a DescriptionSection Section. There should only be one of these in a MessageDetails."));
        _DescriptionSection = new DescriptionSection();
        return(_DescriptionSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public DescriptionSection getDescriptionSection(){
        if (_DescriptionSection == null)
            throw new IllegalStateException("The DescriptionSection Section is optional. You must add the section before you get it.");

        return(_DescriptionSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:361)
    public FieldSection addFieldSection(){
        if (_FieldSection != null)
            throw(new IllegalStateException("Multiple calls to add a FieldSection Section. There should only be one of these in a MessageDetails."));
        _FieldSection = new FieldSection();
        return(_FieldSection);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:369)
    public FieldSection getFieldSection(){
        if (_FieldSection == null)
            throw new IllegalStateException("The FieldSection Section is optional. You must add the section before you get it.");

        return(_FieldSection);
    }

    public DetailEnd getDetailEnd(){
        return(_DetailEnd);
    }

}