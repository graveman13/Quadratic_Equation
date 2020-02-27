package com.dev.service.impl;

import com.dev.dao.QuadraticEquationDao;
import com.dev.model.QuadraticEquation;
import com.dev.service.QuadraticEquationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuadraticEquationServiceImpl implements QuadraticEquationService {
    @Autowired
    private QuadraticEquationDao quadraticEquationDao;

    @Override
    public QuadraticEquation add(QuadraticEquation qe) {
        return quadraticEquationDao.add(qe);
    }

    @Override
    public QuadraticEquation getById(Long id) {
        return quadraticEquationDao.getById(id);
    }
}
