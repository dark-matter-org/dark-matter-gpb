//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.gpb.tools.generation.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:782)
import org.dmd.dmc.*;                                       // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.enums.DataTypeEnum;            // For AUX base functionality - (BaseDMWGenerator.java:780)
import org.dmd.dms.generated.enums.ValueTypeEnum;           // For AUX base functionality - (BaseDMWGenerator.java:779)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Type in an auxiliary class - (BaseDMWGenerator.java:1153)
import org.dmd.dmw.DmwWrapper;                              // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * This class is used to test adding auxiliary information to GPB definitions.
 * <P>
 * Generated from the gpbauxtest schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:784)
 */
public class GpbTestAuxInfo {

    public final static ClassDefinition _auxClass = org.dmd.gpb.tools.generation.generated.GpbauxtestSchemaAG._GpbTestAuxInfo;
    public final static DmcAttributeInfo __otherInfo = new DmcAttributeInfo("otherInfo",-478999,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __units = new DmcAttributeInfo("units",-478998,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2713)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__otherInfo) != null)
            anyLeft = true;
        if (corew.getDmcObject().get(__units) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2731)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2741)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the otherInfo attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2836)
    static public DmcAttribute<?> remOtherInfo(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__otherInfo);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2867)
    static public String getOtherInfo(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__otherInfo);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets otherInfo to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2907)
    static public void setOtherInfo(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__otherInfo);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__otherInfo,attr);
    }

    /**
     * Removes the units attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2836)
    static public DmcAttribute<?> remUnits(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__units);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2867)
    static public String getUnits(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__units);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets units to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2907)
    static public void setUnits(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__units);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__units,attr);
    }




}
