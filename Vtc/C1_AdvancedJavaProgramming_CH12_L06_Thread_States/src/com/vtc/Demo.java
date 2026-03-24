package com.vtc;

public class Demo extends Thread{

	boolean waiting = true;
	boolean ready = false;

	Demo() {}

	public void run() {
		String threaddName = Thread.currentThread().getName();
		System.out.println(threaddName + " starting.");
		while (waiting){
			System.out.println("waiting:" + waiting);
		}
		System.out.println("waiting...");
		startWait();
		try {
			Thread.sleep(100);
		} catch (Exception exc) {
			System.out.println(threaddName + " interrupted.");
		}
		System.out.println(threaddName + " terminating.");
	}

	synchronized void startWait() {
		try {
			while (!ready)
				wait();
		} catch (InterruptedException exc) {
			System.out.println("wait() interrupted");
		}
	}

	synchronized void notice() {
		ready = true;
		notify();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Demo demoThread = new Demo();
		demoThread.setName("demoThread #1");
		printThreadStatus(demoThread);
		demoThread.start();
		Thread.sleep(50);
		printThreadStatus(demoThread);
		demoThread.waiting = false;
		Thread.sleep(50);
		printThreadStatus(demoThread);
		demoThread.notice();
		Thread.sleep(50);
		printThreadStatus(demoThread);
		while (demoThread.isAlive())
			System.out.println("alive");
		printThreadStatus(demoThread);
	}
	
	public static void printThreadStatus(Thread thread){
		System.out.println(thread.getName() + " Alive:"+thread.isAlive()
				+" State:"+thread.getState());
	}
}
