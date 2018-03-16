package com.csc.dao;

import java.util.ArrayList;

import javax.management.Query;
import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.csc.model.TreatmentDTO;

@Repository("TreatmentDAO")
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

	
	public void save(TreatmentDTO u) {
		getSessionFactory().getCurrentSession().save(u);
	}
	public void update(TreatmentDTO u) {
		getSessionFactory().getCurrentSession().update(u);
	}

	public ArrayList<TreatmentDTO> getAll() {
		return (ArrayList<TreatmentDTO>) getSessionFactory().getCurrentSession().createQuery("from treatments").list();
	}
	

	public ArrayList<TreatmentDTO> getAllById(int id){
		String hql = "from treatments where personId = :id";
		return (ArrayList<TreatmentDTO>) getSessionFactory().getCurrentSession().createQuery(hql).setParameter("id", id).list();
	}
	
	@Override
	public void delete(TreatmentDTO u) {
		getSessionFactory().getCurrentSession().delete(u);
	}



}
