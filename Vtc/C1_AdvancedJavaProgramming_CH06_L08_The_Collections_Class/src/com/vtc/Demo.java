package com.vtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s = {"mat","hat","cat"};
		
		List myList = Arrays.asList(s);
		
		Collections.sort(myList);
		System.out.println("sorted: "+myList);
		
		Collections.reverse(myList);
		System.out.println("reversed: "+myList);
		
		Collections.shuffle(myList);
		System.out.println("shuffle: "+myList);
		
		String[] copy = new String[3];
		List listCopy = Arrays.asList(copy);
		Collections.copy(listCopy, myList);
		System.out.println("copy: "+listCopy);
		
		Collections.fill(myList, "vtc");
		System.out.println("fill: "+myList);
	}

}
