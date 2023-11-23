package in.iNeuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Component.Printer;

public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Printer printer =context.getBean("printer", Printer.class);
		System.out.println(printer);
		
	}

}
