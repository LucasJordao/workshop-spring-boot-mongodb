package com.lucaswilliam.workshopmongo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaswilliam.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User user = new User(1L, "Lucas", "lucas@hotmail.com");
		List<User> list = Arrays.asList(user);
		
		return ResponseEntity.ok().body(list);
	}
}
