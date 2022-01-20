package dudi.tech.calculator.services.impl;

import dudi.tech.calculator.services.OperationService;

public class DivisionServiceImpl implements OperationService {

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        Double div;
        try {
            if (secondValue.equals(0.0)) {
                throw new ArithmeticException("ERROR, NO SE PUEDE DIVIDIR ENTRE CERO");
            } else {
                div = (firstValue / secondValue);
            }
        } catch (ArithmeticException e) {
            div = null;
            System.out.println(e.getMessage());
        }
        return div;
    }

}
