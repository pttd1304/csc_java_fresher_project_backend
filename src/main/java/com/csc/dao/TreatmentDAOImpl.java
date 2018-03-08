package com.csc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.TreatmentDTO;

@Repository
@Transactional
public class TreatmentDAOImpl implements TreatmentDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void saveOrUpdate(TreatmentDTO u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);
	}

	public ArrayList<TreatmentDTO> getAll() {
		return (ArrayList<TreatmentDTO>) getSessionFactory().getCurrentSession().createQuery("from treatments").list();
	}

	@Override
	public void delete(TreatmentDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
