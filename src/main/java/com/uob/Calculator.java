package com.uob;

public class Calculator {

    public int divide(int a, int b) {
        // BUG: divide by zero → will cause runtime exception
        return a / 0;
    }
}
