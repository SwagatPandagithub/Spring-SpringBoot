package in.ineuron;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.dao.EmployeeDaoImpl;
import in.ineuron.dao.EmployeeDaoImplClasss;
import in.ineuron.model.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("No of beans ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		
		EmployeeDaoImpl dao = context.getBean(EmployeeDaoImplClasss.class);
		
		List<Employee> list  = dao.findAllEmployees();
		list.forEach(System.out::println);
		
	}

}
