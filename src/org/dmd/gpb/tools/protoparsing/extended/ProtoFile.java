package org.dmd.gpb.tools.protoparsing.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:249)
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;                                       // Used in derived constructors - (DMWGenerator.java:243)
import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFileDMO;         // The wrapper we're extending - (DMWGenerator.java:242)
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFileDMW;         // The wrapper we're extending - (DMWGenerator.java:241)
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoMainElementIterableDMW;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.ManagedFileWriter;


public class ProtoFile extends ProtoFileDMW {

    public ProtoFile(){
        super();
    }

    public ProtoFile(ProtoFileDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

	public void dumpDotGPB(String dn) throws IOException, DmcValueException {
		int lastSlash = getFile().lastIndexOf("/");
		int lastDot = getFile().lastIndexOf(".");
		String modName = getFile().substring(lastSlash+1,lastDot);
		
		FileUpdateManager.instance().generationStarting();
		
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dn, modName + "AG.gpb");
		
		GpbModule module = new GpbModule();
		module.setName(modName);
		module.addDescription("Add a description");	
		
		out.write(module.toOIF() + "\n");
		
		ProtoMainElementIterableDMW it = getMainElementsIterable();
		while(it.hasNext()){
			ProtoMainElement m = it.getNext();
			
			out.write(m.toDotGPBFormat() + "\n");
		}
		
		out.write(this.toOIF());

		out.close();
		
		FileUpdateManager.instance().generationComplete();
	}

}

