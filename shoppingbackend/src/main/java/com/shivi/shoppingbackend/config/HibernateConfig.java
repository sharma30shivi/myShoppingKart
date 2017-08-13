package com.shivi.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.shivi.shoppingbackend.dto")
@EnableTransactionManagement
public class HibernateConfig {

	//change the below based configuration on the DBMS 
	private final static String DATABASE_URL= "jdbc:h2:tcp://localhost/~/myshoppingkart";
	private final static String DATABASE_DRIVER= "org.h2.Driver";
	private final static String DATABASE_DIALECT= "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME= "sa";
	private final static String DATABASEO_PASSWORD= "";
	
	//datasource bean will be available
	@Bean
	public DataSource getDataSource(){
		
		BasicDataSource datasource = new BasicDataSource();
		
		datasource.setDriverClassName(DATABASE_DRIVER);
		datasource.setUrl(DATABASE_URL);
		datasource.setUsername(DATABASE_USERNAME);
		datasource.setPassword(DATABASEO_PASSWORD);
		
		return datasource;
		
	}
	
	//session factory bean will be available
	@Bean 
	public SessionFactory getSessionFactory(DataSource datasource){
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(datasource);
		
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.shivi.shoppingbackend.dto");
		
		return builder.buildSessionFactory();
	}
	
	//All the hibernate properties will be returned
	
	private Properties getHibernateProperties(){
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.format_sql","true");
	
		return properties;
	
	}
	
	//transaction manager bean
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transationManager = new HibernateTransactionManager(sessionFactory);
		return transationManager;
	}
}
