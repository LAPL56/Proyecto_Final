package com.registro_estudiantes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro_estudiantes.model.Country;
import com.registro_estudiantes.service.CountryService;

@RestController
@RequestMapping("/pais")
public class CountryREST {
	@Autowired
	private CountryService countryService; 
	@GetMapping
	private ResponseEntity<List<Country>> getAllCountries(){
		return ResponseEntity.ok(countryService.findAll());
	}
}
