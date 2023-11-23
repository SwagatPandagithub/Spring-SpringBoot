package in.iNeuron.Component;

import java.util.Arrays;

public class MarksInfo {
	
	private int[] marks;

	
	public void setMarks(int[] marks) {
		this.marks = marks;
		System.out.println("The setter method is called");
		
	}


	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + "]";
	}
	
	

	
	

}
