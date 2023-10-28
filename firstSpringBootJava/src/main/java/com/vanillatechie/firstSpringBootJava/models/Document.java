package com.vanillatechie.firstSpringBootJava.models;

public class Document {
	
	private String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Document{" +
				"name='" + name + '\'' +
				'}';
	}
}
