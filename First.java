package com.random.kafka.com.learn.java;

import java.util.Scanner;


public class First {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any integer for conversion :  ");
        int i = scan.nextInt();
        System.out.println("binary conversion : " + Integer.toString(i,2));
        System.out.println("octal conversion : " + Integer.toString(i,8));
        System.out.println("hexadecimal conversion : " + Integer.toString(i,16));

    }
}
