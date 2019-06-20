package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

//@Service("userService")
public class UserServiceImpl implements UserService{
	List <User> userList;
	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User retrieveByName(String name) {
		User user = new User("male", "john");
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}

}
