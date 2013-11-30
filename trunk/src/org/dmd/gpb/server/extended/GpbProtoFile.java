package org.dmd.gpb.server.extended;

import java.io.IOException;

import org.dmd.gpb.server.generated.dmw.GpbProtoFileDMW;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.ManagedFileWriter;

public class GpbProtoFile extends GpbProtoFileDMW {

	public GpbProtoFile(){
		
	}
		
	///////////////////////////////////////////////////////////////////////////
	
	public void dumpDotGPB(String dn) throws IOException{
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dn, getName() + "AG.gpb");
		
		GpbModule module = new GpbModule();
		module.setName(getName());
		
		

		out.close();
	}
}
