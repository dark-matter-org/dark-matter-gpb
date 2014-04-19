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
import java.io.Serializable;                                        // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                    // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcSliceInfo;                                    // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                               // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                            // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;         // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;           // Base class - (GenUtility.java:355)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The GpbType class provides a common base for all things that can be used
 * \n to represent the type of a GpbField. This includes the built-in scalar
 * types associated with\n Google Protocol Buffers, as well and enums and
 * messages. Having a common base for types means\n that we don't run into
 * problems with generating internal types to represent enums and messages.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class GpbTypeDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

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
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof GpbTypeDMO){
            return( getObjectName().equals( ((GpbTypeDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
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