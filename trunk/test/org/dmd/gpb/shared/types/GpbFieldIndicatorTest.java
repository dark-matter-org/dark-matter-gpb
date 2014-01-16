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
		GpbFieldIndicator fi = new GpbFieldIndicator("element 5 OPTIONAL");
		
		assertNotNull("Element should be available", fi.getElement());
		assertEquals("Element should be element", "element", fi.getElement().toString());
		
		assertNotNull("Tag shouldn't be null", fi.getFieldTag());
		
		assertNotNull("Rule shouldn't be null", fi.getFieldRule());
		
		assertNull("Option should be null", fi.getOption());
		
		assertNull("Default should be null", fi.getDefaultValue());
	}
	
	@Test
	public void testMissing() throws DmcValueException{
		try{
			@SuppressWarnings("unused")
			GpbFieldIndicator fi = new GpbFieldIndicator("element 5");
			
			assertTrue("Should have thrown an exception", false);
		}
		catch (DmcValueException ex) {
			System.out.println(ex);
		}
	}
	
	@Test
	public void missingDefault() throws DmcValueException{
		try{
			GpbFieldIndicator fi = new GpbFieldIndicator("element 5 OPTIONAL  DEFAULT");
			
			assertTrue("Should have thrown an exception", false);
		}
		catch (DmcValueException ex) {
			System.out.println(ex);
		}
		
	}
	
	@Test
	public void defaultSpecified() throws DmcValueException{
		GpbFieldIndicator fi = new GpbFieldIndicator("element 5 OPTIONAL  DEFAULT 345");
			
		assertNotNull("Element should be available", fi.getElement());
		assertEquals("Element should be element", "element", fi.getElement().toString());
		
		assertNotNull("Tag shouldn't be null", fi.getFieldTag());
		
		assertNotNull("Rule shouldn't be null", fi.getFieldRule());
		
		assertNotNull("Option shouldn't be null", fi.getOption());
		
		assertNotNull("Default value shouldn't null", fi.getDefaultValue());
		assertEquals("Default should be 345", "345", fi.getDefaultValue());
		
	}
}
