package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository; 
	
	public List<User> getAllUsers(){
		
		List <User> users = new ArrayList<>();
		userRepository.findAll()
		.forEach(users::add);
		
		return users;
		
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public Optional<User> getUser(String id){
		return userRepository.findById(id);
	}
	
	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
	
	public void updateUser(String id, User user) {
		userRepository.save(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	User user1 = new User(
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"Jany@gmail.com");
			
		User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
			"Jadon@gmail.com");
			
	private List<User> users = Arrays.asList(user1, user2);
	
	

	public List<User> getAllUsers() {
		return users;
	}
	
	public User getUser(String id) {
		User user = users.stream()
				.filter(t -> id.equals(t.getId()))
				.findFirst()
				.orElse(null);
		return user;
	}

	public void addUser(User user) {
		users.add(user);
		
	}

	public void updateLocation(User user, String id) {
		for(int i=0; i<users.size();i++) {
			User u = users.get(i);
			if(u.getId().equals(id)) {
				users.set(i, user);
			}
			
			
		}
		
	}

	public void deleteUser(String id) {
		users.removeIf(t -> t.getId().equals(id));
		
	}
	*/

}
