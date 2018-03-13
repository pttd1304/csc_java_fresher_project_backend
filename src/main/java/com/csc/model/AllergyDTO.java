
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
	private String personId;
	@Column(name = "medicineId")
	private String medicineId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "personId")
	private PersonDTO persons;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}
	public PersonDTO getPersons() {
		return persons;
	}
	public void setPersons(PersonDTO persons) {
		this.persons = persons;
	}

	

}
