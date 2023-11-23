package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {

	// Dependent Object
	private Courier courier;
	private Float discount;

	static {
		System.out.println("\nFlipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart:: Zero param constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}

	// Business logic
	public String doShopping(String[] items, float prices[]) {
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is :: " + courier.getClass().getName());
		System.out.println("Discount amount is :: " + discount);
		
		
		int orderId=0;
		float billAmt=0.0f;
		Random random = new Random();
		orderId=random.nextInt(1000);
		
		String msg=courier.deliver(orderId);
		for(float price:prices ) {
			billAmt +=price;
		}
		
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" Total bill Amount "+msg;
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
