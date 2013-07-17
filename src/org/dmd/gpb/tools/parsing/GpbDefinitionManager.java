package org.dmd.gpb.tools.parsing;

import java.util.HashMap;

import org.dmd.dmc.types.DotName;
import org.dmd.dms.DMDefinition;

public class GpbDefinitionManager {
	
    // Key: the fully qualified dotname of a definition i.e. module.defname.type
    public HashMap<DotName, DMDefinition>				globallyUniqueMAP;
	
    
}
