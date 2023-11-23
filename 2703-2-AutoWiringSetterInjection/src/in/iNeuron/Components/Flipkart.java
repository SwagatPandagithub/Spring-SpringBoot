package in.iNeuron.Components;


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

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}



	public void setDiscount(Float discount) {
		System.out.println("flipkart.setDiscount method is called");
		this.discount = discount;
	}

	

	@Override
	public String toString() {
		System.out.println();
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

	



}
