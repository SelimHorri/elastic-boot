package com.selimhorri.app.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	
}











