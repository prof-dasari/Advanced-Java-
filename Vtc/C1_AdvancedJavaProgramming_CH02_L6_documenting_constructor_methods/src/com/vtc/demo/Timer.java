package com.vtc.demo;

public class Timer {
	String time; 
	boolean alarmOn;
	
	/**
	 * The Default Behavior of this Object is...
	 * <ul>
	 * <li>time is initialized to 12am</li>
	 * <li>alarmOn is initialized to false</li>
	 * </ul>
	 */
	public Timer() {
		time = "12:00am";
		alarmOn = false;
	}
	
	/**
	 * Calculates the ...
	 * @param a the value of a
	 * @param b the value of b
	 * @return a negative, zero, or positive integer
	 * @throws Exception
	 * @author Bob
	 */
	public static int calcInt(int a, int b) throws Exception {
		return a+b;
	}
	
	/**
	 * @deprecated As of release 1.8.1, replaced by {@link #getMyMethod()}
	 * @return
	 */
	public int myMethod(){
		return getMyMethod();
	}
	
	public int getMyMethod(){
		return 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
