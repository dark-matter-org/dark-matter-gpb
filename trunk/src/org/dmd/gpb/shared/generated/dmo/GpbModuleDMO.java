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
import java.io.Serializable;                                                           // Always required - (GenUtility.java:224)
import java.util.*;                                                                    // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO;                    // Type specific set/add - (GenUtility.java:307)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;                      // Attribute from dmconcinnity schema - (GenUtility.java:135)
import org.dmd.concinnity.shared.generated.types.ConcinnityModuleREF;                  // Helper class - (GenUtility.java:335)
import org.dmd.concinnity.shared.generated.types.DmcTypeConcinnityModuleREFMV;         // Reference type - (GenUtility.java:300)
import org.dmd.dmc.DmcAttribute;                                                       // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                                   // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcOmni;                                                            // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                                       // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                                  // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                               // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                            // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                            // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                  // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeSchemaAndReasonMV;                           // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeStringMV;                                    // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                    // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.SchemaAndReason;                                    // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;                              // Base class - (GenUtility.java:355)
import org.dmd.gpb.shared.generated.dmo.GpbModuleDMO;                                  // Type specific set/add - (GenUtility.java:307)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbModuleREFMV;                       // Reference type - (GenUtility.java:300)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;                                // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbModuleDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbModule";


    static {
    }

    public GpbModuleDMO() {
        super("GpbModule");
    }

    protected GpbModuleDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbModuleDMO getNew(){
        GpbModuleDMO rc = new GpbModuleDMO();
        return(rc);
    }

    @Override
    public GpbModuleDMO getSlice(DmcSliceInfo info){
        GpbModuleDMO rc = new GpbModuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbModuleDMO(DmcTypeModifierMV mods) {
        super("GpbModule");
        modrec(true);
        setModifier(mods);
    }

    public GpbModuleDMO getModificationRecorder(){
        GpbModuleDMO rc = new GpbModuleDMO();
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
        if (obj instanceof GpbModuleDMO){
            return( getObjectName().equals( ((GpbModuleDMO) obj).getObjectName()) );
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
     * @return An Iterator of SchemaAndReason objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<SchemaAndReason> getLoadSchemaClass(){
        DmcTypeSchemaAndReasonMV attr = (DmcTypeSchemaAndReasonMV) get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return( ((List<SchemaAndReason>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth SchemaAndReason value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public SchemaAndReason getNthLoadSchemaClass(int i){
        DmcTypeSchemaAndReasonMV attr = (DmcTypeSchemaAndReasonMV) get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another loadSchemaClass to the specified value.
     * @param value SchemaAndReason
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addLoadSchemaClass(SchemaAndReason value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            attr = new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__loadSchemaClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified SchemaAndReason.
     * @param value SchemaAndReason
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean loadSchemaClassContains(SchemaAndReason value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another loadSchemaClass value.
     * @param value A value compatible with SchemaAndReason
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addLoadSchemaClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            attr = new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__loadSchemaClass,attr);
        return(attr);
    }

    /**
     * Returns the number of values in loadSchemaClass
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getLoadSchemaClassSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null){
            if (MetaDMSAG.__loadSchemaClass.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__loadSchemaClass.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a loadSchemaClass value.
     * @param value The SchemaAndReason to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delLoadSchemaClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass), value);
        else
            attr = del(MetaDMSAG.__loadSchemaClass, value);
        
        return(attr);
    }

    /**
     * Deletes a loadSchemaClass from the specified value.
     * @param value SchemaAndReason
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delLoadSchemaClass(SchemaAndReason value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass), value);
        else
            attr = del(MetaDMSAG.__loadSchemaClass, value);
        
        return(attr);
    }

    /**
     * Removes the loadSchemaClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remLoadSchemaClass(){
         rem(MetaDMSAG.__loadSchemaClass);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthDescription(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__description,attr);
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
    public boolean descriptionContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * Returns the number of values in description
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null){
            if (MetaDMSAG.__description.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__description.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Deletes a description from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthDefFiles(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another defFiles to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addDefFiles(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__defFiles);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__defFiles,attr);
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
    public boolean defFilesContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDefFiles(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__defFiles);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__defFiles,attr);
        return(attr);
    }

    /**
     * Returns the number of values in defFiles
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null){
            if (MetaDMSAG.__defFiles.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__defFiles.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delDefFiles(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__defFiles), value);
        else
            attr = del(MetaDMSAG.__defFiles, value);
        
        return(attr);
    }

    /**
     * Deletes a defFiles from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delDefFiles(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__defFiles), value);
        else
            attr = del(MetaDMSAG.__defFiles, value);
        
        return(attr);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDefFiles(){
         rem(MetaDMSAG.__defFiles);
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
    public String getVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__version);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets version to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setVersion(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__version);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__version,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setVersion(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__version);
        
        attr.set(value);
        set(DmdgpbDMSAG.__version,attr);
    }

    /**
     * Removes the version attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remVersion(){
         rem(DmdgpbDMSAG.__version);
    }

    /**
     * @return An Iterator of GpbModuleDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<GpbModuleREF> getDependsOnGpbModule(){
        DmcTypeGpbModuleREFMV attr = (DmcTypeGpbModuleREFMV) get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null)
            return( ((List<GpbModuleREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<GpbModuleREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of GpbModuleREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<GpbModuleREF> getDependsOnGpbModuleREFs(){
        DmcTypeGpbModuleREFMV attr = (DmcTypeGpbModuleREFMV) get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null)
            return( ((List<GpbModuleREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnGpbModule to the specified value.
     * @param value GpbModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addDependsOnGpbModule(GpbModuleDMO value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null)
            attr = new DmcTypeGpbModuleREFMV(DmdgpbDMSAG.__dependsOnGpbModule);
        
        try{
            setLastValue(attr.add(value));
            add(DmdgpbDMSAG.__dependsOnGpbModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnGpbModule value.
     * @param value A value compatible with GpbModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDependsOnGpbModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null)
            attr = new DmcTypeGpbModuleREFMV(DmdgpbDMSAG.__dependsOnGpbModule);
        
        setLastValue(attr.add(value));
        add(DmdgpbDMSAG.__dependsOnGpbModule,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnGpbModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDependsOnGpbModuleSize(){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__dependsOnGpbModule);
        if (attr == null){
            if (DmdgpbDMSAG.__dependsOnGpbModule.indexSize == 0)
                return(0);
            else
                return(DmdgpbDMSAG.__dependsOnGpbModule.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnGpbModule value.
     * @param value The GpbModule to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delDependsOnGpbModule(Object value){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__dependsOnGpbModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeGpbModuleREFMV(DmdgpbDMSAG.__dependsOnGpbModule), value);
        else
            attr = del(DmdgpbDMSAG.__dependsOnGpbModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnGpbModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDependsOnGpbModule(){
         rem(DmdgpbDMSAG.__dependsOnGpbModule);
    }

    /**
     * @return An Iterator of ConcinnityModuleDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<ConcinnityModuleREF> getDependsOnConcinnityModule(){
        DmcTypeConcinnityModuleREFMV attr = (DmcTypeConcinnityModuleREFMV) get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null)
            return( ((List<ConcinnityModuleREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ConcinnityModuleREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ConcinnityModuleREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<ConcinnityModuleREF> getDependsOnConcinnityModuleREFs(){
        DmcTypeConcinnityModuleREFMV attr = (DmcTypeConcinnityModuleREFMV) get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null)
            return( ((List<ConcinnityModuleREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnConcinnityModule to the specified value.
     * @param value ConcinnityModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addDependsOnConcinnityModule(ConcinnityModuleDMO value) {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null)
            attr = new DmcTypeConcinnityModuleREFMV(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        
        try{
            setLastValue(attr.add(value));
            add(DmconcinnityDMSAG.__dependsOnConcinnityModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnConcinnityModule value.
     * @param value A value compatible with ConcinnityModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDependsOnConcinnityModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null)
            attr = new DmcTypeConcinnityModuleREFMV(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        
        setLastValue(attr.add(value));
        add(DmconcinnityDMSAG.__dependsOnConcinnityModule,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnConcinnityModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDependsOnConcinnityModuleSize(){
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        if (attr == null){
            if (DmconcinnityDMSAG.__dependsOnConcinnityModule.indexSize == 0)
                return(0);
            else
                return(DmconcinnityDMSAG.__dependsOnConcinnityModule.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnConcinnityModule value.
     * @param value The ConcinnityModule to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delDependsOnConcinnityModule(Object value){
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeConcinnityModuleREFMV(DmconcinnityDMSAG.__dependsOnConcinnityModule), value);
        else
            attr = del(DmconcinnityDMSAG.__dependsOnConcinnityModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnConcinnityModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDependsOnConcinnityModule(){
         rem(DmconcinnityDMSAG.__dependsOnConcinnityModule);
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




}
