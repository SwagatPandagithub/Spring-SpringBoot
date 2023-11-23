package in.iNeuron.test;

import java.util.Date;

public class TargetClass {
	
	
	
	private Date date;
	
	static {
		System.out.println("Target Class is loading....");
	}
	
	public TargetClass() {
		System.out.println("The target class is instantiated...");
	}



	public void setDate(Date date) {
		this.date = date;
	}

	
	public String wish(String userName) {
		int hour = date.getHours();
		
		if (hour<12) {
			return "Good morning :: "+userName;
		}else if(hour<16) {
			return "good Afternoon :: "+userName;
			
		}else if(hour<20) {
			return "good evening :: "+userName;
		}else {
			return "good night :: "+userName;
		}
					
	}
	
	

}
