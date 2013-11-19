package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1060)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:994)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:993)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:995)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:996)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:997)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1013)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1001)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1002)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1007)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1028)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:133)
public class DmdgpbDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmdgpb";


    static int schemaBaseID = -478000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -477950;

    public final static DmcAttributeInfo __basedOnEnum = new DmcAttributeInfo("dmdgpb", "basedOnEnum", -477988, "EnumDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __cplusplusType = new DmcAttributeInfo("dmdgpb", "cplusplusType", -477999, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultValue = new DmcAttributeInfo("dmdgpb", "defaultValue", -477996, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedInGpbModule = new DmcAttributeInfo("dmdgpb", "definedInGpbModule", -477992, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnGpbModule = new DmcAttributeInfo("dmdgpb", "dependsOnGpbModule", -477980, "GpbModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmType = new DmcAttributeInfo("dmdgpb", "dmType", -477998, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbHint = new DmcAttributeInfo("dmdgpb", "gpbHint", -477997, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbType = new DmcAttributeInfo("dmdgpb", "gpbType", -477994, "GpbType", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isMessageType = new DmcAttributeInfo("dmdgpb", "isMessageType", -477993, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __javaType = new DmcAttributeInfo("dmdgpb", "javaType", -477989, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __pythonType = new DmcAttributeInfo("dmdgpb", "pythonType", -477990, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sizeInBytes = new DmcAttributeInfo("dmdgpb", "sizeInBytes", -477995, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usesDefsFrom = new DmcAttributeInfo("dmdgpb", "usesDefsFrom", -477991, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:172)
    public final static DmcTypeInfo __type_GpbArtifact = new DmcTypeInfo("GpbArtifact", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbDefinition = new DmcTypeInfo("GpbDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbEnum = new DmcTypeInfo("GpbEnum", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbField = new DmcTypeInfo("GpbField", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbFieldIndicator = new DmcTypeInfo("GpbFieldIndicator", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_GpbFieldRuleEnum = new DmcTypeInfo("GpbFieldRuleEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_GpbMessage = new DmcTypeInfo("GpbMessage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbModule = new DmcTypeInfo("GpbModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbType = new DmcTypeInfo("GpbType", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:213)
    public final static DmcClassInfo __GpbDefinition = new DmcClassInfo("GpbDefinition","org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO", -477998, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbArtifact = new DmcClassInfo("GpbArtifact","org.dmd.gpb.shared.generated.dmo.GpbArtifactDMO", -477993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbEnum = new DmcClassInfo("GpbEnum","org.dmd.gpb.shared.generated.dmo.GpbEnumDMO", -477996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbField = new DmcClassInfo("GpbField","org.dmd.gpb.shared.generated.dmo.GpbFieldDMO", -477995, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbMessage = new DmcClassInfo("GpbMessage","org.dmd.gpb.shared.generated.dmo.GpbMessageDMO", -477994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbModule = new DmcClassInfo("GpbModule","org.dmd.gpb.shared.generated.dmo.GpbModuleDMO", -477999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbType = new DmcClassInfo("GpbType","org.dmd.gpb.shared.generated.dmo.GpbTypeDMO", -477997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);

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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:296)
    static {


        __GpbDefinition.addMust(MetaDMSAG.__name);
        __GpbDefinition.addMust(MetaDMSAG.__dotName);
        __GpbDefinition.addMust(__definedInGpbModule);
        __GpbDefinition.addMay(__gpbHint);

        __GpbType.addMay(MetaDMSAG.__internallyGenerated);
        __GpbType.addMay(MetaDMSAG.__isEnumType);
        __GpbType.addMay(__isMessageType);
        __GpbType.addMay(__defaultValue);
        __GpbType.addMay(__sizeInBytes);
        __GpbType.addMay(__javaType);
        __GpbType.addMay(__cplusplusType);
        __GpbType.addMay(__pythonType);

        __GpbEnum.addMust(MetaDMSAG.__enumValue);
        __GpbEnum.addMay(__defaultValue);

        __GpbField.addMust(__gpbType);

        __GpbMessage.addMust(MetaDMSAG.__name);

        __GpbArtifact.addMust(MetaDMSAG.__name);

        __GpbModule.addMust(MetaDMSAG.__name);
        __GpbModule.addMay(MetaDMSAG.__description);
        __GpbModule.addMay(__dependsOnGpbModule);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:340)
    static {


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
