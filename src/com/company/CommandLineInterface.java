package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class CommandLineInterface {

    public static final String[] OPERATIONS = new String[] {"+","-","*","/"};

    Scanner sc = new Scanner(System.in);

    public double requestNumber(String message) {
        double d;
        System.out.print(message);
        d = sc.nextDouble();
        sc.nextLine();
        return d;
    }

    public String requestOperator(String message) throws InvalidOperatorSymbol {

        String operator;
        System.out.print(message);
        operator = sc.nextLine();

        if (operator.isEmpty()) {
            throw new InvalidOperatorSymbol("You didn't chose an operation!");
        }
        if (!Arrays.asList(OPERATIONS).contains(operator)) {
            throw new InvalidOperatorSymbol("Invalid operator: " + operator);
        }

        return operator;
    }

}
