package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:108)
import java.io.IOException;                                                       // Thrown by formatting - (Section.java:91)
import java.util.ArrayList;                                                       // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                        // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.SummaryItem;         // Is a contained section - (Section.java:62)
import org.dmd.templates.server.extended.Template;                                // The Template - (Section.java:89)
import org.dmd.templates.server.util.FormattedArtifactIF;                         // Common interface for gathering formatted output - (Section.java:90)
import org.dmd.templates.server.util.SectionIF;                                   // Standard interface used by Templates - (Section.java:88)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:110)
public class MessageSummary implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:113)
    ArrayList<SummaryItem>    _SummaryItem    = new ArrayList<SummaryItem>();   // Multiple instances of SummaryItem


    public MessageSummary(){
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:261)
    public void format(FormattedArtifactIF artifact) throws IOException {

        GpbdocTemplateLoader.MessageSummary.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_SummaryItem != null){
            for(SummaryItem entry: _SummaryItem){
                entry.format(artifact);
            }
        }

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:329)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public SummaryItem addSummaryItem(){
        if (_SummaryItem == null)
            _SummaryItem = new ArrayList<SummaryItem>();
        SummaryItem rc = new SummaryItem();
        _SummaryItem.add(rc);
        return(rc);
    }

    public Iterator<SummaryItem> getSummaryItemSet(){
        return(_SummaryItem.iterator());
    }

    public SummaryItem fastAddSummaryItem(String itemName_){
        if (_SummaryItem == null)
            _SummaryItem = new ArrayList<SummaryItem>();
        SummaryItem rc = new SummaryItem(itemName_);
        _SummaryItem.add(rc);
        return(rc);
    }

}