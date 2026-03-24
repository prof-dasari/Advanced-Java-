package com.vtc;

import java.util.regex.*;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		 Pattern pattern = Pattern.compile("(?i)vtc");//regex, literal string
         Matcher matcher = pattern.matcher("VTC");//string to search
		
         //find the next subsequence of the input sequence that matches the pattern
         matcher.find();
         
         String output = String.format("" +
         "found the text \"%s\" beginning at " +
         "index %d and ending at index %d.%n",
         matcher.group(),
         matcher.start(),
         matcher.end());
         
         System.out.println(output);
	}

}
