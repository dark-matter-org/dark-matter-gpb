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
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                      // Standard type - (ComplexTypeFormatter.java:494)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                       // Standard type - (ComplexTypeFormatter.java:494)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;                      // Primitive type - (ComplexTypeFormatter.java:476)
import org.dmd.gpb.shared.generated.types.DmcTypeFieldRuleEnumSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:494)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbElementREFSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:494)
import org.dmd.gpb.shared.generated.types.GpbElementREF;                      // Object reference - (ComplexTypeFormatter.java:457)



@SuppressWarnings("serial")
/**
 * The GpbFieldIndicatorBase class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class GpbFieldIndicatorBase implements Serializable {

    // The field, enum or message referred to by this field indicator.
    GpbElementREF element;

    final static DmcAttributeInfo elementAI = new DmcAttributeInfo("element",0,"GpbElement",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The unique numeric tag for this field.
    Integer fieldTag;

    final static DmcAttributeInfo fieldTagAI = new DmcAttributeInfo("fieldTag",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Whether the field is required, optional or repeated.
    FieldRuleEnum fieldRule;

    final static DmcAttributeInfo fieldRuleAI = new DmcAttributeInfo("fieldRule",0,"FieldRuleEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Additional info to be supplied for the field definition. For example the default value for a field [default = 10] or [packed = true] for a repeated field.
    String info;

    final static DmcAttributeInfo infoAI = new DmcAttributeInfo("info",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public GpbFieldIndicatorBase(){
    }

    /**
     * Copy constructor.
     */
    public GpbFieldIndicatorBase(GpbFieldIndicatorBase original){
        element = original.element;
        fieldTag = original.fieldTag;
        fieldRule = original.fieldRule;
        info = original.info;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public GpbFieldIndicatorBase(GpbElementREF f1, Integer f2, FieldRuleEnum f3, String f4) throws DmcValueException {
        element = DmcTypeGpbElementREFSTATIC.instance.typeCheck(f1);
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(f2);
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(f3);
        info = DmcTypeStringSTATIC.instance.typeCheck(f4);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public GpbFieldIndicatorBase(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        element = DmcTypeGpbElementREFSTATIC.instance.typeCheck(getNextField(input,seppos,"element",false));
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldTag",false));
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldRule",false));
        info = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"info",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:212)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeGpbElementREFSTATIC.instance.serializeValue(dos, element);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, fieldTag);
        DmcTypeFieldRuleEnumSTATIC.instance.serializeValue(dos, fieldRule);
        DmcTypeStringSTATIC.instance.serializeValue(dos, info);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:229)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        element = DmcTypeGpbElementREFSTATIC.instance.deserializeValue(dis);
        fieldTag = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
        fieldRule = DmcTypeFieldRuleEnumSTATIC.instance.deserializeValue(dis);
        info = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:246)
     */
    public String toString(){
        return(element.toString() + " " + fieldTag.toString() + " " + fieldRule.toString() + " " + info.toString());
    }

    public GpbElementREF getElement(){
        return(element);
    }

    public Integer getFieldTag(){
        return(fieldTag);
    }

    public FieldRuleEnum getFieldRule(){
        return(fieldRule);
    }

    public String getInfo(){
        return(info);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:278)
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObject(element.getObjectName());
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + element.getObjectName() + " via attribute: " + attrName));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)element).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)element).setObject(obj);
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:300)
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObjectMayClash(object, element.getObjectName(), ncr, elementAI);
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + element.getObjectName() + " via attribute: " + ai.name));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)element).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)element).setObject(obj);
        
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:321)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GpbFieldIndicatorBase"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GpbFieldIndicatorBase"));

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
