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
<<<<<<< HEAD
		for (int i = 0; i < 15; i++) {
=======
		for (int i = 0; i < 5; i++) {
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
			UserDTO u = new UserDTO();
			u.setUsername("username"+i);
			u.setPassword("password"+i);
			u.setCmnd("123"+i);
<<<<<<< HEAD
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
=======
			u.setRole(1);
			userService.save(u);
		}
		for (int i = 5; i < 10; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username"+i);
			u.setPassword("password"+i);
			u.setCmnd("123"+i);
			u.setRole(2);
			userService.save(u);
		}
		for (int i = 10; i < 15; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username"+i);
			u.setPassword("password"+i);
			u.setCmnd("123"+i);
			u.setRole(3);
			userService.save(u);
		}
		
		//CREATE FAKE TREATMENTS
		for (int i = 0; i < 10; i++) {
			
			TreatmentDTO u = new TreatmentDTO();
			u.setDiseases("sida");
			u.setDoctorId("123"+i);
			u.setPrescription("abc xyz");
			u.setMedicalResult("Project nhóm 1");

		}
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
		//CREATE FAKE PERSON
		for (int i = 0; i < 10; i++) {
			PersonDTO u = new PersonDTO();
			u.setFullname("name"+i);
			u.setAddress("TPHCM");
			u.setCmnd("1234"+i);		
			u.setDob("1/1/2000");
			u.setSex("male");	
<<<<<<< HEAD
=======
			
			TreatmentDTO u123 = new TreatmentDTO();
			u123.setDiseases("sida");
			u123.setDoctorId("123"+i);
			u123.setPrescription("abc xyz");
			u123.setMedicalResult("Project nhóm 1");

			Set set = new HashSet<TreatmentDTO>();
			set.add(u123);
			u.setTreatments(set);
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
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
<<<<<<< HEAD
		for (int i = 0; i < 5; i++) {
			AllergyDTO u = new AllergyDTO();
			u.setMedicine("medicine"+i);
			u.setPersonId(i);
=======
		for (int i = 0; i < 10; i++) {
			AllergyDTO u = new AllergyDTO();
			u.setMedicineId("med"+i);
			u.setPersonCMND("1234"+i);
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
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
