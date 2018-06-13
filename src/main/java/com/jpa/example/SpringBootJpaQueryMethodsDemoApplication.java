package com.jpa.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.example.entity.Person;
import com.jpa.example.service.PersonService;

@SpringBootApplication
public class SpringBootJpaQueryMethodsDemoApplication implements CommandLineRunner{
	@Autowired
	private PersonService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaQueryMethodsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//savePersonById();
		//savePersons();
		//getPersonById();
		//deletePersonById();
		//getPersonByLastName();
		getPersonInfoByFirstNameAndEmail();
		
	}

	private void getPersonInfoByFirstNameAndEmail() {
		List<Person> list=service.getPersonInfoByFirstNameAndEmail("priya","priya890@gmail.com");
		for (Person person : list) {
			System.out.println(person);
			
		}
		
	}

	private void getPersonByLastName() {
		List<Person> list=service.getPersonByLastName("soni");
		list.forEach(System.out::println);
		
	}

	private void deletePersonById() {
		Person person=new Person();
		person.setId(11);
		service.deletePersonById(person);
		
	}

	private void getPersonById() {

		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		Iterable<Person> pIterable=service.getPersonById(list);
		 pIterable.forEach(System.out::println);		
		}
		


	private void savePersons() {
		List<Person> asList = Arrays.asList(new Person("Priya", "soni", "priya890@gmail.com", new Date()),
				new Person("Surbhi", "singh", "surbhi132@gmail.com", new Date()),
				new Person("puja", "kumari", "pujamom08", new Date()));
		Iterable<Person> person1=service.savePersons(asList);
		person1.forEach(System.out::println);
		
		
		
	}

	private void savePersonById() {
		Person person=new Person("Nikhil", "SIngh", "nikhil09@gmail.com", new Date());
		service.savePersonById(person);
		
	}
}
