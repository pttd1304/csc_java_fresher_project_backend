package com.csc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.csc.model.UserDTO;
import com.csc.service.UserService;
import com.csc.model.AllergyDTO;
import com.csc.model.MedicineDTO;
import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;
import com.csc.service.AllergyService;
import com.csc.service.MedicineService;
import com.csc.service.PersonService;
import com.csc.service.TreatmentService;

@RestController
@RequestMapping("/ajax")
public class AjaxController {

	@Autowired
	UserService userService;
	PersonService personService;
	TreatmentService treatmentService;
	MedicineService medicineService;
	AllergyService allergyService;
	
	//READ
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<UserDTO> showAllUser(){
		return userService.getAll();
	}
	@RequestMapping(value = "/persons", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<PersonDTO> showAllPatient(){
		return personService.getAll();
	}
	@RequestMapping(value = "/treatments", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<TreatmentDTO> showAllTreatment(){
		return treatmentService.getAll();
	}
	@RequestMapping(value = "/medicines", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<MedicineDTO> showAllMedicine(){
		return medicineService.getAll();
	}
	@RequestMapping(value = "/allergies", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<AllergyDTO> showAllAllergy(){
		return allergyService.getAll();
	}
	
	//CREATE
	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addUser(@RequestBody UserDTO user){
		userService.saveOrUpdate(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/persons", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addPerson(@RequestBody PersonDTO person){
		personService.saveOrUpdate(person);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/treatments", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addPatient(@RequestBody TreatmentDTO treatment){
		treatmentService.saveOrUpdate(treatment);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/medicines", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addMedicine(@RequestBody MedicineDTO medicine){
		medicineService.saveOrUpdate(medicine);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/allergies", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addAllergy(@RequestBody AllergyDTO allergy){
		allergyService.saveOrUpdate(allergy);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//UPDATE
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateUser(@RequestBody UserDTO user){
		userService.saveOrUpdate(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/persons/{personId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updatePerson(@RequestBody PersonDTO person){
		personService.saveOrUpdate(person);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/treatments/{treatmentId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateTreatment(@RequestBody TreatmentDTO treatment){
		treatmentService.saveOrUpdate(treatment);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/medicines/{medicineId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateMedicine(@RequestBody MedicineDTO medicine){
		medicineService.saveOrUpdate(medicine);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/patients/{patientId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updatePatient(@RequestBody AllergyDTO allergy){
		allergyService.saveOrUpdate(allergy);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	//DELETE
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> deleteUser(@RequestBody UserDTO user){
		userService.delete(user);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/persons/{personId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deletePerson(@RequestBody PersonDTO person){
		personService.delete(person);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/treatments/{treatmentId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteTreatment(@RequestBody TreatmentDTO treatment){
		treatmentService.delete(treatment);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/medicines/{medicineId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteMedicine(@RequestBody MedicineDTO medicine){
		medicineService.delete(medicine);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/allergies/{allergyId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteAllergy(@RequestBody AllergyDTO allergy){
		allergyService.delete(allergy);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
