package com.example.demo.entity;

import jakarta.persistence.Column;

public class LoginCredentialsDTO {

	private String email;
	private String username;
	private String password;
	private String phoneNo;
	@Column(columnDefinition = "Boolean")
	private boolean isAdmin;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LoginCredentialsDTO() {
		super();
	}

	public LoginCredentialsDTO(String email, String username, String password, String phoneNo, boolean isAdmin) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.isAdmin = isAdmin;
	}
}
