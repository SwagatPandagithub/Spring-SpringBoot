package in.iNeuron.ConstructorInjection;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.iNeuron.Component.WishMessager;

public class CI_Using_BeanFactory {
	
	public static void main(String[] args) {
		
		FileSystemResource file = new FileSystemResource("src/ApplicationContext.xml");
		
		System.out.println("Bean Factory Container Starting...");
		XmlBeanFactory factory = new XmlBeanFactory(file);
		System.out.println("Bean factory Container Started...");
		
		
		
		WishMessager wishmessanger = factory.getBean("wishMessagr", WishMessager.class);
		System.out.println(wishmessanger+"\n");
		
		
		String result = wishmessanger.wish("Swagat");
		System.out.println(result);
		System.out.println();
		
		
		
	
		
		
	}

}
