package com.liuyi.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private void configurer(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated()
		.and().logout().permitAll()
		.and().formLogin();
		http.csrf().disable();
		
	}
	
	public void configurer(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/js/**","/images/**","/css/**");
		
	}

}
