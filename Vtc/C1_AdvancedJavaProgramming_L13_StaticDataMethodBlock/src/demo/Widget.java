package demo;

public class Widget {
	
	static{
		System.out.println("Executing Static Block.");
	}
	
	    private int id;
	    private static int numberOfWidgets = 0;
	    	        
	    public Widget(){
	         // increment number of Widgets
	        // and assign ID number
	        id = ++numberOfWidgets;
	    }

	    // new method to return the ID instance variable
	    public int getID() {
	        return id;
	    }
	    
	    public static int getAvailableWidgets(){
	    	return numberOfWidgets;
	    }
}
