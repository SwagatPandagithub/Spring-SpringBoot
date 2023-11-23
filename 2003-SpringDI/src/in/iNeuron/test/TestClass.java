package in.iNeuron.test;

import java.util.Date;

public class TestClass {
	
	public static void main(String[] args) {
		
		
		//Taget Object has been created
		TargetClass target  = new TargetClass();
		
		System.out.println("Target object before Setter injection :: "+target);
		
		Date date = new Date();
		target.setDate(date);
		//Dependent object has been created and injected into the target object
		
		System.out.println("Target Object after the setter injection :: "+target);
		
		System.out.println();
		
		String result = target.wish("Sachin");
		System.out.println(result);
		
		
		
		
	
		
		
	}

}
