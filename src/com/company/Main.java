package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        double userNum1 = myScanner.nextDouble();
        System.out.print("Enter a numeric value: ");
        double userNum2 = myScanner.nextDouble();
        System.out.println("The answer is: " + (userNum1 / userNum2));
    }
}
