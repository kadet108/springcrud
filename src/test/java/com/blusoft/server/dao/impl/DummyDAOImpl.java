package com.blusoft.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.blusoft.server.dao.DummyDAO;
import com.blusoft.server.model.DummyEntity;

/**
 * Plain DAO which provides only {@link com.blusoft.server.dao.impl.GenericHibernateDAOImpl} methods
 */
@Repository
public class DummyDAOImpl extends GenericHibernateDAOImpl<DummyEntity, Long> implements DummyDAO {
    
}
