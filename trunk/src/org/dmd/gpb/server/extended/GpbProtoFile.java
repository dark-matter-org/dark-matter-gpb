package org.dmd.gpb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbProtoFileDMW;
import org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO;

/**
 * The GpbProtoFile is created by the ProtoFileParser when it reads an existing .proto file.
 * Based on the contents of the original proto file, we can dump an equivalent .gpb file
 * that can then be augmented to contain additional descriptions, docuementation etc.
 */
public class GpbProtoFile extends GpbProtoFileDMW {

	public GpbProtoFile(){
		super();
	}
	
	public GpbProtoFile(GpbProtoFileDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
//	public void dumpDotGPB(String dn) throws IOException, DmcValueException {
//		int lastSlash = getFile().lastIndexOf("/");
//		int lastDot = getFile().lastIndexOf(".");
//		String modName = getFile().substring(lastSlash+1,lastDot);
//		
//		FileUpdateManager.instance().generationStarting();
//		
//		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dn, modName + "AG.gpb");
//		
//		GpbModule module = new GpbModule();
//		module.setName(modName);
//		module.addDescription("Add a description");
//		
//		out.write(module.toOIF() + "\n");
//		
//		GpbMainElementIterableDMW it = getMainElementsIterable();
//		while(it.hasNext()){
//			GpbMainElement m = it.getNext();
//			
//			out.write(m.toDotGPBFormat() + "\n");
//		}
//		
//		out.write(this.toOIF());
//
//		out.close();
//		
//		FileUpdateManager.instance().generationComplete();
//	}
}
