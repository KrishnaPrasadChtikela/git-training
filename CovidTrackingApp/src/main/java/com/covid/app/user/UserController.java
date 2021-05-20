package com.covid.app.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService covidAppService;

	@GetMapping
	public List<User> getAllUsers() {
		return covidAppService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Integer userId) {
		return covidAppService.getUserById(userId);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return covidAppService.createUser(user);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		covidAppService.deleteUser(userId);
	}
	
	@PutMapping("/{userId}")
	public User updateUser(@PathVariable Integer userId, @RequestBody User user) {
		return covidAppService.updateUser(userId, user);
	}

}
