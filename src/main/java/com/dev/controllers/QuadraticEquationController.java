package com.dev.controllers;

import com.dev.dto.QuadraticEquationRequestDto;
import com.dev.dto.QuadraticEquationResponseDto;
import com.dev.model.QuadraticEquation;
import com.dev.service.QuadraticEquationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuadraticEquationController {
    @Autowired
    private QuadraticEquationService equationService;

    @RequestMapping(value = "/coefficients", method = RequestMethod.POST)
    public String add(QuadraticEquationRequestDto qe, Model model) {
        if (qe.getA() == 0) return "errorZeroA";
        QuadraticEquationResponseDto response = converToResponseDto(equationService.add(new QuadraticEquation(
                qe.getA()
                , qe.getB()
                , qe.getC())));
        if (response.getD() < 0) return "errorNoRoots";

        model.addAttribute("resp", response);
        return "getСalculate";
    }

    @GetMapping
    public String getResult() {
        return "addСoefficients";
    }

    private QuadraticEquationResponseDto converToResponseDto(QuadraticEquation equation) {
        QuadraticEquationResponseDto qr = new QuadraticEquationResponseDto();
        qr.setA(equation.getA());
        qr.setB(equation.getB());
        qr.setC(equation.getC());
        qr.setD(equation.getD());
        if (equation.getD() == 0) {
            qr.setRoots("x = " + equation.getX1());
        } else {
            qr.setRoots("x1 = " + equation.getX1() + " x2 = " + equation.getX2());
        }
        return qr;
    }
}
