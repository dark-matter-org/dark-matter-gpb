package org.dmd.gpb.shared.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.dmd.gpb.shared.generated.enums.OptionEnum;
import org.dmd.gpb.shared.generated.types.GpbFieldIndicatorWithVersion;
import org.junit.Test;

public class GpbFieldIndicatorWithVersionTest {
	
//	OPTIONAL field 5 default="hi there" version=1.0.1.3 obsolete=2.0 concinnity:
	
	

	@Test
	public void testBasic() throws DmcValueException{
		GpbFieldIndicatorWithVersion fi = new GpbFieldIndicatorWithVersion("OPTIONAL : element : 5 : DEFAULT : 345 : 1.0.0 : 2.0.1.3 ");
		
		assertNotNull("Rule shouldn't be null", fi.getFieldRule());
		
		assertNotNull("Field should be available", fi.getFieldRef());
		
		assertEquals("Field should be element", "element", fi.getFieldRef().toString());
		
		assertEquals("Option should be DEFAULT", OptionEnum.DEFAULT , fi.getOption());

		assertEquals("Value should be 345", "345", fi.getDefaultValue());

		assertEquals("Introduced version should be 1.0.0", "1.0.0", fi.getIntroducedVersion());

		assertEquals("Obsolete version should be 2.0.1.3", "2.0.1.3", fi.getObsoleteVersion());

//		assertNull("Option should be null", fi.getOption());
//		
//		assertNull("Default should be null", fi.getDefaultValue());
	}
	
	@Test
	public void testMissing() throws DmcValueException{
		try{
			@SuppressWarnings("unused")
			GpbFieldIndicatorWithVersion fi = new GpbFieldIndicatorWithVersion("element:5");
			
			assertTrue("Should have thrown an exception", false);
		}
		catch (DmcValueException ex) {
			System.out.println(ex);
		}
	}
	
	@Test
	public void missingDefault() throws DmcValueException{
		try{
			@SuppressWarnings("unused")
			GpbFieldIndicatorWithVersion fi = new GpbFieldIndicatorWithVersion("OPTIONAL:element:	5:DEFAULT");
			
			assertTrue("Should have thrown an exception", false);
		}
		catch (DmcValueException ex) {
			System.out.println(ex);
		}
		
	}
	
	@Test
	public void defaultSpecified() throws DmcValueException{
		GpbFieldIndicator fi = new GpbFieldIndicator("OPTIONAL:element:5:DEFAULT:345");
			
		assertNotNull("Field should be available", fi.getFieldRef());
		assertEquals("Field should be element", "element", fi.getFieldRef().toString());
		
		assertNotNull("Tag shouldn't be null", fi.getFieldTag());
		
		assertNotNull("Rule shouldn't be null", fi.getFieldRule());
		
		assertNotNull("Option shouldn't be null", fi.getOption());
		
		assertNotNull("Default value shouldn't null", fi.getDefaultValue());
		assertEquals("Default should be 345", "345", fi.getDefaultValue());
		
	}
}
