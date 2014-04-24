package org.dmd.gpb.tools.generation;


public class GpbDefGeneratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GpbDefGenerator gen = new GpbDefGenerator();
		
		try {
			gen.run(args);
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		}
	}

}
