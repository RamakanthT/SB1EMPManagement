package com.example.demo.model;

public class EmpLoginTO {

	String username;
	String password;
	
	public EmpLoginTO() {
		super();
	}
	
	public EmpLoginTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmpLoginTO [username=" + username + ", password=" + password + "]";
	}	
	
}
