package com.peerlender.lendingengine;

import com.peerlender.lendingengine.domain.model.Users;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new Users("John", "John","B", 27, "Software Developer"));
		userRepository.save(new Users("Peter", "Peter","C", 21, "Pilot"));
		userRepository.save(new Users("Henry", "Henry","E", 21, "Unemployed"));

	}
}
