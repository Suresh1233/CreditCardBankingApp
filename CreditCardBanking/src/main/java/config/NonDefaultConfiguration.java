package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import business.NonDefaultCustomerImpl;
import dao.CreditcardDBDAOImpl;
import fasade.NonDefaultServiceMappingImpl;
import service.NonDefaultServiceImpl;

@Configuration
@PropertySource(value = "msaccess_database.properties")
public class NonDefaultConfiguration {

	@Autowired
	Environment environment;

	@Bean
	public NonDefaultServiceImpl nonDefaultService() {
		return new NonDefaultServiceImpl();
	}

	@Bean
	public NonDefaultServiceMappingImpl nonDefaultServiceMapping() {
		return new NonDefaultServiceMappingImpl();
	}

	@Bean
	public NonDefaultCustomerImpl nonDefaultCustomer() {
		return new NonDefaultCustomerImpl();
	}

	@Bean
	public CreditcardDBDAOImpl creditcardDBDAO() {
		return new CreditcardDBDAOImpl();
	}

	@Bean
	public JdbcTemplate creditcardDatabaseJdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("db.driver"));
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.username"));
		dataSource.setPassword(environment.getProperty("db.password"));
		return dataSource;
	}
}
