package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount sbi = new BankAccount();
        System.out.println("Enter your name: ");
        Scanner scanner= new Scanner(System.in);

        sbi.setCustomer_name(scanner.nextLine());
        System.out.println("Enter your account number: ");
        sbi.setAccountno(scanner.nextInt());
        System.out.println("Enter your email address : ");
        sbi.setEmail(scanner.next());
        sbi.setBalance(0);
        System.out.println("Enter your mobile number : ");
        sbi.setMobile_number(scanner.next());
        System.out.println("Enter the amount you want to add: ");
        sbi.deposte_fund(scanner.nextLong());
        System.out.println("Enter the amount you want to withdraw:");
        sbi.withdraw_fund(scanner.nextLong());


    }
}
