package com.selimhorri.app.service;

import java.util.List;

import com.selimhorri.app.model.Person;

public interface PersonService {
	
	List<Person> findAll();
	Person findById(final String employeeId);
	Person save(final Person person);
	Person update(final Person person);
	void deleteById(final String employeeId);
	
}
