package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean checkUser(User user) {
		for (User u : userRepository.findAll())
			if (u.getEmail().equalsIgnoreCase(user.getEmail()) && u.getPassword().equals(user.getPassword()))
				return true;
		return false;
	}

}
