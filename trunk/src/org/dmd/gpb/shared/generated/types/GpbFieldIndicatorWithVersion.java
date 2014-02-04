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
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:100)
import java.io.Serializable;                                                  // To prevent serialization warnings - (ComplexTypeFormatter.java:75)
import org.dmd.dmc.DmcAttributeInfo;                                          // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcContainerIF;                                            // To support object references - (ComplexTypeFormatter.java:87)
import org.dmd.dmc.DmcInputStreamIF;                                          // Standard serialization techniques - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcNameClashResolverIF;                                    // To support possible clashing object references - (ComplexTypeFormatter.java:91)
import org.dmd.dmc.DmcNameResolverIF;                                         // To support object references - (ComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                         // To support possible clashing object references - (ComplexTypeFormatter.java:89)
import org.dmd.dmc.DmcNamedObjectIF;                                          // To support object references - (ComplexTypeFormatter.java:85)
import org.dmd.dmc.DmcNamedObjectREF;                                         // To support object references - (ComplexTypeFormatter.java:86)
import org.dmd.dmc.DmcObject;                                                 // To support possible clashing object references - (ComplexTypeFormatter.java:92)
import org.dmd.dmc.DmcOutputStreamIF;                                         // Standard serialization techniques - (ComplexTypeFormatter.java:77)
import org.dmd.dmc.DmcValueException;                                         // Standard value exception - (ComplexTypeFormatter.java:96)
import org.dmd.dmc.DmcValueExceptionSet;                                      // To support possible clashing object references - (ComplexTypeFormatter.java:93)
import org.dmd.dmc.types.IntegerVar;                                          // To support getNextField() - (ComplexTypeFormatter.java:78)
import org.dmd.dms.generated.enums.DataTypeEnum;                              // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:79)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:80)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                      // Standard type - (ComplexTypeFormatter.java:581)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                       // Standard type - (ComplexTypeFormatter.java:581)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;                      // Primitive type - (ComplexTypeFormatter.java:564)
import org.dmd.gpb.shared.generated.enums.OptionEnum;                         // Primitive type - (ComplexTypeFormatter.java:564)
import org.dmd.gpb.shared.generated.types.DmcTypeFieldRuleEnumSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:581)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldREFSTATIC;           // Internally generated type - (ComplexTypeFormatter.java:581)
import org.dmd.gpb.shared.generated.types.DmcTypeOptionEnumSTATIC;            // Internally generated type - (ComplexTypeFormatter.java:581)
import org.dmd.gpb.shared.generated.types.GpbFieldREF;                        // Object reference - (ComplexTypeFormatter.java:556)



@SuppressWarnings("serial")
/**
 * The GpbFieldIndicatorWithVersion class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:107)
 */
public class GpbFieldIndicatorWithVersion implements Serializable {

    // Whether the field is required, optional or repeated.
    FieldRuleEnum fieldRule;

    final static DmcAttributeInfo fieldRuleAI = new DmcAttributeInfo("fieldRule",0,"FieldRuleEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Reference to the GpbField to be used.
    GpbFieldREF fieldRef;

    final static DmcAttributeInfo fieldRefAI = new DmcAttributeInfo("fieldRef",0,"GpbField",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The unique numeric tag for this field.
    Integer fieldTag;

    final static DmcAttributeInfo fieldTagAI = new DmcAttributeInfo("fieldTag",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Indicates if there's a DEFAULT value or if the PACKED option is to be used for repeated fields.
    OptionEnum option;

    final static DmcAttributeInfo optionAI = new DmcAttributeInfo("option",0,"OptionEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The default value - this is limited to a single, space delimited token at the moment.
    String defaultValue;

    final static DmcAttributeInfo defaultValueAI = new DmcAttributeInfo("defaultValue",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The release at which the field was introduced to the message.
    String introducedVersion;

    final static DmcAttributeInfo introducedVersionAI = new DmcAttributeInfo("introducedVersion",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The release at which the field became obsolete.
    String obsoleteVersion;

    final static DmcAttributeInfo obsoleteVersionAI = new DmcAttributeInfo("obsoleteVersion",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public GpbFieldIndicatorWithVersion(){
    }

    /**
     * Copy constructor.
     */
    public GpbFieldIndicatorWithVersion(GpbFieldIndicatorWithVersion original){
        fieldRule = original.fieldRule;
        fieldRef = original.fieldRef;
        fieldTag = original.fieldTag;
        option = original.option;
        defaultValue = original.defaultValue;
        introducedVersion = original.introducedVersion;
        obsoleteVersion = original.obsoleteVersion;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:134)
     */
    public GpbFieldIndicatorWithVersion(FieldRuleEnum f1, GpbFieldREF f2, Integer f3, OptionEnum f4, String f5, String f6, String f7) throws DmcValueException {
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(f1);
        fieldRef = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(f2);
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(f3);
        option = DmcTypeOptionEnumSTATIC.instance.typeCheck(f4);
        defaultValue = DmcTypeStringSTATIC.instance.typeCheck(f5);
        introducedVersion = DmcTypeStringSTATIC.instance.typeCheck(f6);
        obsoleteVersion = DmcTypeStringSTATIC.instance.typeCheck(f7);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:175)
     */
    public GpbFieldIndicatorWithVersion(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldRule",false));
        fieldRef = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldRef",false));
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldTag",false));
        option = DmcTypeOptionEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"option",false));
        defaultValue = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"defaultValue",false));
        introducedVersion = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"introducedVersion",false));
        obsoleteVersion = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"obsoleteVersion",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:219)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeFieldRuleEnumSTATIC.instance.serializeValue(dos, fieldRule);
        DmcTypeGpbFieldREFSTATIC.instance.serializeValue(dos, fieldRef);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, fieldTag);
        DmcTypeOptionEnumSTATIC.instance.serializeValue(dos, option);
        DmcTypeStringSTATIC.instance.serializeValue(dos, defaultValue);
        DmcTypeStringSTATIC.instance.serializeValue(dos, introducedVersion);
        DmcTypeStringSTATIC.instance.serializeValue(dos, obsoleteVersion);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:236)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.deserializeValue(dis);
        fieldRef = DmcTypeGpbFieldREFSTATIC.instance.deserializeValue(dis);
        fieldTag = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
        option = DmcTypeOptionEnumSTATIC.instance.deserializeValue(dis);
        defaultValue = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        introducedVersion = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        obsoleteVersion = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:253)
     */
    public String toString(){
        return(fieldRule.toString() + ":" + fieldRef.toString() + ":" + fieldTag.toString() + ":" + option.toString() + ":" + defaultValue.toString() + ":" + introducedVersion.toString() + ":" + obsoleteVersion.toString());
    }

    public FieldRuleEnum getFieldRule(){
        return(fieldRule);
    }

    public GpbFieldREF getFieldRef(){
        return(fieldRef);
    }

    public Integer getFieldTag(){
        return(fieldTag);
    }

    public OptionEnum getOption(){
        return(option);
    }

    public String getDefaultValue(){
        return(defaultValue);
    }

    public String getIntroducedVersion(){
        return(introducedVersion);
    }

    public String getObsoleteVersion(){
        return(obsoleteVersion);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:285)
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
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:307)
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

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:413)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();
   	   
    	   if (last){
            if ( (start+1) >= input.length())
                rc = "";
            else
                rc = input.substring(start+1);
 	   }
	       else{
    	       if ( (start+1) >= input.length())
        		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: RuleParam"));
   		   
        	   int pos = -1;
	           if (start > -1){
	        	   start = start + 1;
	    	       pos = input.indexOf(":", start);
	           }
	           else{
	        	   start = 0;
	    	       pos = input.indexOf(":");
	           }
	       
	           if (pos == start){
	        	   seppos.set(pos);
	        	   return("");
	           }
	       
	           if (pos == -1)
		           throw (new DmcValueException("Missing value for field: " + fn + " in complex type: RuleParam"));
		       
	           rc = input.substring(start, pos).trim();
	       
	           seppos.set(pos);
        }
    
        return(rc);
    }

}
