package com.csc.service;

import java.util.ArrayList;

import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;

public interface TreatmentService {

	public void save(TreatmentDTO u);
	public void update(TreatmentDTO u);
	public ArrayList<TreatmentDTO> getAll();
<<<<<<< HEAD
	public ArrayList<TreatmentDTO> getAllById(int id);
=======
	public ArrayList<TreatmentDTO> getAllById(String cmnd);
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
	public void delete(TreatmentDTO u);
}