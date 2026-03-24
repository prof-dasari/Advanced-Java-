package com.vtc;

import java.util.logging.Logger;

public class Demo {

	private static final Logger logger = Logger.getLogger(Demo.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean debug = false;
		if (debug)
			System.out.println("Debug info.");
		
		logger.info("Logging an INFO-level message");
	}
}
