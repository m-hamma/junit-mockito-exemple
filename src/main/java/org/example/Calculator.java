package org.example;

import org.example.services.CalculatorService;

public class Calculator {
    public Calculator() {
        this.calculatorService = new CalculatorService();
    }

    CalculatorService calculatorService;
    public int perform(int i,int j) {
        return this.calculatorService.add(i,j);
    }
}
