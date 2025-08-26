package com.uob;

public class LoanProcessor {

    public void processLoan() {
        // BUG: Null pointer → accessing null may cause runtime failure
        String customer = null;
        System.out.println(customer.length());
    }
}
