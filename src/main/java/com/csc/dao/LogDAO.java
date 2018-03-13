package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.LogDTO;

public interface LogDAO {

	public void save(LogDTO u);
	public void update(LogDTO u);
	public ArrayList<LogDTO> getAll();
	public void delete(LogDTO u);
}
