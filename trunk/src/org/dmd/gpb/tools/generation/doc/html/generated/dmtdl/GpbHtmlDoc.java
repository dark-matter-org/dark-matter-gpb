package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:72)
import java.io.IOException;                                                        // Thrown by formatting - (TextualArtifact.java:40)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DivDetails;           // To access static Section: DivDetails - (TextualArtifact.java:43)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DivSummary;           // To access static Section: DivSummary - (TextualArtifact.java:43)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.DocType;              // Is a contained section - (TextualArtifact.java:53)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.HtmlContent;          // Is a contained section - (TextualArtifact.java:53)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.HtmlHead;             // To access static Section: HtmlHead - (TextualArtifact.java:43)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.ModuleHeader;         // To access static Section: ModuleHeader - (TextualArtifact.java:43)
import org.dmd.templates.server.util.FormattedArtifactIF;                          // Common interface for gathering formatted output - (TextualArtifact.java:39)



    // Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:74)
    /**
     * The structure of the GpbHtmlDoc TextualArtifact is as follows:
     * 
     * [] : many Sections
     * ++ : an optional Section
     * -- : a static Section
     * <- : values can be inserted
     * xx : extension hook can be inserted
     * 
     * GpbHtmlDoc
     *   -- DocType  
     *   -- HtmlContent  
     *     -- HtmlHead  <-
     *     -- Body  
     *       -- DivHeader  
     *       -- DivMain  
     *         -- DivContent  
     *           -- ModuleHeader  <-
     *           -- DivSummary  
     *             [] SummarySection  
     *               -- SummaryHeader  <-
     *               [] SummaryItem  <-
     *               -- SummaryFooter  
     *           -- DivDetails  
     *             ++ EnumerationSection  
     *               [] EnumerationDetails  
     *                 -- EnumerationHeader  <-
     *                 [] EnumerationValue  <-
     *                 -- EnumerationFooter  
     *             ++ MessageSection  
     *               [] MessageDetails  
     *                 -- MessageHeader  <-
     *                 [] FieldReference  <-
     *                 -- MessageFooter  
     */
    public class GpbHtmlDoc {


    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:78)
    DocType        _DocType;             // A single static instance of DocType
    HtmlContent    _HtmlContent;         // A single static instance of HtmlContent


    // Generated from: org.dmd.templates.server.extended.TextualArtifact.generateTextualArtifactClass(TextualArtifact.java:81)
    public GpbHtmlDoc(){
        _DocType = new DocType(); // Static Section
        _HtmlContent = new HtmlContent(); // Static Section
    }

    // Generated from: org.dmd.templates.server.extended.TextualArtifact.getFormatFunction(TextualArtifact.java:137)
    public void format(FormattedArtifactIF artifact) throws IOException {

        _DocType.format(artifact);

        _HtmlContent.format(artifact);

    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the DivDetails Section at: _HtmlContent.getBody().getDivMain().getDivContent().getDivDetails()
     */
    public DivDetails getDivDetails(){
        return(_HtmlContent.getBody().getDivMain().getDivContent().getDivDetails());
    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the DivSummary Section at: _HtmlContent.getBody().getDivMain().getDivContent().getDivSummary()
     */
    public DivSummary getDivSummary(){
        return(_HtmlContent.getBody().getDivMain().getDivContent().getDivSummary());
    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the HtmlHead Section at: _HtmlContent.getHtmlHead()
     */
    public HtmlHead getHtmlHead(){
        return(_HtmlContent.getHtmlHead());
    }

    // Generated from: org.dmd.templates.server.util.StaticAccessInfo.getAccessFunctions(StaticAccessInfo.java:47)
    /**
     * @return the ModuleHeader Section at: _HtmlContent.getBody().getDivMain().getDivContent().getModuleHeader()
     */
    public ModuleHeader getModuleHeader(){
        return(_HtmlContent.getBody().getDivMain().getDivContent().getModuleHeader());
    }

}