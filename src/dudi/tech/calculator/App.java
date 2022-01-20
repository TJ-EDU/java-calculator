package dudi.tech.calculator;

import dudi.tech.calculator.services.CalculatorService;

public class App {

    public static void main(String[] args) throws Exception {

        CalculatorService calculatorService = new CalculatorService();
        calculatorService.getOperations();

    }
}
