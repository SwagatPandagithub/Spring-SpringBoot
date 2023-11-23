package in.iNeuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Components.Employee;


public class TestApp {
	
	public static void main(String[] args) {
		
		System.out.println("*******Container Starting*****");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("**********Container Started ****** ");
		
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext) context).close();
	}

}
