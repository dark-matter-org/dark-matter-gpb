package org.dmd.gpb.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.gpb.shared.generated.types.GpbModuleREF;
import org.dmd.gpb.server.extended.GpbModule;
/**
 * The GpbModuleIteratorDMW will cast from an underlying GpbModuleREF class to 
 * the associated wrapper class: GpbModule when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:247)
 */
public class GpbModuleIterableDMW extends DmwContainerIterator<GpbModule,GpbModuleREF> {

    public final static GpbModuleIterableDMW emptyList = new GpbModuleIterableDMW();

    protected GpbModuleIterableDMW(){
        super();
    }

    public GpbModuleIterableDMW(Iterator<GpbModuleREF> it){
        super(it);
    }

}

