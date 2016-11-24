package com.example.service;

import java.util.Optional;

import com.example.domain.User;

public interface UserService {
	
	Optional<User> getUserByEmail(String email);
	
}
