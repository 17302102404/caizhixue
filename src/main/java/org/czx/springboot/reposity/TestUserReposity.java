package org.czx.springboot.reposity;

import org.czx.springboot.domain.TestUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by ASUS on 2018/5/12.
 */
@Repository
public class TestUserReposity {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public List<TestUser> selectBySql(String sql) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createSQLQuery(sql);
        return query.list();
    }

}
