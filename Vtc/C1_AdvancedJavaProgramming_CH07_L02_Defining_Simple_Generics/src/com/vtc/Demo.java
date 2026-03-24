package com.vtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(1, "Bob");
		employeeMap.put(2, "Dorris");
		employeeMap.put(3, "Jane");

        System.out.println("forloop with Generics");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " +
                               entry.getValue());
        }
             
        
        for ( Map.Entry entry : employeeMap.entrySet() ) {
            //do something
        }
        
        for ( Integer keys : employeeMap.keySet()) {
        	//do something
        }
	}

}
