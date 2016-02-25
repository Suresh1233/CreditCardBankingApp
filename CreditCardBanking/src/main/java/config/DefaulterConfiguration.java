package config;

import model.DefaulterServicePOJO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaulterConfiguration {

	
	
	@Bean
	public DefaulterServicePOJO defaulterServicePOJO() {
		return new DefaulterServicePOJO();
	}

}
