package in.iNeuron.ConstructorInjection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Component.Student;


public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context=	new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student1 = context.getBean("Student1",Student.class);
		System.out.println(student1);
		
		System.out.println();
		
		Student student2 = context.getBean("Student2",Student.class);
		System.out.println(student2);
				
		System.out.println();
		
		Student student3 = context.getBean("Student3",Student.class);
		System.out.println(student3);
		
		
		
	
		
		
	}

}
