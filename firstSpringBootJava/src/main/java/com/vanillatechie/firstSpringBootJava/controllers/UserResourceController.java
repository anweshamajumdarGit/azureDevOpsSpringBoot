package com.vanillatechie.firstSpringBootJava.controllers;

import com.vanillatechie.firstSpringBootJava.models.User;
import com.vanillatechie.firstSpringBootJava.serviceInterfaces.UserDaoService;
import jakarta.servlet.ServletConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/social")
public class UserResourceController {
	@Autowired
	UserDaoService userDaoService;
	@GetMapping("/users")
	public List<User> getAllUsers(){
	 return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Integer id){
		return userDaoService.findOne(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User newUser=userDaoService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
