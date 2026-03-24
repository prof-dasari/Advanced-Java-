package com.vtc;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//assert booleanExpr.
		//assert booleanExpr : errorMessageExpr.
		
		List messages = new ArrayList();
		String s = null;
		
		assert messages.size() == 0 : "messages: should be empty.";

		assert s != null : "String null";
		
	}

}
