package com.vtc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1
		User user = new User();
		user.setId(1);
		user.setName("Mozart");
		user.setPassword("mySuperSecretPass!@");

		System.out.println("User has been set with data = "+user);
		//Serializing an Object:
		try {
			FileOutputStream fileOut = new FileOutputStream("user.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(user);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
		
		//2
		user = null;
		System.out.println("User has been erased = "+user);

		//Deserializing an Object
		try {
			FileInputStream fileIn = new FileInputStream("user.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			user = (User) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("User class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println("User has been Reconstituted = "+user);
	}

}
