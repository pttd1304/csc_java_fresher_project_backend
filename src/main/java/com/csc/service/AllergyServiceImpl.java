package com.csc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.dao.AllergyDAO;
import com.csc.model.AllergyDTO;


@Service
public class AllergyServiceImpl implements AllergyService {

	AllergyDAO u;
	

	public AllergyDAO getU() {
		return u;
	}

	@Autowired
	public void setU(AllergyDAO u) {
		this.u = u;
	}

	public void save(AllergyDTO u) {
		getU().save(u);
	}
	public void update(AllergyDTO u) {
		getU().update(u);
	}

	@Override
	public ArrayList<AllergyDTO> getAll() {
		return getU().getAll();
	}

	@Override
	public void delete(AllergyDTO u) {
		getU().delete(u);
		
	}

	
}
