package com.registro_estudiantes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Persona")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="Nombre")
	private String name;
	@Column(name="Apellido")
	private String lastname;
	@Column(name="Edad")
	private int age;
	
	@ManyToOne
	@JoinColumn(name="ID_Pais")
	private Country country;
	@ManyToOne
	@JoinColumn(name="ID_Grupo")
	private Group group;
	
	
	public Person(String name, String lastname, int age, Country country, Group group) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.country = country;
		this.group = group;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	
}

