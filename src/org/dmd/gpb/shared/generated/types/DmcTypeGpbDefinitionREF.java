//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.gpb.shared.generated.types.GpbDefinitionREF;

import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GpbDefinition
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGpbDefinitionREF extends DmcTypeNamedObjectREF<GpbDefinitionREF, DefinitionName> {

    public DmcTypeGpbDefinitionREF(){
    
    }

    public DmcTypeGpbDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected GpbDefinitionREF getNewHelper(){
        return(new GpbDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( GpbDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof GpbDefinitionDMO)
            return(true);
        return(false);
    }

    @Override
    protected GpbDefinitionREF typeCheck(Object value) throws DmcValueException {
        GpbDefinitionREF rc = null;

        if (value instanceof GpbDefinitionREF)
            rc = (GpbDefinitionREF)value;
        else if (value instanceof GpbDefinitionDMO)
            rc = new GpbDefinitionREF((GpbDefinitionDMO)value);
        else if (value instanceof DefinitionName)
            rc = new GpbDefinitionREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new GpbDefinitionREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbDefinitionREF, GpbDefinitionDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GpbDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbDefinitionREF rc = new GpbDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GpbDefinitionREF cloneValue(GpbDefinitionREF value){
        return(new GpbDefinitionREF(value));
    }



}
