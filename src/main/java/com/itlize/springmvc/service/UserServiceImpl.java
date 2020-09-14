package com.itlize.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itlize.springmvc.dao.UserDao;
import com.itlize.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public User getById(int id) {
		
		return dao.findById(id);
	}

	@Override
	public void saveUser(User user) {

		dao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		User entity=dao.findById(user.getId());
		if(entity!=null) {
			entity.setName(user.getName());
			entity.setPassword(user.getPassword());
			entity.setEmail(user.getEmail());
			entity.setPhone(user.getPhone());
		}
		
	}

}
