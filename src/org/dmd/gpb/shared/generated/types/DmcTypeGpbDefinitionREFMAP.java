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
import org.dmd.dmc.types.StringName;    // key type import
/**
 * The DmcTypeGpbDefinitionREFMAP provides storage for a map of GpbDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2829)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeGpbDefinitionREFMAP extends DmcTypeGpbDefinitionREF<GpbDefinitionREF,StringName> {
public class DmcTypeGpbDefinitionREFMAP extends DmcTypeGpbDefinitionREF implements Serializable {
    
    private final static Iterator<GpbDefinitionREF> emptyList = (new HashMap<StringName,GpbDefinitionREF>()).values().iterator();
    
    protected Map<StringName,GpbDefinitionREF> value;
    
    public DmcTypeGpbDefinitionREFMAP(){
        value = null;
    }
    
    public DmcTypeGpbDefinitionREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,GpbDefinitionREF>();
        else
            value = new TreeMap<StringName,GpbDefinitionREF>();
    }
    
    public StringName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,GpbDefinitionREF> map = (TreeMap<StringName,GpbDefinitionREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeGpbDefinitionREFMAP getNew(){
        return(new DmcTypeGpbDefinitionREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2886)
    public DmcAttribute<GpbDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeGpbDefinitionREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(GpbDefinitionREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2906)
    public GpbDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            GpbDefinitionREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            GpbDefinitionREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2927)
    public GpbDefinitionREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof StringName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2943)
    public Iterator<GpbDefinitionREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<StringName,GpbDefinitionREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,GpbDefinitionREF>(value);
            else
                clone = new TreeMap<StringName,GpbDefinitionREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2960)
    public Map<StringName,GpbDefinitionREF> getMVCopy(){
        synchronized(this){
            Map<StringName,GpbDefinitionREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<StringName,GpbDefinitionREF>();
                else
                    clone = new HashMap<StringName,GpbDefinitionREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<StringName,GpbDefinitionREF>();
                else
                    clone = new TreeMap<StringName,GpbDefinitionREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2981)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2993)
    public GpbDefinitionREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof StringName)
                return(value.get((StringName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3008)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                GpbDefinitionREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3025)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof StringName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

