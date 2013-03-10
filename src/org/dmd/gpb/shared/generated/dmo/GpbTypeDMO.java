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
package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                             // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                         // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcHierarchicNamedObjectIF;                           // Named object - (GenUtility.java:369)
import org.dmd.dmc.DmcNamedObjectIF;                                     // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcOmni;                                              // Lazy resolution - (GenUtility.java:316)
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                    // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.DotName;                                        // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                     // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeDotNameSV;                     // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                     // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeStringSV;                      // Required type - (GenUtility.java:324)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;                // Base class - (GenUtility.java:351)
import org.dmd.gpb.shared.generated.dmo.GpbModuleDMO;                    // Type specific set/add - (GenUtility.java:303)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbModuleREFSV;         // Reference type - (GenUtility.java:296)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                  // Helper class - (GenUtility.java:331)

/**
 * The GpbType class is use to define the types of attributes in the GPB\n
 * specification. All GpbMessages and EnumDefinitions will have GpbTypes
 * generated for\n them so that they can be used as types for GpbAttributes.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbTypeDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, DmcHierarchicNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbType";


    static {
    }

    public GpbTypeDMO() {
        super("GpbType");
    }

    protected GpbTypeDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbTypeDMO getNew(){
        GpbTypeDMO rc = new GpbTypeDMO();
        return(rc);
    }

    @Override
    public GpbTypeDMO getSlice(DmcSliceInfo info){
        GpbTypeDMO rc = new GpbTypeDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbTypeDMO(DmcTypeModifierMV mods) {
        super("GpbType");
        modrec(true);
        setModifier(mods);
    }

    public GpbTypeDMO getModificationRecorder(){
        GpbTypeDMO rc = new GpbTypeDMO();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public DotName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__dotName);
        if (name != null)
            return((DotName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:755)
    public DotName getHierarchicObjectName(){
        return(getObjectName());
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__dotName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof GpbTypeDMO){
            return( getObjectName().equals( ((GpbTypeDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        DotName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isInternallyGenerated(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setInternallyGenerated(Boolean value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__internallyGenerated);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__internallyGenerated,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__internallyGenerated);
        
        attr.set(value);
        set(MetaDMSAG.__internallyGenerated,attr);
    }

    /**
     * Removes the internallyGenerated attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remInternallyGenerated(){
         rem(MetaDMSAG.__internallyGenerated);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isIsEnumType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isEnumType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setIsEnumType(Boolean value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__isEnumType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isEnumType);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__isEnumType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setIsEnumType(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MetaDMSAG.__isEnumType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isEnumType);
        
        attr.set(value);
        set(MetaDMSAG.__isEnumType,attr);
    }

    /**
     * Removes the isEnumType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remIsEnumType(){
         rem(MetaDMSAG.__isEnumType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isIsMessageType(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmdgpbDMSAG.__isMessageType);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isMessageType to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setIsMessageType(Boolean value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__isMessageType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmdgpbDMSAG.__isMessageType);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__isMessageType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets isMessageType to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setIsMessageType(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmdgpbDMSAG.__isMessageType);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmdgpbDMSAG.__isMessageType);
        
        attr.set(value);
        set(DmdgpbDMSAG.__isMessageType,attr);
    }

    /**
     * Removes the isMessageType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remIsMessageType(){
         rem(DmdgpbDMSAG.__isMessageType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getDefaultValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__defaultValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setDefaultValue(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__defaultValue);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__defaultValue);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__defaultValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setDefaultValue(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__defaultValue);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__defaultValue);
        
        attr.set(value);
        set(DmdgpbDMSAG.__defaultValue,attr);
    }

    /**
     * Removes the defaultValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remDefaultValue(){
         rem(DmdgpbDMSAG.__defaultValue);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Integer getSizeInBytes(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmdgpbDMSAG.__sizeInBytes);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sizeInBytes to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSizeInBytes(Integer value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__sizeInBytes);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmdgpbDMSAG.__sizeInBytes);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__sizeInBytes,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sizeInBytes to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSizeInBytes(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmdgpbDMSAG.__sizeInBytes);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmdgpbDMSAG.__sizeInBytes);
        
        attr.set(value);
        set(DmdgpbDMSAG.__sizeInBytes,attr);
    }

    /**
     * Removes the sizeInBytes attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSizeInBytes(){
         rem(DmdgpbDMSAG.__sizeInBytes);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getJavaType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__javaType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets javaType to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setJavaType(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__javaType);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__javaType);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__javaType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets javaType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setJavaType(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__javaType);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__javaType);
        
        attr.set(value);
        set(DmdgpbDMSAG.__javaType,attr);
    }

    /**
     * Removes the javaType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remJavaType(){
         rem(DmdgpbDMSAG.__javaType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getCplusplusType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__cplusplusType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets cplusplusType to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setCplusplusType(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__cplusplusType);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__cplusplusType);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__cplusplusType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets cplusplusType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setCplusplusType(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__cplusplusType);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__cplusplusType);
        
        attr.set(value);
        set(DmdgpbDMSAG.__cplusplusType,attr);
    }

    /**
     * Removes the cplusplusType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remCplusplusType(){
         rem(DmdgpbDMSAG.__cplusplusType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getPythonType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__pythonType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets pythonType to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setPythonType(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__pythonType);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__pythonType);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__pythonType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets pythonType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setPythonType(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__pythonType);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__pythonType);
        
        attr.set(value);
        set(DmdgpbDMSAG.__pythonType,attr);
    }

    /**
     * Removes the pythonType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remPythonType(){
         rem(DmdgpbDMSAG.__pythonType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setDotName(DotName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__dotName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setDotName(Object value) throws DmcValueException {
        DmcTypeDotNameSV attr  = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remDotName(){
         rem(MetaDMSAG.__dotName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:645)
    public GpbModuleREF getDefinedInGpbModule(){
        DmcTypeGpbModuleREFSV attr = (DmcTypeGpbModuleREFSV) get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to GpbModule without attempting lazy resolution (if turned on).
     */
    public GpbModuleREF getDefinedInGpbModuleREF(){
        DmcTypeGpbModuleREFSV attr = (DmcTypeGpbModuleREFSV) get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInGpbModule to the specified value.
     * @param value GpbModuleDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:699)
    public void setDefinedInGpbModule(GpbModuleDMO value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            attr = new DmcTypeGpbModuleREFSV(DmdgpbDMSAG.__definedInGpbModule);
        else
            ((DmcTypeGpbModuleREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__definedInGpbModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets definedInGpbModule to the specified value.
     * @param value A value compatible with DmcTypeGpbModuleREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setDefinedInGpbModule(Object value) throws DmcValueException {
        DmcTypeGpbModuleREFSV attr  = (DmcTypeGpbModuleREFSV) get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            attr = new DmcTypeGpbModuleREFSV(DmdgpbDMSAG.__definedInGpbModule);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmdgpbDMSAG.__definedInGpbModule,attr);
    }

    /**
     * Removes the definedInGpbModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remDefinedInGpbModule(){
         rem(DmdgpbDMSAG.__definedInGpbModule);
    }




}
