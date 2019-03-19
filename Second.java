package com.random.kafka.com.learn.java;

import java.util.Scanner;

public class Second {
    public static void main(String args[]) {
        System.out.println("Please type any int");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int angleOne = i % 359;
        System.out.println(angleOne);
        int angleTwo = Math.floorMod(i,359);
        System.out.println(angleTwo);



        }
    }
