package in.iNeuron.commons;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.iNeuron")
public class AppConfig {
	
	static {
		System.out.println("The appconfig configuration class is loading.....");
	}
	
	public AppConfig() {
		System.out.println("AppConfig Configuration class instantiated....");
	}
	
	
	@Bean(value="date")
	public LocalDateTime createdDateTime() {
		return LocalDateTime.now();
	}
}
