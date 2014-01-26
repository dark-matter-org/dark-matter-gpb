package org.dmd.gpb.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbMainElementDMW;
import org.dmd.gpb.server.generated.dsd.GpbModuleDefinitionManager;
import org.dmd.gpb.shared.generated.dmo.GpbMainElementDMO;

abstract public class GpbMainElement extends GpbMainElementDMW {

	public GpbMainElement(){
		
	}
	
	protected GpbMainElement(GpbMainElementDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
	
	/**
	 * @return a String that represents this element in the format it would
	 * have in a .gpb module file.
	 */
	abstract public String toDotGPBFormat();
	
	/**
	 * Our derived classes determine whether or not a GpbTypeDefinition exists to
	 * represent them and, if not, will create one in the definition manager.
	 * @param definitions The complete set of definitions.
	 * @throws DmcValueException 
	 */
	abstract public void createTypeIfRequired(GpbModuleDefinitionManager definitions) throws DmcValueException;
}
