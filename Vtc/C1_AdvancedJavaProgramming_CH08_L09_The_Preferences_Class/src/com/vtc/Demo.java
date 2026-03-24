package com.vtc;

import java.util.prefs.Preferences;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1
		Preferences userPreferences = Preferences.userRoot();
		Preferences systemPreferences = Preferences.systemRoot();
		
		//Store an int to User Preferences with String key
		userPreferences.putInt("X_DEFAULT", 10);
		  
		//Retrive an entry from User Preferences, 
		//the number sent as a second parameter will be returned if the key doesnt exist
		int numberOfRows = userPreferences.getInt("X_DEFAULT", 5);
		
		userPreferences.remove("X_DEFAULT ");
		
		//2
		Preferences userPreferencesPackage = Preferences.userNodeForPackage(Demo.class);  
		
		//Set
		
		Preferences userPreferencesCustomNodeForPackage = Preferences.userRoot().node("/user/custom/root");
		userPreferences.put("USER_LANGUAGE", "DUTCH");
		
		//Retrieve
		Preferences userPreferencesCustom = Preferences.userRoot().node("/user/custom/root");
		userPreferences.put("USER_LANGUAGE", "SPANISH");
	}
}