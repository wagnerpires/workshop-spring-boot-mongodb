package com.catalinazulu.workshopmongo.dto;

import java.io.Serializable;

import com.catalinazulu.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	private static final long serialVersionUID = 469054669906820813L;

	private String id;
	private String name;
	
	public AuthorDTO() {
		
	}
	
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

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
