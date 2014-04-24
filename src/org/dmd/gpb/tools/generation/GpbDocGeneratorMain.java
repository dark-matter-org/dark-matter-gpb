package org.dmd.gpb.tools.generation;


public class GpbDocGeneratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GpbDocGenerator generator = new GpbDocGenerator();
		
		try {
			generator.run(args);
		} catch (Exception e) {
			System.err.println(e.toString());
			System.exit(1);
		} 
	}

}
