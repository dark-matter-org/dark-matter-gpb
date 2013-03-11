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
import org.dmd.dmc.types.StringName;

import org.dmd.gpb.shared.generated.types.GpbTypeREF;

import org.dmd.gpb.shared.generated.dmo.GpbTypeDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GpbType
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGpbTypeREF extends DmcTypeNamedObjectREF<GpbTypeREF, StringName> {

    public DmcTypeGpbTypeREF(){
    
    }

    public DmcTypeGpbTypeREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected GpbTypeREF getNewHelper(){
        return(new GpbTypeREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( GpbTypeDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof GpbTypeDMO)
            return(true);
        return(false);
    }

    @Override
    protected GpbTypeREF typeCheck(Object value) throws DmcValueException {
        GpbTypeREF rc = null;

        if (value instanceof GpbTypeREF)
            rc = (GpbTypeREF)value;
        else if (value instanceof GpbTypeDMO)
            rc = new GpbTypeREF((GpbTypeDMO)value);
        else if (value instanceof StringName)
            rc = new GpbTypeREF((StringName)value);
        else if (value instanceof String)
            rc = new GpbTypeREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbTypeREF, GpbTypeDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbTypeREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GpbTypeREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbTypeREF rc = new GpbTypeREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GpbTypeREF cloneValue(GpbTypeREF value){
        return(new GpbTypeREF(value));
    }



}
