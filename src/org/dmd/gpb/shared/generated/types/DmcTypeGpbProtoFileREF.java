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

import org.dmd.gpb.shared.generated.types.GpbProtoFileREF;

import org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO;

/**
 * This is the generated DmcAttribute derivative for values of type GpbProtoFile
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeGpbProtoFileREF extends DmcTypeNamedObjectREF<GpbProtoFileREF, DefinitionName> {

    public DmcTypeGpbProtoFileREF(){
    
    }

    public DmcTypeGpbProtoFileREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected GpbProtoFileREF getNewHelper(){
        return(new GpbProtoFileREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( GpbProtoFileDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof GpbProtoFileDMO)
            return(true);
        return(false);
    }

    @Override
    protected GpbProtoFileREF typeCheck(Object value) throws DmcValueException {
        GpbProtoFileREF rc = null;

        if (value instanceof GpbProtoFileREF)
            rc = (GpbProtoFileREF)value;
        else if (value instanceof GpbProtoFileDMO)
            rc = new GpbProtoFileREF((GpbProtoFileDMO)value);
        else if (value instanceof DefinitionName)
            rc = new GpbProtoFileREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new GpbProtoFileREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GpbProtoFileREF, GpbProtoFileDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, GpbProtoFileREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public GpbProtoFileREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        GpbProtoFileREF rc = new GpbProtoFileREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public GpbProtoFileREF cloneValue(GpbProtoFileREF value){
        return(new GpbProtoFileREF(value));
    }



}
