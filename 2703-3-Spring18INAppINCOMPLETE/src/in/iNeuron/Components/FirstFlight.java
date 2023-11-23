package in.iNeuron.Components;

public class FirstFlight implements Courier {

	
	static {
		System.out.println("Firstflight.class file is loading....");
	}
	
	public FirstFlight() {
		// TODO Auto-generated constructor stub
		System.out.println("FirstFlight.class is instantiated zero param constructor is called.....");
	}
	@Override
	public String deliver(int orderId) {
		return null;
	}

}
