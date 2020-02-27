package com.dev.service;

import com.dev.model.QuadraticEquation;

public interface QuadraticEquationService {
    QuadraticEquation add(QuadraticEquation qe);

    QuadraticEquation getById(Long id);
}
