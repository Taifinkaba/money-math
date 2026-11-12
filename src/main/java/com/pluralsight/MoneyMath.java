package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        // create variables
        float floatAmount = 0.0f;
        double doubleAmount = 0.0;
        BigDecimal bigDecimalAmount = BigDecimal.ZERO;

        System.out.println("Adding 0.10 ten times: ");

        // loop to run 10 times
        for (int i = 0; i < 10; i++){
            floatAmount += 0.10f;
            doubleAmount += 0.10;

            bigDecimalAmount = bigDecimalAmount.add(new BigDecimal("0.10"));

            // verify amount
            System.out.println("Round: " + i);
            System.out.println("Float: " + floatAmount);
            System.out.println("Double: " + doubleAmount);
            System.out.println("BigDecimal: " + bigDecimalAmount);

            // empty line - the console is getting hard to read
            System.out.println();
        }

        // reset the variables
        floatAmount = 0.0f;
        doubleAmount = 0.0;
        bigDecimalAmount = BigDecimal.ZERO;

        System.out.println("Adding 19.99 one thousand times: ");

        // loop to run 1,000 times
        for (int i = 0; i < 1_000; i++){
            floatAmount += 19.99f;
            doubleAmount += 19.99;

            bigDecimalAmount = bigDecimalAmount.add(new BigDecimal("19.99"));

        }

        // print final amount
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("Float: " + floatAmount);
        System.out.println("Double: " + doubleAmount);
        System.out.println("BigDecimal: " + bigDecimalAmount);

        // stores the exact expected answer
        BigDecimal expectedAmount = new BigDecimal("19990.00");

        // convert float into BigDecimal
        BigDecimal floatResult = new BigDecimal(Float.toString(floatAmount));

        // find the difference between float and exact answer
        BigDecimal floatDifference = floatResult.subtract(expectedAmount);

        // convert the difference from dollars into cents
        double centsOff = floatDifference.doubleValue() * 100;

        // print the float difference in dollars and cents
        System.out.println("Float difference in dollars: " + floatDifference);
        System.out.println("Float difference in cents: " + centsOff);

        // convert double into BigDecimal
        BigDecimal doubleResult = BigDecimal.valueOf(doubleAmount);

        // compare float with double and print
        boolean floatEqualsDouble = floatResult.compareTo(doubleResult) == 0;
        System.out.println("Float equals double: " + floatEqualsDouble);

        // compare double with BigDecimal and print
        boolean doubleEqualsBigDecimal = doubleResult.compareTo(bigDecimalAmount) == 0;
        System.out.println("Double equals BigDecimal: " + doubleEqualsBigDecimal);

        // compare float with BigDecimal and print
        boolean floatEqualsBigDecimal = floatResult.compareTo(bigDecimalAmount) == 0;
        System.out.println("Float equals BigDecimal: " + floatEqualsBigDecimal);

    }
}
