package com.csc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.dao.PersonDAO;
import com.csc.model.PersonDTO;


@Service
public class PersonServiceImpl implements PersonService {

	PersonDAO u;
	

	public PersonDAO getU() {
		return u;
	}

	@Autowired
	public void setU(PersonDAO u) {
		this.u = u;
	}

	public void save(PersonDTO u) {
		getU().save(u);
	}
	public void update(PersonDTO u) {
		getU().update(u);
	}

	@Override
	public ArrayList<PersonDTO> getAll() {
		return getU().getAll();
	}

	@Override
	public void delete(PersonDTO u) {
		getU().delete(u);
		
	}

	@Override
	/**
	 * @author abc
	 * @return ID
	 */
	public PersonDTO getById(int id) {
		return getU().getById(id);
	}

	
}
