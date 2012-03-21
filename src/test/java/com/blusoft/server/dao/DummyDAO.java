package com.blusoft.server.dao;

import com.blusoft.server.model.DummyEntity;

/**
 * Plain DAO which provides only {@link com.blusoft.server.dao.impl.GenericHibernateDAOImpl} methods
 */
public interface DummyDAO extends GenericDAO<DummyEntity, Long> {
}
