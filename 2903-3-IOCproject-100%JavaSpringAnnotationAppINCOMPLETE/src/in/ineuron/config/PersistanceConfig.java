package in.ineuron.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value = "application.properties")
public class PersistanceConfig {

	
	static {
		System.out.println("PersistanceConfig.class file is loading......");
	}
	
	public PersistanceConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("PersistanceConfig object is instantiated....\n");
	}
	
	
	@Autowired(required = true)
	private Environment env;
	// environment is an interface automatically an implementation class

	
	
	@Bean(value = "dataSource")
	public HikariDataSource getDS() {
		System.out.println("Persistance Config.getDS()");
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setMinimumIdle(Integer.parseInt(env.getProperty("jdbc.minimumIdle")));
		dataSource.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.maximumPoolSize")));
		dataSource.setConnectionTimeout(Integer.parseInt(env.getProperty("jdbc.connectionTimeOut")));
		return dataSource;
	}
}
