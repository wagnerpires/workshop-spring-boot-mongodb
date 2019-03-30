package com.catalinazulu.workshopmongo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.catalinazulu.workshopmongo.domain.User;
import com.catalinazulu.workshopmongo.respository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		// userRepository.save(Arrays.asList(maria, alex, bob));
		
		userRepository.save(maria);
		userRepository.save(alex);
		userRepository.save(bob);		
	}

}
