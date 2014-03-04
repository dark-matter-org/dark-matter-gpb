package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                          // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                                          // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                           // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.FieldReference;         // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageFooter;          // Ends with one of these - (Section.java:83)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.MessageHeader;          // Starts with one of these - (Section.java:50)
import org.dmd.templates.server.extended.Template;                                   // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                            // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                      // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class MessageDetails implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    MessageHeader                _MessageHeader;                                         // Starts with a MessageHeader
    ArrayList<FieldReference>    _FieldReference    = new ArrayList<FieldReference>();   // Multiple instances of FieldReference
    MessageFooter                _MessageFooter;                                         // Ends with a MessageFooter


    public MessageDetails(){
        _MessageHeader = new MessageHeader(); // Starts with
        _MessageFooter = new MessageFooter(); // Ends with
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _MessageHeader.format(artifact);

        GpbdocTemplateLoader.MessageDetails.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_FieldReference != null){
            for(FieldReference entry: _FieldReference){
                entry.format(artifact);
            }
        }

        _MessageFooter.format(artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public MessageHeader getMessageHeader(){
        return(_MessageHeader);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public FieldReference addFieldReference(){
        if (_FieldReference == null)
            _FieldReference = new ArrayList<FieldReference>();
        FieldReference rc = new FieldReference();
        _FieldReference.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:400)
    public Iterator<FieldReference> getFieldReferenceSet(){
        return(_FieldReference.iterator());
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:407)
    public FieldReference fastAddFieldReference(String fieldRef_, String generateAs_, String fieldTag_, String hint_, String version_, String skip_, String obsolete_){
        if (_FieldReference == null)
            _FieldReference = new ArrayList<FieldReference>();
        FieldReference rc = new FieldReference(fieldRef_, generateAs_, fieldTag_, hint_, version_, skip_, obsolete_);
        _FieldReference.add(rc);
        return(rc);
    }

    public MessageFooter getMessageFooter(){
        return(_MessageFooter);
    }

}