package com.csc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	// public String loginPage(Model model) {
	//
	// return "loginPage";
	// }

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if ("itphutran".equals(username)) {
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			RequestDispatcher dispatcher = request.getRequestDispatcher("quantri.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/login.jsp?error=0");
		}

	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model) {
		return "adminPage";
	}

	@RequestMapping(value = "/doctor", method = RequestMethod.GET)
	public String doctorPage(Model model) {
		return "doctorPage";
	}

	@RequestMapping(value = "/nurse", method = RequestMethod.GET)
	public String nursePage(Model model) {
		return "nursePage";
	}
}
