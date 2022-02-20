package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double num1, num2;

        try {

            System.out.print("Enter a numeric value 1: ");
            num1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a numeric value 2: ");
            num2 = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }

        String operator;
        System.out.print("Select an operation (+ - * /): ");
        operator = sc.nextLine();

        try {
            if (operator.isEmpty()) {
                throw new InvalidOperatorSymbol("You didn't chose an operation!");
            }
            if (!Set.of("+", "-", "*", "/").contains(operator)) {
                throw new InvalidOperatorSymbol("Invalid operator: " + operator);
            }
        } catch (InvalidOperatorSymbol e ) {
            System.out.println(e.getMessage());
            return;
        }

        double result;
        switch (operator) {
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
            default:
                return;
        }
        System.out.println("The answer is: " + result);

    }
    
}

