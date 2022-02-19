package com.company;

public class Main {

    public static void main(String[] args) {

        // nothing has been changed
        var originalInt = 10;
        System.out.println("Original int before: " + originalInt);
        incrementValue(originalInt);
        System.out.println("Original int after: " + originalInt);

        // originalArray[0] has been changed
        int[] originalArray = {10, 20, 30};
        System.out.println("Original array before: " + originalArray[0]);
        incrementValue(originalArray);
        System.out.println("Original array before: " + originalArray[0]);

        // strings are immutable
        String original = "Original!";
        System.out.println("Original string before: " + original);
        changeString(original);
        System.out.println("Original after: " + original);

    }

    private static int incrementValue(int inMethod) {
        inMethod ++;
        System.out.println("In method: " + inMethod);
        return inMethod;
    }

    private static int[] incrementValue(int[] inMethod) {
        inMethod[0] ++;
        System.out.println("In method: " + inMethod[0]);
        return inMethod;
    }

    private static String changeString(String inMethod) {
        inMethod = "New!";
        System.out.println("In method: " + inMethod);
        return inMethod;
    }

}
