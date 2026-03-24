package com.vtc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   User u1 = new User(100,"ted","ted@teddy.com");
		   User u2 = new User(100,"ted","ted@teddy.com");

	        System.out.println("User's equals : "+u1.equals(u2));

	        Map users = new HashMap();
	        users.put(u1,u1);
	        users.put(u2,u2);
	        System.out.println("Contents of Hashmap="+users);
	        System.out.println("Hashmap Size="+users.size());
	}
}