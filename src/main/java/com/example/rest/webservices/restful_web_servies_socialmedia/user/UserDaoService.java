package com.example.rest.webservices.restful_web_servies_socialmedia.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users=new ArrayList<>();
	
	private static int userCount=4;
	static {
		users.add(new User(1,"Adam",LocalDate.now().minusYears(23)));
		users.add(new User(2,"Ram",LocalDate.now().minusYears(20)));
		users.add(new User(3,"Eve",LocalDate.now().minusYears(21)));
		users.add(new User(4,"Moon",LocalDate.now().minusYears(63)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}

	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		users.removeIf(predicate);
	}
}
