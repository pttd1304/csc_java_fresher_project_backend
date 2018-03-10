package com.csc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.dao.LogDAO;
import com.csc.model.LogDTO;


@Service
public class LogServiceImpl implements LogService {

	LogDAO u;
	

	public LogDAO getU() {
		return u;
	}

	@Autowired
	public void setU(LogDAO u) {
		this.u = u;
	}

	public void save(LogDTO u) {
		getU().save(u);
	}
	public void update(LogDTO u) {
		getU().update(u);
	}

	@Override
	public ArrayList<LogDTO> getAll() {
		return getU().getAll();
	}

	@Override
	public void delete(LogDTO u) {
		getU().delete(u);
		
	}

	
}
