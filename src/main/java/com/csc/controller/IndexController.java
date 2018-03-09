package com.csc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csc.model.AllergyDTO;
import com.csc.model.MedicineDTO;
import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;
import com.csc.model.UserDTO;
import com.csc.service.AllergyService;
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

	@RequestMapping("/create4test")
	public void index() {
		for (int i = 0; i < 20; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username" + i);
			u.setPassword("password" + i);
			u.setRole(1);
			userService.saveOrUpdate(u);
		}
		for (int i = 20; i < 40; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username" + i);
			u.setPassword("password" + i);
			u.setRole(2);
			userService.saveOrUpdate(u);
		}
		for (int i = 40; i < 45; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username" + i);
			u.setPassword("password" + i);
			u.setRole(3);
			userService.saveOrUpdate(u);
		}
		// Person
		for (int i = 0; i < 50; i++) {
			PersonDTO u = new PersonDTO();
			u.setFullname("name" + i);
			u.setAddress("TPHCM");
			u.setCmnd("12345678" + i);
			u.setDob("1/1/2000");
			u.setJob(" ");
			u.setSex("male");
			u.setRole(0);
			personService.saveOrUpdate(u);
		}
		// Treatment
		for (int i = 0; i < 50; i++) {
			TreatmentDTO u = new TreatmentDTO();
			u.setTreatmendId("a" + i);
			u.setMedicalResult("b" + i);
			u.setPrescription("c" + i);
			u.setDoctorId("123" + i);
			u.setCreationDate("2018");
			treatmentService.saveOrUpdate(u);
		}
		// Medicine
		for (int i = 0; i < 50; i++) {
			MedicineDTO u = new MedicineDTO();
			u.setMedicineId("med" + i);
			u.setName("medicine" + i);
			u.setNsx("1/1/2000");
			u.setExp("2018");
			u.setCompany("DXC");
			u.setQuantity(i + 10);
			medicineService.saveOrUpdate(u);
		}
		// Allergy
		for (int i = 0; i < 20; i++) {
			AllergyDTO u = new AllergyDTO();
			u.setMedicineId("med" + i);
			u.setPersonCMND("12345678" + i);
			allergyService.saveOrUpdate(u);
		}
	}

	@RequestMapping("/")
	public String aaaaa() {
		return "Welcome";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<ArrayList<UserDTO>> showAllUser() {
		return new ResponseEntity<ArrayList<UserDTO>>(userService.getAll(), HttpStatus.OK);
	}

}
