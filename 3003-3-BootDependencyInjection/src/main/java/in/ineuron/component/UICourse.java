package in.ineuron.component;

import org.springframework.stereotype.Component;

@Component
public class UICourse implements ICourse{

	static {
		System.out.println("UICourse .class file is loading...");
	}
	
	public UICourse() {
		System.out.println("UICourse class zero param constructor is called...");
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
