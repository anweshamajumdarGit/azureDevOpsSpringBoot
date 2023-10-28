package com.vanillatechie.firstSpringBootJava.controllers;

import com.vanillatechie.firstSpringBootJava.models.Document;
import com.vanillatechie.firstSpringBootJava.models.User;
import com.vanillatechie.firstSpringBootJava.serviceInterfaces.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	UserDaoService userDaoService;
	@GetMapping
	public List<User> getTest(){
		return (userDaoService.findAll());
	}
	@GetMapping("/doc")
	public Document getTestDoc(){
		//System.out.println("hi");
		return (new Document("doc name is doc"));
	}
	
	@GetMapping("/doc/{name}")
	public Document getTestDocByName(@PathVariable String name){
		//System.out.println("hi");
		return (new Document("the details for the document : " +name));
		//return new Document(String.format("the details for the document : " ,name));
	}
}
