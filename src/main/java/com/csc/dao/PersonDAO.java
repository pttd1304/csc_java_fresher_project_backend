package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.PersonDTO;

public interface PersonDAO {

	public void saveOrUpdate(PersonDTO u);
	public ArrayList<PersonDTO> getAll();
	public void delete(PersonDTO u);
}
