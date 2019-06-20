package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	User create(User user);
	User retrieveByName(String name);
	User update(User user);
	void deleteByName(String name);
}
