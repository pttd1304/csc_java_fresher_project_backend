package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.TreatmentDTO;

public interface TreatmentDAO {

	public void saveOrUpdate(TreatmentDTO u);
	public ArrayList<TreatmentDTO> getAll();
	public void delete(TreatmentDTO u);
}
