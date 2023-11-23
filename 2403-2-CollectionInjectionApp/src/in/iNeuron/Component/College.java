package in.iNeuron.Component;

import java.util.Date;
import java.util.List;

public class College {

	
	private List<String> studentNames;
	private List<Date> dateList;
	
	
	
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
		System.out.println("The implementation class of the List interface is ::"+studentNames.getClass().getName());
	}
	
	
	
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}



	@Override
	public String toString() {
		return "College [studentNames=" + studentNames + ", dateList=" + dateList + "]";
	}
	
	
	
}
