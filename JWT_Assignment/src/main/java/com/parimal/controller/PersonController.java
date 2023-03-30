package com.parimal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parimal.service.PersonService;

@RestController
public class PersonController
{
	@Autowired
	private PersonService personService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/")
	public String testHandler()
	{
		return "Welcome Parimal";
	}

}
