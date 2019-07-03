package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Scanner scanner = new Scanner(System.in);

        int a ;
        System.out.println("enter a number : ");
        a = scanner.nextInt();
        scanner.close();

        System.out.println("you have entered : "+ a);

    }
}
