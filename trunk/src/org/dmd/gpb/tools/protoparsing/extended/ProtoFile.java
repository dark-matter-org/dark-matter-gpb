package org.dmd.gpb.tools.protoparsing.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:249)
import org.dmd.dms.ClassDefinition;                                       // Used in derived constructors - (DMWGenerator.java:243)
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFileDMO;         // The wrapper we're extending - (DMWGenerator.java:242)
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFileDMW;         // The wrapper we're extending - (DMWGenerator.java:241)


public class ProtoFile extends ProtoFileDMW {

    public ProtoFile(){
        super();
    }

    public ProtoFile(ProtoFileDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

