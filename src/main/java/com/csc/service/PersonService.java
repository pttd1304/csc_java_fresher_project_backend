package com.csc.service;

import java.util.ArrayList;

import com.csc.model.PersonDTO;

public interface PersonService {

	public void save(PersonDTO u);
	public void update(PersonDTO u);
	public ArrayList<PersonDTO> getAll();
	/**
	 * @author abc
	 * @return ID
	 */
	public PersonDTO getById(int id);
	public void delete(PersonDTO u);
}
