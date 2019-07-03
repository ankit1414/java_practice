package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void add_customer_to_branch(int branchno , String name , Double amount) {

        branches.get(branchno).add_new_customer(Customer.createcustomer(name , amount));
        System.out.println("customer added successfully ");
    }

    public void perform_transacton(int branchno , String name ,Double amount) {

        int check = this.branches.get(branchno).customer_does_exists(this.branches.get(branchno).getCustomers(), name);
        if(check >= 0){
            this.branches.get(branchno).getCustomers().get(check).setTransactions(amount);
        }
        else{
            System.out.println("user does not exit in this branch");

        }
    }
    public  void print_users_transactions(int branchno , String name){
        int check = this.branches.get(branchno).customer_does_exists(this.branches.get(branchno).getCustomers(), name);
        if(check < 0 ){
            System.out.println("INVALID USER_NAME!!!");
        }
        else {
            System.out.println(name + "'s --> TRANSACTIONS HISTORY : ");
            for(int i=0 ; i<this.branches.get(branchno).getCustomers().get(check).getTransactions().size(); i++) {

                System.out.println(i+1 + " => " + this.branches.get(branchno).getCustomers().get(check).getTransactions().get(i));
            }
        }
    }

    public void display_customer_names(int branchno){
        for(int i=0; i<this.branches.get(branchno).getCustomers().size(); i++) {
            System.out.println(i+1 + " : " + this.branches.get(branchno).getCustomers().get(i).getCustomername());
        }
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }
}
