package in.iNeuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Components.WishMessageGenerator;
import in.iNeuron.commons.AppConfig;



public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("The Beans created are ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		WishMessageGenerator wmg = 	context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		
		String result = wmg.wish("Swagat");
		System.out.println(result);
		
		((AbstractApplicationContext) context).close();
	}

}
