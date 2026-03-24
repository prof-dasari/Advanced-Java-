package com.vtc;

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
		/**
		   Boundary Construct 	Description
		   ^					The beginning of a line
		   $ 					The end of a line
		   \b 					A word boundary
		   \B 					A non-word boundary
		   \A 					The beginning of the input
		   \G 					The end of the previous match
		   \Z 					The end of the input but for the final terminator, if any
		   \z 					The end of the input
		*/
		
		new Demo(TextDevices.defaultTextDevice()).run();
	}

}
