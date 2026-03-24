package com.vtc;

/**
 * Description of your class
 * @author David
 * @version 7.0 Build 900
 */

public class DemoJavadoc {
	
	/** Description of my field */
	public int i;
	
	/**
	 * Description of DemoJavadoc()
	 * @throws MyException description of MyException
	 */
	public DemoJavadoc() throws MyException {
		
	}
	
	
	/**
	 * Description of calculateSomething
	 * @param a Describe parameter
	 * @param b
	 * @return description of int
	 */
	public int calculateSomething(int a, int b){
		return i+a+b;
	}
	
}
