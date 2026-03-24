package com.vtc;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vtc.harness.TextDevice;
import com.vtc.harness.TextDevices;

public class Demo {
	private final TextDevice io;

	public Demo(TextDevice io) {
		super();
		this.io = io;
	}

	public void run() {

		while (true) {
			Pattern pattern = Pattern.compile(readLineRegex());
			Matcher matcher = pattern.matcher(readLineSearchString());

			boolean found = false;

			while (matcher.find()) {
				String output = String.format(""
						+ "found the text \"%s\" beginning at "
						+ "index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());
				System.out.println(output);
				found = true;
			}
			if (!found) {
				String output = String.format("No match found.%n");
				System.out.println(output);
			}
		}
	}

	private String readLineRegex() {
		io.printf("Enter your regex: ");
		while (true) {
			return io.readLine();
		}
	}

	private String readLineSearchString() {
		io.printf("Enter input string to search: ");
		while (true) {
			return io.readLine();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Demo(TextDevices.defaultTextDevice()).run();
	}

}
