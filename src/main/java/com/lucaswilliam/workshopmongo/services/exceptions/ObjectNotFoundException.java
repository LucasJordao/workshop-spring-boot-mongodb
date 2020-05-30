package com.lucaswilliam.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String id) {
		super("Id object: " + id + ", not found");
	}

}
