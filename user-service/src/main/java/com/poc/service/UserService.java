package com.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.User;
import com.poc.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {

		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
