package com.csc.controller;

<<<<<<< HEAD
import javax.servlet.http.HttpServlet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
=======
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
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;
import com.csc.model.UserDTO;

@RestController
public class LoginController extends HttpServlet {
//	
//	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
//	public String login(@RequestBody UserDTO user){
//			
//		  return new String("A");
//}
//	@RequestMapping("/admin")
//	@RequestMapping("/doctor")
//	@RequestMapping("/nurse")
//	@RequestMapping("/403")
=======
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
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
}
