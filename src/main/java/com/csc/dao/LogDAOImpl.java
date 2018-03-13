package com.csc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.LogDTO;

@Repository
@Transactional
public class LogDAOImpl implements LogDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void save(LogDTO u) {
		getSessionFactory().getCurrentSession().save(u);
	}
	public void update(LogDTO u) {
		getSessionFactory().getCurrentSession().update(u);
	}

	public ArrayList<LogDTO> getAll() {
		return (ArrayList<LogDTO>) getSessionFactory().getCurrentSession().createQuery("from log").list();
	}

	@Override
	public void delete(LogDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
