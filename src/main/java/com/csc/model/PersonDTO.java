
package com.csc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="persons")
public class PersonDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "address")
	private String address;
	@Column(name = "dob")
	private String dob;
	@Column(name = "sex")
	private String sex;
	@Column(name = "cmnd")
	private String cmnd;
	
	@OneToMany(mappedBy = "persons", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<TreatmentDTO> treatments = new HashSet<TreatmentDTO>();
	
	@OneToMany(mappedBy = "persons", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<AllergyDTO> allergys = new HashSet<AllergyDTO>();

	@OneToOne(cascade = CascadeType.ALL)
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public Set<TreatmentDTO> getTreatments() {
		return treatments;
	}
	public void setTreatments(Set<TreatmentDTO> treatments) {
		this.treatments = treatments;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Set<AllergyDTO> getAllergys() {
		return allergys;
	}
	public void setAllergys(Set<AllergyDTO> allergys) {
		this.allergys = allergys;
	}
}
