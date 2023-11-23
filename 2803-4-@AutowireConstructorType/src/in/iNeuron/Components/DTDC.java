package in.iNeuron.Components;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading.....");
	}
	
	public DTDC() {
		System.out.println("DTDC.class constructor is instantiated using zero argument constructor....");
		System.out.println();
		System.out.println("DtDC injected");
		System.out.println();
	}
	
	@Override
	public String deliver(int orderId) {

		return null;
	}

}
