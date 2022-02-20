package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

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

        System.out.print("Select an operation (+ - * /): ");
        var operator = sc.nextLine();

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
                System.out.println("You didn't chose a valid operation");
                return;
        }
        System.out.println("The answer is: " + result);

    }
    
}

