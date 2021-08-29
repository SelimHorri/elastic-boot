package com.selimhorri.app.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.model.Person;
import com.selimhorri.app.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = {"/persons"})
@RequiredArgsConstructor
public class PersonResource {
	
	private final PersonService personService;
	
	@GetMapping
	public ResponseEntity<List<Person>> findAll() {
		return new ResponseEntity<>(this.personService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{personId}")
	public ResponseEntity<Person> findById(@PathVariable("personId") final String personId) {
		return new ResponseEntity<>(this.personService.findById(personId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Person> save(@RequestBody final Person person) {
		return new ResponseEntity<>(this.personService.save(person), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Person> update(@RequestBody final Person person) {
		return new ResponseEntity<>(this.personService.update(person), HttpStatus.OK);
	}
	
	@DeleteMapping("/{personId}")
	public ResponseEntity<Person> deleteById(@PathVariable("personId") final String personId) {
		this.personService.deleteById(personId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}











