package in.iNeuron.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Target Class
public class Flipkart {

	//Flipkart needs Courier Service
	//dependent Object
	
	private Courier courier;
	private Float discount;

	static {
		System.out.println("Flipkart.class file is loading....");
	}

	public Flipkart() {
		System.out.println("Flipkart.class file is instantiated...");
		System.out.println();		
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

	@Autowired
	public void setCourier(@Qualifier("fFlight")Courier courier) {
		this.courier = courier;
	}


	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	



}
