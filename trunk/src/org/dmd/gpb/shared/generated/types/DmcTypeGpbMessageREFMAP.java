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
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.CamelCaseName;    // key type import
/**
 * The DmcTypeGpbMessageREFMAP provides storage for a map of GpbMessageREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2828)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeGpbMessageREFMAP extends DmcTypeGpbMessageREF<GpbMessageREF,CamelCaseName> {
public class DmcTypeGpbMessageREFMAP extends DmcTypeGpbMessageREF implements Serializable {
    
    private final static Iterator<GpbMessageREF> emptyList = (new HashMap<CamelCaseName,GpbMessageREF>()).values().iterator();
    
    protected Map<CamelCaseName,GpbMessageREF> value;
    
    public DmcTypeGpbMessageREFMAP(){
        value = null;
    }
    
    public DmcTypeGpbMessageREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<CamelCaseName,GpbMessageREF>();
        else
            value = new TreeMap<CamelCaseName,GpbMessageREF>();
    }
    
    public CamelCaseName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<CamelCaseName,GpbMessageREF> map = (TreeMap<CamelCaseName,GpbMessageREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeGpbMessageREFMAP getNew(){
        return(new DmcTypeGpbMessageREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2885)
    public DmcAttribute<GpbMessageREF> cloneIt(){
        synchronized(this){
            DmcTypeGpbMessageREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(GpbMessageREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2905)
    public GpbMessageREF add(Object v) throws DmcValueException {
        synchronized(this){
            GpbMessageREF newval = typeCheck(v);
            if (value == null)
                initValue();
            CamelCaseName key = (CamelCaseName)((DmcMappedAttributeIF)newval).getKey();
            GpbMessageREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2926)
    public GpbMessageREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof CamelCaseName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2942)
    public Iterator<GpbMessageREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<CamelCaseName,GpbMessageREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,GpbMessageREF>(value);
            else
                clone = new TreeMap<CamelCaseName,GpbMessageREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2959)
    public Map<CamelCaseName,GpbMessageREF> getMVCopy(){
        synchronized(this){
            Map<CamelCaseName,GpbMessageREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<CamelCaseName,GpbMessageREF>();
                else
                    clone = new HashMap<CamelCaseName,GpbMessageREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<CamelCaseName,GpbMessageREF>();
                else
                    clone = new TreeMap<CamelCaseName,GpbMessageREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2980)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2992)
    public GpbMessageREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof CamelCaseName)
                return(value.get((CamelCaseName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3007)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                GpbMessageREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof CamelCaseName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

