package org.dmd.gpb.tools.parsing;

import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.dmd.dmc.DmcValueException;
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
	public void testBasicFind() throws ResultException, IOException, DmcValueException {
		StringArrayList sd = new StringArrayList();
		sd.add(workingDir + "/test/org/dmd/gpb/tools/parsing");
		GpbDotProtoParser parser = new GpbDotProtoParser(sd);
		parser.debug(true);
		
		parser.run();
		
		Assert.assertNotNull(parser.getConfig("config1"));
	}
	
	
}
