package in.iNeuron.ConstructorInjection;

import java.util.Date;

import in.iNeuron.Component.WishMessager;

public class CorejavaStyle {
	
	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println("Creating the object of the dependent class using the zero parameterised constructor :: "+date);
		
		WishMessager wishmessager = new WishMessager(date);
		System.out.println("Target object is created using parameterised constructor.... "+wishmessager);
		
		
		
		String result = wishmessager.wish("swagat");
		System.out.println(result);
		
		
		
	
		
		
	}

}
