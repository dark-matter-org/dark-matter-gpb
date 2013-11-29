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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:106)
import java.io.Serializable;                                                     // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcAttributeInfo;                                             // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcContainerIF;                                               // To support object references - (ComplexTypeFormatter.java:82)
import org.dmd.dmc.DmcInputStreamIF;                                             // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcNameClashResolverIF;                                       // To support possible clashing object references - (ComplexTypeFormatter.java:86)
import org.dmd.dmc.DmcNameResolverIF;                                            // To support object references - (ComplexTypeFormatter.java:79)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                            // To support possible clashing object references - (ComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNamedObjectIF;                                             // To support object references - (ComplexTypeFormatter.java:80)
import org.dmd.dmc.DmcNamedObjectREF;                                            // To support object references - (ComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcObject;                                                    // To support possible clashing object references - (ComplexTypeFormatter.java:87)
import org.dmd.dmc.DmcOutputStreamIF;                                            // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                                            // Standard value exception - (ComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcValueExceptionSet;                                         // To support possible clashing object references - (ComplexTypeFormatter.java:88)
import org.dmd.dmc.types.IntegerVar;                                             // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.enums.DataTypeEnum;                                 // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:74)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                         // Standard type - (ComplexTypeFormatter.java:494)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                          // Standard type - (ComplexTypeFormatter.java:494)
import org.dmd.gpb.shared.generated.enums.GpbFieldRuleEnum;                      // Primitive type - (ComplexTypeFormatter.java:476)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldREFSTATIC;              // Internally generated type - (ComplexTypeFormatter.java:494)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldRuleEnumSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:494)
import org.dmd.gpb.shared.generated.types.GpbFieldREF;                           // Object reference - (ComplexTypeFormatter.java:457)



@SuppressWarnings("serial")
/**
 * The GpbFieldIndicator class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class GpbFieldIndicator implements Serializable {

    // Whether the field is required, optional or repeated.
    GpbFieldRuleEnum fieldRule;

    final static DmcAttributeInfo fieldRuleAI = new DmcAttributeInfo("fieldRule",0,"GpbFieldRuleEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The name of the GpbField used for this field
    GpbFieldREF fieldName;

    final static DmcAttributeInfo fieldNameAI = new DmcAttributeInfo("fieldName",0,"GpbField",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The unique numeric tag for this field.
    Integer fieldTag;

    final static DmcAttributeInfo fieldTagAI = new DmcAttributeInfo("fieldTag",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Additional info to be supplied for the field definition. For example the default value for a field [default = 10] or [packed = true] for a repeated field.
    String info;

    final static DmcAttributeInfo infoAI = new DmcAttributeInfo("info",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public GpbFieldIndicator(){
    }

    /**
     * Copy constructor.
     */
    public GpbFieldIndicator(GpbFieldIndicator original){
        fieldRule = original.fieldRule;
        fieldName = original.fieldName;
        fieldTag = original.fieldTag;
        info = original.info;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public GpbFieldIndicator(GpbFieldRuleEnum f1, GpbFieldREF f2, Integer f3, String f4) throws DmcValueException {
        fieldRule = DmcTypeGpbFieldRuleEnumSTATIC.instance.typeCheck(f1);
        fieldName = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(f2);
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(f3);
        info = DmcTypeStringSTATIC.instance.typeCheck(f4);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public GpbFieldIndicator(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        fieldRule = DmcTypeGpbFieldRuleEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldRule",false));
        fieldName = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldName",false));
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldTag",false));
        info = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"info",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:212)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeGpbFieldRuleEnumSTATIC.instance.serializeValue(dos, fieldRule);
        DmcTypeGpbFieldREFSTATIC.instance.serializeValue(dos, fieldName);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, fieldTag);
        DmcTypeStringSTATIC.instance.serializeValue(dos, info);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:229)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        fieldRule = DmcTypeGpbFieldRuleEnumSTATIC.instance.deserializeValue(dis);
        fieldName = DmcTypeGpbFieldREFSTATIC.instance.deserializeValue(dis);
        fieldTag = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
        info = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:246)
     */
    public String toString(){
        return(fieldRule.toString() + " " + fieldName.toString() + " " + fieldTag.toString() + " " + info.toString());
    }

    public GpbFieldRuleEnum getFieldRule(){
        return(fieldRule);
    }

    public GpbFieldREF getFieldName(){
        return(fieldName);
    }

    public Integer getFieldTag(){
        return(fieldTag);
    }

    public String getInfo(){
        return(info);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:278)
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObject(fieldName.getObjectName());
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + fieldName.getObjectName() + " via attribute: " + attrName));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)fieldName).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)fieldName).setObject(obj);
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:300)
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObjectMayClash(object, fieldName.getObjectName(), ncr, fieldNameAI);
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + fieldName.getObjectName() + " via attribute: " + ai.name));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)fieldName).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)fieldName).setObject(obj);
        
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:321)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GpbFieldIndicator"));

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(" ", start+1);
    	       else
    		       pos = input.indexOf(" ");

    	       if (pos == -1)
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GpbFieldIndicator"));

    		   while(pos < (input.length()-1)){
    		       if ( input.charAt(pos+1) == ' ')
    		           pos++;
    		       else
    		           break;
    		   }

    	       rc = input.substring(start+1, pos).trim();

    	       seppos.set(pos);
        }

        return(rc);
    }

}