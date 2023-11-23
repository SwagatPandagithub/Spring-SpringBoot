package in.ineuron.component;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loading....");
	}
	
	WishMessageGenerator(){
		System.out.println("The wishmessagegenerator object instantiated...");
	}
	
	//Business logic
	public String greetUser(String username) {
		int hour = date.getHour();
		
		if(hour<12)
			return "Good Morning ::"+username;
		else if(hour<16)
			return "Good AfterNoon ::"+username;
		else if(hour<20)
			return "Good Evening ::"+username;
		else
			return "Good night ::"+username;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
	
}
