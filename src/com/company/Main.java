package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Enter a number 1: ");
        var number1 = scanner.nextInt();
        System.out.print("Enter a number 2: ");
        var number2 = scanner.nextInt();
        System.out.println("Sum is: " + (number1 + number2));

    }
}
