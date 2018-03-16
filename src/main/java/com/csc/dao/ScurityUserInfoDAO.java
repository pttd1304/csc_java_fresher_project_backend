package com.csc.dao;

import java.util.List;

import com.csc.model.UserInfo;

public interface ScurityUserInfoDAO {
	public UserInfo findUserInfo(String userName);

	// [USER,AMIN,..]
	public List<String> getUserRoles(String userName);
}
