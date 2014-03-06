package org.dmd.gpb.server.util;

import java.util.Iterator;

/**
 * The VersionCheck utility class determines whether or not some element should
 * be included in a version of something.
 */
public class VersionChecker {

    /**
     * Determines if a GpbFieldIndicator or GpbEnumValue should be included in generated output.
     * @param genversion the generation version or null.
     * @param version the version of the thing being tested or null.
     * @param skips the versions to be skipped or null.
     * @return true if there's no genversion. Otherwise, it will depend on whether we're specifically skipping
     * the genversion or if the version is less than or equal to the genversion.
     */
    static public boolean shouldBeIncluded(String genversion, String version, Iterator<String> skips){
    	boolean rc = true;
    	
    	// We only proceed if we have a genversion, otherwise, we're done
    	if (genversion != null){
    		if (skips != null){
    			// We have specified versions to skip
    			while(skips.hasNext()){
    				String skip = skips.next();
    				if (skip.equals(genversion)){
    					// We've been explicitly told to skip this version
    					rc = false;
    					break;
    				}
    			}
    		}
    		if (rc){
    			// We don't have a reason to stop yet
    			if (version != null){
    				// The element was introduced at a specific version
    				
    				// If the version is greater than the version we're trying to generate, don't include the element
    				if (version.compareTo(genversion) > 0)
    					rc = false;
    			}
    		}
    	}
    	
    	return(rc);
    }

}
