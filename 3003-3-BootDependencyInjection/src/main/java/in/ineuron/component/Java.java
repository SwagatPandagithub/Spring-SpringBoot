package in.ineuron.component;

import org.springframework.stereotype.Component;

@Component(value ="Java")
public class Java implements ICourse{

	static {
		System.out.println("Java .class file is loading...");
	}
	
	public Java() {
		System.out.println("java class zero param constructor is called...");
	}
	
	@Override
	public String courseName() {
		return null;
	}

	@Override
	public Integer coursePrice() {
		return null;
	}
	
	

}
