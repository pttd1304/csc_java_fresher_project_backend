
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

@Entity(name="treatments")
public class TreatmentDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "prescription")
	private String prescription;
//	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name = "medicalResult")
	private String medicalResult;	
	@Column(name = "doctorId")
	private String doctorId;
	@Column(name = "diseases")
	private String diseases;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "personId")
	private PersonDTO persons;
	
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
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public PersonDTO getPersons() {
		return persons;
	}
	public void setPersons(PersonDTO persons) {
		this.persons = persons;
	}
	
}
