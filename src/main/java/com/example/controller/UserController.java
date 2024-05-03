package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;


@RestController
@RequestMapping(value="/shop")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/newUrl")
	public void getApi() {
		 
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.createUser(user);
	
	}
	@PostMapping("/addUsers")
	public List<User> addUser(@RequestBody List<User> users){
		return userService.createUser(users);
	}
	
	@GetMapping("/user/{id}")
	public User getuserById(@PathVariable int id) {
	return userService.getUserById(id);
		
	}
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
		
	}
	
	@PutMapping("/updateuser")
	public User updatUser(User user) {
		return userService.updateUser(user);
		
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUserById(id);
		
	}
	
}
