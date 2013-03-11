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
 * The DmcTypeGpbArtifactREFMAP provides storage for a map of GpbArtifactREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2829)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeGpbArtifactREFMAP extends DmcTypeGpbArtifactREF<GpbArtifactREF,StringName> {
public class DmcTypeGpbArtifactREFMAP extends DmcTypeGpbArtifactREF implements Serializable {
    
    private final static Iterator<GpbArtifactREF> emptyList = (new HashMap<StringName,GpbArtifactREF>()).values().iterator();
    
    protected Map<StringName,GpbArtifactREF> value;
    
    public DmcTypeGpbArtifactREFMAP(){
        value = null;
    }
    
    public DmcTypeGpbArtifactREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<StringName,GpbArtifactREF>();
        else
            value = new TreeMap<StringName,GpbArtifactREF>();
    }
    
    public StringName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<StringName,GpbArtifactREF> map = (TreeMap<StringName,GpbArtifactREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeGpbArtifactREFMAP getNew(){
        return(new DmcTypeGpbArtifactREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2886)
    public DmcAttribute<GpbArtifactREF> cloneIt(){
        synchronized(this){
            DmcTypeGpbArtifactREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(GpbArtifactREF val: value.values())
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
    public GpbArtifactREF add(Object v) throws DmcValueException {
        synchronized(this){
            GpbArtifactREF newval = typeCheck(v);
            if (value == null)
                initValue();
            StringName key = (StringName)((DmcMappedAttributeIF)newval).getKey();
            GpbArtifactREF oldval = value.put(key,newval);
            
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
    public GpbArtifactREF del(Object key){
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
    public Iterator<GpbArtifactREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<StringName,GpbArtifactREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<StringName,GpbArtifactREF>(value);
            else
                clone = new TreeMap<StringName,GpbArtifactREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2960)
    public Map<StringName,GpbArtifactREF> getMVCopy(){
        synchronized(this){
            Map<StringName,GpbArtifactREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<StringName,GpbArtifactREF>();
                else
                    clone = new HashMap<StringName,GpbArtifactREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<StringName,GpbArtifactREF>();
                else
                    clone = new TreeMap<StringName,GpbArtifactREF>(value);
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
    public GpbArtifactREF getByKey(Object key){
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
                GpbArtifactREF val = typeCheck(v);
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

