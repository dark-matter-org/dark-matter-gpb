package org.dmd.gpb.singlefile;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.gpb.tools.gpbgen.GpbGenUtility;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.junit.Test;

public class SingleFileTest {
	
	@Test
	public void testHelp() throws IOException, ResultException, DmcValueException, DmcValueExceptionSet, DmcRuleExceptionSet{
		DebugInfo.debug("\n\n*** testHelp");
		String[] args = { "-h" };
		
		GpbGenUtility	gen = new GpbGenUtility(args);
		
		gen.run();
	}
	
	@Test
	public void testNoArgs() throws IOException, ResultException, DmcValueException, DmcValueExceptionSet, DmcRuleExceptionSet{
		DebugInfo.debug("\n\n*** testNoArgs");
		String[] args = { };
		
		GpbGenUtility	gen = new GpbGenUtility(args);
		
		gen.run();
	}
	
//	@Test
//	public void testModuleParse2() throws IOException, ResultException, DmcValueException, DmcValueExceptionSet{
//		String ws = getWorkspace();
//		String[] args = {"-workspace", ws };
//		
//		GpbGenUtility	gen = new GpbGenUtility(args);
//		
//
//	}
	
	String getWorkspace() throws IOException{
        File curr = new File(".");
        String runDir;
		runDir = curr.getCanonicalPath();
		return(runDir);
	}

}
