package in.iNeuron.Components;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class Bluedart implements Courier {
	
	static {
		System.out.println("BlueDart.class is loading.....");
	}
	
	public Bluedart() {
		System.out.println("Bluedart.class is instantiated zero param constructor is called....");
	}
	
	
	@Override
	public String deliver(int orderId) {
		return null;
	}

}
