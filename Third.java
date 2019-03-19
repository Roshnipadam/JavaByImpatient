package com.random.kafka.com.learn.java;

import java.util.Scanner;
public class Third {
    public static void main(String args[]) {
        int a, b, c, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type three integers: ");
        System.out.println("Enter First one: ");
        a = scanner.nextInt();
        System.out.println("Enter Second one: ");
        b = scanner.nextInt();
        System.out.println("Enter Third one: ");
        c = scanner.nextInt();
        max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("largest number is " +   max );

        System.out.println("largest number is " + Math.max(Math.max(a,b),c));


    }
}
