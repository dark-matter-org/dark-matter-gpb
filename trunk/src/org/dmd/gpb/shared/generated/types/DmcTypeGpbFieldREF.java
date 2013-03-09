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
import org.dmd.dmc.types.DotName;

import org.dmd.gpb.shared.generated.types.GpbFieldREF;

import org.dmd.gpb.shared.generated.dmo.GpbFieldDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GpbField
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGpbFieldREF extends DmcTypeNamedObjectREF<GpbFieldREF, DotName> {

    public DmcTypeGpbFieldREF(){
    
    }

    public DmcTypeGpbFieldREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected GpbFieldREF getNewHelper(){
        return(new GpbFieldREF());
    }

    @Override
    protected DotName getNewName(){
        return(new DotName());
    }

    @Override
    protected String getDMOClassName(){
        return( GpbFieldDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof GpbFieldDMO)
            return(true);
        return(false);
    }

    @Override
    protected GpbFieldREF typeCheck(Object value) throws DmcValueException {
        GpbFieldREF rc = null;

        if (value instanceof GpbFieldREF)
            rc = (GpbFieldREF)value;
        else if (value instanceof GpbFieldDMO)
            rc = new GpbFieldREF((GpbFieldDMO)value);
        else if (value instanceof DotName)
            rc = new GpbFieldREF((DotName)value);
        else if (value instanceof String)
            rc = new GpbFieldREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbFieldREF, GpbFieldDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbFieldREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GpbFieldREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbFieldREF rc = new GpbFieldREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GpbFieldREF cloneValue(GpbFieldREF value){
        return(new GpbFieldREF(value));
    }



}
