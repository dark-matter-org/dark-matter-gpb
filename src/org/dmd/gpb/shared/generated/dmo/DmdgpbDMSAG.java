package org.dmd.gpb.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:850)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:784)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:783)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:785)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:786)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:787)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:803)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:791)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:792)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:818)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:119)
public class DmdgpbDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmdgpb";


    static int schemaBaseID = -478000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -477950;

    public final static DmcAttributeInfo __cplusplusType = new DmcAttributeInfo("cplusplusType", -477999, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultValue = new DmcAttributeInfo("defaultValue", -477996, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedInGpbModule = new DmcAttributeInfo("definedInGpbModule", -477992, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmType = new DmcAttributeInfo("dmType", -477998, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbHint = new DmcAttributeInfo("gpbHint", -477997, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __gpbType = new DmcAttributeInfo("gpbType", -477994, "GpbType", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isMessageType = new DmcAttributeInfo("isMessageType", -477993, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sizeInBytes = new DmcAttributeInfo("sizeInBytes", -477995, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:157)
    public final static DmcTypeInfo __type_GpbAttribute = new DmcTypeInfo("GpbAttribute", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbDefinition = new DmcTypeInfo("GpbDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbDefinitionSet = new DmcTypeInfo("GpbDefinitionSet", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbEnum = new DmcTypeInfo("GpbEnum", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbMessage = new DmcTypeInfo("GpbMessage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GpbType = new DmcTypeInfo("GpbType", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:193)
    public final static DmcClassInfo __GpbDefinition = new DmcClassInfo("GpbDefinition","org.dmd.gpb.shared.generated.dmo.GpbDefinitionDMO", -477999, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __GpbAttribute = new DmcClassInfo("GpbAttribute","org.dmd.gpb.shared.generated.dmo.GpbAttributeDMO", -477996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __GpbDefinitionSet = new DmcClassInfo("GpbDefinitionSet","org.dmd.gpb.shared.generated.dmo.GpbDefinitionSetDMO", -477994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __GpbEnum = new DmcClassInfo("GpbEnum","org.dmd.gpb.shared.generated.dmo.GpbEnumDMO", -477997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __GpbMessage = new DmcClassInfo("GpbMessage","org.dmd.gpb.shared.generated.dmo.GpbMessageDMO", -477995, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __GpbType = new DmcClassInfo("GpbType","org.dmd.gpb.shared.generated.dmo.GpbTypeDMO", -477998, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__GpbDefinition,MetaDMSAG.__camelCaseName);

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

        _SmAp.put(__cplusplusType.id,__cplusplusType);
        _SmAp.put(__defaultValue.id,__defaultValue);
        _SmAp.put(__definedInGpbModule.id,__definedInGpbModule);
        _SmAp.put(__dmType.id,__dmType);
        _SmAp.put(__gpbHint.id,__gpbHint);
        _SmAp.put(__gpbType.id,__gpbType);
        _SmAp.put(__isMessageType.id,__isMessageType);
        _SmAp.put(__sizeInBytes.id,__sizeInBytes);
        _CmAp.put(__GpbAttribute.id,__GpbAttribute);
        _CmAp.put(__GpbDefinition.id,__GpbDefinition);
        _CmAp.put(__GpbDefinitionSet.id,__GpbDefinitionSet);
        _CmAp.put(__GpbEnum.id,__GpbEnum);
        _CmAp.put(__GpbMessage.id,__GpbMessage);
        _CmAp.put(__GpbType.id,__GpbType);

        __GpbDefinition.addMust(MetaDMSAG.__camelCaseName);
        __GpbDefinition.addMay(MetaDMSAG.__file);
        __GpbDefinition.addMay(MetaDMSAG.__lineNumber);
        __GpbDefinition.addMay(MetaDMSAG.__description);
        __GpbDefinition.addMay(__gpbHint);

        __GpbType.addMust(MetaDMSAG.__camelCaseName);
        __GpbType.addMust(__definedInGpbModule);
        __GpbType.addMay(MetaDMSAG.__internallyGenerated);
        __GpbType.addMay(MetaDMSAG.__isEnumType);
        __GpbType.addMay(__isMessageType);
        __GpbType.addMay(__defaultValue);
        __GpbType.addMay(__sizeInBytes);

        __GpbEnum.addMust(MetaDMSAG.__camelCaseName);
        __GpbEnum.addMust(MetaDMSAG.__enumValue);
        __GpbEnum.addMay(__defaultValue);

        __GpbAttribute.addMust(MetaDMSAG.__camelCaseName);
        __GpbAttribute.addMust(__gpbType);

        __GpbMessage.addMust(MetaDMSAG.__camelCaseName);

        __GpbDefinitionSet.addMust(MetaDMSAG.__camelCaseName);


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

