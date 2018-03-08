package com.csc.service;

import java.util.ArrayList;

import com.csc.model.TreatmentDTO;

public interface TreatmentService {

	public void saveOrUpdate(TreatmentDTO u);
	public ArrayList<TreatmentDTO> getAll();
	public void delete(TreatmentDTO u);
}