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
package org.dmd.gpb.tools.protoparsing.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.tools.protoparsing.generated.enums.ProtoFieldRuleEnum;    // DmcType import
/**
 * The DmcTypeProtoFieldRuleEnumSV provides storage for a single-valued ProtoFieldRuleEnum
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:1985)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:360)
 */
@SuppressWarnings("serial")
public class DmcTypeProtoFieldRuleEnumSV extends DmcTypeProtoFieldRuleEnum implements Serializable {
    
    protected ProtoFieldRuleEnum value;
    
    public DmcTypeProtoFieldRuleEnumSV(){
    
    }
    
    public DmcTypeProtoFieldRuleEnumSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeProtoFieldRuleEnumSV getNew(){
        return(new DmcTypeProtoFieldRuleEnumSV(getAttributeInfo()));
    }
    
    public DmcTypeProtoFieldRuleEnumSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeProtoFieldRuleEnumSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2017)
    public DmcAttribute<ProtoFieldRuleEnum> cloneIt(){
        DmcTypeProtoFieldRuleEnumSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2028)
    public ProtoFieldRuleEnum getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2040)
    public ProtoFieldRuleEnum set(Object v) throws DmcValueException {
        ProtoFieldRuleEnum rc = typeCheck(v);
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
    public ProtoFieldRuleEnum getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

