package com.udemy.section3;

public class Challenge {
    public static void main(String[] args) {
        // Challenge 1:
        byte myByte = 120;
        short myShort = 32000;
        int myInt = 6_000_000;
        long myLong = 50000L + (10L * (myByte + myShort + myInt));

        // Challenge 2:
        convertLbsToKg(200);
        convertLbsToKg(2.6);

        // Challenge 3:
        int result = 10;
        int decrement = result-=1;
        System.out.println("result: " + result); // 9

        int result1 = 10;
        result1 -= 5.5;
        System.out.println("result1: " + result1); // 4

        int result2 = 10;
//        result2 = result - 5.5;
//        System.out.println("result2: " + result2); // error

        // Therefore:
        int testResult = 10;
        testResult -= 5.5;
        // Is basically:
        // testResult = (int) (testResult - 5.5);

        System.out.println("testResult: " + testResult); // 4




    }

    // Challenge 2:
    // Convert a given number of pounds to kilograms
    public static void convertLbsToKg(double pounds) {
        double conversionRate = 0.45359237;
        double resultInKilograms = pounds * conversionRate; // conversion rate is already a double
        System.out.println(resultInKilograms);
    }
}
