package com.company;

public class BankAccount {
    private int accountno;
    private long balance;
    private  String customer_name;
    private String email;
    private  String mobile_number;


    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }
    public  void setBalance(long balance) {
        this.balance = balance;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
    public int getAccountno() {
        return this.accountno;
    }
    public long getBalance() {
        return this.balance;
    }
    public String getCustomer_name() {
        return this.customer_name;
    }
    public String getEmail() {
        return  this.email;
    }
    public String getMobile_number() {
        return this.mobile_number;
    }

    public void deposte_fund(long amount) {
        System.out.println("=====================================================================");
        System.out.println("Old balance is : " + this.balance);
        if(amount>=0) {
            this.balance += amount;
            System.out.println("TRANSACTION COMPLETED SUCCESSFULLY!");
        } else {
            System.out.println("Invalid amount");
            System.out.println("TRANSACTION FAILED!!!");
        }
        System.out.println("The updated balance is : " + this.balance);
        System.out.println("=====================================================================");
    }
    public void withdraw_fund(long amount) {
        System.out.println("=====================================================================");
        System.out.println("Old balance is : " + this.balance);
        if(amount>=0) {
            if(this.balance >= amount) {
                this.balance -= amount;
                System.out.println("TRANSACTION COMPLETED SUCCESSFULLY!");
            } else {
                System.out.println("Insufficient balance!!!");
                System.out.println("TRANSACTION FAILED!!!");

            }
        } else {
            System.out.println("Invalid amount!!!");
            System.out.println("TRANSACTION FAILED!!!");
        }
        System.out.println("The updated balance is : " + this.balance);
        System.out.println("=====================================================================");
    }

}
