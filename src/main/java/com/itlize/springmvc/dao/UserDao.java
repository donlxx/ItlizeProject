package com.itlize.springmvc.dao;

import com.itlize.springmvc.model.User;

public interface UserDao {
	User findById(int id);
	void saveUser(User user);
//	void deleteUserById(int id);
	

}
