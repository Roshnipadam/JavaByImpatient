package com.random.kafka.com.learn.java;

import java.util.Scanner;

/**
 * Write a program that reads a string and prints all of its nonempty substrings
 */
public class Eigth {

        public static void main(String[] args) {
            String input;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type any string");
            input = scanner.next();
            String[] subStrings = input.split("\\s+");
            System.out.println("All of nonempty substrings of the given string are:");
            for (String s : subStrings) {
                System.out.println(s);
            }
        }
}
