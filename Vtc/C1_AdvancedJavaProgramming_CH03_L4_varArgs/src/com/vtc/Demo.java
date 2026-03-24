package com.vtc;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		methodVarArgs(2,3);
		methodVarArgs(5,4,7,3);
		
		//using with Class String
		appendString("Hi!","How","Are","You");
		
		System.out.println("Average Number of User ="+calcAverage(1,4,6));
		System.out.println("Average Number of User ="+calcAverage(7,100));
		
	}
	
	public static int methodNormal(int a, int b){
		return a+b;
	}

	public static int methodVarArgs(int...a){
		int total = 0;
		for(int i=0; i<a.length; i++){
			total += a[i];
		}
		System.out.println("total="+total);
		return total;
	}
		
	public static void appendString(String...s){
		StringBuffer stbr = new StringBuffer();
		
		for(String x : s){
			stbr.append(x);
			stbr.append(" ");
		}
		System.out.println(stbr);
	}
	
	public static double calcAverage(double... numberOfUsersPerHour)
	{
		double totalUsers = 0.0; // initialize total

		// calculate total using the enhanced for statement
		for(double x: numberOfUsersPerHour){
			totalUsers += x;
		}

		return totalUsers / numberOfUsersPerHour.length;
	}
	
		
}
