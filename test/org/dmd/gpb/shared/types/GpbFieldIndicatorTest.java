package org.dmd.gpb.shared.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class GpbFieldIndicatorTest {

	@Test
	public void testBasic() throws DmcValueException{
		GpbFieldIndicator fi = new GpbFieldIndicator("OPTIONAL element 5");
		
		assertNotNull("Field should be available", fi.getFieldRef());
		assertEquals("Field should be element", "element", fi.getFieldRef().toString());
		
		assertNotNull("Tag shouldn't be null", fi.getFieldTag());
		
		assertNotNull("Rule shouldn't be null", fi.getFieldRule());
		
		assertNull("Option should be null", fi.getOption());
		
		assertNull("Default should be null", fi.getDefault());
	}
	
	@Test
	public void testMissing() throws DmcValueException{
		try{
			@SuppressWarnings("unused")
			GpbFieldIndicator fi = new GpbFieldIndicator("element 5");
			
			assertTrue("Should have thrown an exception", false);
		}
		catch (DmcValueException ex) {
			System.out.println("Expected exception:\n" + ex);
		}
	}
	
	@Test
	public void missingDefault() throws DmcValueException{
		try{
			@SuppressWarnings("unused")
			GpbFieldIndicator fi = new GpbFieldIndicator("OPTIONAL element 5 DEFAULT");
			
			assertTrue("Should have thrown an exception", false);
		}
		catch (DmcValueException ex) {
			System.out.println("Expected exception:\n" + ex);
		}
		
	}
	
	@Test
	public void defaultSpecified() throws DmcValueException{
		GpbFieldIndicator fi = new GpbFieldIndicator("OPTIONAL element 5 default=345");
			
		assertNotNull("Field should be available", fi.getFieldRef());
		assertEquals("Field should be element", "element", fi.getFieldRef().toString());
		
		assertNotNull("Tag shouldn't be null", fi.getFieldTag());
		
		assertNotNull("Rule shouldn't be null", fi.getFieldRule());
		
		assertNotNull("Default value shouldn't be null", fi.getDefault());
		assertEquals("Default should be 345", "345", fi.getDefault());
		
	}
}
