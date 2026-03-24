public class StringClassDemo {

	public static void main(String[] args) {

		String s1 = "Hello";// Literal
		String s2 = new String("Hello");// Explicitly create a new Object in memory

		switch (s1) {
		case "Hola":
			System.out.println("Spanish Greeting! "+s1);
			break;
		case "Ciao":
			System.out.println("Italian Greeting! "+s1);
			break;	
		case "Hello":
			System.out.println("English Greeting! "+s1);
			break;
		default:
			System.out.println("Error: '" + s1
					+ "' is not a recognized greeting");
			break;
		}
	}

}
