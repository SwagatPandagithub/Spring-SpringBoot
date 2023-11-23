package in.iNeuron.Component;

import java.util.Date;

public class WishMessager {
	
	private Date date;
	
	static {
		System.out.println("WishMessager Target Class is loading....");
	}
	
	
	
	public WishMessager(Date date) {
		System.out.println("Parameterised Constructor is called...and instantiated.");
		this.date = date;
	}

	


	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		System.out.println("Setter method is called ...");
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
