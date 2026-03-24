package com.vtc;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vtc.harness.TextComponent;
import com.vtc.harness.TextComponents;

public class Demo {
	private final TextComponent io;
	
	public Demo(TextComponent io) {
		super();
		this.io = io;
	}
	
	public void run() {
		while (true) {
			String read = readLine();
			System.out.println("ECHO You Typed : "+read);
		}
	}

	private String readLine() {
		io.printf("Enter : ");
		while (true) {
			return io.readLine();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Demo(TextComponents.defaultTextComponent()).run();
	}

}
