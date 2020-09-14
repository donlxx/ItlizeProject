package com.itlize.springmvc.service;

import com.itlize.springmvc.model.User;

public interface UserService {

	User getById(int id);
	
	void saveUser(User user);
	
	void updateUser(User user);
}
