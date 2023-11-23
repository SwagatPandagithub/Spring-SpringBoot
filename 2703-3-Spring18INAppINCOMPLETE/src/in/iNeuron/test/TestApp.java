package in.iNeuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Components.Flipkart;

public class TestApp {
	
	public static void main(String[] args) {
		
		System.out.println("*******Container Starting*****");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("**********Container Started ****** ");
		
		
		
		Flipkart flipkart = context.getBean(Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] {"omega","tissot"}, new float[] {1234.0f,3456.0f}));
		
		
		
		((AbstractApplicationContext) context).close();
	}

}
