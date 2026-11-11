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

            // verify amount
            System.out.println("Round: " + i);
            System.out.println("Float: " + floatAmount);
            System.out.println("Double: " + doubleAmount);
            System.out.println("BigDecimal: " + bigDecimalAmount);

            // empty line - the console is getting hard to read
            System.out.println();
        }


    }
}
