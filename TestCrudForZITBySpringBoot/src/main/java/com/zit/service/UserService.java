package com.zit.service;

import org.springframework.http.ResponseEntity;

import com.zit.model.User;

public interface UserService {
	ResponseEntity<?> userRegistration(User user);

	ResponseEntity<?> userLogin(User user);

	ResponseEntity<?> getUserById(int id);
	
	ResponseEntity<?> getUserByEmail(String userEmail);

}
