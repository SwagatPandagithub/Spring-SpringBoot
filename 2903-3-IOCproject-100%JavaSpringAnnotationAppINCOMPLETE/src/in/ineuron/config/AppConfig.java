package in.ineuron.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"in.ineuron"})
@Import(value=PersistanceConfig.class)
public class AppConfig {
	
	
	
	static {
		System.out.println("AppConfig.class file is loading....");
	}

	public AppConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("AppConfig constructor is instantiated....\n.");
	}
	
	
}
