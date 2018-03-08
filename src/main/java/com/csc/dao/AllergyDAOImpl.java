package com.csc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.AllergyDTO;

@Repository
@Transactional
public class AllergyDAOImpl implements AllergyDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void saveOrUpdate(AllergyDTO u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);
	}

	public ArrayList<AllergyDTO> getAll() {
		return (ArrayList<AllergyDTO>) getSessionFactory().getCurrentSession().createQuery("from allergies").list();
	}

	@Override
	public void delete(AllergyDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
