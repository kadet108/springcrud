package com.blusoft.server.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.blusoft.server.model.Person;

public class PersonDaoImpl extends GenericHibernateDAOImpl<Person, Long> {

	@Autowired
    public void init(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
	
}
