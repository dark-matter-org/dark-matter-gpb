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
package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:224)
import java.util.*;                                                             // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeStringMV;                             // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:328)
import org.dmd.gpb.shared.generated.dmo.GpbCompositeTypeDMO;                    // Type specific set/add - (GenUtility.java:307)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;                       // Base class - (GenUtility.java:355)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbCompositeTypeREFMV;         // Reference type - (GenUtility.java:300)
import org.dmd.gpb.shared.generated.types.GpbCompositeTypeREF;                  // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * The GpbProtoFile is used to represent a single .proto file. It may be
 * parsed\n from an existing .proto file by the GpbDotProtoParser utility.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbProtoFileDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbProtoFile";


    static {
    }

    public GpbProtoFileDMO() {
        super("GpbProtoFile");
    }

    protected GpbProtoFileDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbProtoFileDMO getNew(){
        GpbProtoFileDMO rc = new GpbProtoFileDMO();
        return(rc);
    }

    @Override
    public GpbProtoFileDMO getSlice(DmcSliceInfo info){
        GpbProtoFileDMO rc = new GpbProtoFileDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbProtoFileDMO(DmcTypeModifierMV mods) {
        super("GpbProtoFile");
        modrec(true);
        setModifier(mods);
    }

    public GpbProtoFileDMO getModificationRecorder(){
        GpbProtoFileDMO rc = new GpbProtoFileDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:751)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:775)
    public boolean equals(Object obj){
        if (obj instanceof GpbProtoFileDMO){
            return( getObjectName().equals( ((GpbProtoFileDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:783)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getImport(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmdgpbDMSAG.__import);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthImport(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmdgpbDMSAG.__import);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another import to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addImport(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__import);
        if (attr == null)
            attr = new DmcTypeStringMV(DmdgpbDMSAG.__import);
        
        try{
            setLastValue(attr.add(value));
            add(DmdgpbDMSAG.__import,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean importContains(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__import);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another import value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__import);
        if (attr == null)
            attr = new DmcTypeStringMV(DmdgpbDMSAG.__import);
        
        setLastValue(attr.add(value));
        add(DmdgpbDMSAG.__import,attr);
        return(attr);
    }

    /**
     * Returns the number of values in import
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getImportSize(){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__import);
        if (attr == null){
            if (DmdgpbDMSAG.__import.indexSize == 0)
                return(0);
            else
                return(DmdgpbDMSAG.__import.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a import value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__import);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmdgpbDMSAG.__import), value);
        else
            attr = del(DmdgpbDMSAG.__import, value);
        
        return(attr);
    }

    /**
     * Deletes a import from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delImport(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__import);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmdgpbDMSAG.__import), value);
        else
            attr = del(DmdgpbDMSAG.__import, value);
        
        return(attr);
    }

    /**
     * Removes the import attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remImport(){
         rem(DmdgpbDMSAG.__import);
    }

    /**
     * @return An Iterator of GpbCompositeTypeDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<GpbCompositeTypeREF> getMainElements(){
        DmcTypeGpbCompositeTypeREFMV attr = (DmcTypeGpbCompositeTypeREFMV) get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            return( ((List<GpbCompositeTypeREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<GpbCompositeTypeREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of GpbCompositeTypeREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<GpbCompositeTypeREF> getMainElementsREFs(){
        DmcTypeGpbCompositeTypeREFMV attr = (DmcTypeGpbCompositeTypeREFMV) get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            return( ((List<GpbCompositeTypeREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another mainElements to the specified value.
     * @param value GpbCompositeType
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addMainElements(GpbCompositeTypeDMO value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            attr = new DmcTypeGpbCompositeTypeREFMV(DmdgpbDMSAG.__mainElements);
        
        try{
            setLastValue(attr.add(value));
            add(DmdgpbDMSAG.__mainElements,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mainElements value.
     * @param value A value compatible with GpbCompositeType
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addMainElements(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__mainElements);
        if (attr == null)
            attr = new DmcTypeGpbCompositeTypeREFMV(DmdgpbDMSAG.__mainElements);
        
        setLastValue(attr.add(value));
        add(DmdgpbDMSAG.__mainElements,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mainElements
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getMainElementsSize(){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__mainElements);
        if (attr == null){
            if (DmdgpbDMSAG.__mainElements.indexSize == 0)
                return(0);
            else
                return(DmdgpbDMSAG.__mainElements.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mainElements value.
     * @param value The GpbCompositeType to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delMainElements(Object value){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__mainElements);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeGpbCompositeTypeREFMV(DmdgpbDMSAG.__mainElements), value);
        else
            attr = del(DmdgpbDMSAG.__mainElements, value);
        
        return(attr);
    }

    /**
     * Removes the mainElements attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remMainElements(){
         rem(DmdgpbDMSAG.__mainElements);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public String getPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__package);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setPackage(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__package);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__package);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__package,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setPackage(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__package);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__package);
        
        attr.set(value);
        set(DmdgpbDMSAG.__package,attr);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remPackage(){
         rem(DmdgpbDMSAG.__package);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public String getGeneratedFileName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__generatedFileName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setGeneratedFileName(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__generatedFileName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__generatedFileName);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__generatedFileName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets generatedFileName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setGeneratedFileName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__generatedFileName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__generatedFileName);
        
        attr.set(value);
        set(DmdgpbDMSAG.__generatedFileName,attr);
    }

    /**
     * Removes the generatedFileName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remGeneratedFileName(){
         rem(DmdgpbDMSAG.__generatedFileName);
    }




}
