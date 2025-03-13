package com.codurance.ocp;

public class ManagerPayCalculator implements PayCalculator {
    @Override
    public int calculatePay(Employee employee) {
        return employee.getSalary() + employee.getBonus();
    }
}
