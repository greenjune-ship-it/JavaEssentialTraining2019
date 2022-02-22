package com.company;

public class Calculator {
    public double calculateOperation(double num1, double num2, String operation) throws InvalidOperatorSymbol {
        double result = 42; // The Ultimate Answer to the Ultimate Question
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
