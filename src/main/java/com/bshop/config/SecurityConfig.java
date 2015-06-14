package com.bshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * using spring security 4.0.1.Release 
 * 
 * @EnableWebMvcSecurity is deprecated - exists for 
 * backward compatability
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.
			inMemoryAuthentication()
			.withUser("user").password("user").roles("USER").and()
			.withUser("admin").password("admin").roles("USER", "ADMIN");		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.formLogin()
			.loginPage("/login")
			.and()
			.httpBasic().and()
			.authorizeRequests()
			.antMatchers("/hello").authenticated()			
			.anyRequest().permitAll().and()
			.logout();		
	
	}
}
