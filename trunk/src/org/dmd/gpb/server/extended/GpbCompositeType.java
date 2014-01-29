package org.dmd.gpb.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeDMW;
import org.dmd.gpb.shared.generated.dmo.GpbCompositeTypeDMO;


abstract public class GpbCompositeType extends GpbCompositeTypeDMW {

    public GpbCompositeType(){
        super();
    }

    public GpbCompositeType(GpbCompositeTypeDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    /**
     * Derived classes will overload this to return themselves in GPB proto spec format.
     * @param indent a string with the required indentation level. This is used in the case of embedded enums/messages.
     */
    abstract public String toDotProtoFormat(String indent);
    	
}

