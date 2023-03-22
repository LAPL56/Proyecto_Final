package com.registro_estudiantes.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro_estudiantes.model.Person;
import com.registro_estudiantes.service.PersonService;

@RestController
@RequestMapping("/estudiantes")
public class PersonREST {
	@Autowired
	private PersonService personService;
	@GetMapping
	private ResponseEntity<List<Person>> getAllPersons(){
		return ResponseEntity.ok(personService.findAll());
	}
	@PostMapping
	private ResponseEntity<Person> savePerson(@RequestBody Person person){
		try {
			Person personaGuardada = personService.save(person);
		return ResponseEntity.created(new URI("/estudiantes"+personaGuardada.getId())).body(personaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
}