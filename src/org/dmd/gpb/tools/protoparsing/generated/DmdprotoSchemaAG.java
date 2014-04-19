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
package org.dmd.gpb.tools.protoparsing.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.gpb.tools.protoparsing.generated.dmo.DmdprotoDMSAG;


/**
 * The dark-matter proto schema defines objects that are parsed from .proto\n
 * specifications and used to generate the initial .gpb files that use the
 * dmdgpb schema.\n These two schemas are maintained separately to prevent
 * confusion.
 * <P>
 * Generated from the dmdproto schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DmdprotoSchemaAG extends SchemaDefinition {

    public static ClassDefinition _ProtoDefinition;
    public static ClassDefinition _ProtoElement;
    public static ClassDefinition _ProtoMainElement;
    public static ClassDefinition _ProtoField;
    public static ClassDefinition _ProtoMessage;
    public static ClassDefinition _ProtoEnum;
    public static ClassDefinition _ProtoFile;

    public static AttributeDefinition _gpbType;
    public static AttributeDefinition _package;
    public static AttributeDefinition _elements;
    public static AttributeDefinition _mainElements;
    public static AttributeDefinition _fields;
    public static AttributeDefinition _tag;
    public static AttributeDefinition _fieldRule;
    public static AttributeDefinition _import;
    public static AttributeDefinition _generateAs;
    public static AttributeDefinition _hint;
    public static AttributeDefinition _generatedFileName;
    public static AttributeDefinition _parentMessage;
    public static AttributeDefinition _embeddedElements;




    public static EnumDefinition _ProtoFieldRuleEnum;



    static DmdprotoSchemaAG instance;

    public DmdprotoSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.gpb.tools.protoparsing.generated.DmdprotoSchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmdproto");
            me.setDotName("dmdproto");
            me.setSchemaPackage("org.dmd.gpb.tools.protoparsing");
            me.setDmwPackage("org.dmd.gpb.tools.protoparsing");
            me.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/dmdproto.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DmdprotoDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoDefinitionOBJ = new ClassDefinitionDMO();
            _ProtoDefinition = new ClassDefinition(_ProtoDefinitionOBJ,DmdprotoDMSAG.__ProtoDefinition);
            _ProtoDefinitionOBJ.setName("ProtoDefinition");
            _ProtoDefinitionOBJ.setDmdID("-478099");
            _ProtoDefinitionOBJ.setClassType("ABSTRACT");
            _ProtoDefinitionOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoDefinitionOBJ.setLineNumber("14");
            _ProtoDefinitionOBJ.addDescription("The ProtoDefinition provides a common base for all data parsed from an\n original .proto file.");
            _ProtoDefinitionOBJ.setDerivedFrom("meta.DSDefinition");
            _ProtoDefinitionOBJ.setIsNamedBy("meta.name");
            _ProtoDefinitionOBJ.setUseWrapperType("EXTENDED");
            _ProtoDefinitionOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoDefinitionREF");
            _ProtoDefinitionOBJ.setDmwIteratorClass("ProtoDefinitionIterableDMW");
            _ProtoDefinitionOBJ.addMay("meta.file");
            _ProtoDefinitionOBJ.addMay("meta.lineNumber");
            _ProtoDefinitionOBJ.addMust("meta.name");
            _ProtoDefinitionOBJ.addMust("meta.dotName");
            _ProtoDefinitionOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoDefinitionIterableDMW");
            _ProtoDefinitionOBJ.setDotName("dmdproto.ProtoDefinition.ClassDefinition");
            _ProtoDefinition.setDefinedIn(this);
            addClassDefList(_ProtoDefinition);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoElementOBJ = new ClassDefinitionDMO();
            _ProtoElement = new ClassDefinition(_ProtoElementOBJ,DmdprotoDMSAG.__ProtoElement);
            _ProtoElementOBJ.setName("ProtoElement");
            _ProtoElementOBJ.setDmdID("-478098");
            _ProtoElementOBJ.setClassType("ABSTRACT");
            _ProtoElementOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoElementOBJ.setLineNumber("27");
            _ProtoElementOBJ.addDescription("The ProtoElement provides a common base for all elements that \n comprise a .proto specification.");
            _ProtoElementOBJ.setDerivedFrom("dmdproto.ProtoDefinition");
            _ProtoElementOBJ.setIsNamedBy("meta.name");
            _ProtoElementOBJ.setUseWrapperType("EXTENDED");
            _ProtoElementOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoElementREF");
            _ProtoElementOBJ.setDmwIteratorClass("ProtoElementIterableDMW");
            _ProtoElementOBJ.addMay("dmdproto.parentMessage");
            _ProtoElementOBJ.addMay("dmdproto.generateAs");
            _ProtoElementOBJ.addMust("meta.name");
            _ProtoElementOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoElementIterableDMW");
            _ProtoElementOBJ.setDotName("dmdproto.ProtoElement.ClassDefinition");
            _ProtoElement.setDefinedIn(this);
            addClassDefList(_ProtoElement);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoMainElementOBJ = new ClassDefinitionDMO();
            _ProtoMainElement = new ClassDefinition(_ProtoMainElementOBJ,DmdprotoDMSAG.__ProtoMainElement);
            _ProtoMainElementOBJ.setName("ProtoMainElement");
            _ProtoMainElementOBJ.setDmdID("-478097");
            _ProtoMainElementOBJ.setClassType("ABSTRACT");
            _ProtoMainElementOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoMainElementOBJ.setLineNumber("38");
            _ProtoMainElementOBJ.addDescription("The GpbElement provides a common base for enums and messages that\n are defined at the top level of a .proto specification.");
            _ProtoMainElementOBJ.setDerivedFrom("dmdproto.ProtoElement");
            _ProtoMainElementOBJ.setIsNamedBy("meta.name");
            _ProtoMainElementOBJ.setUseWrapperType("EXTENDED");
            _ProtoMainElementOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoMainElementREF");
            _ProtoMainElementOBJ.setDmwIteratorClass("ProtoMainElementIterableDMW");
            _ProtoMainElementOBJ.addMust("meta.name");
            _ProtoMainElementOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoMainElementIterableDMW");
            _ProtoMainElementOBJ.setDotName("dmdproto.ProtoMainElement.ClassDefinition");
            _ProtoMainElement.setDefinedIn(this);
            addClassDefList(_ProtoMainElement);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoFieldOBJ = new ClassDefinitionDMO();
            _ProtoField = new ClassDefinition(_ProtoFieldOBJ,DmdprotoDMSAG.__ProtoField);
            _ProtoFieldOBJ.setName("ProtoField");
            _ProtoFieldOBJ.setDmdID("-478096");
            _ProtoFieldOBJ.setClassType("STRUCTURAL");
            _ProtoFieldOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoFieldOBJ.setLineNumber("54");
            _ProtoFieldOBJ.addDescription("The ProtoField class represents a single field of a .proto message.");
            _ProtoFieldOBJ.setDerivedFrom("dmdproto.ProtoElement");
            _ProtoFieldOBJ.setIsNamedBy("meta.name");
            _ProtoFieldOBJ.setUseWrapperType("EXTENDED");
            _ProtoFieldOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoFieldREF");
            _ProtoFieldOBJ.setDmwIteratorClass("ProtoFieldIterableDMW");
            _ProtoFieldOBJ.addMay("meta.description");
            _ProtoFieldOBJ.addMay("dmdproto.fieldRule");
            _ProtoFieldOBJ.addMay("dmdproto.tag");
            _ProtoFieldOBJ.addMay("dmdproto.generateAs");
            _ProtoFieldOBJ.addMay("dmdproto.hint");
            _ProtoFieldOBJ.addMust("meta.name");
            _ProtoFieldOBJ.addMust("dmdproto.gpbType");
            _ProtoFieldOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFieldIterableDMW");
            _ProtoFieldOBJ.setDotName("dmdproto.ProtoField.ClassDefinition");
            _ProtoField.setDefinedIn(this);
            addClassDefList(_ProtoField);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoMessageOBJ = new ClassDefinitionDMO();
            _ProtoMessage = new ClassDefinition(_ProtoMessageOBJ,DmdprotoDMSAG.__ProtoMessage);
            _ProtoMessageOBJ.setName("ProtoMessage");
            _ProtoMessageOBJ.setDmdID("-478095");
            _ProtoMessageOBJ.setClassType("STRUCTURAL");
            _ProtoMessageOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoMessageOBJ.setLineNumber("64");
            _ProtoMessageOBJ.setDerivedFrom("dmdproto.ProtoMainElement");
            _ProtoMessageOBJ.setIsNamedBy("meta.name");
            _ProtoMessageOBJ.setUseWrapperType("EXTENDED");
            _ProtoMessageOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoMessageREF");
            _ProtoMessageOBJ.setDmwIteratorClass("ProtoMessageIterableDMW");
            _ProtoMessageOBJ.addMust("meta.name");
            _ProtoMessageOBJ.addMust("dmdproto.elements");
            _ProtoMessageOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoMessageIterableDMW");
            _ProtoMessageOBJ.setDotName("dmdproto.ProtoMessage.ClassDefinition");
            _ProtoMessage.setDefinedIn(this);
            addClassDefList(_ProtoMessage);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoEnumOBJ = new ClassDefinitionDMO();
            _ProtoEnum = new ClassDefinition(_ProtoEnumOBJ,DmdprotoDMSAG.__ProtoEnum);
            _ProtoEnumOBJ.setName("ProtoEnum");
            _ProtoEnumOBJ.setDmdID("-478094");
            _ProtoEnumOBJ.setClassType("STRUCTURAL");
            _ProtoEnumOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoEnumOBJ.setLineNumber("74");
            _ProtoEnumOBJ.setDerivedFrom("dmdproto.ProtoMainElement");
            _ProtoEnumOBJ.setIsNamedBy("meta.name");
            _ProtoEnumOBJ.setUseWrapperType("EXTENDED");
            _ProtoEnumOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoEnumREF");
            _ProtoEnumOBJ.setDmwIteratorClass("ProtoEnumIterableDMW");
            _ProtoEnumOBJ.addMust("meta.name");
            _ProtoEnumOBJ.addMust("meta.enumValue");
            _ProtoEnumOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoEnumIterableDMW");
            _ProtoEnumOBJ.setDotName("dmdproto.ProtoEnum.ClassDefinition");
            _ProtoEnum.setDefinedIn(this);
            addClassDefList(_ProtoEnum);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ProtoFileOBJ = new ClassDefinitionDMO();
            _ProtoFile = new ClassDefinition(_ProtoFileOBJ,DmdprotoDMSAG.__ProtoFile);
            _ProtoFileOBJ.setName("ProtoFile");
            _ProtoFileOBJ.setDmdID("-478093");
            _ProtoFileOBJ.setClassType("STRUCTURAL");
            _ProtoFileOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/classes.dmd");
            _ProtoFileOBJ.setLineNumber("91");
            _ProtoFileOBJ.addDescription("The ProtoFile is used to represent a single .proto file. It may be parsed\n from an existing .proto file by the GpbDotProtoParser utility.");
            _ProtoFileOBJ.setDerivedFrom("dmdproto.ProtoDefinition");
            _ProtoFileOBJ.setIsNamedBy("meta.name");
            _ProtoFileOBJ.setUseWrapperType("EXTENDED");
            _ProtoFileOBJ.setDmtREFImport("org.dmd.gpb.tools.protoparsing.generated.types.ProtoFileREF");
            _ProtoFileOBJ.setDmwIteratorClass("ProtoFileIterableDMW");
            _ProtoFileOBJ.addMay("dmdproto.import");
            _ProtoFileOBJ.addMay("dmdproto.mainElements");
            _ProtoFileOBJ.addMay("dmdproto.embeddedElements");
            _ProtoFileOBJ.addMay("dmdproto.fields");
            _ProtoFileOBJ.addMay("dmdproto.generatedFileName");
            _ProtoFileOBJ.addMust("meta.name");
            _ProtoFileOBJ.addMust("dmdproto.package");
            _ProtoFileOBJ.setDmwIteratorImport("org.dmd.gpb.tools.protoparsing.generated.dmw.ProtoFileIterableDMW");
            _ProtoFileOBJ.setDotName("dmdproto.ProtoFile.ClassDefinition");
            _ProtoFile.setDefinedIn(this);
            addClassDefList(_ProtoFile);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _gpbTypeOBJ = new AttributeDefinitionDMO();
            _gpbType = new AttributeDefinition(_gpbTypeOBJ);
            _gpbTypeOBJ.setType("meta.String");
            _gpbTypeOBJ.setName("gpbType");
            _gpbTypeOBJ.setDmdID("-478099");
            _gpbTypeOBJ.addDescription("The type of a .proto field. We just use a string here since we're\n not doing object resolution based on type.");
            _gpbTypeOBJ.setDotName("dmdproto.gpbType.AttributeDefinition");
            _gpbType.setDefinedIn(this);
            _gpbTypeOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _gpbTypeOBJ.setLineNumber("7");
            addAttributeDefList(_gpbType);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _packageOBJ = new AttributeDefinitionDMO();
            _package = new AttributeDefinition(_packageOBJ);
            _packageOBJ.setType("meta.String");
            _packageOBJ.setName("package");
            _packageOBJ.setDmdID("-478098");
            _packageOBJ.addDescription("The package associated with a .proto file.");
            _packageOBJ.setDotName("dmdproto.package.AttributeDefinition");
            _package.setDefinedIn(this);
            _packageOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _packageOBJ.setLineNumber("13");
            addAttributeDefList(_package);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _elementsOBJ = new AttributeDefinitionDMO();
            _elements = new AttributeDefinition(_elementsOBJ);
            _elementsOBJ.setType("dmdproto.ProtoElement");
            _elementsOBJ.setName("elements");
            _elementsOBJ.setDmdID("-478097");
            _elementsOBJ.addDescription("The elements attribute indicates a list of ProtoElements that comprise a ProtoMessage, this\n includes ProtoFields, ProtoEnums and other ProtoMessages.");
            _elementsOBJ.setValueType("MULTI");
            _elementsOBJ.setDotName("dmdproto.elements.AttributeDefinition");
            _elements.setDefinedIn(this);
            _elementsOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _elementsOBJ.setLineNumber("21");
            addAttributeDefList(_elements);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _mainElementsOBJ = new AttributeDefinitionDMO();
            _mainElements = new AttributeDefinition(_mainElementsOBJ);
            _mainElementsOBJ.setType("dmdproto.ProtoMainElement");
            _mainElementsOBJ.setName("mainElements");
            _mainElementsOBJ.setDmdID("-478096");
            _mainElementsOBJ.addDescription("The mainElements attribute indicates a list of ProtoMainElements that comprise a ProtoFile. Main elements\n include messages and enumerations.");
            _mainElementsOBJ.setValueType("MULTI");
            _mainElementsOBJ.setDotName("dmdproto.mainElements.AttributeDefinition");
            _mainElements.setDefinedIn(this);
            _mainElementsOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _mainElementsOBJ.setLineNumber("29");
            addAttributeDefList(_mainElements);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _fieldsOBJ = new AttributeDefinitionDMO();
            _fields = new AttributeDefinition(_fieldsOBJ);
            _fieldsOBJ.setType("dmdproto.ProtoField");
            _fieldsOBJ.setName("fields");
            _fieldsOBJ.setDmdID("-478095");
            _fieldsOBJ.addDescription("The fields that will be defined individually within a GpbModule. As field from messages\n are parsed, they are added to the fields of a ProtoFile.");
            _fieldsOBJ.setValueType("MULTI");
            _fieldsOBJ.setDotName("dmdproto.fields.AttributeDefinition");
            _fields.setDefinedIn(this);
            _fieldsOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _fieldsOBJ.setLineNumber("37");
            addAttributeDefList(_fields);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _tagOBJ = new AttributeDefinitionDMO();
            _tag = new AttributeDefinition(_tagOBJ);
            _tagOBJ.setType("meta.Integer");
            _tagOBJ.setName("tag");
            _tagOBJ.setDmdID("-478094");
            _tagOBJ.addDescription("As you can see, each field in the message definition has a unique numbered tag.\n These tags are used to identify your fields in the message binary format, and should not be\n changed once your message type is in use. Note that tags with values in the range 1 through 15\n take one byte to encode, including the identifying number and the field's type (you can find\n out more about this in Protocol Buffer Encoding). Tags in the range 16 through 2047 take two\n bytes. So you should reserve the tags 1 through 15 for very frequently occurring message\n elements. Remember to leave some room for frequently occurring elements that might be added\n in the future.\n <p/>\n The smallest tag number you can specify is 1, and the largest is 229 - 1, or 536,870,911.\n You also cannot use the numbers 19000 though 19999");
            _tagOBJ.setDotName("dmdproto.tag.AttributeDefinition");
            _tag.setDefinedIn(this);
            _tagOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _tagOBJ.setLineNumber("53");
            addAttributeDefList(_tag);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _fieldRuleOBJ = new AttributeDefinitionDMO();
            _fieldRule = new AttributeDefinition(_fieldRuleOBJ);
            _fieldRuleOBJ.setType("dmdproto.ProtoFieldRuleEnum");
            _fieldRuleOBJ.setName("fieldRule");
            _fieldRuleOBJ.setDmdID("-478093");
            _fieldRuleOBJ.addDescription("Indicates if a field is required, optional or repeated. See the note about \n required fields as part of the FieldRuleEnum.\n <p/>\n For historical reasons, repeated fields of basic numeric types aren't encoded as efficiently\n as they could be. New code should use the special option [packed=true] to get a more efficient encoding.\n <br/>\n For example: repeated int32 samples = 4 [packed=true];");
            _fieldRuleOBJ.setDotName("dmdproto.fieldRule.AttributeDefinition");
            _fieldRule.setDefinedIn(this);
            _fieldRuleOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _fieldRuleOBJ.setLineNumber("65");
            addAttributeDefList(_fieldRule);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _importOBJ = new AttributeDefinitionDMO();
            _import = new AttributeDefinition(_importOBJ);
            _importOBJ.setType("meta.String");
            _importOBJ.setName("import");
            _importOBJ.setDmdID("-478092");
            _importOBJ.addDescription("An import associated with a .proto file.");
            _importOBJ.setValueType("MULTI");
            _importOBJ.setDotName("dmdproto.import.AttributeDefinition");
            _import.setDefinedIn(this);
            _importOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _importOBJ.setLineNumber("72");
            addAttributeDefList(_import);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _generateAsOBJ = new AttributeDefinitionDMO();
            _generateAs = new AttributeDefinition(_generateAsOBJ);
            _generateAsOBJ.setType("meta.String");
            _generateAsOBJ.setName("generateAs");
            _generateAsOBJ.setDmdID("-478091");
            _generateAsOBJ.addDescription("When protocol elements have clashing names in the namespace of a dmgpb set of definitions,\n we alter their original names but maintain the original name here so that we can regenerate the .proto\n file without difficulty. This is also handy when you start to merge definitions from different .proto\n implementations but still want to maintain the old names in the regenerated .proto files.");
            _generateAsOBJ.setDotName("dmdproto.generateAs.AttributeDefinition");
            _generateAs.setDefinedIn(this);
            _generateAsOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _generateAsOBJ.setLineNumber("81");
            addAttributeDefList(_generateAs);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _hintOBJ = new AttributeDefinitionDMO();
            _hint = new AttributeDefinition(_hintOBJ);
            _hintOBJ.setType("meta.String");
            _hintOBJ.setName("hint");
            _hintOBJ.setDmdID("-478090");
            _hintOBJ.addDescription("Any comment associated with a field");
            _hintOBJ.setDotName("dmdproto.hint.AttributeDefinition");
            _hint.setDefinedIn(this);
            _hintOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _hintOBJ.setLineNumber("87");
            addAttributeDefList(_hint);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _generatedFileNameOBJ = new AttributeDefinitionDMO();
            _generatedFileName = new AttributeDefinition(_generatedFileNameOBJ);
            _generatedFileNameOBJ.setType("meta.String");
            _generatedFileNameOBJ.setName("generatedFileName");
            _generatedFileNameOBJ.setDmdID("-478089");
            _generatedFileNameOBJ.addDescription("The name of the file to be generated, complete with the appropriate file extension.\n An example would be company_common.proto.");
            _generatedFileNameOBJ.setDotName("dmdproto.generatedFileName.AttributeDefinition");
            _generatedFileName.setDefinedIn(this);
            _generatedFileNameOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _generatedFileNameOBJ.setLineNumber("94");
            addAttributeDefList(_generatedFileName);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _parentMessageOBJ = new AttributeDefinitionDMO();
            _parentMessage = new AttributeDefinition(_parentMessageOBJ);
            _parentMessageOBJ.setType("dmdproto.ProtoMessage");
            _parentMessageOBJ.setName("parentMessage");
            _parentMessageOBJ.setDmdID("-478088");
            _parentMessageOBJ.addDescription("Indicates the message in which an enum or message was embedded.");
            _parentMessageOBJ.setDotName("dmdproto.parentMessage.AttributeDefinition");
            _parentMessage.setDefinedIn(this);
            _parentMessageOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _parentMessageOBJ.setLineNumber("100");
            addAttributeDefList(_parentMessage);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _embeddedElementsOBJ = new AttributeDefinitionDMO();
            _embeddedElements = new AttributeDefinition(_embeddedElementsOBJ);
            _embeddedElementsOBJ.setType("dmdproto.ProtoMainElement");
            _embeddedElementsOBJ.setName("embeddedElements");
            _embeddedElementsOBJ.setDmdID("-478070");
            _embeddedElementsOBJ.addDescription("The embeddedElements attribute indicates a list of ProtoMainElement that were \n embedded in other messages. We mainatain a separate collection of these so that we don't\n wind up dumping them as actual main elements in the regenerated .proto file.");
            _embeddedElementsOBJ.setValueType("MULTI");
            _embeddedElementsOBJ.setDotName("dmdproto.embeddedElements.AttributeDefinition");
            _embeddedElements.setDefinedIn(this);
            _embeddedElementsOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/attributes.dmd");
            _embeddedElementsOBJ.setLineNumber("108");
            addAttributeDefList(_embeddedElements);

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
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            EnumDefinitionDMO _ProtoFieldRuleEnumOBJ = new EnumDefinitionDMO();
            _ProtoFieldRuleEnum = new EnumDefinition(_ProtoFieldRuleEnumOBJ);
            _ProtoFieldRuleEnumOBJ.setName("ProtoFieldRuleEnum");
            _ProtoFieldRuleEnumOBJ.addEnumValue("0 REQUIRED A well-formed message must have exactly one of this field.");
            _ProtoFieldRuleEnumOBJ.addEnumValue("1 OPTIONAL A well-formed message can have zero or one of this field (but not more than one).");
            _ProtoFieldRuleEnumOBJ.addEnumValue("2 REPEATED This field can be repeated any number of times (including zero) in a well-formed message. The order of the repeated values will be preserved.");
            _ProtoFieldRuleEnumOBJ.addDescription("The ProtoFieldRuleEnum indicates whether a field is required, optional or repeated.\n <p/>\n REQUIRED is Forever You should be very careful about marking fields as required. If at some\n point you wish to stop writing or sending a required field, it will be problematic to change\n the field to an optional field ? old readers will consider messages without this field to be\n incomplete and may reject or drop them unintentionally. You should consider writing\n application-specific custom validation routines for your buffers instead. Some engineers\n at Google have come to the conclusion that using required does more harm than good; they\n prefer to use only optional and repeated. However, this view is not universal.");
            _ProtoFieldRuleEnumOBJ.setDotName("dmdproto.ProtoFieldRuleEnum.EnumDefinition");
            _ProtoFieldRuleEnum.setDefinedIn(this);
            _ProtoFieldRuleEnumOBJ.setFile("/src/org/dmd/gpb/tools/protoparsing/dmdconfig/types.dmd");
            _ProtoFieldRuleEnumOBJ.setLineNumber("15");
            addEnumDefList(_ProtoFieldRuleEnum);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initRules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initDSDModules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DmdprotoSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

