package com.vtc;

public class Demo extends Thread {
	static String message[] = { "VTC and Java", "are", "hot,", "rock,", "and",
			"inspiring." };

	public Demo(String id) {
		super(id);
	}

	public void run() {
		displayList(getName(), message);
	}

	void randomWait() {
		try {
			sleep((long) (3000 * Math.random()));
		} catch (InterruptedException x) {
			System.out.println("Interrupted!");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Demo thread1 = new Demo("thread1: ");
		Demo thread2 = new Demo("thread2: ");
		thread1.start();
		thread2.start();
		boolean thread1IsAlive = true;
		boolean thread2IsAlive = true;

		do {
			if (thread1IsAlive && !thread1.isAlive()) {
				thread1IsAlive = false;
				System.out.println("Thread 1 is dead.");
			}

			if (thread2IsAlive && !thread2.isAlive()) {
				thread2IsAlive = false;
				System.out.println("Thread 2 is dead.");
			}
		} while (thread1IsAlive || thread2IsAlive);
	}

	public static void displayList(String name, String list[]) {
		for (int i = 0; i < list.length; ++i) {
			Demo t = (Demo) Thread.currentThread();
			t.randomWait();
			System.out.println(name + list[i]);
		}
	}
}
