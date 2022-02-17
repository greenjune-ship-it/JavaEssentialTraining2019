package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        // check if values are referenced to the same object
        if (s3 == s4) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        // check equality of values
        if (s3.equals(s4)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        // case-insensetive comparison
        String s5 = new String("HELLO!");
        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

    }
}