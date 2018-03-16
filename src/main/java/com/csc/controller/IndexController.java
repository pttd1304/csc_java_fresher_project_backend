package com.csc.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc.model.AllergyDTO;
import com.csc.model.LogDTO;
import com.csc.model.MedicineDTO;
import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;
import com.csc.model.UserDTO;
import com.csc.service.AllergyService;
import com.csc.service.LogService;
import com.csc.service.MedicineService;
import com.csc.service.PersonService;
import com.csc.service.TreatmentService;
import com.csc.service.UserService;

//@CrossOrigin(origins = "http://localhost:8080/DemoSpringMVCHibernate")
@RestController

public class IndexController {

	@Autowired
	UserService userService;
	@Autowired
	PersonService personService;
	@Autowired
	TreatmentService treatmentService;
	@Autowired
	MedicineService medicineService;
	@Autowired
	AllergyService allergyService;
	@Autowired
	LogService logService;
	
	@RequestMapping("/create4test")
	public void index(){
		//CREATE FAKE USERS
		for (int i = 0; i < 15; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username"+i);
			u.setPassword("password"+i);
			u.setCmnd("123"+i);
			u.setRole(i%3+1);
			userService.save(u);
		}
		
//		//CREATE FAKE TREATMENTS
		for (int i = 0; i < 10; i+=2) {
			
			TreatmentDTO u = new TreatmentDTO();
			u.setPersonId(i);
			u.setDiseases("sida");
			u.setMedicine("medicine"+i);
			u.setPrescription("abc xyz");
			u.setMedicalResult("Cai j do");	
			treatmentService.save(u);

		}
		//CREATE FAKE PERSON
		for (int i = 0; i < 10; i++) {
			PersonDTO u = new PersonDTO();
			u.setFullname("name"+i);
			u.setAddress("TPHCM");
			u.setCmnd("1234"+i);		
			u.setDob("1/1/2000");
			u.setSex("male");	
			personService.save(u);
		}

		//CREATE FAKE MEDICINE
		for (int i = 0; i < 20; i++) {
			MedicineDTO u = new MedicineDTO();
			u.setName("medicine"+i);
			u.setNsx("1/1/2000");
			u.setExp("2018");
			u.setCompany("DXC");
			u.setQuantity(i + 10);
			medicineService.save(u);
		}
		
		//CREATE FAKE ALLERGY
		for (int i = 0; i < 5; i++) {
			AllergyDTO u = new AllergyDTO();
			u.setMedicine("medicine"+i);
			u.setPersonId(i);
			allergyService.save(u);
		}
		
		//CREATE FAKE LOG
		for (int i = 0; i < 3; i++) {
			LogDTO u = new LogDTO();
			u.setTimeModified("4:30");
			u.setDoctorId("doctor"+i);
			u.setDoctorName("name"+i);
			u.setChanges("Something.....");
			logService.save(u);
		}
	}
	
	@RequestMapping("/")
	public String aaaaa(){
		return "Welcome";
	}
	

	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public  ResponseEntity<ArrayList<UserDTO>> showAllUser(){
		return new ResponseEntity<ArrayList<UserDTO>>(userService.getAll(), HttpStatus.OK);
	}

	
}
