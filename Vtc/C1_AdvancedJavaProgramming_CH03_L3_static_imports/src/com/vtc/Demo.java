package com.vtc;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//without Static import
		System.out.println("Maximum value of Integer:"  + Integer.MAX_VALUE);
		System.out.println("Minimum value of Integer:" + Integer.MIN_VALUE);
		
		System.out.println("Maximum value of Integer using static import:" + MAX_VALUE);
		System.out.println("Minimum value of Integer using static import:" + MIN_VALUE);

	}

}
