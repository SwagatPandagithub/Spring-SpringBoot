package in.iNeuron.Component;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


public class testMain {
	
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=	new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("ApplicationContext.xml");
		System.out.println(
		factory.getBean("Student1",Student.class));
		
		
	}

}
