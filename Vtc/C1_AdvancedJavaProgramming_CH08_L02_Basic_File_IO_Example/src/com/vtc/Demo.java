package com.vtc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// intro
		File[] roots = File.listRoots();
		for (File root : roots)
			System.out.println(root);

		File file1 = new File("/y/z"); // Unix or Linux
		File file = new File("C:\\temp\\a.dat");// Windows

		// write
		try{
			boolean exist = file.createNewFile();
			FileWriter fstream = new FileWriter(file);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write("Hello VTC");
			out.close();
			System.out.println("File created successfully.");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		//File Info
		System.out.println("About " + file + ":");
		System.out.println("Can execute = " + file.canExecute());
		System.out.println("Can read = " + file.canRead());
		System.out.println("Can write = " + file.canWrite());
		System.out.println("Exists = " + file.exists());
		System.out.println("Is directory = " + file.isDirectory());
		System.out.println("Is file = " + file.isFile());
		System.out.println("Is hidden = " + file.isHidden());
		System.out.println("Last modified = " + new Date(file.lastModified()));
		System.out.println("Length = " + file.length());

		// read
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println("Contents of File: " + line + "\n");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (file != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// Ignore issues during closing
				}
			}
		}
	}
}
