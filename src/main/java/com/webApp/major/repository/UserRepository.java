package com.webApp.major.repository;



import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webApp.major.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
	

	Optional<User> findUserByEmail(String email);
}
