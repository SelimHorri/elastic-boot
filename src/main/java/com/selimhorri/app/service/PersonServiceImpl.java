package com.selimhorri.app.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selimhorri.app.model.Person;
import com.selimhorri.app.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
	
	private final PersonRepository personRepository;
	
	@Override
	public List<Person> findAll() {
		
		final List<Person> persons = new ArrayList<>();
		this.personRepository.findAll().forEach(persons::add);
		
		return Collections.unmodifiableList(persons);
	}
	
	@Override
	public Person findById(String personId) {
		return this.personRepository.findById(personId).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Person save(Person person) {
		return this.personRepository.save(person);
	}
	
	@Override
	public Person update(Person person) {
		return this.personRepository.save(person);
	}
	
	@Override
	public void deleteById(String personId) {
		this.personRepository.deleteById(personId);
	}
	
	
	
}









