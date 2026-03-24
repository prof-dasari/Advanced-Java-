package com.vtc;

public class Demo extends Object implements Runnable {

	public void run() {
		System.out.println("entering run()");

		try {
			System.out.println("in run() - currentThread()="
					+ Thread.currentThread());

			while (true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException x) {
				}

				System.out.println("in run() - woke up again");

			}
		} finally {
			System.out.println("leaving run()");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo daemonThread = new Demo();

		System.out.println("entering main()");

		Thread t = new Thread(daemonThread);
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException x) {
		}

		System.out.println("leaving main()");
	}
}