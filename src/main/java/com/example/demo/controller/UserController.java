package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public User retrieveByName() {
		return userService.retrieveByName("chaitu");
	}
	
	@PostMapping("/")
	public String postexample() {
		return "THIS IS A POST REQUEST";
	}
	
	@RequestMapping(value="/", method = RequestMethod.PUT)
	public String putexample() {
		return "THIS IS A PUT REQUEST";
	}
	
	@RequestMapping(value="/", method = RequestMethod.DELETE)
	public String deleteexample() {
		return "THIS IS A DELETE REQUEST";
	}
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String welcome(@PathVariable String name) {
		return "Hello "+ name;
	}	
	
}
