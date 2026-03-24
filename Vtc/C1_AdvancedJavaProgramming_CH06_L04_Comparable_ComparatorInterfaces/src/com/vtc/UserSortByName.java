package com.vtc;

import java.util.Comparator;

public class UserSortByName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		User u1 = (User) o1;
		User u2 = (User) o2;

		String userName1 = u1.getName().toUpperCase();
		String userName2 = u2.getName().toUpperCase();

		// ascending
		//return userName1.compareTo(userName2);
		
		// descending
		return userName2.compareTo(userName1);
	}

}
