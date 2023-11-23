package in.ineuron.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggStudents;



public class TestApp {

	public static void main(String[] args) {
		
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Container started....");System.out.println();
		
		
		/*
		//Setter method collection merging
		EnggStudents enggStudents = context.getBean("Electrical",EnggStudents.class);
		System.out.println(enggStudents);
		*/
		
		EnggStudents enggStudents2 = context.getBean("CS", EnggStudents.class);
		System.out.println(enggStudents2);
		
	}

}
