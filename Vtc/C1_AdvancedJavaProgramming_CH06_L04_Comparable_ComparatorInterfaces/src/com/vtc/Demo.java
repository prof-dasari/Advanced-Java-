package com.vtc;

import java.util.Arrays;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User[] users = { 
				new User(3, "Bob"), 
				new User(5, "Joe"),
				new User(1, "Lisa"), };
		
		//Comparable
		System.out.println("Comparable");
		Arrays.sort(users); // Sort using Comparable method

		for (User user : users) {
			System.out.println(user);
		}
				
		//Comparator
		System.out.println("\n\nComparator");
		Arrays.sort(users, new UserSortByName());
		
		for (User user : users) {
			System.out.println(user);
		}
	}

}
