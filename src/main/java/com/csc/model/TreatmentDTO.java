
package com.csc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="treatments")
public class TreatmentDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "treatmentId")
	private String treatmendId;
	@Column(name = "prescription")
	private String prescription;
	@Column(name = "medicalResult")
	private String medicalResult;
	@Column(name = "doctorId")
	private String doctorId;
	@Column(name = "creationDate")
	private String creationDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTreatmendId() {
		return treatmendId;
	}
	public void setTreatmendId(String treatmendId) {
		this.treatmendId = treatmendId;
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
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	

}
