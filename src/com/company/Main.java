package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));
        var intF = NumberFormat.getIntegerInstance();

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

        // formatter can use custom locale
        var locale = new Locale("de", "DE");
        var localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(doubleValue));

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));

    }
}
