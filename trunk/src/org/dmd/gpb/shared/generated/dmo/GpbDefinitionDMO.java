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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                        // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                    // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcValueException;                               // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.DefinitionName;                            // Naming attribute type - (GenUtility.java:367)
import org.dmd.dmc.types.DotName;                                   // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                   // Base class - (GenUtility.java:352)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Attribute from meta schema - (GenUtility.java:194)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;         // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDotNameSV;                // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeStringSV;                 // Required type - (GenUtility.java:325)

/**
 * The GpbDefinition provides a common base for all dark-matter\n Google
 * Protocol Buffer definitions.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class GpbDefinitionDMO  extends DSDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbDefinition";


    static {
    }

    public GpbDefinitionDMO() {
        super("GpbDefinition");
    }

    protected GpbDefinitionDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof GpbDefinitionDMO){
            return( getObjectName().equals( ((GpbDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public String getGpbHint(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__gpbHint);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets gpbHint to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setGpbHint(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__gpbHint);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__gpbHint);
        
        try{
            attr.set(value);
            set(DmdgpbDMSAG.__gpbHint,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets gpbHint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setGpbHint(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__gpbHint);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__gpbHint);
        
        attr.set(value);
        set(DmdgpbDMSAG.__gpbHint,attr);
    }

    /**
     * Removes the gpbHint attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remGpbHint(){
         rem(DmdgpbDMSAG.__gpbHint);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remDotName(){
         rem(MetaDMSAG.__dotName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public String getDefinedInGpbModule(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInGpbModule to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setDefinedInGpbModule(String value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__definedInGpbModule);
        
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
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setDefinedInGpbModule(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmdgpbDMSAG.__definedInGpbModule);
        if (attr == null)
            attr = new DmcTypeStringSV(DmdgpbDMSAG.__definedInGpbModule);
        
        attr.set(value);
        set(DmdgpbDMSAG.__definedInGpbModule,attr);
    }

    /**
     * Removes the definedInGpbModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remDefinedInGpbModule(){
         rem(DmdgpbDMSAG.__definedInGpbModule);
    }




}