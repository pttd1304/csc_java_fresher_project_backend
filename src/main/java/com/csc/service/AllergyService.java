package com.csc.service;

import java.util.ArrayList;

import com.csc.model.AllergyDTO;

public interface AllergyService {

	public void saveOrUpdate(AllergyDTO u);
	public ArrayList<AllergyDTO> getAll();
	public void delete(AllergyDTO u);
}
