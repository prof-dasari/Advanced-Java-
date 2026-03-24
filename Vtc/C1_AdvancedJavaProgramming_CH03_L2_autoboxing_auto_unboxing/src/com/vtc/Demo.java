package com.vtc;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Autoboxing Examples
		List<Integer> listIntegers = new ArrayList<>();
		for (int i = 1; i < 10; i += 2)
			listIntegers.add(Integer.valueOf(i));
		
        //Unboxing through assignment
        int firstInt = listIntegers.get(0);
        System.out.println("first Integer in List = " + firstInt);
	
	}
	
	public static int sumEven(List<Integer> listIntegers) {
	    int sum = 0;
	    for (Integer i: listIntegers)
	        if (i % 2 == 0)
	            sum += i.intValue();
	        return sum;
	}


}
