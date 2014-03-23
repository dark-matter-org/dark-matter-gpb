package org.dmd.gpb.tools.parsing;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.tools.protoparsing.GpbDotProtoParser;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.StringArrayList;
import org.junit.Before;
import org.junit.Test;

public class GpbDotProtoParserTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}

	@Test
	public void testBasicFind() throws ResultException, IOException, DmcValueException, DmcNameClashException {
		StringArrayList sd = new StringArrayList();
		sd.add(workingDir + "/test/org/dmd/gpb/tools/parsing");
		GpbDotProtoParser parser = new GpbDotProtoParser(sd);
		
		parser.debug(false);
		
		parser.run();
		
		assertNotNull(parser.getConfig("config1"));
	}
	
	
}
