
package com.csc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="allergies")
public class AllergyDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "personId")
<<<<<<< HEAD
	private int personId;
	@Column(name = "medicine")
	private String medicine;
=======
	private String personId;
	@Column(name = "medicineId")
	private String medicineId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "personId")
	private PersonDTO persons;
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
<<<<<<< HEAD


	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
=======
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
		this.personId = personId;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public PersonDTO getPersons() {
		return persons;
	}
	public void setPersons(PersonDTO persons) {
		this.persons = persons;
	}


}
