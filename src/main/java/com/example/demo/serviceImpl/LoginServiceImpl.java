package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.LoginCredentials;
import com.example.demo.entity.LoginCredentialsDTO;
import com.example.demo.repository.LoginCredentialsRepo;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginCredentialsRepo loginCredentialsRepository;

	@Override
	public String login(String upe, String password) {
		LoginCredentials credentials = loginCredentialsRepository.findByUsernameOrEmailOrPhoneNoAndPassword(upe, upe,
				upe, password);
		if (credentials != null) {
			if (credentials.isAdmin()) {
				return "admin_dashboard";
			} else {
				return "user_dashboard";
			}
		}
		return "login_error";
	}

	@SuppressWarnings("unused")
	@Override
	public void saveLoginCredentials(LoginCredentialsDTO loginCredentialsDTO) {
		LoginCredentials loginCredentials = new LoginCredentials();
		loginCredentials.setEmail(loginCredentialsDTO.getEmail());
		loginCredentials.setUsername(loginCredentialsDTO.getUsername());
		loginCredentials.setPassword(loginCredentialsDTO.getPassword());
		loginCredentials.setPhoneNo(loginCredentialsDTO.getPhoneNo());
		Boolean isAdmin = loginCredentialsDTO.isAdmin();
		if (isAdmin == null) {
			isAdmin = false;
		}
		loginCredentials.setAdmin(isAdmin);
		loginCredentialsRepository.save(loginCredentials);
	}

	public void login1(String username) {
		LoginCredentials login = loginCredentialsRepository.findByUsername(username);
		login.getClass();
	}

	public void Logins(String password) {
		LoginCredentials logg = loginCredentialsRepository.findByUsername(password);
		logg.notify();
	}

	public void LoginBy(String password) {
		LoginCredentials log = loginCredentialsRepository.findByUsername(password);
		log.isAdmin();
	}
}
