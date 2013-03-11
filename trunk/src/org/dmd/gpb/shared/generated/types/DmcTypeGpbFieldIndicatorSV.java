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

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.shared.generated.types.GpbFieldIndicator;    // base type import
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldIndicator;    // DmcType import
/**
 * The DmcTypeGpbFieldIndicatorSV provides storage for a single-valued GpbFieldIndicator
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1956)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:125)
 */
@SuppressWarnings("serial")
public class DmcTypeGpbFieldIndicatorSV extends DmcTypeGpbFieldIndicator implements Serializable {
    
    protected GpbFieldIndicator value;
    
    public DmcTypeGpbFieldIndicatorSV(){
    
    }
    
    public DmcTypeGpbFieldIndicatorSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeGpbFieldIndicatorSV getNew(){
        return(new DmcTypeGpbFieldIndicatorSV(getAttributeInfo()));
    }
    
    public DmcTypeGpbFieldIndicatorSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeGpbFieldIndicatorSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1988)
    public DmcAttribute<GpbFieldIndicator> cloneIt(){
        DmcTypeGpbFieldIndicatorSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1999)
    public GpbFieldIndicator getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2011)
    public GpbFieldIndicator set(Object v) throws DmcValueException {
        GpbFieldIndicator rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public GpbFieldIndicator getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

