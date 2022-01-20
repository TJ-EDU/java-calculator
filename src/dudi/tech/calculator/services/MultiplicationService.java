package dudi.tech.calculator.services;

import dudi.tech.calculator.entities.Multiplication;
import dudi.tech.calculator.services.impl.MultiplicationServiceImpl;

public class MultiplicationService {

    private MultiplicationServiceImpl multiplicationServiceImpl;
    private Multiplication multiplication = null;

    public MultiplicationService(MultiplicationServiceImpl multiplicationServiceImpl) {
        this.multiplicationServiceImpl = multiplicationServiceImpl;
        loadData();
    }

    public void loadData() {
        this.multiplication = new Multiplication(5.0, 12.0);
    }

    public Double getMultiplication() {
        return multiplicationServiceImpl.calculate(multiplication.getFirstNumber(), multiplication.getSecondNumber());
    }

    public void viewMultiplication() {
        System.out.println("MULTIPLICACIÓN entre " + multiplication.getFirstNumber() + " x "
                + multiplication.getSecondNumber() + " = " + getMultiplication());
    }

}
