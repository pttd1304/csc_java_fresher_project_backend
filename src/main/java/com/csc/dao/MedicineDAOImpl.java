package com.csc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.MedicineDTO;

@Repository
@Transactional
public class MedicineDAOImpl implements MedicineDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void save(MedicineDTO u) {
		getSessionFactory().getCurrentSession().save(u);
	}
	public void update(MedicineDTO u) {
		getSessionFactory().getCurrentSession().update(u);
	}

	public ArrayList<MedicineDTO> getAll() {
		return (ArrayList<MedicineDTO>) getSessionFactory().getCurrentSession().createQuery("from medicines").list();
	}

	@Override
	public void delete(MedicineDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
