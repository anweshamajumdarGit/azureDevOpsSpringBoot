package com.vanillatechie.firstSpringBootJava.models;


import lombok.Data;

import java.util.Objects;

@Data
public class Post {
	
	private String id;
	private String description;
	
	public Post(String id, String description) {
		this.id = id;
		this.description = description;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Post post)) return false;
		return Objects.equals(getId(), post.getId()) && Objects.equals(getDescription(), post.getDescription());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getDescription());
	}
	
	@Override
	public String toString() {
		return "Post{" +
				"id='" + id + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
