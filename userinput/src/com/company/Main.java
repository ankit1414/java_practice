package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter your year of birth: ");
        Scanner scan = new Scanner(System.in);
        boolean hasNextInt = scan.hasNextInt();
        if(hasNextInt){
            int yearofbirth = scan.nextInt();
            scan.nextLine(); // handling next line .....(or for the line separator (enter key))
            System.out.println("Enter your name: ");
            String name = scan.nextLine();
            int age = 2019- yearofbirth;
            if(age>=0 && age<=100){
                System.out.println("your name is : " + name + " and your age is : " + age);

            } else {
                System.out.println("invalid year of birth !!!!");
            }

        }else {
            System.out.println("couldnt parse year of birth");
        }

        scan.close();

    }
}
