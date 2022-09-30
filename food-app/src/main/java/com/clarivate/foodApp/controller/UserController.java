package com.clarivate.foodApp.controller;

import com.clarivate.foodApp.model.User;
import com.clarivate.foodApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/user/add")
	public String addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@DeleteMapping("/user/delete/{id}")
	public void removeUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	@GetMapping("/user/all")
	public List<User> retrieveAllUsers() {
		return userService.getAllUsers();
	}

	@PutMapping("/user/update/{id}")
	public void updateUser(@PathVariable Long id, @RequestBody User user) {
		userService.updateUser(id, user);
	}

}
