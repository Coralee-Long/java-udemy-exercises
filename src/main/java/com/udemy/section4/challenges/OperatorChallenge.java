package com.udemy.section4.challenges;

public class OperatorChallenge {

    /*
    Operator-Precedence-and-Operator-Challenge

        Step 1:  create a double variable with a value of 20.00.
        Step 2:  create a second variable of type double with a value 80.00.
        Step 3:  add both numbers together, then multiply by 100.00.
        Step 4:  use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be.
        Step 5:  create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
        Step 6:  output the boolean variable just to see what the result is.
        Step 7:  write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.
     */



    public static void calculate(double a, double b) {
        double result = (a + b) * 100.00;
        System.out.println("result is: " + result);

        double remainder = result % 40.00;
        System.out.println("remainder is: " + remainder);

        boolean isRemainderZero = (remainder == 0.00) ? true : false;
        System.out.println("isRemainderZero is: " + isRemainderZero);

        if(!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }



}
