package in.iNeuron.Component;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class testMain {
	
	
	
	public static void main(String[] args) {
		
		
		FileSystemResource resource = new FileSystemResource("src/ApplicationContext.xml");
		
		XmlBeanFactory factory= new XmlBeanFactory(resource);
				
		Student result=factory.getBean("Student1",Student.class);
		Student result2=factory.getBean("Student2",Student.class);
		Student result3=factory.getBean("Student3",Student.class);
			
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
