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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:123)
import java.io.Serializable;                                                  // To prevent serialization warnings - (NewComplexTypeFormatter.java:92)
import java.util.ArrayList;                                                   // To store NameValuePairs - (NewComplexTypeFormatter.java:99)
import java.util.Iterator;                                                    // To support multi-valued optional parts - (NewComplexTypeFormatter.java:103)
import org.dmd.dmc.DmcAttributeInfo;                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcContainerIF;                                            // To support object references - (NewComplexTypeFormatter.java:109)
import org.dmd.dmc.DmcInputStreamIF;                                          // Standard serialization techniques - (NewComplexTypeFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                    // To support possible clashing object references - (NewComplexTypeFormatter.java:113)
import org.dmd.dmc.DmcNameResolverIF;                                         // To support object references - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                         // To support possible clashing object references - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcNamedObjectIF;                                          // To support object references - (NewComplexTypeFormatter.java:107)
import org.dmd.dmc.DmcNamedObjectREF;                                         // To support object references - (NewComplexTypeFormatter.java:108)
import org.dmd.dmc.DmcObject;                                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOutputStreamIF;                                         // Standard serialization techniques - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcValueException;                                         // Standard value exception - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcValueExceptionSet;                                      // To support possible clashing object references - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.util.ComplexTypeSplitter;                                  // For parsing initial input - (NewComplexTypeFormatter.java:98)
import org.dmd.dmc.util.NameValuePair;                                        // To store values parsed from initial input - (NewComplexTypeFormatter.java:100)
import org.dmd.dms.generated.enums.DataTypeEnum;                              // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:95)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:96)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                      // Standard type - (NewComplexTypeFormatter.java:797)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                       // Standard type - (NewComplexTypeFormatter.java:797)
import org.dmd.gpb.shared.generated.enums.FieldRuleEnum;                      // Primitive type - (NewComplexTypeFormatter.java:780)
import org.dmd.gpb.shared.generated.enums.OptionEnum;                         // Primitive type - (NewComplexTypeFormatter.java:780)
import org.dmd.gpb.shared.generated.types.DmcTypeFieldRuleEnumSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:797)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbFieldREFSTATIC;           // Internally generated type - (NewComplexTypeFormatter.java:797)
import org.dmd.gpb.shared.generated.types.DmcTypeOptionEnumSTATIC;            // Internally generated type - (NewComplexTypeFormatter.java:797)
import org.dmd.gpb.shared.generated.types.GpbFieldREF;                        // Object reference - (NewComplexTypeFormatter.java:772)



@SuppressWarnings("serial")
/**
 * The GpbFieldIndicatorBase class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:130)
 */
public class GpbFieldIndicatorBase implements Serializable {

    final static int requiredParts = 3;

    // Whether the field is required, optional or repeated.
    FieldRuleEnum fieldRuleV;

    final static DmcAttributeInfo fieldRuleAI = new DmcAttributeInfo("fieldRule",0,"FieldRuleEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Reference to the GpbField to be used.
    GpbFieldREF fieldRefV;

    final static DmcAttributeInfo fieldRefAI = new DmcAttributeInfo("fieldRef",0,"GpbField",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The unique numeric tag for this field.
    Integer fieldTagV;

    final static DmcAttributeInfo fieldTagAI = new DmcAttributeInfo("fieldTag",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Indicates if the PACKED option is to be used for repeated fields.
    OptionEnum optionV;

    final static DmcAttributeInfo optionAI = new DmcAttributeInfo("option",0,"OptionEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The default value
    String defaultV;

    final static DmcAttributeInfo defaultAI = new DmcAttributeInfo("default",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The version at which the field was introduced in the message.
    String versionV;

    final static DmcAttributeInfo versionAI = new DmcAttributeInfo("version",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The version at which the field was made obsolete.
    String obsoleteV;

    final static DmcAttributeInfo obsoleteAI = new DmcAttributeInfo("obsolete",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A note about the field and its use in this message e.g. why it's obsolete.
    String noteV;

    final static DmcAttributeInfo noteAI = new DmcAttributeInfo("note",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // If a field isn't supported in one or more intermediate versions, you can indicate the skip version.
    ArrayList<String> skipV;

    final static DmcAttributeInfo skipAI = new DmcAttributeInfo("skip",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public GpbFieldIndicatorBase(){
    }

    /**
     * Copy constructor.
     */
    @SuppressWarnings("unchecked")
    public GpbFieldIndicatorBase(GpbFieldIndicatorBase original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:735)
        fieldRuleV =  original.fieldRuleV;
        fieldRefV =  original.fieldRefV;
        fieldTagV =  original.fieldTagV;
        optionV =  original.optionV;
        defaultV =  original.defaultV;
        versionV =  original.versionV;
        obsoleteV =  original.obsoleteV;
        noteV =  original.noteV;
        skipV = (ArrayList<String>) original.skipV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:161)
     */
    public GpbFieldIndicatorBase(FieldRuleEnum fieldRule_, GpbFieldREF fieldRef_, Integer fieldTag_, OptionEnum option_, String default_, String version_, String obsolete_, String note_, ArrayList<String> skip_) throws DmcValueException {
        fieldRuleV = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(fieldRule_);
        fieldRefV = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(fieldRef_);
        fieldTagV = DmcTypeIntegerSTATIC.instance.typeCheck(fieldTag_);
        if (option_ != null)
            optionV = DmcTypeOptionEnumSTATIC.instance.typeCheck(option_);
        if (default_ != null)
            defaultV = DmcTypeStringSTATIC.instance.typeCheck(default_);
        if (version_ != null)
            versionV = DmcTypeStringSTATIC.instance.typeCheck(version_);
        if (obsolete_ != null)
            obsoleteV = DmcTypeStringSTATIC.instance.typeCheck(obsolete_);
        if (note_ != null)
            noteV = DmcTypeStringSTATIC.instance.typeCheck(note_);
        if (skip_ != null){
            skipV = new ArrayList<String>();
            for(String v: skip_){
                skipV.add(DmcTypeStringSTATIC.instance.typeCheck(v));
            }
        }
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:234)
     */
    public GpbFieldIndicatorBase(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:242)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: GpbFieldIndicatorBase"));

        fieldRuleV = DmcTypeFieldRuleEnumSTATIC.instance.typeCheck(nvp.get(0).getValue());
        fieldRefV = DmcTypeGpbFieldREFSTATIC.instance.typeCheck(nvp.get(1).getValue());
        fieldTagV = DmcTypeIntegerSTATIC.instance.typeCheck(nvp.get(2).getValue());

        if (nvp.size() > requiredParts){
            for(int i=3; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: GpbFieldIndicatorBase"));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: GpbFieldIndicatorBase"));
                }
                if (nvp.get(i).getName().equals("option"))
                    optionV = DmcTypeOptionEnumSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("default"))
                    defaultV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("version"))
                    versionV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("obsolete"))
                    obsoleteV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("note"))
                    noteV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("skip")){
                    if (skipV == null)
                        skipV = new ArrayList<String>();
                    skipV.add(DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue()));
                }
                else{
                    throw(new DmcValueException("Unknown field for complex type GpbFieldIndicatorBase: "  + nvp.get(i).getName()));
                }
            }
        }

    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        dos.writeUTF(toString());
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        initialize(dis.readUTF());
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:341)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(fieldRuleV.toString());
        sb.append(' ');
        sb.append(fieldRefV.toString());
        sb.append(' ');
        sb.append(fieldTagV.toString());
        if (optionV != null){
            sb.append(' ');
            sb.append("option=" + optionV.toString());
        }

        if (defaultV != null){
            sb.append(' ');
            sb.append("default=" + defaultV.toString());
        }

        if (versionV != null){
            sb.append(' ');
            sb.append("version=" + versionV.toString());
        }

        if (obsoleteV != null){
            sb.append(' ');
            sb.append("obsolete=" + obsoleteV.toString());
        }

        if (noteV != null){
            sb.append(' ');
            sb.append("note=" + "\"" + noteV.toString() + "\"");
        }

        if (skipV != null){
            for(String v: skipV){
                sb.append(' ');
                sb.append("skip=" + v.toString());
            }
        }

        return(sb.toString());
    }

    public FieldRuleEnum getFieldRule(){
        return(fieldRuleV);
    }

    public GpbFieldREF getFieldRef(){
        return(fieldRefV);
    }

    public Integer getFieldTag(){
        return(fieldTagV);
    }

    public OptionEnum getOption(){
        return(optionV);
    }

    public String getDefault(){
        return(defaultV);
    }

    public String getVersion(){
        return(versionV);
    }

    public String getObsolete(){
        return(obsoleteV);
    }

    public String getNote(){
        return(noteV);
    }

    public Iterator<String> getSkip(){
        if (skipV == null)
            return(null);
        return(skipV.iterator());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:449)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((fieldRefV != null) && (!fieldRefV.isResolved())){
            obj = resolver.findNamedObject(fieldRefV.getObjectName());
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + fieldRefV.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)fieldRefV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)fieldRefV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:494)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((fieldRefV != null) && (!fieldRefV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, fieldRefV.getObjectName(), ncr, fieldRefAI);
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + fieldRefV.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)fieldRefV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)fieldRefV).setObject(obj);
        }
        
    }

}