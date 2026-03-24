package com.vtc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Properties propOut = new Properties();
    	try {
    		//Write
    		//set the properties value
    		propOut.setProperty("database", "localhost");
    		propOut.setProperty("dbuser", "vtc");
    		propOut.setProperty("dbpassword", "superSecretSauce");
 
    		//save properties to project root folder
    		propOut.store(new FileOutputStream("c:\\temp\\config.properties"), null);
    		propOut = null;

    		//Read
    		Properties propIn = new Properties();
    		//load a properties file
    		propIn.load(new FileInputStream("c:\\temp\\config.properties"));
 
            //get the property value and print it out
            System.out.println("database prop="+propIn.getProperty("database"));
    		System.out.println("dbuser prop="+propIn.getProperty("dbuser"));
    		System.out.println("dbpassword prop="+propIn.getProperty("dbpassword"));
    		
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }	
	}
}