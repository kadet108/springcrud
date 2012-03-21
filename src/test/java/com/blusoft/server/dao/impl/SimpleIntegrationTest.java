package com.blusoft.server.dao.impl;

import javax.annotation.Resource;

import org.junit.Test;

import com.blusoft.ApplicationContextAwareTest;
import com.blusoft.server.dao.DummyDAO;
import com.blusoft.server.model.DummyEntity;

import static org.junit.Assert.assertEquals;

/**
 * 
 */
public class SimpleIntegrationTest extends ApplicationContextAwareTest {

    @Resource
    private DummyDAO dummyDAO;

    /**
     * Tries to store {@link com.blusoft.server.model.DummyEntity}.
     */
    @Test
    public void testPersistTestEntity() {
        int countBefore = dummyDAO.findAll().size();
        DummyEntity dummyEntity = new DummyEntity();
        dummyDAO.makePersistent(dummyEntity);

        int countAfter = dummyDAO.findAll().size();
        assertEquals(countBefore + 1, countAfter);
    }
}
