package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:112)
import java.io.IOException;                                                            // Thrown by formatting - (Section.java:95)
import java.util.ArrayList;                                                            // Because we have multiple instances of some Sections - (Section.java:67)
import java.util.Iterator;                                                             // Because we have multiple instances of some Sections - (Section.java:68)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.AttributeInfo;            // Is a contained section - (Section.java:62)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DescriptionEnd;           // Ends with one of these - (Section.java:83)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DescriptionStart;         // Starts with one of these - (Section.java:50)
import org.dmd.templates.server.extended.Template;                                     // The Template - (Section.java:93)
import org.dmd.templates.server.util.FormattedArtifactIF;                              // Common interface for gathering formatted output - (Section.java:94)
import org.dmd.templates.server.util.SectionIF;                                        // Standard interface used by Templates - (Section.java:92)



// Generated from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:114)
public class DescriptionSection implements SectionIF {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.Section.generateSectionClass(Section.java:117)
    DescriptionStart            _DescriptionStart;                                       // Starts with a DescriptionStart
    ArrayList<AttributeInfo>    _AttributeInfo       = new ArrayList<AttributeInfo>();   // Multiple instances of AttributeInfo
    DescriptionEnd              _DescriptionEnd;                                         // Ends with a DescriptionEnd


    public DescriptionSection(){
        _DescriptionStart = new DescriptionStart(); // Starts with
        _DescriptionEnd = new DescriptionEnd(); // Ends with
    }

    public String getValue(String name){
        return("");
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:269)
    public void format(FormattedArtifactIF artifact) throws IOException {
        _DescriptionStart.format(artifact);

        GpbdocTemplateLoader.DescriptionSection.format(this,artifact, GpbdocTemplateLoader._Comment);

        if (_AttributeInfo != null){
            for(AttributeInfo entry: _AttributeInfo){
                entry.format(artifact);
            }
        }

        _DescriptionEnd.format(artifact);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getFormatFunction(Section.java:341)
    public void format(FormattedArtifactIF artifact, Template template) throws IOException {
        template.format(this, artifact);
    }

    public DescriptionStart getDescriptionStart(){
        return(_DescriptionStart);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:391)
    public AttributeInfo addAttributeInfo(){
        if (_AttributeInfo == null)
            _AttributeInfo = new ArrayList<AttributeInfo>();
        AttributeInfo rc = new AttributeInfo();
        _AttributeInfo.add(rc);
        return(rc);
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:400)
    public Iterator<AttributeInfo> getAttributeInfoSet(){
        return(_AttributeInfo.iterator());
    }

    // Generated from: org.dmd.templates.server.extended.Section.getAccessFunctions(Section.java:407)
    public AttributeInfo fastAddAttributeInfo(String label_, String info_){
        if (_AttributeInfo == null)
            _AttributeInfo = new ArrayList<AttributeInfo>();
        AttributeInfo rc = new AttributeInfo(label_, info_);
        _AttributeInfo.add(rc);
        return(rc);
    }

    public DescriptionEnd getDescriptionEnd(){
        return(_DescriptionEnd);
    }

}