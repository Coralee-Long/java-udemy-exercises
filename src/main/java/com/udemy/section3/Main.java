package com.udemy.section3;

public class Main {
    public static void main(String[] args) {
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        long longSize = Long.SIZE;

        System.out.println(minIntValue);
        System.out.println(maxIntValue);
        System.out.println(longSize);

        int testInt = 5 / 2;
        System.out.println("testInt: " + testInt);
        float testFloat = 5 / 2;
        System.out.println("testFloat: " + testFloat);
        testFloat = 5f / 2f;
        System.out.println("testFloat: " + testFloat);
        double myDouble = 5 / 2;
        System.out.println("myDouble: " + myDouble);
        myDouble = 5f / 3d;
        System.out.println("myDouble: " + myDouble);

        System.out.println("--------------");

        String firstString = "abc";
        String lastString = "cde";

        lastString = firstString + lastString;
        System.out.println(lastString); // "1050"


    }
}
