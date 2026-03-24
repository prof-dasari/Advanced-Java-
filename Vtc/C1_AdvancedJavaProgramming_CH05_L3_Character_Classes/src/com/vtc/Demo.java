package com.vtc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[0-5&&[^345]]");//regex, literal string
        Matcher matcher = pattern.matcher("123456789");//string to search
        
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
