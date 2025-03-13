package com.codurance.ocp;

public enum EmployeeType {
    MANAGER(new ManagerPayCalculator()),
    ENGINEER(new EngineerPayCalculator());

    private final PayCalculator payCalculator;

    EmployeeType(PayCalculator payCalculator) {
        this.payCalculator = payCalculator;
    }

    public int calculatePay(Employee employee) {
        return payCalculator.calculatePay(employee);
    }

}
