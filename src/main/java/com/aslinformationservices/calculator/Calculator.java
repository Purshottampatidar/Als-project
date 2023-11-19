package com.aslinformationservices.calculator;

public class Calculator {

    public double add(double a, double b) {
    	// TODO: Implement custom feature logic
        double result=a+b;
        return result;
    }

    public double subtract(double a, double b) {
    	// TODO: Implement custom feature logic
        double result=a-b;
        return result;
    }

    public double multiply(double a, double b) {
    	// TODO: Implement custom feature logic
        double result=a*b;
        return result;
    }

    public double divide(double a, double b) {
    	// TODO: Implement custom feature logic
        try {
            double result=a/b;

            return result;
        }catch (ArithmeticException e) {
            return -1;
        }
    }
}