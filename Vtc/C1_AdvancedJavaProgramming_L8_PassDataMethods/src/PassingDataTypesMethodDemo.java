
public class PassingDataTypesMethodDemo {

	public static void main(String[] args) {
		double d = 2.0;
		changeMe(d);
		System.out.println("d = "+d);
		
		Car lamborghini = new Car();
		lamborghini.setSpeed(65.0);
		
		changeCarParameters(lamborghini);
		System.out.println("The speed = "+lamborghini.getSpeed());
		
		changeCar(lamborghini);
		System.out.println("The speed = "+lamborghini.getSpeed());
		
	}

	public static void changeMe(double d){
	     //this has no effect on d outside of this method!
	     d = 345.0;
	}

	public static void changeCarParameters(Car c){
	     //changes the car’s speed outside this method!
	     c.setSpeed(200.0);
	}
	
	public static void changeCar(Car c){
	     Car ford = new Car();
	     ford.setSpeed(75.0);
	     //does not affect car outside this method
	     c = ford;
	}
	
}
