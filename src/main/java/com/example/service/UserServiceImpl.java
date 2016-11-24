package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
    private final UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
    	this.userRepository = userRepository;
    }

	@Override
	public Optional<User> getUserByEmail(String email) {
		return userRepository.findOneByEmail(email);
	}

}
