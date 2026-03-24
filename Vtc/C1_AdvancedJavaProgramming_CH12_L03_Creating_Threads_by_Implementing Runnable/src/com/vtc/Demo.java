package com.vtc;

public class Demo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Runs runs = new Runs(); // class object
		Thread runThread = new Thread(runs); // creating thread object and giving
											// reference of class object to
											// thread object
		runThread.start();
		System.out.println("End of main Thread");
	}
	
	private static class Runs implements Runnable {
		public void run() {
			System.out.println("Inside Runs thread");
			for (int i = 1; i <= 10; i++) {
				System.out.println("From runThread i = " + i);
			}
			System.out.println("Exit from Runs");
		}
	}
}