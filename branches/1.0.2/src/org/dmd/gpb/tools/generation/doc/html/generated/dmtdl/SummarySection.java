package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                         // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                                         // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                          // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummaryFooter;         // Ends with one of these - (Section.java:83)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummaryHeader;         // Starts with one of these - (Section.java:50)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummaryItem;           // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                  // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                           // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                     // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class SummarySection implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    SummaryHeader             _SummaryHeader;                                     // Starts with a SummaryHeader
    ArrayList<SummaryItem>    _SummaryItem      = new ArrayList<SummaryItem>();   // Multiple instances of SummaryItem
    SummaryFooter             _SummaryFooter;                                     // Ends with a SummaryFooter


    public SummarySection(){
        _SummaryHeader = new SummaryHeader(); // Starts with
        _SummaryFooter = new SummaryFooter(); // Ends with
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _SummaryHeader.format(artifact);

        GpbdocTemplateLoader.SummarySection.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_SummaryItem != null){
            for(SummaryItem entry: _SummaryItem){
                entry.format(artifact);
            }
        }

        _SummaryFooter.format(artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public SummaryHeader getSummaryHeader(){
        return(_SummaryHeader);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public SummaryItem addSummaryItem(){
        if (_SummaryItem == null)
            _SummaryItem = new ArrayList<SummaryItem>();
        SummaryItem rc = new SummaryItem();
        _SummaryItem.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:400)
    public Iterator<SummaryItem> getSummaryItemSet(){
        return(_SummaryItem.iterator());
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:407)
    public SummaryItem fastAddSummaryItem(String itemName_, String hint_, String version_, String obsolete_){
        if (_SummaryItem == null)
            _SummaryItem = new ArrayList<SummaryItem>();
        SummaryItem rc = new SummaryItem(itemName_, hint_, version_, obsolete_);
        _SummaryItem.add(rc);
        return(rc);
    }

    public SummaryFooter getSummaryFooter(){
        return(_SummaryFooter);
    }

}