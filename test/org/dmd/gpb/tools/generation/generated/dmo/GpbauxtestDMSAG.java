package org.dmd.gpb.tools.generation.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1079)
import java.util.ArrayList;                               // For storage of schema info - (DmoCompactSchemaFormatter.java:1013)
import java.util.HashMap;                                 // For storage of schema info - (DmoCompactSchemaFormatter.java:1012)
import java.util.Iterator;                                // For access of schema info - (DmoCompactSchemaFormatter.java:1014)
import org.dmd.dmc.*;                                     // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1015)
import org.dmd.dmc.rules.RuleIF;                          // For rule info - (DmoCompactSchemaFormatter.java:1016)
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions - (DmoCompactSchemaFormatter.java:1020)
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1021)
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions - (DmoCompactSchemaFormatter.java:1047)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:137)
public class GpbauxtestDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "gpbauxtest";


    static int schemaBaseID = -479000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -478950;

    public final static DmcAttributeInfo __otherInfo = new DmcAttributeInfo("gpbauxtest", "otherInfo", -478999, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __units = new DmcAttributeInfo("gpbauxtest", "units", -478998, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:224)
    public final static DmcClassInfo __GpbTestAuxInfo = new DmcClassInfo("GpbTestAuxInfo","org.dmd.gpb.tools.generation.generated.dmo.GpbTestAuxInfoDMO", -478999, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);

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

        GpbauxtestDMSAGAMAP.initSmAp(_SmAp);

        GpbauxtestDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:307)
    static {


        __GpbTestAuxInfo.addMay(__otherInfo);
        __GpbTestAuxInfo.addMay(__units);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:351)
    static {


    }

    static  GpbauxtestDMSAG instance;

    protected GpbauxtestDMSAG (){
    }

    public synchronized static GpbauxtestDMSAG instance(){
        if (instance == null)
            instance = new GpbauxtestDMSAG();
        
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

