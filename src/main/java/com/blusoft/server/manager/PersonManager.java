package com.blusoft.server.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blusoft.server.dao.GenericDAO;
import com.blusoft.server.model.Person;

public class PersonManager {

	@Autowired
	GenericDAO<Person, Long> personDao;
	
	public Person find(Long id){
		return personDao.findById(id, true);
	}

	public List<Person> findAll(){
		return personDao.findAll();
	}
	
	public Person save(Person person){
		return personDao.makePersistent(person);
	}
	
}
