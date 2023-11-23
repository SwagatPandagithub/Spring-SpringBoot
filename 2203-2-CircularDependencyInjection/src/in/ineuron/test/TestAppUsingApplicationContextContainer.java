package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAppUsingApplicationContextContainer {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");

		System.in.read();

		

	}
}

