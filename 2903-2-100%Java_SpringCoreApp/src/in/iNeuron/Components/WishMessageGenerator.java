package in.iNeuron.Components;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component(value="wmg")
@Scope(value="singleton")
public class WishMessageGenerator {
	
	@Autowired(required = true)
	private LocalDateTime date;
	
	static {
		System.out.println("/t WishMessagegenerator. class file is loading.....");
	}
	
	WishMessageGenerator(){
		System.out.println("WishMessageGenerator object is instantiated.... ");
	}
	
	
	
	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}



	public String wish(String name) {
		int hour = date.getHour();
		
		if(hour<12) 
			return "Good Morning "+name;
		else if(hour<16)
			return "good afternoon "+name;
		else if(hour<20)
			return "good evening "+name;
		else
			return "Good night "+name;
	}

}
