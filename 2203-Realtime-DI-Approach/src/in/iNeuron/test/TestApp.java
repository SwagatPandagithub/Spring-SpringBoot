package in.iNeuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Components.Flipkart;

public class TestApp {
	
	public static void main(String[] args) {
		
		System.out.println("*******Container Starting*****");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("**********Container Started ****** ");
		
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		
		String result = flipkart.doShopping(new String[] {"Tissot","fossil"}, new float[] {23456.3f,1234.5f});
		System.out.println(result);
	}

}
