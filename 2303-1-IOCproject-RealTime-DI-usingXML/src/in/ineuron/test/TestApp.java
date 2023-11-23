package in.ineuron.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVo;

public class TestApp {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the name of the Customer");
		String name=scan.next();
		
		System.out.println("Enter the Address of the customer");
		String addr = scan.next();
		
		System.out.println("Enter the PrincipalAmount");
		String pAmt = scan.next();
		
		System.out.println("Enter the rate of interest");
		String rate = scan.next();
		
		System.out.println("Enter the time period");
		String time = scan.next();
		
		
		CustomerVo customerVo = new CustomerVo();
		customerVo.setCustName(name);
		customerVo.setCustAddr(addr);
		customerVo.setpAmt(pAmt);
		customerVo.setRate(rate);
		customerVo.setTime(time);
		
		
		

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("ApplicationContext.xml");
		System.out.println("*************container Started******* ");
		
		MainController mainController =	factory.getBean("customerController",MainController.class);
		try {
			String result = mainController.processCustomer(customerVo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem....."+e.getMessage());
		}
		
		System.out.println("*************container Stopped******* ");
		scan.close();
		
	}

}
