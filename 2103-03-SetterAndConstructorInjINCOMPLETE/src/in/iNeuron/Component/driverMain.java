package in.iNeuron.Component;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class driverMain {
	
	
	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/ApplicationContext.xml");
				
				XmlBeanFactory factory= new XmlBeanFactory(resource);
						
				String result=factory.getBean("wishMessagr",WishMessager.class).wish("suraj");
					
				System.out.println(result);
	}

}
