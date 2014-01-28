package org.dmd.gpb.tools.protoparsing.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1064)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:998)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:997)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:999)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1000)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1001)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1017)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1005)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1006)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1011)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1032)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:137)
public class DmdprotoDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmdproto";


    static int schemaBaseID = -478100;


    static int schemaIDRange = 50;


    static int schemaMaxID = -478050;

    public final static DmcAttributeInfo __elements = new DmcAttributeInfo("dmdproto", "elements", -478097, "ProtoElement", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __fieldRule = new DmcAttributeInfo("dmdproto", "fieldRule", -478093, "ProtoFieldRuleEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __fields = new DmcAttributeInfo("dmdproto", "fields", -478095, "ProtoField", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __generateAs = new DmcAttributeInfo("dmdproto", "generateAs", -478091, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __generatedFileName = new DmcAttributeInfo("dmdproto", "generatedFileName", -478089, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbType = new DmcAttributeInfo("dmdproto", "gpbType", -478099, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hint = new DmcAttributeInfo("dmdproto", "hint", -478090, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __import = new DmcAttributeInfo("dmdproto", "import", -478092, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mainElements = new DmcAttributeInfo("dmdproto", "mainElements", -478096, "ProtoMainElement", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __package = new DmcAttributeInfo("dmdproto", "package", -478098, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tag = new DmcAttributeInfo("dmdproto", "tag", -478094, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:176)
    public final static DmcTypeInfo __type_ProtoDefinition = new DmcTypeInfo("ProtoDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ProtoElement = new DmcTypeInfo("ProtoElement", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ProtoEnum = new DmcTypeInfo("ProtoEnum", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ProtoField = new DmcTypeInfo("ProtoField", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ProtoFieldRuleEnum = new DmcTypeInfo("ProtoFieldRuleEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ProtoFile = new DmcTypeInfo("ProtoFile", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ProtoMainElement = new DmcTypeInfo("ProtoMainElement", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ProtoMessage = new DmcTypeInfo("ProtoMessage", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:217)
    public final static DmcClassInfo __ProtoDefinition = new DmcClassInfo("ProtoDefinition","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoDefinitionDMO", -478099, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ProtoElement = new DmcClassInfo("ProtoElement","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoElementDMO", -478098, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__ProtoDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ProtoField = new DmcClassInfo("ProtoField","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFieldDMO", -478096, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ProtoElement,MetaDMSAG.__name);
    public final static DmcClassInfo __ProtoMainElement = new DmcClassInfo("ProtoMainElement","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoMainElementDMO", -478097, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__ProtoElement,MetaDMSAG.__name);
    public final static DmcClassInfo __ProtoEnum = new DmcClassInfo("ProtoEnum","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoEnumDMO", -478094, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ProtoMainElement,MetaDMSAG.__name);
    public final static DmcClassInfo __ProtoMessage = new DmcClassInfo("ProtoMessage","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoMessageDMO", -478095, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ProtoMainElement,MetaDMSAG.__name);
    public final static DmcClassInfo __ProtoFile = new DmcClassInfo("ProtoFile","org.dmd.gpb.tools.protoparsing.generated.dmo.ProtoFileDMO", -478093, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ProtoDefinition,MetaDMSAG.__name);

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

        DmdprotoDMSAGAMAP.initSmAp(_SmAp);

        DmdprotoDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:300)
    static {


        __ProtoDefinition.addMust(MetaDMSAG.__name);
        __ProtoDefinition.addMust(MetaDMSAG.__dotName);
        __ProtoDefinition.addMay(MetaDMSAG.__file);
        __ProtoDefinition.addMay(MetaDMSAG.__lineNumber);

        __ProtoElement.addMust(MetaDMSAG.__name);

        __ProtoMainElement.addMust(MetaDMSAG.__name);

        __ProtoField.addMust(__gpbType);
        __ProtoField.addMay(MetaDMSAG.__description);
        __ProtoField.addMay(__fieldRule);
        __ProtoField.addMay(__tag);
        __ProtoField.addMay(__generateAs);
        __ProtoField.addMay(__hint);

        __ProtoMessage.addMust(MetaDMSAG.__name);
        __ProtoMessage.addMust(__elements);

        __ProtoEnum.addMust(MetaDMSAG.__name);
        __ProtoEnum.addMust(MetaDMSAG.__enumValue);

        __ProtoFile.addMust(MetaDMSAG.__name);
        __ProtoFile.addMust(__package);
        __ProtoFile.addMay(__import);
        __ProtoFile.addMay(__mainElements);
        __ProtoFile.addMay(__fields);
        __ProtoFile.addMay(__generatedFileName);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:344)
    static {


    }

    static  DmdprotoDMSAG instance;

    protected DmdprotoDMSAG (){
    }

    public synchronized static DmdprotoDMSAG instance(){
        if (instance == null)
            instance = new DmdprotoDMSAG();
        
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

