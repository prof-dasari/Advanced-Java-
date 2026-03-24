package com.vtc;

public enum Colors {

	Red("rgb(255,0,0)"),
    Yellow("rgb(255,255,0)"),
    Blue("rgb(0,0,255)");
	
	void setColor(String aColor){
		currentColor = aColor;
	}
	
	String getCalories(){
		return currentColor;
	}
	
	private Colors(String aColor){
		currentColor = aColor;
	}
	
	private String currentColor;
}
