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
package org.dmd.gpb.tools.protoparsing.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.gpb.tools.protoparsing.generated.types.ProtoFieldREF;
import org.dmd.gpb.tools.protoparsing.extended.ProtoField;
/**
 * The ProtoFieldIteratorDMW will cast from an underlying ProtoFieldREF class to 
 * the associated wrapper class: ProtoField when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmdproto schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class ProtoFieldIterableDMW extends DmwContainerIterator<ProtoField,ProtoFieldREF> {

    public final static ProtoFieldIterableDMW emptyList = new ProtoFieldIterableDMW();

    protected ProtoFieldIterableDMW(){
        super();
    }

    public ProtoFieldIterableDMW(Iterator<ProtoFieldREF> it){
        super(it);
    }

}
