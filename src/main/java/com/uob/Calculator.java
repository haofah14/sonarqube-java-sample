package com.uob;

public class Calculator {

    public int divide(int a, int b) {
        try {
            // BUG: divide by zero → will cause runtime exception if executed
            return a / 0;
        } catch (Exception e) { 
            // CODE SMELL: empty catch block → hides runtime errors, can lead to undetected failures
        }
        int unusedVar = 42; // CODE SMELL: unused variable → clutter, reduces readability
        return 0;
    }
}
