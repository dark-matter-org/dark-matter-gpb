package org.dmd.gpb.tools.generation;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;
//import static org.junit.Assert.assertEquals;

public class GpbDocGeneratorTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}
	
	@Test
	public void singleConfigTest() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
		String[] args = { "-workspace", workingDir,
							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base", "src/org/dmd/gpb/tools/generation/doc",
							"-outdir", workingDir + "/test/org/dmd/gpb/tools/generation/doc-out",
//							"-target", "ewmnbi_stats"
				};
		
		System.out.println("\n\nSingle config...\n");
		
		GpbDocGenerator generator = new GpbDocGenerator();
		
		generator.run(args);
	}
	
//	@Test
//	public void singleConfigTest2() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
//		String[] args = { "-workspace", workingDir,
//							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base",
//							"-target", "ewmnbi_inventory"
//				};
//		
//		System.out.println("\n\nSingle config...\n");
//		
//		GpbDefGenerator generator = new GpbDefGenerator(System.out);
//		
//		generator.run(args);
//	}
//	
//	@Test
//	public void singleConfigTestCommon() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
//		String[] args = { "-workspace", workingDir,
//							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base",
//							"-target", "ewmnbi_common",
////							"-genversion", "14.1",
//				};
//		
//		System.out.println("\n\nSingle config - ewmnbi_common...\n");
//		
//		GpbDefGenerator generator = new GpbDefGenerator(System.out);
//		
//		generator.run(args);
//	}
	
//	@Test
//	public void allConfigsTest() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
//		String[] args = { "-workspace", workingDir,
//							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base"
//				};
//		
//		System.out.println("\n\nAll configs...\n");
//		
//		GpbDefGenerator generator = new GpbDefGenerator(System.out);
//		
//		generator.run(args);
//	}
	
//	@Test
//	public void singleConfigTest3() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
//		String[] args = { "-workspace", workingDir,
//							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base",
//							"-target", "cgcm"
//				};
//		
//		System.out.println("\n\nSingle config...\n");
//		
//		GpbDefGenerator generator = new GpbDefGenerator(System.out);
//		
//		generator.run(args);
//	}
	

}
