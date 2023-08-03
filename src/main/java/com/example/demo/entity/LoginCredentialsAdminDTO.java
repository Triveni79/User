package com.example.demo.entity;

public class LoginCredentialsAdminDTO extends LoginCredentialsDTO {

	private boolean isAdmin;

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public LoginCredentialsAdminDTO() {
		super();
	}

	public LoginCredentialsAdminDTO(String email, String username, String password, String phoneNo, boolean isAdmin) {
		super(email, username, password, phoneNo, isAdmin);
	}

	public LoginCredentialsAdminDTO(boolean isAdmin) {
		super();
		this.isAdmin = isAdmin;
	}
}
