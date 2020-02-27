package com.dev.dto;

public class QuadraticEquationResponseDto {
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private String roots;

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

    public String getRoots() {
        return roots;
    }

    public void setRoots(String roots) {
        this.roots = roots;
    }
}
