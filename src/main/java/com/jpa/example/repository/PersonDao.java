package com.jpa.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.example.entity.Person;
@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {
	
	 List<Person> findByLastName(String lastName);
	 List<Person> findByFirstNameAndGmail(String firstName,String gmail);

}
