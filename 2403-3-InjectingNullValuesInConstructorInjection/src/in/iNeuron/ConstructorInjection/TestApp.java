package in.iNeuron.ConstructorInjection;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Component.PersonInfo;



public class TestApp {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("The beans present are ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		
		PersonInfo personInfo = context.getBean("pInfo",PersonInfo.class);
		System.out.println(personInfo);
		
	}

}
