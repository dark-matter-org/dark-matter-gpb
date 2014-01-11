//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.gpb.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.gpb.shared.generated.types.GpbMainElementREF;

import org.dmd.gpb.shared.generated.dmo.GpbMainElementDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GpbMainElement
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGpbMainElementREF extends DmcTypeNamedObjectREF<GpbMainElementREF, DefinitionName> {

    public DmcTypeGpbMainElementREF(){
    
    }

    public DmcTypeGpbMainElementREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected GpbMainElementREF getNewHelper(){
        return(new GpbMainElementREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( GpbMainElementDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof GpbMainElementDMO)
            return(true);
        return(false);
    }

    @Override
    protected GpbMainElementREF typeCheck(Object value) throws DmcValueException {
        GpbMainElementREF rc = null;

        if (value instanceof GpbMainElementREF)
            rc = (GpbMainElementREF)value;
        else if (value instanceof GpbMainElementDMO)
            rc = new GpbMainElementREF((GpbMainElementDMO)value);
        else if (value instanceof DefinitionName)
            rc = new GpbMainElementREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new GpbMainElementREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbMainElementREF, GpbMainElementDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbMainElementREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GpbMainElementREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbMainElementREF rc = new GpbMainElementREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GpbMainElementREF cloneValue(GpbMainElementREF value){
        return(new GpbMainElementREF(value));
    }



}
