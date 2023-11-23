package in.iNeuron.Component;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {
	
	private Set<Long> phoneNumbers;
	private Set<Date> dates;
	
	
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		System.out.println("The implementation class of the set interface is ::"+phoneNumbers.getClass().getName());
	}
	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}
	
	
	@Override
	public String toString() {
		return "ContactsInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}
	
	

}
