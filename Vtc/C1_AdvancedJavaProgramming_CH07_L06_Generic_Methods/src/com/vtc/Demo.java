package com.vtc;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] ints = {1, 2};
		Character[] chars = {'A', 'B', 'C'};
		
		System.out.println("Array containing ints:");
		printAnyArray(ints);
		
		System.out.println("\nArray containing chars:");
		printAnyArray(chars);
		
	}

	   public static < E > void printAnyArray( E[] anArray )
	   {
	         for ( E element : anArray ){        
	            System.out.println("Element="+element );
	         }
	    }
	
}
