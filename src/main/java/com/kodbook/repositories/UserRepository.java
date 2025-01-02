package com.kodbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbook.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByusername(String username);

	User findByEmail(String email);

	
}
