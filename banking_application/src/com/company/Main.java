package com.company;

import java.util.Scanner;

public class Main {

    private static  Scanner  scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        String name;
        int b_instance = 0;
        Double amount = 0.00;
        int branchno = 0;
        Bank bank = new Bank();
        int choice ;
        boolean quit = false;

        System.out.println("Please select the action :" +
                "\n0. press 0 for options" +
                "\n1. create new branch and add customer to it" +
                "\n2. add customer to already existing branch" +
                "\n3. make transaction from your account" +
                "\n4. see your transactions" +
                "\n5. see the customers name in current branch" +
                "\n6. exit");

        while(!quit){
            System.out.println("________________________________________________________________________");

            System.out.println("(press 0 for available options)");
            System.out.print(">>");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n");



            switch (choice){

                case 0:
                    System.out.println("Please select the action :" +
                            "\n0. press 0 for options" +
                            "\n1. create new branch and add customer to it" +
                            "\n2. add customer to already existing branch" +
                            "\n3. make transaction from your account" +
                            "\n4. see your transactions" +
                            "\n5. see the customers name in current branch" +
                            "\n6. exit");

                    break;

                case 1:
                    System.out.println("New Branch created !!!");
                    b_instance++;
                    System.out.print("Branch number : " + b_instance + "\n");

                    System.out.print("Enter the username : ");
                    name = scanner.nextLine();
                    System.out.print("Enter the initial transaction amount : ");
                    amount = scanner.nextDouble();
                    bank.getBranches().add(Branch.createbranch(name , amount));


                    break;

                case 2:
                    System.out.print("Enter branch number : ");
                    branchno = scanner.nextInt();
                    scanner.nextLine();
                    if(branchno > bank.getBranches().size()){
                        System.out.println("THE ENTERED BRANCH DOES NOT EXIT");
                    }
                    else{

                        branchno = branchno - 1;
                        System.out.print("Enter username : ");
                        name = scanner.nextLine();
                        System.out.print("Enter transaction amount : ");
                        amount = scanner.nextDouble();
                        bank.add_customer_to_branch(branchno , name , amount);
                    }


                    break;


                case 3:
                    System.out.print("enter your branch number : ");
                    branchno  = scanner.nextInt();
                    branchno = branchno-1;
                    scanner.nextLine();
                    System.out.print("enter the username : ");
                    name = scanner.nextLine();
                    System.out.print("enter transaction amount : ");
                    amount = scanner.nextDouble();
                    bank.perform_transacton(branchno , name , amount);

                    break;

                case 4:
                    System.out.print("enter the branch number : ");
                    branchno = scanner.nextInt();
                    scanner.nextLine();
                    branchno = branchno -1;
                    System.out.print("enter the username : ");
                    name = scanner.nextLine();
                    bank.print_users_transactions(branchno , name);

                    break;

                case 5:
                    System.out.print("enter the branch number : ");
                    branchno = scanner.nextInt();
                    branchno = branchno-1;
                    bank.display_customer_names(branchno);

                    break;

                case 6:

                    quit = true;
                    System.out.println("THANK YOU FOR USING OUR SERVICE (*_*)");
                    break;

                default:
                    System.out.println("INVALID CHOICE!!");
                    System.out.println("TRY AGAIN: \npress 0 for available actions");

                    break;


            }
        }

    }
}
