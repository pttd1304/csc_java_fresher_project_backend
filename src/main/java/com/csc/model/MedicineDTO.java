
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
import javax.persistence.OneToMany;

@Entity(name = "medicines")
public class MedicineDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "medicineId")
	private String medicineId;
	@Column(name = "name")
	private String name;
	@Column(name = "nsx")
	private String nsx;
	@Column(name = "exp")
	private String exp;
	@Column(name = "company")
	private String company;
	@Column(name = "quantity")
	private int quantity;

	@OneToMany(mappedBy = "medicines", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AllergyDTO> allergys = new HashSet<AllergyDTO>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNsx() {
		return nsx;
	}

	public void setNsx(String nsx) {
		this.nsx = nsx;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
