package org.dmd.gpb.singlefile;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.gpb.tools.gpbgen.GpbGenUtility;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;
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
	
	@Test
	public void testFindConfigs() throws IOException, ResultException, DmcValueException, DmcValueExceptionSet, DmcRuleExceptionSet{
		DebugInfo.debug("\n\n*** testFindConfigs");
		String ws = getWorkspace();
		String[] args = {"-workspace", ws , "-srcdir", "test/org/dmd/gpb/singlefile"};
		
		GpbGenUtility	gen = new GpbGenUtility(args);
		
		Iterator<ConfigLocation> locations = gen.getFinder().getLocations();
		
		while(locations.hasNext()){
			ConfigLocation location = locations.next();
			System.out.println(location.toString());
			assertEquals("Expecting the test1.gpb config","test1", location.getConfigName());
		}
	}

	@Test
	public void testParseConfig() throws IOException, ResultException, DmcValueException, DmcValueExceptionSet, DmcRuleExceptionSet{
		DebugInfo.debug("\n\n*** testParseConfig");
		String ws = getWorkspace();
		String[] args = {"-workspace", ws , "-srcdir", "test/org/dmd/gpb/singlefile", "-autogen"};
		
		GpbGenUtility	gen = new GpbGenUtility(args);
		
		gen.run();
	}

	
	String getWorkspace() throws IOException{
        File curr = new File(".");
        String runDir;
		runDir = curr.getCanonicalPath();
		return(runDir);
	}

}
