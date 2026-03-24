package com.vtc.harness;

import java.io.PrintWriter;
import java.io.Reader;

public abstract class TextDevice {

	public abstract TextDevice printf(String fmt, Object... params) throws ConsoleException;

		  public abstract String readLine() throws ConsoleException;

		  public abstract char[] readPassword() throws ConsoleException;

		  public abstract Reader reader() throws ConsoleException;

		  public abstract PrintWriter writer() throws ConsoleException;

}
