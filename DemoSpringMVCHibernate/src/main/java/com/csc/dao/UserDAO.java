package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.UserDTO;

public interface UserDAO {

	public void saveOrUpdate(UserDTO u);
	public ArrayList<UserDTO> getAll();
	public void delete(UserDTO u);
}
