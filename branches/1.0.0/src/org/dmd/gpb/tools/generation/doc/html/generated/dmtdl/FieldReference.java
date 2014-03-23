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

    public FieldReference setIcon(String icon_){
        if (icon_ != null)
            values.put("icon", icon_);
        return(this);
    }

    public FieldReference setTooltip(String tooltip_){
        if (tooltip_ != null)
            values.put("tooltip", tooltip_);
        return(this);
    }

    public FieldReference setFieldRef(String fieldRef_){
        if (fieldRef_ != null)
            values.put("fieldRef", fieldRef_);
        return(this);
    }

    public FieldReference setFieldName(String fieldName_){
        if (fieldName_ != null)
            values.put("fieldName", fieldName_);
        return(this);
    }

    public FieldReference setGenerateAs(String generateAs_){
        if (generateAs_ != null)
            values.put("generateAs", generateAs_);
        return(this);
    }

    public FieldReference setTypeRef(String typeRef_){
        if (typeRef_ != null)
            values.put("typeRef", typeRef_);
        return(this);
    }

    public FieldReference setTypeName(String typeName_){
        if (typeName_ != null)
            values.put("typeName", typeName_);
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