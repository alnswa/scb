package com.spaneos.scb.web.config;

import javax.annotation.Resource;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = { "com.spaneos.scb" })
@Configuration
@PropertySource("classpath:db.properties")
public class ContactAppConfig extends WebMvcConfigurerAdapter {
	private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
	private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
	private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

	@Resource
	private Environment environment;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations(
				"/resources/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/js/**").addResourceLocations("/js/")
				.setCachePeriod(31556926);
	}

	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Autowired
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		basicDataSource.setUrl(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
		basicDataSource.setUsername(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
		basicDataSource.setPassword(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
		return basicDataSource;
	}

}
