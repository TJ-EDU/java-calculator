package dudi.tech.calculator.services;

import dudi.tech.calculator.entities.Division;
import dudi.tech.calculator.services.impl.DivisionServiceImpl;

public class DivisionService {

    private DivisionServiceImpl divisionServiceImpl;
    private Division division = null;

    public DivisionService(DivisionServiceImpl divisionServiceImpl) {
        this.divisionServiceImpl = divisionServiceImpl;
        loadData();
    }

    public void loadData() {
        this.division = new Division(125.0, 5.0);
    }

    public Double getDivision() {
        return divisionServiceImpl.calculate(division.getFirstNumber(), division.getSecondNumber());
    }

    public void viewDivision() {
        System.out.println("DIVISIÓN entre " + division.getFirstNumber() + " / " + division.getSecondNumber() + " = "
                + getDivision());
    }

}
