package dudi.tech.calculator.services;

import dudi.tech.calculator.entities.Subtraction;
import dudi.tech.calculator.services.impl.SubtractionServiceImpl;

public class SubtractionService {

    private SubtractionServiceImpl subtractionServiceImpl;
    private Subtraction subtraction = null;

    public SubtractionService(SubtractionServiceImpl subtractionServiceImpl) {
        this.subtractionServiceImpl = subtractionServiceImpl;
        loadData();
    }

    public void loadData() {
        this.subtraction = new Subtraction(70.0, 20.0);
    }

    public Double getSubtraction() {
        return subtractionServiceImpl.calculate(subtraction.getFirstNumber(), subtraction.getSecondNumber());
    }

    public void viewSubtraction() {
        System.out.println("RESTA entre " + subtraction.getFirstNumber() + " - " + subtraction.getSecondNumber()
                + " = " + getSubtraction());
    }

}
