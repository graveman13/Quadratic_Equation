package com.dev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuadraticEquation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double x1;
    private Double x2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = calculateDiscriminant();
        calculateTheRoots();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }

    private Double calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    private void calculateTheRoots() {
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
        }
        if (d == 0) {
            x1 = -b / (2 * a);
        }
    }

    public Boolean isEquationHasRoots() {
        return d >= 0;
    }
}
