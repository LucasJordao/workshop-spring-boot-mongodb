package com.lucaswilliam.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaswilliam.workshopmongo.domain.User;
import com.lucaswilliam.workshopmongo.dto.UserDTO;
import com.lucaswilliam.workshopmongo.repositories.UserRepository;
import com.lucaswilliam.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		List<User> obj = repository.findAll();
		
		return obj;
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.insert(user);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public User update(String id, User obj) {
		User user = findById(id);
		user.setName(obj.getName());
		user.setEmail(obj.getEmail());
		user.setId(obj.getId());
		obj = repository.save(user);
		
		return obj; 
	}
	
	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}

}
