package com.example.PolicyHolder.CRUD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolicyHolderCrudApplication {

	private static final Logger log = LoggerFactory.getLogger(PolicyHolderCrudApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PolicyHolderCrudApplication.class, args);
	}

}
