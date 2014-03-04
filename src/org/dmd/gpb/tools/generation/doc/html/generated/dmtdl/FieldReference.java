package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                       // Thrown by formatting - (Section.java:95)
import java.util.TreeMap;                                         // To store values - (Section.java:102)
import org.dmd.templates.server.extended.Template;                // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;         // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                   // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class FieldReference implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    TreeMap<String,String>    values    = new TreeMap<String,String>();   // Required to store our values


    public FieldReference(){
    }

    /**
     * Constructs a new FieldReference section.
     * @param fieldRef_ The name of the field being referenced
     * @param generateAs_ The name the will be used in the generated .proto file
     * @param fieldTag_ The numeric tag for the field
     * @param hint_ A short description of the value
     * @param version_ The version when the enum value was introduced
     * @param skip_ Any versions where this field is skipped
     * @param obsolete_ The version when the enum value became obsolete
     * Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:143)
     */
    public FieldReference(String fieldRef_, String generateAs_, String fieldTag_, String hint_, String version_, String skip_, String obsolete_){
        if (fieldRef_ != null)
            values.put("fieldRef", fieldRef_);

        if (generateAs_ != null)
            values.put("generateAs", generateAs_);

        if (fieldTag_ != null)
            values.put("fieldTag", fieldTag_);

        if (hint_ != null)
            values.put("hint", hint_);

        if (version_ != null)
            values.put("version", version_);

        if (skip_ != null)
            values.put("skip", skip_);

        if (obsolete_ != null)
            values.put("obsolete", obsolete_);

    }

    public FieldReference setFieldRef(String fieldRef_){
        if (fieldRef_ != null)
            values.put("fieldRef", fieldRef_);
        return(this);
    }

    public FieldReference setGenerateAs(String generateAs_){
        if (generateAs_ != null)
            values.put("generateAs", generateAs_);
        return(this);
    }

    public FieldReference setFieldTag(String fieldTag_){
        if (fieldTag_ != null)
            values.put("fieldTag", fieldTag_);
        return(this);
    }

    public FieldReference setHint(String hint_){
        if (hint_ != null)
            values.put("hint", hint_);
        return(this);
    }

    public FieldReference setVersion(String version_){
        if (version_ != null)
            values.put("version", version_);
        return(this);
    }

    public FieldReference setSkip(String skip_){
        if (skip_ != null)
            values.put("skip", skip_);
        return(this);
    }

    public FieldReference setObsolete(String obsolete_){
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

        GpbdocTemplateLoader.FieldReference.format(this,artifact, GpbdocTemplateLoader._Comment);

    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

}