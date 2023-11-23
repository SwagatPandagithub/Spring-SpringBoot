package in.ineuron.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	static {
		System.out.println("Student.class file is loading..");
	}

	public Student() {
		System.out.println("Student zero parameter constructor us called...");
	}

	private String StudentName;

	@Autowired
	@Qualifier(value="Java")
	private ICourse icourse;
	
	
	public void examPrep(String examName) {
		System.out.println("Student.examPrep() method calling..");
		System.out.println("The injected dependent object is ::"+icourse.getClass().getName());
		
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", icourse=" + icourse + "]";
	}

}
