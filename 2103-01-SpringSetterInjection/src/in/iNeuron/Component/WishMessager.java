package in.iNeuron.Component;

import java.util.Date;

public class WishMessager {
	
	
	
	private Date date;
	
	static {
		System.out.println("WishMessager Target Class is loading....");
	}
	
	public WishMessager() {
		System.out.println("WishMessager target class is instantiated...");
	}



	public void setDate(Date date) {
		this.date = date;
		System.out.println("Dependent object setter method is called ");
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
