package com.vtc;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Valid
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(5);
		numbers.add(7.1);
		System.out.println("numbers="+numbers.toString());
		
		
		//Invalid
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		integers.add(3);
		
		numbers = integers;
		nums.add(7.1);
		
	}

}
