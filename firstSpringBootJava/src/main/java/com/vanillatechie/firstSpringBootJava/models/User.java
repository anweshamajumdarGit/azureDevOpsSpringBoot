package com.vanillatechie.firstSpringBootJava.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

@Data
public class User {
	
	private Integer id;
	private String name;
	private LocalDate birthDate;
	
	
	public User(Integer id, String name, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User user)) return false;
		return Objects.equals(getId(), user.getId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getBirthDate(), user.getBirthDate());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getBirthDate());
	}
	
	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", birthDate='" + birthDate + '\'' +
				'}';
	}
}
