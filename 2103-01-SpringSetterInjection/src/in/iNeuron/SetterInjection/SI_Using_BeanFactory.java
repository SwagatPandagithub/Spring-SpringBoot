package in.iNeuron.SetterInjection;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.iNeuron.Component.WishMessager;

public class SI_Using_BeanFactory {
	
	public static void main(String[] args) {
		
		FileSystemResource file = new FileSystemResource("src/ApplicationContext.xml");
		
		System.out.println("Bean Factory Container Starting...");
		XmlBeanFactory factory = new XmlBeanFactory(file);
		System.out.println("Bean factory Container Started...");
		
		System.out.println();
		
		WishMessager wishmessanger = factory.getBean("wishMsgr", WishMessager.class);
		System.out.println();
		System.out.println(wishmessanger+"\n");
		
		
		String result = wishmessanger.wish("Swagat");
		System.out.println(result);
		System.out.println();
		
		WishMessager wishmessanger1 = factory.getBean("wishMsgr", WishMessager.class);
		System.out.println();
		System.out.println(wishmessanger1+"\n");
		System.out.println("The objects created here only once for both the instances USAGE OF CACHE MEMORY");
		
		String result1 = wishmessanger1.wish("Sachin");
		System.out.println(result1);
		System.out.println("The container is closing...");
		
		
	
		
		
	}

}
