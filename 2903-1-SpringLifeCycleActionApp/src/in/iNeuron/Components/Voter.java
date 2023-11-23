package in.iNeuron.Components;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


@Component
@PropertySource(value="in/iNeuron/commons/application.properties")
public class Voter {
	
	
	@Value("${voter.info.name}")
	private String name;
	
	@Value("${voter.info.voterId}")
	private String voterId;
	
	@Value("${voter.info.age}")
	private Integer age;
	
	private Date dov;
	
	static {
		System.out.println("voter.class file is loading....");
	}
	
	public Voter() {
		System.out.println("voter object instantiated...zero param constructor called..");
	}

	
	
	//@postConstruct-----//depricated after JDK9	
	public void Init() {
		
		boolean flag= false;
		if(age<=0) {
			age=age*-1;
		}
		if(name== null) {
			System.out.println("Enter a valid age");
			flag= true;
		}
		
		if(age>100) {
			System.out.println("Age miust be less than 100..");
			flag= true;
		}
		
		if (flag) {
			throw new IllegalArgumentException("Invaid Inputs");
		}
	}
	
	public String checkVoteEligibility() {
		dov=new Date();
		
		if(age<=18) 
			return "Hello "+name+" you are not eligible for voting "+age+" on dt "+dov;
		else
			return "Hello "+name+" you are eligible for voting "+age+" on dt "+dov;		
		
	}
	
	
	//@predestroy---//depricated after JDK9
	public void myDestroy() {
		
	}
	

	@Override
	public String toString() {
		return "Voter [name=" + name + ", voterId=" + voterId + ", dov=" + dov + "]";
	}
	
	
	
}
