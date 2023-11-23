package in.iNeuron.ConstructorInjection;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Component.College;
import in.iNeuron.Component.ContactsInfo;
import in.iNeuron.Component.MarksInfo;
import in.iNeuron.Component.UniversityInfo;

public class TestApp {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("The beans present are ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		
		MarksInfo info = context.getBean("marksinfo",MarksInfo.class);
			System.out.println(info);
		
			
		College college = context.getBean("clg", College.class);
			System.out.println(college);
		
			
		ContactsInfo contactsInfo = context.getBean("contactInfo",ContactsInfo.class);
			System.out.println(contactsInfo);
			
			
			UniversityInfo universityinfo = context.getBean("uInfo",UniversityInfo.class);
		System.out.println(universityinfo);
		
		
		
	}

}
