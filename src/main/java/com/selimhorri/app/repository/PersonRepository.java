package com.selimhorri.app.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.selimhorri.app.model.Person;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, String> {
	
	
	
}
