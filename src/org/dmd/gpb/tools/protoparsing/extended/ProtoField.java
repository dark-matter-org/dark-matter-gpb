package org.dmd.gpb.tools.protoparsing.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:249)
import org.dmd.dms.ClassDefinition;                                        // Used in derived constructors - (DMWGenerator.java:243)
import org.dmd.dms.generated.dmw.StringIterableDMW;
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFieldDMO;         // The wrapper we're extending - (DMWGenerator.java:242)
import org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFieldDMW;         // The wrapper we're extending - (DMWGenerator.java:241)
import org.dmd.util.formatting.PrintfFormat;


public class ProtoField extends ProtoFieldDMW {

    public ProtoField(){
        super();
    }

    public ProtoField(ProtoFieldDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

	@Override
	public String toGpbFieldReference(int longest) {
		StringBuffer sb = new StringBuffer();
		
		int npadding = longest + 2;
		PrintfFormat 	nformat 	= new PrintfFormat("%-" + npadding + "s");

		sb.append("field ");
		sb.append(nformat.sprintf(getName()) + " ");
		sb.append(getTag() + " ");
		sb.append(getFieldRule() + " ");
		sb.append("\n");
		
		return(sb.toString());
	}
	
	public String toGpbFieldDefinition(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("GpbField\n");
		sb.append("name        " + getName() + "\n");
		sb.append("gpbType     " + getGpbType() + "\n");
		if (getDescriptionHasValue()){
			StringIterableDMW it = getDescriptionIterable();
			while(it.hasNext()){
				sb.append("description " + it.next() + "\n");
			}
		}
		else
			sb.append("description Add a description\n");
		sb.append("\n");

		return(sb.toString());
	}

}

