package com.vtc;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Debugging without Assertions
		int a = 0;
		while (true) {
		   if ( a> 1) {
			  System.out.println("Code correctly Executing.  Going to Break");
		      break;
		   }
		   assert false : "Code Execution should not reach here, Something wrong. A =" + a;
		   //System.out.println("Code Execution should not reach here, Something wrong. A =" + a);
		   break;
		}
		
		int x = 3;
		assert (x>0) : "Asserting Internal Invariants, X";
											
	}

	public static void assertionExample(int a){
		assert a > 0 && a <= 100;
		
		int b = a + 2;//method logic
		
		assert b > a;
	}
}
