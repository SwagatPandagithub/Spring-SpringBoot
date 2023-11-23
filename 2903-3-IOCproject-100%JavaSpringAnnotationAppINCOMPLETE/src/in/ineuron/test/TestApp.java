package in.ineuron.test;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.config.AppConfig;
import in.ineuron.controller.MainController;
import in.ineuron.vo.EmployeeVo;



public class TestApp {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter the name of the employee :: ");
		String name = scan.next();
		
		System.out.println("Enter the address of the employee :: ");
		String address = scan.next();
		
		System.out.println("Enter the age of the employee :: ");
		String age = scan.next();
		
		System.out.println("Enter the Salary of the Employee:: ");
		String sal = scan.next();
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MainController controller = context.getBean(MainController.class);
		EmployeeVo  vo = new EmployeeVo();
			vo.setEmpName(name);
			vo.setEmpAddress(address);
			vo.setEmpAge(age);
			vo.setEmpSal(sal);
			
			EmployeeVo result = controller.getHike(vo);
			System.out.println(result);
		
		
	}

}
