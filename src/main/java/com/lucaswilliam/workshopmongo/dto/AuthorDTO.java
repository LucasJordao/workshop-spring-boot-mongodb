package com.lucaswilliam.workshopmongo.dto;

import java.io.Serializable;

import com.lucaswilliam.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Attributes
	private String id;
	private String name;
	
	//Constructors and Overloads
	public AuthorDTO() {
		
	}
	
	public AuthorDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
	}
	
	//Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
