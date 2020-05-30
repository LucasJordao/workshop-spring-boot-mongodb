package com.lucaswilliam.workshopmongo.resources.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lucaswilliam.workshopmongo.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ObjectNotFoundException e, HttpServletRequest http){
		HttpStatus status = HttpStatus.NOT_FOUND;
		String error = "Resource not found";
		Instant moment = Instant.now();
		StandardError err = new StandardError(error, status.value(), moment, e.getMessage(), http.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
}
