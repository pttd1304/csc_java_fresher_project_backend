
package com.csc.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.springframework.web.multipart.MultipartFile;

@Entity(name="treatments")
public class TreatmentDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@ManyToOne(optional = false)
//	@JoinColumn(name = "personId")
//	private PersonDTO persons;
	@Column(name = "personId")
	private int personId;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	@Column(name = "prescription")
	private String prescription;
	
//	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name = "medicalResult")
	private String medicalResult;
	
	@Column(name = "medicine")
	private String medicine;
	
	@Column(name = "diseases")
	private String diseases;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}



	public String getMedicalResult() {
		return medicalResult;
	}
	public void setMedicalResult(String medicalResult) {
		this.medicalResult = medicalResult;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}


	

}
