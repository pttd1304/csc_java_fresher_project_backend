package com.csc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.dao.TreatmentDAO;
import com.csc.model.PersonDTO;
import com.csc.model.TreatmentDTO;


@Service
public class TreatmentServiceImpl implements TreatmentService {

	TreatmentDAO u;
	

	public TreatmentDAO getU() {
		return u;
	}

	@Autowired
	public void setU(TreatmentDAO u) {
		this.u = u;
	}

	public void save(TreatmentDTO u) {
		getU().save(u);
	}
	public void update(TreatmentDTO u) {
		getU().update(u);
	}

	@Override
	public ArrayList<TreatmentDTO> getAll() {
		return getU().getAll();
	}
	
	@Override
<<<<<<< HEAD
	public ArrayList<TreatmentDTO> getAllById(int id) {
		return getU().getAllById(id);
=======
	public ArrayList<TreatmentDTO> getAllById(String cmnd) {
		return getU().getAllById(cmnd);
>>>>>>> 81fb3a8520c1ec3bae995f7b5b6e5717ce925c83
	}


	@Override
	public void delete(TreatmentDTO u) {
		getU().delete(u);
		
	}

	
}
