package com.temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create 3 files
		File[] files = {new File("C:\\temp\\1.dat"),
				new File("C:\\temp\\2.dat"),
				new File("C:\\temp\\3.dat")};
				
		// 1 Zip
		try {
			String zipFile = "C:\\temp\\zip-vtc.zip";
			//String[] sourceFiles = { "C:/sourcefile1.doc", "C:/sourcefile2.doc" };
			// create byte buffer
			byte[] buffer = new byte[1024];

			/*
			 * To create a zip file, use
			 * 
			 * ZipOutputStream(OutputStream out) constructor of ZipOutputStream
			 * class.
			 */
			// create object of FileOutputStream
			FileOutputStream fout = new FileOutputStream(zipFile);

			// create object of ZipOutputStream from FileOutputStream
			ZipOutputStream zout = new ZipOutputStream(fout);

			for(File file : files){
			//for (int i = 0; i < sourceFiles.length; i++) {
				//System.out.println("Adding " + sourceFiles[i]);
			    System.out.println("Adding " + file);
				// create object of FileInputStream for source file
				//FileInputStream fin = new FileInputStream(sourceFiles[i]);
			    FileInputStream fin = new FileInputStream(file);
			    
				/*
				 * To begin writing ZipEntry in the zip file, use
				 * 
				 * void putNextEntry(ZipEntry entry) method of ZipOutputStream
				 * class.
				 * 
				 * This method begins writing a new Zip entry to the zip file
				 * and positions the stream to the start of the entry data.
				 */
				//zout.putNextEntry(new ZipEntry(sourceFiles[i]));
			    zout.putNextEntry(new ZipEntry(file.getName()));

				/*
				 * After creating entry in the zip file, actually write the
				 * file.
				 */
				int length;
				while ((length = fin.read(buffer)) > 0) {
					zout.write(buffer, 0, length);
				}

				/*
				 * After writing the file to ZipOutputStream, use
				 * 
				 * void closeEntry() method of ZipOutputStream class to close
				 * the current entry and position the stream to write the next
				 * entry.
				 */
				zout.closeEntry();
				// close the InputStream
				fin.close();
			}

			// close the ZipOutputStream
			zout.close();
			System.out.println("Zip file has been created!");
		} catch (IOException ioe) {
			System.out.println("IOException :" + ioe);
		}

		// 2 Unzip

		// Delete all three files
		

		
		/*// 1 Zip Recursively
		String sourceDir = "C:/examples";
		String zipFile = "C:/FileIO/zipdemo.zip";

		try {
			// create object of FileOutputStream
			FileOutputStream fout = new FileOutputStream(zipFile);
			// create object of ZipOutputStream from FileOutputStream
			ZipOutputStream zout = new ZipOutputStream(fout);
			// create File object from source directory
			File fileSource = new File(sourceDir);
			addDirectory(zout, fileSource);
			// close the ZipOutputStream
			zout.close();
			System.out.println("Zip file has been created!");
		} catch (IOException ioe) {
			System.out.println("IOException :" + ioe);
		}*/
	}

	/*private static void addDirectory(ZipOutputStream zout, File fileSource) {
		// get sub-folder/files list
		File[] files = fileSource.listFiles();
		System.out.println("Adding directory " + fileSource.getName());

		for (int i = 0; i < files.length; i++) {
			// if the file is directory, call the function recursively
			if (files[i].isDirectory()) {
				addDirectory(zout, files[i]);
				continue;
			}
			
			 * we are here means, its file and not directory, so add it to the
			 * zip file
			 
			try {
				System.out.println("Adding file " + files[i].getName());
				// create byte buffer
				byte[] buffer = new byte[1024];
				// create object of FileInputStream
				FileInputStream fin = new FileInputStream(files[i]);
				zout.putNextEntry(new ZipEntry(files[i].getName()));

				
				 * After creating entry in the zip file, actually write the
				 * file.
				 
				int length;
				while ((length = fin.read(buffer)) > 0) {
					zout.write(buffer, 0, length);
				}
				
				 * After writing the file to ZipOutputStream, use
				 * 
				 * void closeEntry() method of ZipOutputStream class to close
				 * the current entry and position the stream to write the next
				 * entry.
				 
				zout.closeEntry();

				// close the InputStream
				fin.close();
			} catch (IOException ioe) {
				System.out.println("IOException :" + ioe);
			}
		}
	}
*/
	/*
	 * Unzip it
	 * @param zipFile input zip file
	 * @param output zip file output folder
	 */
	public void unZipIt(String zipFile, String outputFolder) {
		byte[] buffer = new byte[1024];

		try {
			// create output directory is not exists
			File folder = new File("OUTPUT_FOLDER");
			if (!folder.exists()) {
				folder.mkdir();
			}

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipFile));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();

			while (ze != null) {

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator
						+ fileName);

				System.out.println("file unzip : " + newFile.getAbsoluteFile());

				// create all non exists folders
				// else you will hit FileNotFoundException for compressed folder
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();

			System.out.println("Done");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
