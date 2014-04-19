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
package org.dmd.gpb.tools.protoparsing.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                       // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                                        // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                             // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                   // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                          // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Attribute description from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.StringIterableDMW;                               // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.gpb.tools.protoparsing.extended.ProtoElement;                      // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.gpb.tools.protoparsing.extended.ProtoField;                        // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFieldDMO;                // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.gpb.tools.protoparsing.generated.enums.ProtoFieldRuleEnum;         // Primitive type - (BaseDMWGenerator.java:1150)



/**
 * The ProtoField class represents a single field of a .proto message.
 * <P>
 * Generated from the dmdproto schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class ProtoFieldDMW extends ProtoElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public ProtoFieldDMW() {
        super(new ProtoFieldDMO(), org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG._ProtoField);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public ProtoFieldDMW(DmcTypeModifierMV mods) {
        super(new ProtoFieldDMO(mods), org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG._ProtoField);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public ProtoField getModificationRecorder(){
        ProtoField rc = new ProtoField();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public ProtoFieldDMW(ProtoFieldDMO obj) {
        super(obj, org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG._ProtoField);
    }

    public ProtoField cloneIt() {
        ProtoField rc = new ProtoField();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ProtoFieldDMO getDMO() {
        return((ProtoFieldDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected ProtoFieldDMW(ProtoFieldDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((ProtoFieldDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ProtoFieldDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ProtoFieldDMW){
            return( getObjectName().equals( ((ProtoFieldDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((ProtoFieldDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((ProtoFieldDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((ProtoFieldDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ProtoFieldDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((ProtoFieldDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((ProtoFieldDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delDescription(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((ProtoFieldDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((ProtoFieldDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public ProtoFieldRuleEnum getFieldRule(){
        return(((ProtoFieldDMO) core).getFieldRule());
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value A value compatible with DmcTypeProtoFieldRuleEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setFieldRule(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).setFieldRule(value);
    }

    /**
     * Sets fieldRule to the specified value.
     * @param value ProtoFieldRuleEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setFieldRule(ProtoFieldRuleEnum value){
        ((ProtoFieldDMO) core).setFieldRule(value);
    }

    /**
     * Removes the fieldRule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remFieldRule(){
        ((ProtoFieldDMO) core).remFieldRule();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getGenerateAs(){
        return(((ProtoFieldDMO) core).getGenerateAs());
    }

    /**
     * Sets generateAs to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setGenerateAs(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).setGenerateAs(value);
    }

    /**
     * Sets generateAs to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setGenerateAs(String value){
        ((ProtoFieldDMO) core).setGenerateAs(value);
    }

    /**
     * Removes the generateAs attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGenerateAs(){
        ((ProtoFieldDMO) core).remGenerateAs();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getGpbType(){
        return(((ProtoFieldDMO) core).getGpbType());
    }

    /**
     * Sets gpbType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setGpbType(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).setGpbType(value);
    }

    /**
     * Sets gpbType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setGpbType(String value){
        ((ProtoFieldDMO) core).setGpbType(value);
    }

    /**
     * Removes the gpbType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGpbType(){
        ((ProtoFieldDMO) core).remGpbType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getHint(){
        return(((ProtoFieldDMO) core).getHint());
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setHint(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).setHint(value);
    }

    /**
     * Sets hint to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setHint(String value){
        ((ProtoFieldDMO) core).setHint(value);
    }

    /**
     * Removes the hint attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remHint(){
        ((ProtoFieldDMO) core).remHint();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((ProtoFieldDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((ProtoFieldDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((ProtoFieldDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Integer getTag(){
        return(((ProtoFieldDMO) core).getTag());
    }

    /**
     * Sets tag to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setTag(Object value) throws DmcValueException {
        ((ProtoFieldDMO) core).setTag(value);
    }

    /**
     * Sets tag to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setTag(Integer value){
        ((ProtoFieldDMO) core).setTag(value);
    }

    /**
     * Removes the tag attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remTag(){
        ((ProtoFieldDMO) core).remTag();
    }


}
