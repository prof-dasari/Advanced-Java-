package com.vtc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Demo {

	 static Logger logger = Logger.getLogger(Demo.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
			 
	            LogManager.getLogManager().readConfiguration(new FileInputStream(new File("C:\\temp\\logging.properties")));
	        } catch (SecurityException | IOException e1) {
	            e1.printStackTrace();
	        }
		 
	        logger.setLevel(Level.FINE);
	        logger.addHandler(new ConsoleHandler());
	     
	        for(int i=0; i<10; i++){
	        	//logging messages
	        	logger.log(Level.INFO, "Msg"+i);
	        }
	}

}
