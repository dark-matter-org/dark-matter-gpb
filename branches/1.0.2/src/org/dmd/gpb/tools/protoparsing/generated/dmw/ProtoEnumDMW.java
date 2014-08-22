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
import java.util.ArrayList;                                               // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                                // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                     // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                           // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                  // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                       // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Attribute enumValue from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.EnumValueIterableDMW;                    // For multi-valued EnumValue - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dms.types.EnumValue;                                       // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.gpb.tools.protoparsing.extended.ProtoEnum;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.gpb.tools.protoparsing.extended.ProtoMainElement;          // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoEnumDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)



/**
 * <P>
 * Generated from the dmdproto schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class ProtoEnumDMW extends ProtoMainElement implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public ProtoEnumDMW() {
        super(new ProtoEnumDMO(), org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG._ProtoEnum);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public ProtoEnumDMW(DmcTypeModifierMV mods) {
        super(new ProtoEnumDMO(mods), org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG._ProtoEnum);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public ProtoEnum getModificationRecorder(){
        ProtoEnum rc = new ProtoEnum();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public ProtoEnumDMW(ProtoEnumDMO obj) {
        super(obj, org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG._ProtoEnum);
    }

    public ProtoEnum cloneIt() {
        ProtoEnum rc = new ProtoEnum();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ProtoEnumDMO getDMO() {
        return((ProtoEnumDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected ProtoEnumDMW(ProtoEnumDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((ProtoEnumDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ProtoEnumDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ProtoEnumDMW){
            return( getObjectName().equals( ((ProtoEnumDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of EnumValue items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getEnumValueSize(){
        return(((ProtoEnumDMO) core).getEnumValueSize());
    }

    /**
     * @return true if there are no EnumValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getEnumValueIsEmpty(){
        if (((ProtoEnumDMO) core).getEnumValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any EnumValueDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getEnumValueHasValue(){
        if (((ProtoEnumDMO) core).getEnumValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of EnumValue objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public EnumValueIterableDMW getEnumValueIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(EnumValueIterableDMW.emptyList);
        
        return(new EnumValueIterableDMW(((ProtoEnumDMO) core).getEnumValue()));
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addEnumValue(Object value) throws DmcValueException {
        ((ProtoEnumDMO) core).addEnumValue(value);
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addEnumValue(EnumValue value){
        ((ProtoEnumDMO) core).addEnumValue(value);
    }

    /**
     * Returns true if the collection contains the enumValue value.
     * @param value A value compatible with EnumValue
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean enumValueContains(EnumValue value){
        return(((ProtoEnumDMO) core).enumValueContains(value));
    }

    /**
     * @return A COPY of the collection of EnumValue objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<EnumValue> getEnumValueCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(new ArrayList<EnumValue>());
        
        ArrayList<EnumValue> rc = new ArrayList<EnumValue>(attr.getMVSize());
        
        Iterator<EnumValue> it = (Iterator<EnumValue>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a enumValue value.
     * @param value The EnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delEnumValue(Object value) throws DmcValueException {
        ((ProtoEnumDMO) core).delEnumValue(value);
    }

    /**
     * Deletes a enumValue value.
     * @param value The EnumValue to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delEnumValue(EnumValue value){
        ((ProtoEnumDMO) core).delEnumValue(value);
    }

    /**
     * Removes the enumValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remEnumValue(){
        ((ProtoEnumDMO) core).remEnumValue();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((ProtoEnumDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((ProtoEnumDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((ProtoEnumDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((ProtoEnumDMO) core).remName();
    }


}
