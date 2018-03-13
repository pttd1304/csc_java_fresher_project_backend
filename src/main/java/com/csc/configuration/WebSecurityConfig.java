package com.csc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.transaction.annotation.Transactional;

import com.csc.service.MyDBAuthenticationService;

@Configuration
@EnableWebSecurity
@Transactional
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	MyDBAuthenticationService myDBAauthenticationService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Các User trong bộ nhớ (MEMORY).

		auth.inMemoryAuthentication().withUser("Admin").password("ChauHonCuong").roles("3");

		// Các User trong Database
		auth.userDetailsService(myDBAauthenticationService);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll();
		
		http.authorizeRequests().antMatchers("/nurse").access("hasRole('ROLE_1')");
		
		http.authorizeRequests().antMatchers("/doctor").access("hasRole('ROLE_2')");

		// For ADMIN only.
		http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_3')");

		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		http.authorizeRequests().and().formLogin()//

				.loginProcessingUrl("/j_spring_security_check") // Submit URL
				.loginPage("/login")//
				.defaultSuccessUrl("/userInfo")//
				.failureUrl("/login?error=true")//
				.usernameParameter("username")//
				.passwordParameter("password")

				.and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");

	}
}
