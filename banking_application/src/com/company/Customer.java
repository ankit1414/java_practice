package com.company;
import  java.util.ArrayList;
public class Customer {

    private String customername;
    private  ArrayList<Double> transactions;

    public Customer(String customername , Double transaction_amount) {
        this.customername = customername;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transaction_amount);
    }

    public String getCustomername() {
        return customername;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public void setTransactions(Double amount) {
        this.transactions.add(amount);
    }

    public static Customer createcustomer(String customername , Double transaction_amount){

        return new Customer(customername , transaction_amount);
    }
}
