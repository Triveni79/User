package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.LoginCredentialsDTO;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam("upe") String upe,
                                        @RequestParam("password") String password) {
        String dashboard = loginService.login(upe, password);
        if (dashboard.equals("admin_dashboard")) {
             return ResponseEntity.ok("Welcome To Admin");
        } else if (dashboard.equals("user_dashboard")) {
             return ResponseEntity.ok("Welcome To User");
        } else {
            return ResponseEntity.badRequest().body("Invalid login credentials");
        }
    }
 
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LoginCredentialsDTO loginCredentialsDTO) {
        try {
        	loginService.saveLoginCredentials(loginCredentialsDTO);
            return ResponseEntity.ok("Registration successful!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Registration failed: " + e.getMessage());
        }
    }
}
