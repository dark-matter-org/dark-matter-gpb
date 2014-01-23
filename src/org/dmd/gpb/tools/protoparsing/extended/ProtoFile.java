package org.dmd.gpb.tools.protoparsing.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:249)
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.dmw.StringIterableDMW;
import org.dmd.gpb.server.extended.GpbModule;
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFileDMO;
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFieldIterableDMW;
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFileDMW;
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
		
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dn, modName + ".gpb");
		
		GpbModule module = new GpbModule();
		module.setName(modName);
		if (getImportHasValue()){
			StringIterableDMW it = getImportIterable();
			while(it.hasNext()){
				String s = it.getNext();
				int dot = s.lastIndexOf(".");
				
				// Note: we add this to the DMO so that we can use the reference
				module.getDMO().addDependsOnGpbModule(s.substring(0, dot));
			}
		}
		module.addDescription("Add a description");
				
		out.write(module.toOIF() + "\n");
		
		if (getFieldsHasValue()){
			ProtoFieldIterableDMW fields = getFieldsIterable();
			while(fields.hasNext()){
				out.write(fields.getNext().toGpbFieldDefinition());
			}
		}
		
		ProtoMainElementIterableDMW it = getMainElementsIterable();
		while(it.hasNext()){
			ProtoMainElement m = it.getNext();
			
			out.write(m.toDotGPBFormat() + "\n");
		}
		
		// Remove the fields
		remFields();
		
		StringBuffer sb = new StringBuffer();
		sb.append(this.toOIF());
		
		out.write(sb.toString().replaceAll("ProtoFile", "GpbProtoFile"));

		out.close();
		
		FileUpdateManager.instance().generationComplete();
	}

}

