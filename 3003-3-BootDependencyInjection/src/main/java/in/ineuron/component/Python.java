package in.ineuron.component;

import org.springframework.stereotype.Component;

@Component
public class Python implements ICourse{

	
	static {
		System.out.println("Python .class file is loading...");
	}
	
	public Python() {
		System.out.println("Python class zero param constructor is called...");
	}
	
	@Override
	public String courseName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer coursePrice() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
