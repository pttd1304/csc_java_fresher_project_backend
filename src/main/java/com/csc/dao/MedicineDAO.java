package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.MedicineDTO;

public interface MedicineDAO {

	public void saveOrUpdate(MedicineDTO u);
	public ArrayList<MedicineDTO> getAll();
	public void delete(MedicineDTO u);
}