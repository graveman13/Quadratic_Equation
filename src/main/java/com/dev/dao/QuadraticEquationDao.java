package com.dev.dao;

import com.dev.model.QuadraticEquation;

public interface QuadraticEquationDao {
    QuadraticEquation add(QuadraticEquation qe);

    QuadraticEquation getById(Long id);
}
