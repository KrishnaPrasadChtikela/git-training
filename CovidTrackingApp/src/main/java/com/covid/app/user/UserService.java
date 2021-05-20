package com.covid.app.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository covidAppRepository;

	public List<User> getAllUsers() {
		return covidAppRepository.findAll();
	}

	public User createUser(User user) {
		return covidAppRepository.save(user);
	}

	public User getUserById(Integer userId) {
		return covidAppRepository.findById(userId).get();
	}

	public void deleteUser(Integer userId) {
		covidAppRepository.deleteById(userId);
	}

	public User updateUser(Integer userId, User user) {
		Optional<User> optional = covidAppRepository.findById(userId);
		if (optional.isPresent()) {
			User userObj = optional.get();
			userObj.setAddress(user.getAddress());
			userObj.setName(user.getName());
			return covidAppRepository.save(userObj);
		}
		return null;
	}

}
