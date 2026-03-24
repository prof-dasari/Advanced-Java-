package com.vtc;

import java.util.EnumSet;

public class DemoEnums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("All Cars:\n");
		//print all cars in Enum Car
		for(Car car : Car.values()){
			System.out.printf( "%-10s%-45s%s\n",car,car.getModel(),car.getYear());
		}
			
		System.out.println( "\nDisplay a range of enum constants Cars:\n");
		//print first 3 cars
		for(Car car: EnumSet.range(Car.Acura, Car.Toyota)){
			System.out.printf( "%-10s%-45s%s\n", car, car.getModel(), car.getYear());
		}
		
	}

}
