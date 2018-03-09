package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.AllergyDTO;

public interface AllergyDAO {

	public void saveOrUpdate(AllergyDTO u);

	public ArrayList<AllergyDTO> getAll();

	public void delete(AllergyDTO u);
}
