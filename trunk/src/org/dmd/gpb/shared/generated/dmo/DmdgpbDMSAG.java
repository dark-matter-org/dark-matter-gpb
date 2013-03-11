package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:860)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:794)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:793)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:795)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:796)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:801)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:802)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:807)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:828)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:124)
public class DmdgpbDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmdgpb";


    static int schemaBaseID = -478000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -477950;

    public final static DmcAttributeInfo __basedOnEnum = new DmcAttributeInfo("basedOnEnum", -477988, "EnumDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __cplusplusType = new DmcAttributeInfo("cplusplusType", -477999, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultValue = new DmcAttributeInfo("defaultValue", -477996, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedInGpbModule = new DmcAttributeInfo("definedInGpbModule", -477992, "GpbModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmType = new DmcAttributeInfo("dmType", -477998, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbHint = new DmcAttributeInfo("gpbHint", -477997, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbType = new DmcAttributeInfo("gpbType", -477994, "GpbType", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isMessageType = new DmcAttributeInfo("isMessageType", -477993, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __javaType = new DmcAttributeInfo("javaType", -477989, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __pythonType = new DmcAttributeInfo("pythonType", -477990, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sizeInBytes = new DmcAttributeInfo("sizeInBytes", -477995, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usesDefsFrom = new DmcAttributeInfo("usesDefsFrom", -477991, "GpbModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static DmcTypeInfo __type_GpbArtifact = new DmcTypeInfo("GpbArtifact", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbDefinition = new DmcTypeInfo("GpbDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbEnum = new DmcTypeInfo("GpbEnum", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbField = new DmcTypeInfo("GpbField", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbFieldIndicator = new DmcTypeInfo("GpbFieldIndicator", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_GpbFieldRuleEnum = new DmcTypeInfo("GpbFieldRuleEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_GpbMessage = new DmcTypeInfo("GpbMessage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbModule = new DmcTypeInfo("GpbModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbType = new DmcTypeInfo("GpbType", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:203)
    public final static DmcClassInfo __GpbDefinition = new DmcClassInfo("GpbDefinition","org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO", -477999, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbArtifact = new DmcClassInfo("GpbArtifact","org.dmd.gpb.shared.generated.dmo.GpbArtifactDMO", -477993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbEnum = new DmcClassInfo("GpbEnum","org.dmd.gpb.shared.generated.dmo.GpbEnumDMO", -477997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbField = new DmcClassInfo("GpbField","org.dmd.gpb.shared.generated.dmo.GpbFieldDMO", -477996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbMessage = new DmcClassInfo("GpbMessage","org.dmd.gpb.shared.generated.dmo.GpbMessageDMO", -477995, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbModule = new DmcClassInfo("GpbModule","org.dmd.gpb.shared.generated.dmo.GpbModuleDMO", -477994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __GpbType = new DmcClassInfo("GpbType","org.dmd.gpb.shared.generated.dmo.GpbTypeDMO", -477998, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__name);

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

        _SmAp.put(__basedOnEnum.id,__basedOnEnum);
        _SmAp.put(__cplusplusType.id,__cplusplusType);
        _SmAp.put(__defaultValue.id,__defaultValue);
        _SmAp.put(__definedInGpbModule.id,__definedInGpbModule);
        _SmAp.put(__dmType.id,__dmType);
        _SmAp.put(__gpbHint.id,__gpbHint);
        _SmAp.put(__gpbType.id,__gpbType);
        _SmAp.put(__isMessageType.id,__isMessageType);
        _SmAp.put(__javaType.id,__javaType);
        _SmAp.put(__pythonType.id,__pythonType);
        _SmAp.put(__sizeInBytes.id,__sizeInBytes);
        _SmAp.put(__usesDefsFrom.id,__usesDefsFrom);
        _CmAp.put(__GpbArtifact.id,__GpbArtifact);
        _CmAp.put(__GpbDefinition.id,__GpbDefinition);
        _CmAp.put(__GpbEnum.id,__GpbEnum);
        _CmAp.put(__GpbField.id,__GpbField);
        _CmAp.put(__GpbMessage.id,__GpbMessage);
        _CmAp.put(__GpbModule.id,__GpbModule);
        _CmAp.put(__GpbType.id,__GpbType);

        __GpbDefinition.addMust(MetaDMSAG.__name);
        __GpbDefinition.addMust(MetaDMSAG.__dotName);
        __GpbDefinition.addMay(MetaDMSAG.__file);
        __GpbDefinition.addMay(MetaDMSAG.__lineNumber);
        __GpbDefinition.addMay(MetaDMSAG.__description);
        __GpbDefinition.addMay(__gpbHint);

        __GpbType.addMust(__definedInGpbModule);
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

