package org.dmd.gpb.tools.generation;

import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.util.exceptions.ResultException;

public class GpbDefGeneratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GpbDefGenerator gen = new GpbDefGenerator();
		
		try {
			gen.run(args);
		} catch (ResultException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		} catch (DmcValueException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		} catch (DmcRuleExceptionSet e) {
			System.err.println(e.toString());
			e.printStackTrace();
		} catch (DmcNameClashException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		} catch (DmcValueExceptionSet e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}

	}

}
