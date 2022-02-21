package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        CommandLineInterface cli = new CommandLineInterface();
        Calculator calc = new Calculator();
        double result;

        try {
            var num1 = cli.requestNumber("Enter a numeric value 1: ");
            var num2 = cli.requestNumber("Enter a numeric value 2: ");
            var operator = cli.requestOperator("Select an operation (+ - * /): ");

            result = calc.calculateOperation(num1, num2, operator);
            System.out.println("The answer is: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
        } catch (InvalidOperatorSymbol e) {
            System.out.println(e.getMessage());
        }
    }
}

