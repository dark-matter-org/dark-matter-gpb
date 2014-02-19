//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.gpb.tools.generation.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.gpb.tools.generation.generated.dmo.GpbauxtestDMSAG;


/**
 * This is a schema used to test the augmentation of GPB definitions with
 * additional information.
 * <P>
 * Generated from the gpbauxtest schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class GpbauxtestSchemaAG extends SchemaDefinition {

    public static ClassDefinition _GpbTestAuxInfo;

    public static AttributeDefinition _otherInfo;
    public static AttributeDefinition _units;







    static GpbauxtestSchemaAG instance;

    public GpbauxtestSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.gpb.tools.generation.generated.GpbauxtestSchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("gpbauxtest");
            me.setDotName("gpbauxtest");
            me.setSchemaPackage("org.dmd.gpb.tools.generation");
            me.setDmwPackage("org.dmd.gpb.tools.generation");
            me.setFile("/Users/peterstrong/Development/dark-matter/dark-matter-gpb/test/org/dmd/gpb/tools/generation/dmdconfig/gpbauxtest.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(GpbauxtestDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _GpbTestAuxInfoOBJ = new ClassDefinitionDMO();
            _GpbTestAuxInfo = new ClassDefinition(_GpbTestAuxInfoOBJ,GpbauxtestDMSAG.__GpbTestAuxInfo);
            _GpbTestAuxInfoOBJ.setName("GpbTestAuxInfo");
            _GpbTestAuxInfoOBJ.setDmdID("-478999");
            _GpbTestAuxInfoOBJ.setClassType("AUXILIARY");
            _GpbTestAuxInfoOBJ.setFile("/Users/peterstrong/Development/dark-matter/dark-matter-gpb/test/org/dmd/gpb/tools/generation/dmdconfig/classes.dmd");
            _GpbTestAuxInfoOBJ.setLineNumber("9");
            _GpbTestAuxInfoOBJ.addDescription("This class is used to test adding auxiliary information to GPB definitions.");
            _GpbTestAuxInfoOBJ.setDmtREFImport("org.dmd.gpb.tools.generation.generated.types.GpbTestAuxInfoREF");
            _GpbTestAuxInfoOBJ.setDmwIteratorClass("GpbTestAuxInfoIterableDMW");
            _GpbTestAuxInfoOBJ.addMay("gpbauxtest.otherInfo");
            _GpbTestAuxInfoOBJ.addMay("gpbauxtest.units");
            _GpbTestAuxInfoOBJ.setDmwIteratorImport("org.dmd.gpb.tools.generation.generated.dmw.GpbTestAuxInfoIterableDMW");
            _GpbTestAuxInfoOBJ.setDmoAuxClassImport("org.dmd.gpb.tools.generation.generated.auxw.GpbTestAuxInfoDMO");
            _GpbTestAuxInfoOBJ.setDmwAuxClass("GpbTestAuxInfo");
            _GpbTestAuxInfoOBJ.setDmoAuxClass("GpbTestAuxInfoDMO");
            _GpbTestAuxInfoOBJ.setDmwAuxClassImport("org.dmd.gpb.tools.generation.generated.auxw.GpbTestAuxInfo");
            _GpbTestAuxInfoOBJ.setDotName("gpbauxtest.GpbTestAuxInfo.ClassDefinition");
            _GpbTestAuxInfoOBJ.setNameAndTypeName("GpbTestAuxInfo.ClassDefinition");
            _GpbTestAuxInfo.setDefinedIn(this);
            addClassDefList(_GpbTestAuxInfo);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _otherInfoOBJ = new AttributeDefinitionDMO();
            _otherInfo = new AttributeDefinition(_otherInfoOBJ);
            _otherInfoOBJ.setType("meta.String");
            _otherInfoOBJ.setName("otherInfo");
            _otherInfoOBJ.setDmdID("-478999");
            _otherInfoOBJ.addDescription("Some other information.");
            _otherInfoOBJ.setNameAndTypeName("otherInfo.AttributeDefinition");
            _otherInfoOBJ.setDotName("gpbauxtest.otherInfo.AttributeDefinition");
            _otherInfo.setDefinedIn(this);
            _otherInfoOBJ.setFile("/Users/peterstrong/Development/dark-matter/dark-matter-gpb/test/org/dmd/gpb/tools/generation/dmdconfig/attributes.dmd");
            _otherInfoOBJ.setLineNumber("6");
            addAttributeDefList(_otherInfo);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _unitsOBJ = new AttributeDefinitionDMO();
            _units = new AttributeDefinition(_unitsOBJ);
            _unitsOBJ.setType("meta.String");
            _unitsOBJ.setName("units");
            _unitsOBJ.setDmdID("-478998");
            _unitsOBJ.addDescription("Some unit information.");
            _unitsOBJ.setNameAndTypeName("units.AttributeDefinition");
            _unitsOBJ.setDotName("gpbauxtest.units.AttributeDefinition");
            _units.setDefinedIn(this);
            _unitsOBJ.setFile("/Users/peterstrong/Development/dark-matter/dark-matter-gpb/test/org/dmd/gpb/tools/generation/dmdconfig/attributes.dmd");
            _unitsOBJ.setLineNumber("12");
            addAttributeDefList(_units);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initComplexTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initActions() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initEnums() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initRules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initDSDModules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized GpbauxtestSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

