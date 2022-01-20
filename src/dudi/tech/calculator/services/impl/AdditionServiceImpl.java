package dudi.tech.calculator.services.impl;

import dudi.tech.calculator.services.OperationService;

public class AdditionServiceImpl implements OperationService {

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return (firstValue + secondValue);
    }

}