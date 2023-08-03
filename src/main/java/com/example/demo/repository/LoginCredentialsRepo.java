package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.LoginCredentials;

@Repository
public interface LoginCredentialsRepo extends JpaRepository<LoginCredentials, Long> {
	LoginCredentials findByUsernameOrEmailOrPhoneNoAndPassword(String username, String email, String phoneNo,
			String password);
	LoginCredentials findByUsername(String username);
}
