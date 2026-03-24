package com.vtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//List
		//Vector
		Vector v = new Vector();
		v.add("1");
		v.add("2");
		for(Object s : v){
			System.out.println(s);
		}
		
		//ArrayList
		//1
		String[] colors = {"red", "blue", "white"};
		List listColors = Arrays.asList(colors);
		
		/*//2
		List randomList = new ArrayList();
		randomList.add(new Integer(1));
		randomList.add(new Double(1.5));
		randomList.add("Hello");
				
		System.out.println("\n\nRandom list");
		for(Object o : randomList){
			System.out.println(o);
		}*/
		
		List duplicates = new ArrayList();
		duplicates.add("Apple");
		duplicates.add("Banana");
		duplicates.add("Apple");
		
		Set deDup = new HashSet(duplicates);
		for(Object o : deDup){
			System.out.println(o);
		}
		
				
	}

}
