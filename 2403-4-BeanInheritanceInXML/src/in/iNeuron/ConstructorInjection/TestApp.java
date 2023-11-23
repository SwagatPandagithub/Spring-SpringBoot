package in.iNeuron.ConstructorInjection;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.iNeuron.Component.Car;




public class TestApp {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("The beans present are ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		Car car1 = context.getBean("car1",Car.class);
		System.out.println(car1);
		Car car2 = context.getBean("car2",Car.class);
		System.out.println(car2);
		
		System.out.println("base car is made parent and parent common attributes are given to the child");
		System.out.println("made the parent bean as abstract so the bean reference is only created the actual bean is not created ");
		
		Car baseCar = context.getBean("baseCar",Car.class);
		System.out.println(baseCar);
	}

}
