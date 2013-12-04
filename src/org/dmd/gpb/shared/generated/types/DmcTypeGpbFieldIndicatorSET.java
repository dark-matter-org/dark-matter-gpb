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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.gpb.shared.generated.types.GpbFieldIndicator;    // base type import
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldIndicator;    // DmcType import
/**
 * The DmcTypeGpbFieldIndicatorSET provides storage for a set of GpbFieldIndicator
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2609)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DmcTypeGpbFieldIndicatorSET extends DmcTypeGpbFieldIndicator implements Serializable {
    
     private final static Iterator<GpbFieldIndicator> emptyList =  (new HashSet<GpbFieldIndicator>()).iterator();
    
    
    protected Set<GpbFieldIndicator> value;
    
    public DmcTypeGpbFieldIndicatorSET(){
        value = null;
    }
    
    public DmcTypeGpbFieldIndicatorSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<GpbFieldIndicator>();
        else
            value = new TreeSet<GpbFieldIndicator>();
    }
    
    @Override
    public DmcTypeGpbFieldIndicatorSET getNew(){
        return(new DmcTypeGpbFieldIndicatorSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2650)
    public DmcAttribute<GpbFieldIndicator> cloneIt(){
        synchronized(this){
            DmcTypeGpbFieldIndicatorSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(GpbFieldIndicator val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2673)
    public GpbFieldIndicator add(Object v) throws DmcValueException {
        synchronized(this){
            GpbFieldIndicator rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2690)
    public GpbFieldIndicator del(Object v){
        synchronized(this){
            GpbFieldIndicator rc = null;
            if (value == null)
                return(rc);
            
            try {
                rc = typeCheck(v);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
            }
            if (value.contains(rc)){
                value.remove(rc);
                if (value.size() == 0)
                    value = null;
            }
            else
                rc = null;
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2715)
    public Iterator<GpbFieldIndicator> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<GpbFieldIndicator>(value)).iterator() );
            else
                return( (new TreeSet<GpbFieldIndicator>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2729)
    public Set<GpbFieldIndicator> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<GpbFieldIndicator>());
                else
                    return(new HashSet<GpbFieldIndicator>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<GpbFieldIndicator>(value));
                else
                    return(new TreeSet<GpbFieldIndicator>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2749)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2760)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                GpbFieldIndicator val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

