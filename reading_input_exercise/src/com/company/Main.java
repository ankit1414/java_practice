package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1, num , sum=0;
        Scanner scanner = new Scanner(System.in);
        while(count !=11) {
            System.out.println("Enter number #" + count + " :");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                num = scanner.nextInt();
                sum +=num;
                ++count;

            } else {
                System.out.println("Invalid input");

            }
            scanner.nextLine(); // handling next line character.

        }
        System.out.println("the sum of entered numbers is : " + sum);
        scanner.close();
    }
}
