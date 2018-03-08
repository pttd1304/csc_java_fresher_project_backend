package com.csc.service;

import java.util.ArrayList;

import com.csc.model.PersonDTO;

public interface PersonService {

	public void saveOrUpdate(PersonDTO u);
	public ArrayList<PersonDTO> getAll();
	public void delete(PersonDTO u);
}
