package com.csc.service;

import java.util.ArrayList;

import com.csc.model.UserDTO;

public interface UserService {

	public void saveOrUpdate(UserDTO u);
	public ArrayList<UserDTO> getAll();
	public void delete(UserDTO u);
}
