package com.vanillatechie.firstSpringBootJava.serviceImpl;

import com.vanillatechie.firstSpringBootJava.models.User;
import com.vanillatechie.firstSpringBootJava.serviceInterfaces.UserDaoService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserDaoServiceImpl implements UserDaoService {
	
	private static final List<User> users=new ArrayList<>();
	private static int userCount=0;
	static {
		users.add(new User(++userCount,"anwesha", LocalDate.now().minusYears(39)));
		users.add(new User(++userCount,"anwesha2", LocalDate.now().minusYears(39)));
		users.add(new User(++userCount,"anwesha3", LocalDate.now().minusYears(39)));
		users.add(new User(++userCount,"anwesha4", LocalDate.now().minusYears(39)));
	}
	

	@Override
	public List<User> findAll() {
		
		return users;
	}
	
	@Override
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	
	public User findOneById(int id) {
		for(User user:users){
			if(user.getId()==id){
				return user;
			}
		}
		return null;
	}
	@Override
	public User findOne(int id) {
		
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
		
	}
	
}
