package com.csc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.dao.MedicineDAO;
import com.csc.model.MedicineDTO;


@Service
public class MedicineServiceImpl implements MedicineService {

	MedicineDAO u;
	

	public MedicineDAO getU() {
		return u;
	}

	@Autowired
	public void setU(MedicineDAO u) {
		this.u = u;
	}

	public void saveOrUpdate(MedicineDTO u) {
		getU().saveOrUpdate(u);
	}

	@Override
	public ArrayList<MedicineDTO> getAll() {
		return getU().getAll();
	}

	@Override
	public void delete(MedicineDTO u) {
		getU().delete(u);
		
	}

	
}
