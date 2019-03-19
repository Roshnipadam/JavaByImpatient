package com.random.kafka.com.learn.java;

import java.util.Scanner;

public class Seventh {
    /**
     * Write a program that reads in two numbers between 0 and 65535, stores them in short variables,
     * and computes their unsigned sum, difference, product, quotient, and remainder, without converting them to int.
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            short a, b;
            System.out.println("Type a number between 0 and 65535");
            a = (short) scanner.nextInt();
            System.out.println("Type a number between 0 and 65535");
            b = (short) scanner.nextInt();
            System.out.printf(" Unsigned sum is: %d", a + b);
            System.out.printf(" Unsigned difference is: %d", a - b);
            System.out.printf(" Unsigned product is: %d", a * b);
            System.out.printf(" Unsigned quotient is: %d", a / b);
            System.out.printf(" Unsigned remainder is: %d", a % b);
        }


    }
