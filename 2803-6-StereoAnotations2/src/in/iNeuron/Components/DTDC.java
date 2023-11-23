package in.iNeuron.Components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading.....");
	}
	
	public DTDC() {
		System.out.println("DTDC.class constructor is instantiated using zero argument constructor....");
	}
	
	@Override
	public String deliver(int orderId) {

		return null;
	}

}
