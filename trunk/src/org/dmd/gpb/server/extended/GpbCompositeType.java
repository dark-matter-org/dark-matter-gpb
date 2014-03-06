package org.dmd.gpb.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;
import org.dmd.gpb.server.generated.dmw.GpbCompositeTypeDMW;
import org.dmd.gpb.server.util.VersionChecker;
import org.dmd.gpb.shared.generated.dmo.GpbCompositeTypeDMO;


abstract public class GpbCompositeType extends GpbCompositeTypeDMW {

    public GpbCompositeType(){
        super();
    }

    public GpbCompositeType(GpbCompositeTypeDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    /**
     * Derived classes will overload this to return themselves in GPB proto spec format.
     * @param indent a string with the required indentation level. This is used in the case of embedded enums/messages.
     * @param genversion either null, or a string that indicates the version at which particular elements should
     * should be generated. 
     */
    abstract public String toDotProtoFormat(String indent, String genversion);
    
    /**
     * Determines if the derived message or enum should be included in generated output.
     * @param genversion the generation version, or null.
     * @return true if the element should be included in generation, or if genversion is null.
     */
    public boolean shouldBeIncluded(String genversion){
    	boolean rc = true;
    	
    	if (genversion == null)
    		return(rc);
    	
//    	if (getSkipHasValue())
//    		rc = shouldBeIncluded(genversion, getVersion(), getSkipCopy().iterator());
//    	else
//    		rc = shouldBeIncluded(genversion, getVersion(), null);
    	
    	rc = VersionChecker.shouldBeIncluded(genversion, getVersion(), getSkipIterable());
    	
    	return(rc);
    }
    	
//    /**
//     * Determines if a GpbFieldIndicator or GpbEnumValue should be included in generated output.
//     * @param genversion the generation version or null.
//     * @param version the version of the thing being tested or null.
//     * @param skips the versions to be skipped or null.
//     * @return true if there's no genversion. Otherwise, it will depend on whether we're specifically skipping
//     * the genversion or if the version is less than or equal to the genversion.
//     */
//    protected boolean shouldBeIncluded(String genversion, String version, Iterator<String> skips){
//    	boolean rc = true;
//    	
//    	// We only proceed if we have a genversion, otherwise, we're done
//    	if (genversion != null){
//    		if (skips != null){
//    			// We have specified versions to skip
//    			while(skips.hasNext()){
//    				String skip = skips.next();
//    				if (skip.equals(genversion)){
//    					// We've been explicitly told to skip this version
//    					rc = false;
//    					break;
//    				}
//    			}
//    		}
//    		if (rc){
//    			// We don't have a reason to stop yet
//    			if (version != null){
//    				// The element was introduced at a specific version
//    				
//    				// If the version is greater than the version we're trying to generate, don't include the element
//    				if (version.compareTo(genversion) > 0)
//    					rc = false;
//    			}
//    		}
//    	}
//    	
//    	return(rc);
//    }
}

