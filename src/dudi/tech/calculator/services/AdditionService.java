package dudi.tech.calculator.services;

import dudi.tech.calculator.entities.Addition;
import dudi.tech.calculator.services.impl.AdditionServiceImpl;

public class AdditionService {

    private AdditionServiceImpl additionServiceImpl;
    private Addition addition = null;

    public AdditionService(AdditionServiceImpl additionServiceImpl) {
        this.additionServiceImpl = additionServiceImpl;
        loadData();
    }

    public void loadData() {
        this.addition = new Addition(34.0, 43.0);
    }

    public Double getAddition() {
        return additionServiceImpl.calculate(addition.getFirstNumber(), addition.getSecondNumber());
    }

    public void viewAddition() {
        System.out.println(
                "SUMA entre " + addition.getFirstNumber() + " + " + addition.getSecondNumber() + " = " + getAddition());
    }

}
