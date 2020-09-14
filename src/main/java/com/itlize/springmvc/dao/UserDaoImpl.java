package com.itlize.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.itlize.springmvc.model.User;

@Repository
public class UserDaoImpl extends AbstractDao<Integer,User> implements UserDao{

	@Override
	public User findById(int id) {
		 
		return getByKey(id);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		persist(user);
	}



}
