package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1080)
import java.util.ArrayList;                                               // For storage of schema info - (DmoCompactSchemaFormatter.java:1014)
import java.util.HashMap;                                                 // For storage of schema info - (DmoCompactSchemaFormatter.java:1013)
import java.util.Iterator;                                                // For access of schema info - (DmoCompactSchemaFormatter.java:1015)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;         // Optional attribute from DmconcinnityDMSAG - (DmoCompactSchemaFormatter.java:1037)
import org.dmd.dmc.*;                                                     // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1016)
import org.dmd.dmc.rules.RuleIF;                                          // For rule info - (DmoCompactSchemaFormatter.java:1017)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1033)
import org.dmd.dms.generated.enums.ClassTypeEnum;                         // Have class definitions - (DmoCompactSchemaFormatter.java:1021)
import org.dmd.dms.generated.enums.DataTypeEnum;                          // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1022)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                      // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1027)
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Have attribute definitions - (DmoCompactSchemaFormatter.java:1048)
import org.dmd.dmv.shared.extended.rulesdmo.ValueLengthRule;              // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1074)
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;           // To instantiate ValueLengthRuleData rule data - (DmoCompactSchemaFormatter.java:1073)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:138)
public class DmdgpbDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmdgpb";


    static int schemaBaseID = -478000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -477950;

    public final static DmcAttributeInfo __basedOnEnum = new DmcAttributeInfo("dmdgpb", "basedOnEnum", -477988, "EnumDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __cplusplusType = new DmcAttributeInfo("dmdgpb", "cplusplusType", -477999, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __defaultValue = new DmcAttributeInfo("dmdgpb", "defaultValue", -477996, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __definedInGpbModule = new DmcAttributeInfo("dmdgpb", "definedInGpbModule", -477992, "GpbModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnGpbModule = new DmcAttributeInfo("dmdgpb", "dependsOnGpbModule", -477980, "GpbModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dmType = new DmcAttributeInfo("dmdgpb", "dmType", -477998, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __embed = new DmcAttributeInfo("dmdgpb", "embed", -477972, "GpbCompositeType", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __field = new DmcAttributeInfo("dmdgpb", "field", -477976, "GpbFieldIndicator", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __fieldRule = new DmcAttributeInfo("dmdgpb", "fieldRule", -477974, "FieldRuleEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __generateAs = new DmcAttributeInfo("dmdgpb", "generateAs", -477971, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __generatedFileName = new DmcAttributeInfo("dmdgpb", "generatedFileName", -477993, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __gpbEnumValue = new DmcAttributeInfo("dmdgpb", "gpbEnumValue", -477978, "GpbEnumValue", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __gpbType = new DmcAttributeInfo("dmdgpb", "gpbType", -477994, "GpbType", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hint = new DmcAttributeInfo("dmdgpb", "hint", -477997, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __import = new DmcAttributeInfo("dmdgpb", "import", -477973, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __javaType = new DmcAttributeInfo("dmdgpb", "javaType", -477989, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mainElements = new DmcAttributeInfo("dmdgpb", "mainElements", -477977, "GpbCompositeType", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __obsolete = new DmcAttributeInfo("dmdgpb", "obsolete", -477968, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __package = new DmcAttributeInfo("dmdgpb", "package", -477979, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __pythonType = new DmcAttributeInfo("dmdgpb", "pythonType", -477990, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sizeInBytes = new DmcAttributeInfo("dmdgpb", "sizeInBytes", -477995, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __skip = new DmcAttributeInfo("dmdgpb", "skip", -477969, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tag = new DmcAttributeInfo("dmdgpb", "tag", -477975, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __version = new DmcAttributeInfo("dmdgpb", "version", -477970, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __why = new DmcAttributeInfo("dmdgpb", "why", -477967, "Concept", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, true);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:184)
    public final static DmcTypeInfo __type_FieldRuleEnum = new DmcTypeInfo("FieldRuleEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_GpbCompositeType = new DmcTypeInfo("GpbCompositeType", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbDefinition = new DmcTypeInfo("GpbDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbEnum = new DmcTypeInfo("GpbEnum", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbEnumValue = new DmcTypeInfo("GpbEnumValue", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_GpbField = new DmcTypeInfo("GpbField", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbFieldIndicator = new DmcTypeInfo("GpbFieldIndicator", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_GpbFieldIndicatorBase = new DmcTypeInfo("GpbFieldIndicatorBase", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_GpbMessage = new DmcTypeInfo("GpbMessage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbModule = new DmcTypeInfo("GpbModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbProtoFile = new DmcTypeInfo("GpbProtoFile", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbScalarType = new DmcTypeInfo("GpbScalarType", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbType = new DmcTypeInfo("GpbType", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_OptionEnum = new DmcTypeInfo("OptionEnum", OriginalTypeEnum.ENUM);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:225)
    public final static DmcClassInfo __GpbDefinition = new DmcClassInfo("GpbDefinition","org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO", -477998, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbField = new DmcClassInfo("GpbField","org.dmd.gpb.shared.generated.dmo.GpbFieldDMO", -477993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbModule = new DmcClassInfo("GpbModule","org.dmd.gpb.shared.generated.dmo.GpbModuleDMO", -477999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbProtoFile = new DmcClassInfo("GpbProtoFile","org.dmd.gpb.shared.generated.dmo.GpbProtoFileDMO", -477990, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbType = new DmcClassInfo("GpbType","org.dmd.gpb.shared.generated.dmo.GpbTypeDMO", -477997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbCompositeType = new DmcClassInfo("GpbCompositeType","org.dmd.gpb.shared.generated.dmo.GpbCompositeTypeDMO", -477995, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__GpbType,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbEnum = new DmcClassInfo("GpbEnum","org.dmd.gpb.shared.generated.dmo.GpbEnumDMO", -477994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbCompositeType,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbMessage = new DmcClassInfo("GpbMessage","org.dmd.gpb.shared.generated.dmo.GpbMessageDMO", -477992, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbCompositeType,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbScalarType = new DmcClassInfo("GpbScalarType","org.dmd.gpb.shared.generated.dmo.GpbScalarTypeDMO", -477996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbType,MetaDMSAG.__name);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:254)
    public final static ValueLengthRule __dmgpbHintLength;

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmdgpbDMSAGAMAP.initSmAp(_SmAp);

        DmdgpbDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:308)
    static {


        __GpbDefinition.addMust(MetaDMSAG.__name);
        __GpbDefinition.addMust(MetaDMSAG.__dotName);
        __GpbDefinition.addMust(__definedInGpbModule);
        __GpbDefinition.addMay(__hint);
        __GpbDefinition.addMay(MetaDMSAG.__description);

        __GpbType.addMust(MetaDMSAG.__name);

        __GpbScalarType.addMust(MetaDMSAG.__name);
        __GpbScalarType.addMay(__defaultValue);
        __GpbScalarType.addMay(__sizeInBytes);
        __GpbScalarType.addMay(__javaType);
        __GpbScalarType.addMay(__cplusplusType);
        __GpbScalarType.addMay(__pythonType);

        __GpbCompositeType.addMust(MetaDMSAG.__name);
        __GpbCompositeType.addMay(__generateAs);
        __GpbCompositeType.addMay(__version);
        __GpbCompositeType.addMay(__skip);
        __GpbCompositeType.addMay(__obsolete);
        __GpbCompositeType.addMay(__why);

        __GpbEnum.addMust(MetaDMSAG.__name);
        __GpbEnum.addMust(__gpbEnumValue);
        __GpbEnum.addMay(__defaultValue);

        __GpbField.addMust(MetaDMSAG.__name);
        __GpbField.addMust(__gpbType);
        __GpbField.addMay(__hint);
        __GpbField.addMay(MetaDMSAG.__description);
        __GpbField.addMay(__generateAs);

        __GpbMessage.addMust(MetaDMSAG.__name);
        __GpbMessage.addMay(__field);
        __GpbMessage.addMay(__embed);

        __GpbProtoFile.addMust(MetaDMSAG.__name);
        __GpbProtoFile.addMust(__package);
        __GpbProtoFile.addMust(__generatedFileName);
        __GpbProtoFile.addMay(__import);
        __GpbProtoFile.addMay(__mainElements);

        __GpbModule.addMust(MetaDMSAG.__name);
        __GpbModule.addMay(MetaDMSAG.__loadSchemaClass);
        __GpbModule.addMay(MetaDMSAG.__description);
        __GpbModule.addMay(MetaDMSAG.__defFiles);
        __GpbModule.addMay(__package);
        __GpbModule.addMay(__version);
        __GpbModule.addMay(__dependsOnGpbModule);
        __GpbModule.addMay(DmconcinnityDMSAG.__dependsOnConcinnityModule);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:352)
    static {


        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:371)
        try{
            ValueLengthRuleDataDMO _dmgpbHintLengthData = new ValueLengthRuleDataDMO();
            _dmgpbHintLengthData         .setRuleName("dmgpbHintLength");
            _dmgpbHintLengthData         .setRuleTitle("The hint for something should be at most 80 characters.");
            _dmgpbHintLengthData         .setApplyToAttribute("hint");
            _dmgpbHintLengthData         .setMaxLength("80");
            _dmgpbHintLengthData         .setFile("/src/org/dmd/gpb/shared/dmdconfig/v0dot1/attributes.dmd");
            _dmgpbHintLengthData         .setDefinedIn("dmdgpb");
            _dmgpbHintLengthData         .setLineNumber("25");

            __dmgpbHintLength = new ValueLengthRule(_dmgpbHintLengthData);

            _RmAp.add(__dmgpbHintLength);

        } catch(DmcValueException ex){
            throw(new IllegalStateException(ex));
        }

    }

    static  DmdgpbDMSAG instance;

    protected DmdgpbDMSAG (){
    }

    public synchronized static DmdgpbDMSAG instance(){
        if (instance == null)
            instance = new DmdgpbDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

