package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.PersonDTO;

public interface PersonDAO {

	public void save(PersonDTO u);
	public void update(PersonDTO u);
	public ArrayList<PersonDTO> getAll();
	public PersonDTO getById(int id);
	public void delete(PersonDTO u);
}
