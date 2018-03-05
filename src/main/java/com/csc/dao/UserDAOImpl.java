package com.csc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.UserDTO;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void saveOrUpdate(UserDTO u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);
	}

	public ArrayList<UserDTO> getAll() {
		return (ArrayList<UserDTO>) getSessionFactory().getCurrentSession().createQuery("from users").list();
	}

	@Override
	public void delete(UserDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}


}
