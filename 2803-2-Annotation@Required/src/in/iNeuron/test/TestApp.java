package in.iNeuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Components.PersonInfo;
import jdk.jfr.Percentage;



public class TestApp {
	
	public static void main(String[] args) {
		
		System.out.println("*******Container Starting*****");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("**********Container Started ****** ");
		
		PersonInfo personinfo = context.getBean("personInfo", PersonInfo.class);
		System.out.println(personinfo);
		
		((AbstractApplicationContext) context).close();
	}

}
