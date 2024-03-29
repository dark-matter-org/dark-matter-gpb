package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:95)
import java.util.TreeMap;                                         // To store values - (Section.java:102)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class SummaryItem implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public SummaryItem(){
    }

    /**
     * Constructs a new SummaryItem section.
     * @param itemName_ The name of the summary item
     * @param hint_ A short description of the item
     * @param version_ The version when something was introduced
     * @param obsolete_ The version when something became obsolete
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
     */
    public SummaryItem(String itemName_, String hint_, String version_, String obsolete_){
        if (itemName_ != null)
            values.put("itemName", itemName_);

        if (hint_ != null)
            values.put("hint", hint_);

        if (version_ != null)
            values.put("version", version_);

        if (obsolete_ != null)
            values.put("obsolete", obsolete_);

    }

    public SummaryItem setItemName(String itemName_){
        if (itemName_ != null)
            values.put("itemName", itemName_);
        return(this);
    }

    public SummaryItem setHint(String hint_){
        if (hint_ != null)
            values.put("hint", hint_);
        return(this);
    }

    public SummaryItem setVersion(String version_){
        if (version_ != null)
            values.put("version", version_);
        return(this);
    }

    public SummaryItem setObsolete(String obsolete_){
        if (obsolete_ != null)
            values.put("obsolete", obsolete_);
        return(this);
    }

    public String getValue(String name){
        String rc = values.get(name);
        if (rc == null)
            rc = "";
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {

        GpbdocTemplateLoader.SummaryItem.format(this,artifact, GpbdocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}