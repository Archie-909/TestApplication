package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.entity.User;

@Service
public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User createUser(User user) {
		return userRepository.save(user);

	}

	public List<User> createUser(List<User> userList) {
		return userRepository.saveAll(userList);

	}

	public User getUserById(int id) {
		return userRepository.findById(id).orElse(null);

	}

	public List<User> getAllUsers() {
		return userRepository.findAll();

	}

	public User updateUser(User user) {
		Optional<User> optionalUser = userRepository.findById(user.getId());
		User oldUser = null;
		if (optionalUser.isPresent()) {
			oldUser = optionalUser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			userRepository.save(oldUser);
		} else {
			return new User();
		}
		return oldUser;
	}

	public String deleteUserById(int id) {
		userRepository.deleteById(id);
		return "The user is deleted successfully";
	}
}
