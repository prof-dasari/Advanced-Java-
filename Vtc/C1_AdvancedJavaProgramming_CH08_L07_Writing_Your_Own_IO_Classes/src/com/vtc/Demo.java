package com.vtc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Adler32 outChecker = new Adler32();
		CheckedOutputStream out = null;
		String content = "Hello VTC";
		try {
			out = new CheckedOutputStream(new FileOutputStream("C:\\temp\\aCheckSumFile.dat"),outChecker);
			
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();
		 
			out.write(contentInBytes);
		 
			System.out.println("Done");
		    System.out.println("Output stream check sum: " + outChecker.getValue());
		    
		    out.flush();
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
