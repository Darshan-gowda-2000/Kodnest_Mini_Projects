package com.kodbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.models.User;
import com.kodbook.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public void addUser(User user) { 
		repo.save(user);
	}

	@Override
	public boolean userExists(String username, String email) {
		 
		User user1=repo.findByusername(username);
		User user2=repo.findByEmail(email);
		if(user1!=null || user2!=null) {
			return true;
		}
		return false;
	}
}
