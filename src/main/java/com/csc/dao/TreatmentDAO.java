package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;

public interface TreatmentDAO {

	public void update(TreatmentDTO u);
	public void save(TreatmentDTO u);
	public ArrayList<TreatmentDTO> getAll();
	public ArrayList<TreatmentDTO> getAllById(String cmnd);
	public void delete(TreatmentDTO u);
}
