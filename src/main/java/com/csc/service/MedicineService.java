package com.csc.service;

import java.util.ArrayList;

import com.csc.model.MedicineDTO;

public interface MedicineService {

	public void save(MedicineDTO u);
	public void update(MedicineDTO u);
	public ArrayList<MedicineDTO> getAll();
	public void delete(MedicineDTO u);
}
