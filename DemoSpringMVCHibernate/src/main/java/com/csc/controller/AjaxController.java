package com.csc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.csc.model.UserDTO;
import com.csc.service.UserService;

//@CrossOrigin( origins="*" , maxAge = 3600)
@RestController
@RequestMapping("/ajax")
public class AjaxController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<UserDTO> showAllUser(){
		return userService.getAll();
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addUser(@RequestBody UserDTO user){
		userService.saveOrUpdate(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateUser(@RequestBody UserDTO user){
		userService.saveOrUpdate(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")
	
	public ResponseEntity<Void> delete(@RequestBody UserDTO user){
		userService.delete(user);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
