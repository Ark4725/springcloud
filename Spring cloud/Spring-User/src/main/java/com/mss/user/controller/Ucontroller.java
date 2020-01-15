package com.mss.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mss.user.model.User;
import com.mss.user.repository.Urepository;

@RestController
public class Ucontroller {
	@Autowired
	Urepository ur;

	@PostMapping("/add")
	public User adduser(@RequestBody User usr) {

		return ur.save(usr);
	}

	@GetMapping("/get")
	public List<User> getAllUserDetails() {
		return ur.findAll();
	}

	@GetMapping("/gt/{id}")
	public Optional<User> getUserDetailById(@PathVariable Long id) {
		return ur.findById(id);

	}

	@GetMapping("/count")
	public long list() {
		return ur.count();
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return ur.save(user);
	}

	@DeleteMapping("/del/{id}")
	public void deleteUserDetails(User usr) {
		ur.delete(usr);

	}

}
