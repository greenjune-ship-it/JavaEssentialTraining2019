package com.company;

public class Main {

    public static void main(String[] args) {

        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

        // four different ways of looping through collections of information:
        // iterative loop
        //for each loop
        // while loop
        // do loop

        // the oldest version of looping syntax in Java
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        // more elegant
        for (String month : months) {
            System.out.println(month);
        }

        // and more elegant
        for (var month : months ) {
            System.out.println(month);
        }

        // while loop
        var whileCounter = 0;
        while (whileCounter < months.length) {
            System.out.println(months[whileCounter]);
            whileCounter++;
        }

        // do loop
        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        } while (doCounter < months.length);
    }
}
