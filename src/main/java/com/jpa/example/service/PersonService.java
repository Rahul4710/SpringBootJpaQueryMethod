package com.jpa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.example.entity.Person;
import com.jpa.example.repository.PersonDao;

@Service
public class PersonService {
	@Autowired
	private PersonDao dao;

	public void savePersonById(Person person) {
		dao.save(person);
		
	}

	public Iterable<Person> savePersons(List<Person> asList) {
		Iterable<Person> saveAll = dao.saveAll(asList);
		return saveAll;
		
	}

	public Iterable<Person> getPersonById(List<Integer> list) {
		Iterable<Person> iterable = dao.findAllById(list);
		return iterable;
	}

	public void deletePersonById(Person person) {
		dao.delete(person);
		
	}

	public List<Person> getPersonByLastName(String lastName) {
		List<Person> name = dao.findByLastName(lastName);
		return name;
	}

	

}
