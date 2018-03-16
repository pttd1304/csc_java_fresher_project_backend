package com.csc.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
