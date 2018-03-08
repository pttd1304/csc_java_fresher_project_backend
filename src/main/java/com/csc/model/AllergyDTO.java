
package com.csc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="allergies")
public class AllergyDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "personCMND")
	private String personCMND;
	@Column(name = "medicineId")
	private String medicineId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonCMND() {
		return personCMND;
	}
	public void setPersonCMND(String personCMND) {
		this.personCMND = personCMND;
	}
	public String getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	

}
