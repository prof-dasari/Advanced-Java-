package com.vtc;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myListInteger = new ArrayList<Integer>();
		myListInteger.add(1);
		myListInteger.add(2);
		myListInteger.add(3);
		
		printList(myListInteger);
		
		List<String> myListString = new ArrayList<String>();
		myListString.add("#1 String");
		myListString.add("#2 String");
		myListString.add("#3 String");
		
		printList(myListString);
			
	}

	public static void printList(List<?> list) {
	    for(int i=0, n=list.size(); i < n; i++) {
	        if (i > 0) System.out.print(", ");
	        Object o = list.get(i);
	        System.out.print(o.toString());
	    }
	    System.out.print("\n");
	}
	
}
