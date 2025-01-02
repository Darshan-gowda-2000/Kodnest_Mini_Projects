package com.kodbook.services;

import org.springframework.stereotype.Service;

import com.kodbook.models.User;

@Service
public interface UserService {

	void addUser(User user);

	boolean userExists(String username, String email);

}
