package com.vanillatechie.firstSpringBootJava.serviceInterfaces;

import com.vanillatechie.firstSpringBootJava.models.User;

import java.util.List;

public interface UserDaoService {

	public List<User> findAll();
	public User save(User user);
	public User findOne(int id);
	
	
}
