package com.vtc;

import java.util.Arrays;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*int[] anArray = {2, 4, 6};
		System.out.println(Arrays.toString(anArray));
		System.out.println(anArray);*/
		

		/*// create an array of strings
		String fruits[] = new String[] { "apple", "pear", "peach"};
		List fruitsList = Arrays.asList(fruits);
		
		// to check for existence in a "set"
		if (fruitsList.contains("apple")) {
			System.out.println("Yes Contains Apple!");
		}
*/		

		/*String fruits[] = new String[] { "apple", "pear", "peach"};
		String[] copyTo = Arrays.copyOfRange(fruits, 0, 2);
		System.out.println(Arrays.toString(copyTo));*/
		
		
		int array[] = new int[3];
		Arrays.fill(array, 10);
		for (int i : array) {
			System.out.println(i);
		}

	}

}
