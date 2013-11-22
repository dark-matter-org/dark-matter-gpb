package org.dmd.gpb.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.gpb.shared.generated.types.GpbArtifactREF;
import org.dmd.gpb.server.extended.GpbArtifact;
/**
 * The GpbArtifactIteratorDMW will cast from an underlying GpbArtifactREF class to 
 * the associated wrapper class: GpbArtifact when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:247)
 */
public class GpbArtifactIterableDMW extends DmwContainerIterator<GpbArtifact,GpbArtifactREF> {

    public final static GpbArtifactIterableDMW emptyList = new GpbArtifactIterableDMW();

    protected GpbArtifactIterableDMW(){
        super();
    }

    public GpbArtifactIterableDMW(Iterator<GpbArtifactREF> it){
        super(it);
    }

}

