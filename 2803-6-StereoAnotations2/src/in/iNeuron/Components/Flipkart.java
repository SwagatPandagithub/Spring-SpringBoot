package in.iNeuron.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

	
	@Autowired
	private Courier courier;
	

	private Float discount;

	static {
		System.out.println("Flipkart.class file is loading....");
	}

	public Flipkart() {
		System.out.println("Flipkart.class file is instantiated...");
		System.out.println();		
	}

	
	public Flipkart(Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println("Injection through constructor.......");
		System.out.println(this);
	}
		//Business Logic
		public String doShopping(String[] items, float[] price) {
			System.out.println("Flipkart.doShopping method is called...");
			System.out.println("implementation class using the flipkart object :: "+courier.getClass().getName());
			System.out.println("Discount amount is :: "+discount);
			return null;
		}


	@Override
	public String toString() {
		System.out.println();
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

	



}
