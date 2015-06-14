package com.bshop.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;





@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.bshop.repository")
/*@EnableLoadTimeWeaving*/
//for eclipselink -defaultly enabled - so need of this
public class DatabaseConfig {
	
	
	
	
	@Bean
	public DataSource dataSource(){
		

		DriverManagerDataSource dataSource 
		= new DriverManagerDataSource("jdbc:mysql://localhost:3306/mydatabase","root","root");		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");		
		return dataSource;		
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean emf = 
				new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		/*emf.setJpaVendorAdapter(new OpenJpaVendorAdapter());*/
		/*emf.setJpaVendorAdapter(new EclipseLinkJpaVendorAdapter());*/
		//enabling the load time weaver for EclipseLink
		//???? - Must use javaagent along InstrumentationLoadTimeWeaver
		//for now - just disabling the Load Time weaver
	/*	emf.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());*/
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return emf;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
		JpaTransactionManager txManager = new JpaTransactionManager();
		//instead of EntityManagerFactory - we can give the DataSource to configure it
		txManager.setEntityManagerFactory(emf);
		return txManager;		
	}
		
}
