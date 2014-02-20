package org.dmd.gpb.server.extended;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.dmw.StringIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeIterableDMW;
import org.dmd.gpb.server.generated.dmw.GpbProtoFileDMW;
import org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO;
import org.dmd.util.exceptions.DebugInfo;

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
	
	public void dumpProtoFile(String dn, String genversion) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter(dn + File.separator + getGeneratedFileName()));
		
		DebugInfo.debug("Writing to: " + dn + File.separator + getGeneratedFileName());
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("// This file was generated from the " + getDefinedInGpbModule().getName() + " via the dark-matter GPB mechanisms\n");
		out.write("// DO NOT MODIFY THIS FILE BY HAND\n\n");
		out.write("package " + getPackage() + ";\n\n");
		
		if (getImportHasValue()){
			StringIterableDMW it = getImportIterable();
			while(it.hasNext()){
				out.write("import \"" + it.next() + "\";\n");
			}
			out.write("\n\n");
		}
		
		GpbCompositeTypeIterableDMW it = getMainElementsIterable();
		while(it.hasNext()){
			GpbCompositeType ct = it.getNext();
			
			out.write(ct.toDotProtoFormat("",genversion) + "\n");
		}
		
		out.close();
		
		DebugInfo.debug("Finished writing");
	}
	
}
