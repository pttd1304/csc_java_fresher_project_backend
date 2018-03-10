package com.csc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.csc.model.UserDTO;
import com.csc.service.UserService;
import com.csc.model.AllergyDTO;
import com.csc.model.LogDTO;
import com.csc.model.MedicineDTO;
import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;
import com.csc.service.AllergyService;
import com.csc.service.LogService;
import com.csc.service.MedicineService;
import com.csc.service.PersonService;
import com.csc.service.TreatmentService;

@RestController
@RequestMapping("/api")
public class AjaxController {

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
	
	
	/****USER****/
	//CREATE USER
	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addUser(@RequestBody UserDTO user){
		userService.save(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	//READ USER
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<UserDTO> showAllUser(){
		ArrayList<UserDTO> tmp = userService.getAll(); 
		return tmp;
	}
	//UPDATE USER
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateUser(@PathVariable String userId, @RequestBody UserDTO user){
		if(userId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			userService.update(user);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}	
	}
	//DELETE USER
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> deleteUser(@PathVariable String userId, @RequestBody UserDTO user){
		if(userId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			userService.delete(user);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}	
	}

	
	/****PERSON****/
	//CREATE PERSON
	@RequestMapping(value = "/persons", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addPerson(@RequestBody PersonDTO person){
		personService.save(person);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	//READ PERSON
	@RequestMapping(value = "/persons", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<PersonDTO> showAllPerson(){
		return personService.getAll();
	}
	@RequestMapping(value = "/persons/{personId}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public PersonDTO showPersonById(@PathVariable int personId){
		return personService.getById(personId);
	}
	
	@RequestMapping(value = "/persons2/{personId}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<PersonDTO> showPersonById2(@PathVariable int personId){
		return new ResponseEntity<PersonDTO>(personService.getById(personId), HttpStatus.OK);
	}
	//UPDATE PERSON
	@RequestMapping(value = "/persons/{personId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updatePerson(@PathVariable String personId, @RequestBody PersonDTO person){
		if(personId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			personService.update(person);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}	
	}
	//DELETE PERSON
	@RequestMapping(value = "/persons/{personId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deletePerson(@PathVariable String personId, @RequestBody PersonDTO person){	
		if(personId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			personService.delete(person);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}	
	}
	
	
	/****TREATMENT****/
	//CREATE TREATMENT
	@RequestMapping(value = "/treatments", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addTreatment(@RequestBody TreatmentDTO treatment){
		treatmentService.save(treatment);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	//READ TREATMENT
	@RequestMapping(value = "/treatments", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<TreatmentDTO> showAllTreatment(){
		return treatmentService.getAll();
	}
	//READ TREATMENT BY ID
	@RequestMapping(value = "/treatments/{cmnd}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<TreatmentDTO> showAllTreatmentById(@PathVariable String cmnd){
		return treatmentService.getAllById(cmnd);
	}
	//UPDATE TREATMENT
	@RequestMapping(value = "/treatments/{treatmentId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateTreatment(@PathVariable String treatmentId, @RequestBody TreatmentDTO treatment){	
		if(treatmentId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			treatmentService.update(treatment);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	//DELETE TREATMENT
	@RequestMapping(value = "/treatments/{treatmentId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteTreatment(@PathVariable String treatmentId,@RequestBody TreatmentDTO treatment){
			
		if(treatmentId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			treatmentService.delete(treatment);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	
	/****MEDICINE****/
	//CREATE MEDICINE
	@RequestMapping(value = "/medicines", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addMedicine(@RequestBody MedicineDTO medicine){
		medicineService.save(medicine);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	//READ MEDICINE
	@RequestMapping(value = "/medicines", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<MedicineDTO> showAllMedicine(){
		return medicineService.getAll();
	}
	//UPDATE MEDICINE
	@RequestMapping(value = "/medicines/{medicineId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateMedicine(@PathVariable String medicineId, @RequestBody MedicineDTO medicine){
		if(medicineId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			medicineService.update(medicine);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	//DELETE MEDICINE
	@RequestMapping(value = "/medicines/{medicineId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteMedicine(@PathVariable String medicineId, @RequestBody MedicineDTO medicine){
		
		if(medicineId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			medicineService.delete(medicine);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	
	/****ALLERGY****/
	//CREATE ALLERGY
	@RequestMapping(value = "/allergies", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addAllergy(@RequestBody AllergyDTO allergy){
		allergyService.save(allergy);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	//READ ALLERGY
	@RequestMapping(value = "/allergies", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<AllergyDTO> showAllAllergy(){
		return allergyService.getAll();
	}
	//UPDATE ALLERGY
	@RequestMapping(value = "/allergies/{allergyId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateAllergy(@PathVariable String allergyId, @RequestBody AllergyDTO allergy){
		if(allergyId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			allergyService.update(allergy);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	//DELETE ALLERGY
	@RequestMapping(value = "/allergies/{allergyId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteAllergy(@PathVariable String allergyId, @RequestBody AllergyDTO allergy){
		
		if(allergyId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			allergyService.delete(allergy);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	/****LOG****/
	//CREATE LOG
	@RequestMapping(value = "/logs", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addLog(@RequestBody LogDTO log){
		logService.save(log);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	//READ LOG
	@RequestMapping(value = "/logs", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ArrayList<LogDTO> showAllLog(){
		return logService.getAll();
	}
	//UPDATE LOG
	@RequestMapping(value = "/logs/{logId}", method = RequestMethod.PUT, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> updateLog(@PathVariable String logId, @RequestBody LogDTO log){
		if(logId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			logService.update(log);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	//DELETE LOG
	@RequestMapping(value = "/logs/{logId}", method = RequestMethod.DELETE, produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Void> deleteLog(@PathVariable String logId, @RequestBody LogDTO log){		
		if(logId == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			logService.delete(log);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}

