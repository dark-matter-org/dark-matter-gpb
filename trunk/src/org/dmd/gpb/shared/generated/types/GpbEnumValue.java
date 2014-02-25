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
import java.io.Serializable;                                                      // To prevent serialization warnings - (NewComplexTypeFormatter.java:92)
import java.util.ArrayList;                                                       // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:99)
import java.util.Iterator;                                                        // To support multi-valued optional parts - (NewComplexTypeFormatter.java:103)
import org.dmd.concinnity.shared.generated.types.ConceptREF;                      // Object reference - (NewComplexTypeFormatter.java:810)
import org.dmd.concinnity.shared.generated.types.DmcTypeConceptREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:835)
import org.dmd.dmc.DmcAttributeInfo;                                              // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcContainerIF;                                                // To support object references - (NewComplexTypeFormatter.java:109)
import org.dmd.dmc.DmcInputStreamIF;                                              // Standard serialization techniques - (NewComplexTypeFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                        // To support possible clashing object references - (NewComplexTypeFormatter.java:113)
import org.dmd.dmc.DmcNameResolverIF;                                             // To support object references - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                             // To support possible clashing object references - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcNamedObjectIF;                                              // To support object references - (NewComplexTypeFormatter.java:107)
import org.dmd.dmc.DmcNamedObjectREF;                                             // To support object references - (NewComplexTypeFormatter.java:108)
import org.dmd.dmc.DmcObject;                                                     // To support possible clashing object references - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOutputStreamIF;                                             // Standard serialization techniques - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcValueException;                                             // Standard value exception - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcValueExceptionSet;                                          // To support possible clashing object references - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.util.ComplexTypeSplitter;                                      // For parsing initial input - (NewComplexTypeFormatter.java:98)
import org.dmd.dmc.util.ParsedNameValuePair;                                      // To store values parsed from initial input - (NewComplexTypeFormatter.java:100)
import org.dmd.dms.generated.enums.DataTypeEnum;                                  // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:95)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                 // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:96)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                          // Standard type - (NewComplexTypeFormatter.java:835)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                           // Standard type - (NewComplexTypeFormatter.java:835)



@SuppressWarnings("serial")
/**
 * The GpbEnumValue class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:130)
 */
public class GpbEnumValue implements Serializable {

    final static int requiredParts = 3;

    // The name of the enumerated value
    String nameV;

    final static DmcAttributeInfo nameAI = new DmcAttributeInfo("name",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The numeric value
    Integer valueV;

    final static DmcAttributeInfo valueAI = new DmcAttributeInfo("value",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // A description of the value
    String descriptionV;

    final static DmcAttributeInfo descriptionAI = new DmcAttributeInfo("description",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The version at which the value was introduced in the enumeration.
    String versionV;

    final static DmcAttributeInfo versionAI = new DmcAttributeInfo("version",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The version at which the value was made obsolete.
    String obsoleteV;

    final static DmcAttributeInfo obsoleteAI = new DmcAttributeInfo("obsolete",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // A note about the value and its use in this message e.g. why it's obsolete.
    String noteV;

    final static DmcAttributeInfo noteAI = new DmcAttributeInfo("note",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // If a value isn't supported in one or more intermediate versions, you can indicate the skip version.
    ArrayList<String> skipV;

    final static DmcAttributeInfo skipAI = new DmcAttributeInfo("skip",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // A reference to a concinnity concept. This might refer to conceptual definition of the thing represented by this value.
    ConceptREF conceptV;

    final static DmcAttributeInfo conceptAI = new DmcAttributeInfo("concept",0,"Concept",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, true);

    // If you want to coordinate disparate enum values that actually mean the same thing across systems, you can refer to the base concept value via this part. Mapping software can then be generated to automatically perform the translation between values.
    ArrayList<ConceptREF> baseValueV;

    final static DmcAttributeInfo baseValueAI = new DmcAttributeInfo("baseValue",0,"Concept",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, true);

    /**
     * Default constructor.
     */
    public GpbEnumValue(){
    }

    /**
     * Copy constructor.
     */
    @SuppressWarnings("unchecked")
    public GpbEnumValue(GpbEnumValue original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:773)
        nameV =  original.nameV;
        valueV =  original.valueV;
        descriptionV =  original.descriptionV;
        versionV =  original.versionV;
        obsoleteV =  original.obsoleteV;
        noteV =  original.noteV;
        skipV = (ArrayList<String>) original.skipV.clone();
        conceptV =  original.conceptV;
        baseValueV = (ArrayList<ConceptREF>) original.baseValueV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:161)
     */
    public GpbEnumValue(String name_, Integer value_, String description_, String version_, String obsolete_, String note_, ArrayList<String> skip_, ConceptREF concept_, ArrayList<ConceptREF> baseValue_) throws DmcValueException {
        nameV = DmcTypeStringSTATIC.instance.typeCheck(name_);
        valueV = DmcTypeIntegerSTATIC.instance.typeCheck(value_);
        descriptionV = DmcTypeStringSTATIC.instance.typeCheck(description_);
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
        if (concept_ != null)
            conceptV = DmcTypeConceptREFSTATIC.instance.typeCheck(concept_);
        if (baseValue_ != null){
            baseValueV = new ArrayList<ConceptREF>();
            for(ConceptREF v: baseValue_){
                baseValueV.add(DmcTypeConceptREFSTATIC.instance.typeCheck(v));
            }
        }
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:234)
     */
    public GpbEnumValue(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:242)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: GpbEnumValue"));

        nameV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        valueV = DmcTypeIntegerSTATIC.instance.typeCheck(nvp.get(1).getValue());
        descriptionV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(2).getValue());

        if (nvp.size() > requiredParts){
            for(int i=3; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: GpbEnumValue"));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: GpbEnumValue"));
                }
                if (nvp.get(i).getName().equals("version"))
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
                else if (nvp.get(i).getName().equals("concept"))
                    conceptV = DmcTypeConceptREFSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("baseValue")){
                    if (baseValueV == null)
                        baseValueV = new ArrayList<ConceptREF>();
                    baseValueV.add(DmcTypeConceptREFSTATIC.instance.typeCheck(nvp.get(i).getValue()));
                }
                else{
                    throw(new DmcValueException("Unknown field for complex type GpbEnumValue: "  + nvp.get(i).getName()));
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
        sb.append(nameV.toString());
        sb.append(' ');
        sb.append(valueV.toString());
        sb.append(' ');
        sb.append("\"" + descriptionV.toString() + "\"");
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

        if (conceptV != null){
            sb.append(' ');
            sb.append("concept=" + conceptV.toString());
        }

        if (baseValueV != null){
            for(ConceptREF v: baseValueV){
                sb.append(' ');
                sb.append("baseValue=" + v.toString());
            }
        }

        return(sb.toString());
    }

    public String getName(){
        return(nameV);
    }

    public Integer getValue(){
        return(valueV);
    }

    public String getDescription(){
        return(descriptionV);
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

    public ConceptREF getConcept(){
        return(conceptV);
    }

    public Iterator<ConceptREF> getBaseValue(){
        if (baseValueV == null)
            return(null);
        return(baseValueV.iterator());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:449)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((conceptV != null) && (!conceptV.isResolved())){
            obj = resolver.findNamedObject(conceptV.getObjectName());
            if (conceptAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + conceptV.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)conceptV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)conceptV).setObject(obj);
        }
        
        if (baseValueV != null){
            for(ConceptREF v: baseValueV){
                if (v.isResolved())
                    continue;
                obj = resolver.findNamedObject(v.getObjectName());
                if (baseValueAI.weakReference)
                    return;
                if (obj == null)
                    throw(new DmcValueException("Could not resolve reference to: " + v.getObjectName() + " via attribute: " + attrName));
        
                if (obj instanceof DmcContainerIF)
                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
                else
                    ((DmcNamedObjectREF)v).setObject(obj);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:498)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((conceptV != null) && (!conceptV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, conceptV.getObjectName(), ncr, conceptAI);
            if (conceptAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + conceptV.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)conceptV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)conceptV).setObject(obj);
        }
        
        if (baseValueV != null){
            for(ConceptREF v: baseValueV){
                if (v.isResolved())
                    continue;
                obj = resolver.findNamedObjectMayClash(object, v.getObjectName(), ncr, baseValueAI);
                if (baseValueAI.weakReference)
                    return;
                if (obj == null)
                    throw(new DmcValueException("Could not resolve reference to: " + v.getObjectName() + " via attribute: " + ai.name));
        
                if (obj instanceof DmcContainerIF)
                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
                else
                    ((DmcNamedObjectREF)v).setObject(obj);
            }
        }
        
    }

}
