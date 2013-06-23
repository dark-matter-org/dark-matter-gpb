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
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.DefinitionName;                          // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dmc.types.DotName;                                 // Primitive type - (BaseDMWGeneratorNewest.java:1019)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dmw.DmwNamedObjectWrapper;                         // Named object wrapper - (BaseDMWGeneratorNewest.java:1111)
import org.dmd.gpb.server.extended.GpbDefinition;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.gpb.server.extended.GpbModule;                     // Is reference type - (BaseDMWGeneratorNewest.java:976)
import org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO;         // Abstract class - (BaseDMWGeneratorNewest.java:1099)
import org.dmd.gpb.shared.generated.types.GpbModuleREF;           // Is reference type REF - (BaseDMWGeneratorNewest.java:984)


/**
 * The GpbDefinition provides a common base for all dark-matter\n Google
 * Protocol Buffer definitions.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class GpbDefinitionDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected GpbDefinitionDMW() {
        super();
    }

    abstract public GpbDefinition getModificationRecorder();

    public GpbDefinitionDMO getDMO() {
        return((GpbDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected GpbDefinitionDMW(GpbDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1166)
    public DefinitionName getObjectName(){
        return(((GpbDefinitionDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GpbDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GpbDefinitionDMW){
            return( getObjectName().equals( ((GpbDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A GpbModule object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1303)
    public GpbModule getDefinedInGpbModule(){
        GpbModuleREF ref = ((GpbDefinitionDMO) core).getDefinedInGpbModule();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((GpbModule)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInGpbModule to the specified value.
     * @param value A value compatible with GpbModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1388)
    public void setDefinedInGpbModule(GpbModule value) {
        ((GpbDefinitionDMO) core).setDefinedInGpbModule(value.getDMO());
    }

    /**
     * Sets the definedInGpbModule to the specified value.
     * @param value A value compatible with GpbModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1397)
    public void setDefinedInGpbModule(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setDefinedInGpbModule(value);
    }

    /**
     * Removes the definedInGpbModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remDefinedInGpbModule(){
        ((GpbDefinitionDMO) core).remDefinedInGpbModule();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getDescription(){
        return(((GpbDefinitionDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setDescription(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setDescription(String value){
        ((GpbDefinitionDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remDescription(){
        ((GpbDefinitionDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public DotName getDotName(){
        return(((GpbDefinitionDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setDotName(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setDotName(DotName value){
        ((GpbDefinitionDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remDotName(){
        ((GpbDefinitionDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getFile(){
        return(((GpbDefinitionDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setFile(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setFile(String value){
        ((GpbDefinitionDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remFile(){
        ((GpbDefinitionDMO) core).remFile();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getGpbHint(){
        return(((GpbDefinitionDMO) core).getGpbHint());
    }

    /**
     * Sets gpbHint to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setGpbHint(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setGpbHint(value);
    }

    /**
     * Sets gpbHint to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setGpbHint(String value){
        ((GpbDefinitionDMO) core).setGpbHint(value);
    }

    /**
     * Removes the gpbHint attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remGpbHint(){
        ((GpbDefinitionDMO) core).remGpbHint();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public Integer getLineNumber(){
        return(((GpbDefinitionDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setLineNumber(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setLineNumber(Integer value){
        ((GpbDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remLineNumber(){
        ((GpbDefinitionDMO) core).remLineNumber();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public DefinitionName getName(){
        return(((GpbDefinitionDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setName(Object value) throws DmcValueException {
        ((GpbDefinitionDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setName(DefinitionName value){
        ((GpbDefinitionDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remName(){
        ((GpbDefinitionDMO) core).remName();
    }


}
