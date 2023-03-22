package com.registro_estudiantes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro_estudiantes.model.Group;
import com.registro_estudiantes.service.GroupService;

@RestController
@RequestMapping("/grupos")
public class GroupREST {
	@Autowired
	private GroupService groupService;
	@GetMapping("{id}")
	private ResponseEntity<List<Group>> getAllGroupsByCountry(@PathVariable("id") Long idCountry){
		return ResponseEntity.ok(groupService.findAllByCountry(idCountry));
	}
}

