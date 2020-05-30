package com.lucaswilliam.workshopmongo.resources.exception;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//Attributes
	private String error;
	private Integer code;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	private String message;
	private String uri;
	
	//Constructors and Overloads
	public StandardError() {
		
	}

	public StandardError(String error, Integer code, Instant moment, String message, String uri) {
		super();
		this.error = error;
		this.code = code;
		this.moment = moment;
		this.message = message;
		this.uri = uri;
	}

	//Getters and Setters
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
