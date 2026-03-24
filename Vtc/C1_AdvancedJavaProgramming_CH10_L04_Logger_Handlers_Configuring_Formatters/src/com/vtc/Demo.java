package com.vtc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

public class Demo {

	private static final Logger logger = Logger.getLogger(Demo.class.getName());

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\temp\\log.log");
		FileOutputStream fos = new FileOutputStream(file); 
		
		StreamHandler handler = new StreamHandler(fos,new Formatter(){
			public String format(LogRecord record){
				return record.getLevel() + " : "
						+ record.getSourceClassName() + " -:- "
						+ record.getSourceMethodName() + " -:- "
						+ record.getMessage() + "\n";
			}});
		
		logger.addHandler(handler);
		logger.info("Hello VTC!");
		
	}

}
