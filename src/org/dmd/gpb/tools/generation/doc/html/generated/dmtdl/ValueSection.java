package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                             // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                                             // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                              // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.EnumerationValue;          // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.ValueSectionEnd;           // Ends with one of these - (Section.java:83)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.ValueSectionStart;         // Starts with one of these - (Section.java:50)
import org.dmd.templates.server.extended.Template;                                      // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                               // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                         // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class ValueSection implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    ValueSectionStart              _ValueSectionStart;                                          // Starts with a ValueSectionStart
    ArrayList<EnumerationValue>    _EnumerationValue     = new ArrayList<EnumerationValue>();   // Multiple instances of EnumerationValue
    ValueSectionEnd                _ValueSectionEnd;                                            // Ends with a ValueSectionEnd


    public ValueSection(){
        _ValueSectionStart = new ValueSectionStart(); // Starts with
        _ValueSectionEnd = new ValueSectionEnd(); // Ends with
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _ValueSectionStart.format(artifact);

        GpbdocTemplateLoader.ValueSection.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_EnumerationValue != null){
            for(EnumerationValue entry: _EnumerationValue){
                entry.format(artifact);
            }
        }

        _ValueSectionEnd.format(artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public ValueSectionStart getValueSectionStart(){
        return(_ValueSectionStart);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public EnumerationValue addEnumerationValue(){
        if (_EnumerationValue == null)
            _EnumerationValue = new ArrayList<EnumerationValue>();
        EnumerationValue rc = new EnumerationValue();
        _EnumerationValue.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:400)
    public Iterator<EnumerationValue> getEnumerationValueSet(){
        return(_EnumerationValue.iterator());
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:407)
    public EnumerationValue fastAddEnumerationValue(String valueName_, String value_, String hint_, String version_, String obsolete_){
        if (_EnumerationValue == null)
            _EnumerationValue = new ArrayList<EnumerationValue>();
        EnumerationValue rc = new EnumerationValue(valueName_, value_, hint_, version_, obsolete_);
        _EnumerationValue.add(rc);
        return(rc);
    }

    public ValueSectionEnd getValueSectionEnd(){
        return(_ValueSectionEnd);
    }

}