package com.lucaswilliam.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaswilliam.workshopmongo.domain.Post;
import com.lucaswilliam.workshopmongo.repositories.PostRepository;
import com.lucaswilliam.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(id));
	}

	
	public List<Post> findByTitle(String text){
		return repository.findByTitleContainingIgnoreCase(text);
	}
}
