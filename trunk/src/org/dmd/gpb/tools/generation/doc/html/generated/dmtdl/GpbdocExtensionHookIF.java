package org.dmd.gpb.tools.generation.doc.html.generated.dmtdl;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.templates.server.extended.TdlModule.generateExtensionInterface(TdlModule.java:50)
import java.util.ArrayList;                                                         // To hold formatted extensions - (TdlModule.java:35)
import org.dmd.gpb.server.extended.GpbDefinition;                                   // The object formatted by ExtensionHook - DescriptionExtension - (TdlModule.java:41)
import org.dmd.gpb.tools.generation.doc.html.generated.dmtdl.AttributeInfo;         // Used by ExtensionHook - DescriptionExtension - (TdlModule.java:40)



// Generated from: org.dmd.templates.server.extended.TdlModule.generateExtensionInterface(TdlModule.java:53)
public interface GpbdocExtensionHookIF {

    /**
     * Create any other required AttributeInfo entries based on the GpbDefinition object.
     * @param target the object currently being formatted.
     * @return null or a set of AttributeInfo Sections to be inserted in the artifact.
     */
    public ArrayList<AttributeInfo> performDescriptionExtension(GpbDefinition target);


}

