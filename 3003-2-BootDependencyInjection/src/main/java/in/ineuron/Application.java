package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.component.WishMessageGenerator;

@SpringBootApplication
public class Application {

	static {
		System.out.println("Application.class file is loading.....");
	}

	public Application() {
		System.out.println("Application class object instantiated....");
	}

	@Bean
	public LocalDateTime createObj() {
		System.out.println("Local date time object is created ");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Implementation Classes are :: " + context.getClass().getName());

		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);

		String result = wmg.greetUser("swagat");
		System.out.println("\n"+result);

	}

}
