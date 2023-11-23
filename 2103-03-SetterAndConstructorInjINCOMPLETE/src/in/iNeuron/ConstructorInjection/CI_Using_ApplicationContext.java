package in.iNeuron.ConstructorInjection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.iNeuron.Component.WishMessager;

public class CI_Using_ApplicationContext {
	
	public static void main(String[] args) {
		
		
		System.out.println("Bean Factory Container Starting...");
		System.out.println();
		
		
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			System.out.println("No of beans created :: "+context.getBeanDefinitionCount());
			System.out.println("Name of the beans are :: "+Arrays.toString(context.getBeanDefinitionNames()));
		
		
		System.out.println();
		System.out.println("Bean factory Container Started...");
		System.out.println();
		
		WishMessager wishMsngr = context.getBean("wishMessagr",WishMessager.class);
		System.out.println(wishMsngr.wish("Sachin tendulkar"));
		
				
		
		
		
		
	
		
		
	}

}
