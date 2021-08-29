package com.selimhorri.app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(
	indexName = "persons",
	createIndex = true,
	shards = 1,
	replicas = 2
)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String personId;
	private String fname;
	private String lname;
	
}
