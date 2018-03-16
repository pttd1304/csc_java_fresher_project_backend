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

	
	public void save(AllergyDTO u) {
		getSessionFactory().getCurrentSession().save(u);
	}
	
	public void update(AllergyDTO u) {
		getSessionFactory().getCurrentSession().update(u);
	}


	public ArrayList<AllergyDTO> getAll() {
		return (ArrayList<AllergyDTO>) getSessionFactory().getCurrentSession().createQuery("from allergies").list();
	}
	
	public ArrayList<AllergyDTO> getAllById(int id) {
		String hql = "from allergies where personId = :id";
		return (ArrayList<AllergyDTO>) getSessionFactory().getCurrentSession().createQuery(hql).setParameter("id", id).list();
	}

	@Override
	public void delete(AllergyDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
