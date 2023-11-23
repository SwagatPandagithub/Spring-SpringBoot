package in.iNeuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Components.Voter;


public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println("The Beans created are ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		Voter voter = context.getBean(Voter.class);
		System.out.println(voter);
		
		System.out.println(voter.checkVoteEligibility());
		
	
		
		((AbstractApplicationContext) context).close();
	}

}
