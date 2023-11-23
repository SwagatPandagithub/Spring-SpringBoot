package in.ineuron.comp;

import java.util.Set;

public class EnggStudents {
	
	private Set<String> courses;

	/*
	//Setter method collection mearging
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	*/


	@Override
	public String toString() {
		return "EnggStudents [courses=" + courses + "]";
	}
	
	

	public EnggStudents(Set<String> courses) {
		System.out.println("Constructor got called for constructor injection.....");
		this.courses = courses;
	}
	
	
	
	
}
