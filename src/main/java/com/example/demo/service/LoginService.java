package com.example.demo.service;

import com.example.demo.entity.LoginCredentialsDTO;

public interface LoginService {
	String login(String upe, String password);
	void saveLoginCredentials(LoginCredentialsDTO loginCredentialsDTO);
}
