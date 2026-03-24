package com.vtc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {

	private static final Logger logger = Logger.getLogger(Demo.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Logging an INFO-level message");
		logger.severe("Logging an SEVERE-level message");
		logger.warning("Logging an WARNING-level message");
				
		try{
			throw new Exception("My Exception");
		}catch(Exception ex){
			logger.log(Level.SEVERE, "Logging in Catch Block", ex);
			
		}
		
	}

}
