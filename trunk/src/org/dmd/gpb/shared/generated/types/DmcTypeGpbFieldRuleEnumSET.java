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
import org.dmd.gpb.shared.generated.enums.GpbFieldRuleEnum;    // DmcType import
/**
 * The DmcTypeGpbFieldRuleEnumSET provides storage for a set of GpbFieldRuleEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2602)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:362)
 */
@SuppressWarnings("serial")
public class DmcTypeGpbFieldRuleEnumSET extends DmcTypeGpbFieldRuleEnum implements Serializable {
    
     private final static Iterator<GpbFieldRuleEnum> emptyList =  (new HashSet<GpbFieldRuleEnum>()).iterator();
    
    
    protected Set<GpbFieldRuleEnum> value;
    
    public DmcTypeGpbFieldRuleEnumSET(){
        value = null;
    }
    
    public DmcTypeGpbFieldRuleEnumSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<GpbFieldRuleEnum>();
        else
            value = new TreeSet<GpbFieldRuleEnum>();
    }
    
    @Override
    public DmcTypeGpbFieldRuleEnumSET getNew(){
        return(new DmcTypeGpbFieldRuleEnumSET(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2643)
    public DmcAttribute<GpbFieldRuleEnum> cloneIt(){
        synchronized(this){
            DmcTypeGpbFieldRuleEnumSET rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(GpbFieldRuleEnum val: value)
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
       }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2666)
    public GpbFieldRuleEnum add(Object v) throws DmcValueException {
        synchronized(this){
            GpbFieldRuleEnum rc = typeCheck(v);
            if (value == null)
                initValue();
        
            // If false is returned, we didn't modify the set, so return null
            if (!value.add(rc))
                rc = null;
        
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2683)
    public GpbFieldRuleEnum del(Object v){
        synchronized(this){
            GpbFieldRuleEnum rc = null;
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
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2708)
    public Iterator<GpbFieldRuleEnum> getMV(){
        synchronized(this){
            if (value == null)
                return(emptyList);

            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)
                return( (new HashSet<GpbFieldRuleEnum>(value)).iterator() );
            else
                return( (new TreeSet<GpbFieldRuleEnum>(value)).iterator() );
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2722)
    public Set<GpbFieldRuleEnum> getMVCopy(){
        synchronized(this){
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){
                if (value == null)
                    return(new HashSet<GpbFieldRuleEnum>());
                else
                    return(new HashSet<GpbFieldRuleEnum>(value));
            }
            else{
                if (value == null)
                    return(new TreeSet<GpbFieldRuleEnum>(value));
                else
                    return(new TreeSet<GpbFieldRuleEnum>(value));
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2742)
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:2753)
    public boolean contains(Object v){
        synchronized(this){
            if (value == null)
                return(false);
            
            try {
                GpbFieldRuleEnum val = typeCheck(v);
                return(value.contains(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
}

