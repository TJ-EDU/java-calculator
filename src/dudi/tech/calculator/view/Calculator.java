package dudi.tech.calculator.view;

import dudi.tech.calculator.services.AdditionService;
import dudi.tech.calculator.services.DivisionService;
import dudi.tech.calculator.services.MultiplicationService;
import dudi.tech.calculator.services.SubtractionService;
import dudi.tech.calculator.services.impl.AdditionServiceImpl;
import dudi.tech.calculator.services.impl.DivisionServiceImpl;
import dudi.tech.calculator.services.impl.MultiplicationServiceImpl;
import dudi.tech.calculator.services.impl.SubtractionServiceImpl;

public class Calculator {

    public Calculator() {

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
