package com.codurance.ocp;

public class EngineerPayCalculator implements PayCalculator {
    @Override
    public int calculatePay(Employee employee) {
        return employee.getSalary();
    }
}
