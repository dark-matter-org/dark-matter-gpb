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
import java.io.Serializable;                                              // Always required - (GenUtility.java:221)
import java.util.*;                                                       // Always required if we have any MV attributes - (GenUtility.java:216)
import org.dmd.dmc.DmcAttribute;                                          // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcOmni;                                               // Lazy resolution - (GenUtility.java:317)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.DefinitionName;                                  // Naming attribute type - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;               // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.gpb.shared.generated.dmo.GpbElementDMO;                    // Type specific set/add - (GenUtility.java:304)
import org.dmd.gpb.shared.generated.dmo.GpbMainElementDMO;                // Base class - (GenUtility.java:352)
import org.dmd.gpb.shared.generated.types.DmcTypeGpbElementREFMV;         // Reference type - (GenUtility.java:297)
import org.dmd.gpb.shared.generated.types.GpbElementREF;                  // Helper class - (GenUtility.java:332)

/**
 * null
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbMessageDMO  extends GpbMainElementDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbMessage";


    static {
    }

    public GpbMessageDMO() {
        super("GpbMessage");
    }

    protected GpbMessageDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbMessageDMO getNew(){
        GpbMessageDMO rc = new GpbMessageDMO();
        return(rc);
    }

    @Override
    public GpbMessageDMO getSlice(DmcSliceInfo info){
        GpbMessageDMO rc = new GpbMessageDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbMessageDMO(DmcTypeModifierMV mods) {
        super("GpbMessage");
        modrec(true);
        setModifier(mods);
    }

    public GpbMessageDMO getModificationRecorder(){
        GpbMessageDMO rc = new GpbMessageDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
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
        if (obj instanceof GpbMessageDMO){
            return( getObjectName().equals( ((GpbMessageDMO) obj).getObjectName()) );
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

    /**
     * @return An Iterator of GpbElementDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:967)
    public Iterator<GpbElementREF> getElements(){
        DmcTypeGpbElementREFMV attr = (DmcTypeGpbElementREFMV) get(DmdgpbDMSAG.__elements);
        if (attr == null)
            return( ((List<GpbElementREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<GpbElementREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of GpbElementREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:987)
    public Iterator<GpbElementREF> getElementsREFs(){
        DmcTypeGpbElementREFMV attr = (DmcTypeGpbElementREFMV) get(DmdgpbDMSAG.__elements);
        if (attr == null)
            return( ((List<GpbElementREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another elements to the specified value.
     * @param value GpbElement
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1001)
    public DmcAttribute<?> addElements(GpbElementDMO value) {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__elements);
        if (attr == null)
            attr = new DmcTypeGpbElementREFMV(DmdgpbDMSAG.__elements);
        
        try{
            setLastValue(attr.add(value));
            add(DmdgpbDMSAG.__elements,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another elements value.
     * @param value A value compatible with GpbElement
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addElements(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__elements);
        if (attr == null)
            attr = new DmcTypeGpbElementREFMV(DmdgpbDMSAG.__elements);
        
        setLastValue(attr.add(value));
        add(DmdgpbDMSAG.__elements,attr);
        return(attr);
    }

    /**
     * Returns the number of values in elements
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getElementsSize(){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__elements);
        if (attr == null){
            if (DmdgpbDMSAG.__elements.indexSize == 0)
                return(0);
            else
                return(DmdgpbDMSAG.__elements.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a elements value.
     * @param value The GpbElement to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1298)
    public DmcAttribute<?> delElements(Object value){
        DmcAttribute<?> attr = get(DmdgpbDMSAG.__elements);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeGpbElementREFMV(DmdgpbDMSAG.__elements), value);
        else
            attr = del(DmdgpbDMSAG.__elements, value);
        
        return(attr);
    }

    /**
     * Removes the elements attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remElements(){
         rem(DmdgpbDMSAG.__elements);
    }




}
