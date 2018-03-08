package com.csc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.PersonDTO;

@Repository
@Transactional
public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void saveOrUpdate(PersonDTO u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);
	}

	public ArrayList<PersonDTO> getAll() {
		return (ArrayList<PersonDTO>) getSessionFactory().getCurrentSession().createQuery("from persons").list();
	}

	@Override
	public void delete(PersonDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
