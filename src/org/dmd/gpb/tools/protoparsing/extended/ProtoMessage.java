package org.dmd.gpb.tools.protoparsing.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:249)
import org.dmd.dms.ClassDefinition;                                          // Used in derived constructors - (DMWGenerator.java:243)
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoMessageDMO;         // The wrapper we're extending - (DMWGenerator.java:242)
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoElementIterableDMW;
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoMessageDMW;         // The wrapper we're extending - (DMWGenerator.java:241)


public class ProtoMessage extends ProtoMessageDMW {

    public ProtoMessage(){
        super();
    }

    public ProtoMessage(ProtoMessageDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }
    
    int longestElementName(){
    	int rc = 0;
		ProtoElementIterableDMW it = getElementsIterable();
		while(it.hasNext()){
			ProtoElement element = it.next();
			if (element.getName().getNameString().length() > rc)
				rc = element.getName().getNameString().length();
		}
		return(rc);
    }

	@Override
	public String toDotGPBFormat() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("GpbMessage\n");
		sb.append("name " + getName() + "\n");
		
		int longest = longestElementName();
		
		ProtoElementIterableDMW it = getElementsIterable();
		while(it.hasNext()){
			ProtoElement element = it.next();
			sb.append(element.toGpbFieldReference(longest));
		}
		
		sb.append("\n");
		
		return(sb.toString());
	}

	@Override
	public String toGpbFieldReference(int longest) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("embed ");
		sb.append(getName() + " ");
		sb.append("\n");
		
		return(sb.toString());
	}

}

