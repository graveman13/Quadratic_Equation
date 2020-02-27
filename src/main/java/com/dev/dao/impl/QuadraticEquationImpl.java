package com.dev.dao.impl;

import com.dev.dao.QuadraticEquationDao;
import com.dev.model.QuadraticEquation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuadraticEquationImpl implements QuadraticEquationDao {
    @Autowired
    private SessionFactory sessionFactory;

    public QuadraticEquation add(QuadraticEquation qe) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Long id = (Long) session.save(qe);
            qe.setId(id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't add quadratic equation", e);
        }
        return qe;
    }

    @Override
    public QuadraticEquation getById(Long id) {
        try {
            return sessionFactory.openSession().get(QuadraticEquation.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get quadratic equation", e);
        }
    }
}
