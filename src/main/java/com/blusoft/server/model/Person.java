package com.blusoft.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)	
	Long id;
	Integer age;
	String name;
	String surname;
	
	public Person(){
		
	}
	
	public Person(Long id, String name, String surname, Integer age) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
