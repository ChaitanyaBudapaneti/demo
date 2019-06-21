package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	  @Id
	  private Long id;
	  private String gender;
	  private String name;
	  
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(String gender, String name) {
		this.gender = gender;
		this.name = name;
	}
	
	public String toString() {
		return this.name + " " + this.gender;
	}
	
	  
}
