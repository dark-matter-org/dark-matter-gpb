//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.gpb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                         // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.DefinitionName;                      // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.ClassDefinition;                           // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.gpb.server.extended.GpbDefinition;             // Derived class - (BaseDMWGeneratorNewest.java:1117)
import org.dmd.gpb.server.extended.GpbType;                   // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.gpb.shared.generated.dmo.GpbTypeDMO;           // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)


/**
 * The GpbType class is use to define the types of attributes in the GPB\n
 * specification. All GpbMessages and GpbEnum will have GpbTypes generated
 * for\n them so that they can be used as types for GpbAttributes.\n <p/>\n
 * GpbType definitions cannot be specified in .dmgpb files; they are strictly
 * for\n internal use. If you specify one in a .dmgpb file, you'll get an
 * error.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class GpbTypeDMW extends GpbDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public GpbTypeDMW() {
        super(new GpbTypeDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbType);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public GpbTypeDMW(DmcTypeModifierMV mods) {
        super(new GpbTypeDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbType);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public GpbType getModificationRecorder(){
        GpbType rc = new GpbType();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public GpbTypeDMW(GpbTypeDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbType);
    }

    public GpbType cloneIt() {
        GpbType rc = new GpbType();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbTypeDMO getDMO() {
        return((GpbTypeDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected GpbTypeDMW(GpbTypeDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1166)
    public DefinitionName getObjectName(){
        return(((GpbTypeDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbTypeDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbTypeDMW){
            return( getObjectName().equals( ((GpbTypeDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getCplusplusType(){
        return(((GpbTypeDMO) core).getCplusplusType());
    }

    /**
     * Sets cplusplusType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setCplusplusType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setCplusplusType(value);
    }

    /**
     * Sets cplusplusType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setCplusplusType(String value){
        ((GpbTypeDMO) core).setCplusplusType(value);
    }

    /**
     * Removes the cplusplusType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remCplusplusType(){
        ((GpbTypeDMO) core).remCplusplusType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getDefaultValue(){
        return(((GpbTypeDMO) core).getDefaultValue());
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setDefaultValue(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setDefaultValue(value);
    }

    /**
     * Sets defaultValue to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setDefaultValue(String value){
        ((GpbTypeDMO) core).setDefaultValue(value);
    }

    /**
     * Removes the defaultValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remDefaultValue(){
        ((GpbTypeDMO) core).remDefaultValue();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public Boolean isInternallyGenerated(){
        return(((GpbTypeDMO) core).isInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setInternallyGenerated(value);
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setInternallyGenerated(Boolean value){
        ((GpbTypeDMO) core).setInternallyGenerated(value);
    }

    /**
     * Removes the internallyGenerated attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remInternallyGenerated(){
        ((GpbTypeDMO) core).remInternallyGenerated();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public Boolean isIsEnumType(){
        return(((GpbTypeDMO) core).isIsEnumType());
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setIsEnumType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setIsEnumType(value);
    }

    /**
     * Sets isEnumType to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setIsEnumType(Boolean value){
        ((GpbTypeDMO) core).setIsEnumType(value);
    }

    /**
     * Removes the isEnumType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remIsEnumType(){
        ((GpbTypeDMO) core).remIsEnumType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public Boolean isIsMessageType(){
        return(((GpbTypeDMO) core).isIsMessageType());
    }

    /**
     * Sets isMessageType to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setIsMessageType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setIsMessageType(value);
    }

    /**
     * Sets isMessageType to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setIsMessageType(Boolean value){
        ((GpbTypeDMO) core).setIsMessageType(value);
    }

    /**
     * Removes the isMessageType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remIsMessageType(){
        ((GpbTypeDMO) core).remIsMessageType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getJavaType(){
        return(((GpbTypeDMO) core).getJavaType());
    }

    /**
     * Sets javaType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setJavaType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setJavaType(value);
    }

    /**
     * Sets javaType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setJavaType(String value){
        ((GpbTypeDMO) core).setJavaType(value);
    }

    /**
     * Removes the javaType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remJavaType(){
        ((GpbTypeDMO) core).remJavaType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getPythonType(){
        return(((GpbTypeDMO) core).getPythonType());
    }

    /**
     * Sets pythonType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setPythonType(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setPythonType(value);
    }

    /**
     * Sets pythonType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setPythonType(String value){
        ((GpbTypeDMO) core).setPythonType(value);
    }

    /**
     * Removes the pythonType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remPythonType(){
        ((GpbTypeDMO) core).remPythonType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public Integer getSizeInBytes(){
        return(((GpbTypeDMO) core).getSizeInBytes());
    }

    /**
     * Sets sizeInBytes to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setSizeInBytes(Object value) throws DmcValueException {
        ((GpbTypeDMO) core).setSizeInBytes(value);
    }

    /**
     * Sets sizeInBytes to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setSizeInBytes(Integer value){
        ((GpbTypeDMO) core).setSizeInBytes(value);
    }

    /**
     * Removes the sizeInBytes attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remSizeInBytes(){
        ((GpbTypeDMO) core).remSizeInBytes();
    }


}
