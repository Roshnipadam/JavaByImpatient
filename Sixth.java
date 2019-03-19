package com.random.kafka.com.learn.java;

import java.math.BigInteger;
/**
 * Write a program that computes the factorial n! = 1 × 2 × … × n, using
 * BigInteger. Compute the factorial of 1000.
 */

public class Sixth {
    public static void main(String[] args) {
        /**
         * Write a program that computes the factorial n! = 1 × 2 × … × n, using
         * BigInteger. Compute the factorial of 1000.
         */

        BigInteger factthousand = BigInteger.valueOf(1);
        for (int i = 1; i <= 1000; i++) {
            BigInteger multiplier = BigInteger.valueOf(i);
            factthousand = factthousand.multiply(multiplier);
        }
        System.out.printf("Factorial of %d is %d", 1000, factthousand);
    }
}
