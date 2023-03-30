package com.parimal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parimal.model.Person;

@Service
public interface PersonService
{
	Person signupPerson(Person person);

	List<List<String>> accessStaticData();

}
