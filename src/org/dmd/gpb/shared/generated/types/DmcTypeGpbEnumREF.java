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

import org.dmd.gpb.shared.generated.types.GpbEnumREF;

import org.dmd.gpb.shared.generated.dmo.GpbEnumDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GpbEnum
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGpbEnumREF extends DmcTypeNamedObjectREF<GpbEnumREF, DefinitionName> {

    public DmcTypeGpbEnumREF(){
    
    }

    public DmcTypeGpbEnumREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected GpbEnumREF getNewHelper(){
        return(new GpbEnumREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( GpbEnumDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof GpbEnumDMO)
            return(true);
        return(false);
    }

    @Override
    protected GpbEnumREF typeCheck(Object value) throws DmcValueException {
        GpbEnumREF rc = null;

        if (value instanceof GpbEnumREF)
            rc = (GpbEnumREF)value;
        else if (value instanceof GpbEnumDMO)
            rc = new GpbEnumREF((GpbEnumDMO)value);
        else if (value instanceof DefinitionName)
            rc = new GpbEnumREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new GpbEnumREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbEnumREF, GpbEnumDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbEnumREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GpbEnumREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbEnumREF rc = new GpbEnumREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GpbEnumREF cloneValue(GpbEnumREF value){
        return(new GpbEnumREF(value));
    }



}
