package com.csc.dao;

import java.util.ArrayList;

import com.csc.model.UserDTO;

public interface UserDAO {

	public void save(UserDTO u);
	public void update(UserDTO u);
	public ArrayList<UserDTO> getAll();
	public UserDTO checkUser(String uname);
	public void delete(UserDTO u);
}
