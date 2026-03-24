package com.vtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List animals = new ArrayList();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Bear");
		
		Iterator animalsIter = animals.iterator();
		
		System.out.println("While Loop");
		while(animalsIter.hasNext()){
			System.out.println(animalsIter.next());
		}
	     
		System.out.println("\nFor Loop");
		for(Iterator<String> animalsIterFor = animals.iterator(); animalsIterFor.hasNext();){
			String s = (String)animalsIterFor.next();
			if(s.equals("Tiger")){
				animalsIterFor.remove();
			}else{
				System.out.println(s);
			}
		}
	}

}
