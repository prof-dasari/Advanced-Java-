package com.vtc;

public class Demo extends Thread {     
    public void run() {     
        for ( int i = 0; i < 5; i++ ) {     
             System.out.println("Another Thread");     
          }     
    }     

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo anotherThread = new Demo();
		anotherThread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Demo Thread");
		}
	}

}
