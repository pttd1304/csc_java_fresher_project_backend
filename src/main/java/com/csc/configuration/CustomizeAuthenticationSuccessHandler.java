package com.csc.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// set our response to OK status
		response.setStatus(HttpServletResponse.SC_OK);

		int role = 0;

		logger.info("AT onAuthenticationSuccess(...) function!");

		for (GrantedAuthority auth : authentication.getAuthorities()) {
			if ("1".equals(auth.getAuthority())) {
				role = 1;
			}
			if ("2".equals(auth.getAuthority())) {
				role = 2;
			}
			if ("3".equals(auth.getAuthority())) {
				role = 3;
			}
		}

		if (role == 1) {
			response.sendRedirect("/admin");
		} else 
		if (role == 2) {
			response.sendRedirect("/doctor");
		}
		else {
			response.sendRedirect("/nurse");
		}
	}
}
