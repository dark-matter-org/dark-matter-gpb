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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:106)
import java.io.Serializable;                                                  // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcAttributeInfo;                                          // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcContainerIF;                                            // To support object references - (ComplexTypeFormatter.java:82)
import org.dmd.dmc.DmcInputStreamIF;                                          // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcNameClashResolverIF;                                    // To support possible clashing object references - (ComplexTypeFormatter.java:86)
import org.dmd.dmc.DmcNameResolverIF;                                         // To support object references - (ComplexTypeFormatter.java:79)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                         // To support possible clashing object references - (ComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNamedObjectIF;                                          // To support object references - (ComplexTypeFormatter.java:80)
import org.dmd.dmc.DmcNamedObjectREF;                                         // To support object references - (ComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcObject;                                                 // To support possible clashing object references - (ComplexTypeFormatter.java:87)
import org.dmd.dmc.DmcOutputStreamIF;                                         // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                                         // Standard value exception - (ComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcValueExceptionSet;                                      // To support possible clashing object references - (ComplexTypeFormatter.java:88)
import org.dmd.dmc.types.IntegerVar;                                          // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.enums.DataTypeEnum;                              // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:74)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                      // Standard type - (ComplexTypeFormatter.java:616)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                       // Standard type - (ComplexTypeFormatter.java:616)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;                      // Primitive type - (ComplexTypeFormatter.java:598)
import org.dmd.gpb.shared.generated.enums.OptionEnum;                         // Primitive type - (ComplexTypeFormatter.java:598)
import org.dmd.gpb.shared.generated.types.DmcTypeFieldRuleEnumSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:616)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldREFSTATIC;           // Internally generated type - (ComplexTypeFormatter.java:616)
import org.dmd.gpb.shared.generated.types.DmcTypeOptionEnumSTATIC;            // Internally generated type - (ComplexTypeFormatter.java:616)
import org.dmd.gpb.shared.generated.types.GpbFieldREF;                        // Object reference - (ComplexTypeFormatter.java:579)



@SuppressWarnings("serial")
/**
 * The GpbFieldIndicatorBase class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class GpbFieldIndicatorBase implements Serializable {

    // Some fields are optional - this many are mandatory
    static int mandatoryFields = 3;

    // Reference to the GpbField to be used.
    GpbFieldREF fieldRef;

    final static DmcAttributeInfo fieldRefAI = new DmcAttributeInfo("fieldRef",0,"GpbField",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The unique numeric tag for this field.
    Integer fieldTag;

    final static DmcAttributeInfo fieldTagAI = new DmcAttributeInfo("fieldTag",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Whether the field is required, optional or repeated.
    FieldRuleEnum fieldRule;

    final static DmcAttributeInfo fieldRuleAI = new DmcAttributeInfo("fieldRule",0,"FieldRuleEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Indicates if there's a DEFAULT value or if the PACKED option is to be used for repeated fields.
    OptionEnum option;

    final static DmcAttributeInfo optionAI = new DmcAttributeInfo("option",0,"OptionEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The default value - this is limited to a single, space delimited token at the moment.
    String defaultValue;

    final static DmcAttributeInfo defaultValueAI = new DmcAttributeInfo("defaultValue",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public GpbFieldIndicatorBase(){
    }

    /**
     * Copy constructor.
     */
    public GpbFieldIndicatorBase(GpbFieldIndicatorBase original){
        fieldRef = original.fieldRef;
        fieldTag = original.fieldTag;
        fieldRule = original.fieldRule;
        option = original.option;
        defaultValue = original.defaultValue;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public GpbFieldIndicatorBase(GpbFieldREF f1, Integer f2, FieldRuleEnum f3, OptionEnum f4, String f5) throws DmcValueException {
        fieldRef = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(f1);
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(f2);
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(f3);
        option = DmcTypeOptionEnumSTATIC.instance.typeCheck(f4);
        defaultValue = DmcTypeStringSTATIC.instance.typeCheck(f5);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public GpbFieldIndicatorBase(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        Object rc = null;
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        if ((rc = getNextField(input,seppos,"fieldRef",1,false)) != null)
            fieldRef = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(rc);
        if ((rc = getNextField(input,seppos,"fieldTag",2,false)) != null)
            fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(rc);
        if ((rc = getNextField(input,seppos,"fieldRule",3,false)) != null)
            fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(rc);
        if ((rc = getNextField(input,seppos,"option",4,false)) != null)
            option = DmcTypeOptionEnumSTATIC.instance.typeCheck(rc);
        if ((rc = getNextField(input,seppos,"defaultValue",5,true)) != null)
            defaultValue = DmcTypeStringSTATIC.instance.typeCheck(rc);
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:225)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeGpbFieldREFSTATIC.instance.serializeValue(dos, fieldRef);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, fieldTag);
        DmcTypeFieldRuleEnumSTATIC.instance.serializeValue(dos, fieldRule);
        DmcTypeOptionEnumSTATIC.instance.serializeValue(dos, option);
        DmcTypeStringSTATIC.instance.serializeValue(dos, defaultValue);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:242)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        fieldRef = DmcTypeGpbFieldREFSTATIC.instance.deserializeValue(dis);
        fieldTag = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.deserializeValue(dis);
        option = DmcTypeOptionEnumSTATIC.instance.deserializeValue(dis);
        defaultValue = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:259)
     */
    public String toString(){
        return(fieldRef.toString() + " " + fieldTag.toString() + " " + fieldRule.toString() + " " + option.toString() + " " + defaultValue.toString());
    }

    public GpbFieldREF getFieldRef(){
        return(fieldRef);
    }

    public Integer getFieldTag(){
        return(fieldTag);
    }

    public FieldRuleEnum getFieldRule(){
        return(fieldRule);
    }

    public OptionEnum getOption(){
        return(option);
    }

    public String getDefaultValue(){
        return(defaultValue);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:291)
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObject(fieldRef.getObjectName());
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + fieldRef.getObjectName() + " via attribute: " + attrName));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)fieldRef).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)fieldRef).setObject(obj);
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:313)
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObjectMayClash(object, fieldRef.getObjectName(), ncr, fieldRefAI);
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + fieldRef.getObjectName() + " via attribute: " + ai.name));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)fieldRef).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)fieldRef).setObject(obj);
        
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:334)
    String getNextField(String input, IntegerVar seppos, String fn, int fnum, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length()){
            if (fnum > mandatoryFields)
                return(null);
            throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GpbFieldIndicatorBase"));
        }

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(" ", start+1);
    	       else
    		       pos = input.indexOf(" ");

    	       if (pos == -1){
                rc = input.substring(start+1);
                seppos.set(input.length());
                return(rc);
            }

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
