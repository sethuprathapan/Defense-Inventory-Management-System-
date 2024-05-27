package com.inventoryStoreManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private String idEmail;
	private String nameD;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String idEmail, String nameD, String password) {
		super();
		this.idEmail = idEmail;
		this.nameD = nameD;
		this.password = password;
	}
	public String getIdEmail() {
		return idEmail;
	}
	public void setIdEmail(String idEmail) {
		this.idEmail = idEmail;
	}
	public String getNameD() {
		return nameD;
	}
	public void setNameD(String nameD) {
		this.nameD = nameD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
