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
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.DefinitionName;                       // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.ClassDefinition;                            // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.gpb.server.extended.GpbDefinition;              // Derived class - (BaseDMWGeneratorNewest.java:1117)
import org.dmd.gpb.server.extended.GpbMessage;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.gpb.shared.generated.dmo.GpbMessageDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)


/**
 * null
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class GpbMessageDMW extends GpbDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public GpbMessageDMW() {
        super(new GpbMessageDMO(), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public GpbMessageDMW(DmcTypeModifierMV mods) {
        super(new GpbMessageDMO(mods), org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public GpbMessage getModificationRecorder(){
        GpbMessage rc = new GpbMessage();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public GpbMessageDMW(GpbMessageDMO obj) {
        super(obj, org.dmd.gpb.server.generated.DmdgpbSchemaAG._GpbMessage);
    }

    public GpbMessage cloneIt() {
        GpbMessage rc = new GpbMessage();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GpbMessageDMO getDMO() {
        return((GpbMessageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected GpbMessageDMW(GpbMessageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1166)
    public DefinitionName getObjectName(){
        return(((GpbMessageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbMessageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbMessageDMW){
            return( getObjectName().equals( ((GpbMessageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public DefinitionName getName(){
        return(((GpbMessageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setName(Object value) throws DmcValueException {
        ((GpbMessageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setName(DefinitionName value){
        ((GpbMessageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remName(){
        ((GpbMessageDMO) core).remName();
    }


}