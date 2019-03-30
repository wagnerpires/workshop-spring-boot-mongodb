package com.catalinazulu.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -290798483274401335L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
