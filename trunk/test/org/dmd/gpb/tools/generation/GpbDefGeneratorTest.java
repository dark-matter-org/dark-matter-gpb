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

public class GpbDefGeneratorTest {

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
							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base",
							"-target", "ewmnbi_stats"
				};
		
		System.out.println("\n\nSingle config...\n");
		
		GpbDefGenerator generator = new GpbDefGenerator(System.out);
		
		generator.run(args);
	}
	
	@Test
	public void allConfigsTest() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {
		String[] args = { "-workspace", workingDir,
							"-srcdir", "test/org/dmd/gpb/tools/generation", "src/org/dmd/gpb/base"
				};
		
		System.out.println("\n\nAll configs...\n");
		
		GpbDefGenerator generator = new GpbDefGenerator(System.out);
		
		generator.run(args);
	}
}
