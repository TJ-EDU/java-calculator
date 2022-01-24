package dudi.tech.calculator.services.impl;

import dudi.tech.calculator.services.IOperationService;

public class SubtractionServiceImpl implements IOperationService {

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return (firstValue - secondValue);
    }

}
