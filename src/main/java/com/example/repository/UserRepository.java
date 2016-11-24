package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findOneByEmail(String email);

}
