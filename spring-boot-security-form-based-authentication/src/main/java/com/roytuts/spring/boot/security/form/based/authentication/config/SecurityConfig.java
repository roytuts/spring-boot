package com.roytuts.spring.boot.security.form.based.authentication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("admin")
				.password("$2a$10$dl8TemMlPH7Z/mpBurCX8O4lu0FoWbXnhsHTYXVsmgXyzagn..8rK").roles("ADMIN"); // password -
																											// admin
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http// ,
				.authorizeRequests()// , authorize request
				.antMatchers("/", "/login", "/static/**", "/error**").permitAll().anyRequest().authenticated()// ,
																												// ignore
																												// /,login
																												// page,static
				// resources, error
				// pages
				.antMatchers("/admin")// Ensures that request with "/admin" to
										// our application requires the user to
										// be authenticated
				.access("hasRole('ADMIN')")// Any URL that starts with
											// "/admin" will
				// be restricted to users who have the
				// role "ROLE_ADMIN",
				.and()// ,
				.formLogin()// Allows users to authenticate with form based
							// login,
				.loginPage("/login")// specifies the location of the log in
									// page,
				.loginProcessingUrl("/j_spring_security_check")// login
																// processing
																// URL,
				.defaultSuccessUrl("/admin")// default-target-url,
				.failureUrl("/login?error")// authentication-failure-url,
				.usernameParameter("username")// overrides Spring's default
												// j_username with
												// username-parameter,
				.passwordParameter("password");// overrides Spring's default
												// j_password with
												// password-parameter
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
