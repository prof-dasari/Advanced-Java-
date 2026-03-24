package com.vtc;

import java.util.Date;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String.format "%[argument number] [flags] [width] [.precision] type"
		
		String s = String.format("%,10.2f", 7.123);
		
		//1
		String formattedString = String.format("Order with Order# : %d and Quantity: %d is Ready", 40021, 3000);
		System.out.println(formattedString);

		//2
		String str = String.format("Hi %s", "VTC!");
		System.out.println(str);

		//3
		str = String.format("Today is %tD", new Date());
		System.out.println(str);

		//4
		String p1 = String.format("positive number : +%d %n", 659874235);
		System.out.println(p1);
		String p2 = String.format("negative number : -%d %n", 345628);
		System.out.println(p2);

		//5
		String strFloat = String.format("%f %n", Math.E);
		System.out.println(strFloat);

		//6
		String strDecimal = String.format("%.3f %n", Math.E);
		System.out.println(strDecimal);

		//7
		String strS = String.format("%8.3f %n", Math.E);
		System.out.println(strS);

		//8
		String message = String.format("Total %,d orders processed today", 60000000);
		System.out.println(message);

		
	}
}
