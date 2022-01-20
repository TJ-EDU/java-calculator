package dudi.tech.calculator.services;

import dudi.tech.calculator.services.impl.AdditionServiceImpl;
import dudi.tech.calculator.services.impl.DivisionServiceImpl;
import dudi.tech.calculator.services.impl.MultiplicationServiceImpl;
import dudi.tech.calculator.services.impl.SubtractionServiceImpl;

public class CalculatorService {

    public CalculatorService() {

    }

    public void getOperations() {
        AdditionService additionService = new AdditionService(new AdditionServiceImpl());
        additionService.viewAddition();

        SubtractionService subtractionService = new SubtractionService(new SubtractionServiceImpl());
        subtractionService.viewSubtraction();

        MultiplicationService multiplicationService = new MultiplicationService(new MultiplicationServiceImpl());
        multiplicationService.viewMultiplication();

        DivisionService divisionService = new DivisionService(new DivisionServiceImpl());
        divisionService.viewDivision();
    }

}
