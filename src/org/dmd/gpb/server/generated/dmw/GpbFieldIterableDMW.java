package org.dmd.gpb.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.gpb.shared.generated.types.GpbFieldREF;
import org.dmd.gpb.server.extended.GpbField;
/**
 * The GpbFieldIteratorDMW will cast from an underlying GpbFieldREF class to 
 * the associated wrapper class: GpbField when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmdgpb schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class GpbFieldIterableDMW extends DmwContainerIterator<GpbField,GpbFieldREF> {

    public final static GpbFieldIterableDMW emptyList = new GpbFieldIterableDMW();

    protected GpbFieldIterableDMW(){
        super();
    }

    public GpbFieldIterableDMW(Iterator<GpbFieldREF> it){
        super(it);
    }

}

