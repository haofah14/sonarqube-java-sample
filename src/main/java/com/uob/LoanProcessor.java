package com.uob;

public class LoanProcessor {

    public void processLoan() {
        // CODE SMELL: TODO comment → indicates incomplete logic, adds maintenance risk
        // TODO: add proper validation
        System.out.println("Processing loan.x.");

        int magicNumber = 9999; // CODE SMELL: unused variable → adds clutter

        // BUG: Null pointer → accessing null may cause runtime failure
        String customer = null;
        System.out.println(customer.length());
    }
}
