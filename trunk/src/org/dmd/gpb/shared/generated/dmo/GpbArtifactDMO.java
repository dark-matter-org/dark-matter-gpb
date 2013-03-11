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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:392)
import java.io.Serializable;                                      // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                  // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcNamedObjectIF;                              // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcSliceInfo;                                  // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.types.StringName;                              // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;         // Base class - (GenUtility.java:351)

/**
 * The GpbArtifact defines an artifact to be generated by the dark-matter GPB
 * \n generation mechanisms; the artifacts in this case are .proto files.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GpbArtifactDMO  extends GpbDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GpbArtifact";


    static {
    }

    public GpbArtifactDMO() {
        super("GpbArtifact");
    }

    protected GpbArtifactDMO(String oc) {
        super(oc);
    }

    @Override
    public GpbArtifactDMO getNew(){
        GpbArtifactDMO rc = new GpbArtifactDMO();
        return(rc);
    }

    @Override
    public GpbArtifactDMO getSlice(DmcSliceInfo info){
        GpbArtifactDMO rc = new GpbArtifactDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GpbArtifactDMO(DmcTypeModifierMV mods) {
        super("GpbArtifact");
        modrec(true);
        setModifier(mods);
    }

    public GpbArtifactDMO getModificationRecorder(){
        GpbArtifactDMO rc = new GpbArtifactDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof GpbArtifactDMO){
            return( getObjectName().equals( ((GpbArtifactDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        StringName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }




}
