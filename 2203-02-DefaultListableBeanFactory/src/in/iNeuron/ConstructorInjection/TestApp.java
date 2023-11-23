package in.iNeuron.ConstructorInjection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Component.Student;


public class TestApp {
	
	public static void main(String[] args) {
		
		
		DefaultListableBeanFactory factory= null;
		XmlBeanDefinitionReader reader = null;
		
		factory= new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("ApplicationContext.xml");
		System.out.println("Container Started");
		
		Student student = factory.getBean("Student1",Student.class);	
		System.out.println(student);
		System.out.println("Closing the resourses");
		
		
		
		
	
		
		
	}

}
