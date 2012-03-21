package com.blusoft.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.blusoft.server.manager.PersonManager;
import com.blusoft.server.model.Person;

@Controller
@RequestMapping("/")
public class Table {

	@Autowired
	PersonManager personManager;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView table() {
    	
    	List <Person> people = new ArrayList<Person>();
    	people.addAll(personManager.findAll());

    	if (people.size() == 0){
    		people.add(new Person(1L, "no data present", "add new person", 12));
    		people.add(new Person(1L, "no data present", "add new person", 12));
    		people.add(new Person(1L, "no data present", "add new person", 12));
    		people.add(new Person(1L, "no data present", "add new person", 12));
    		people.add(new Person(1L, "no data present", "add new person", 12));
    	}
    	
        return new ModelAndView("table", "people", people);
    }

    @RequestMapping(value="/addNewPerson", method = RequestMethod.GET)
    public ModelAndView addNewPerson(@RequestParam("name") String name, @RequestParam("surname") String surname, @RequestParam("age") Integer age) {

//    	List <Person> people = new ArrayList<Person>();
    	Person person = personManager.save(new Person(null, name, surname, age));
//    	people.add(person);
    	
        return new ModelAndView("forward:/");
    }

    
}
