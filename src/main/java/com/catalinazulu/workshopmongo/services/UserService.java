package com.catalinazulu.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.catalinazulu.workshopmongo.domain.User;
import com.catalinazulu.workshopmongo.respository.UserRepository;
import com.catalinazulu.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	
	public Optional<User> findById(String id) {
		// ZULU PROBLEMA PROFESSOR
		// User user = repo.findOne(id);
		
		Example<User> match = Example.of(new User());
		Optional<User> result = repo.findOne(match);
		
		if (result == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return result;
		// return user;
	}

}
