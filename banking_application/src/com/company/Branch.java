package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public Branch(String name , Double amount) {

        this.customers = new ArrayList<Customer>();
        customers.add(Customer.createcustomer(name , amount));
    }

    public  void add_new_customer(Customer customer){
        int check = does_exists(customer);
        if(check == -1){
            customers.add(customer);
            System.out.println("'"+ customer.getCustomername()+"'" + " >> Thanks for choosing us!");

        }
        else{
            System.out.println("ERROR : Customer with same name already exists!");

        }
    }

    private  int does_exists(Customer customer){

        for(int i =0; i<this.customers.size(); i++){

            if(this.customers.get(i).getCustomername().equals(customer.getCustomername())){
                return i;
            }

        }
        return -1;
    }


    public int customer_does_exists(ArrayList<Customer> customerArrayList , String name){
        //System.out.println("customer does exist called");

        for(int i=0 ; i<customerArrayList.size(); i++) {

            if(customerArrayList.get(i).getCustomername().equals(name)){
                //System.out.println("customer does exist called");
                return i;
            }
        }
        //System.out.println("customer does exist called");
        return -1;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public  static Branch createbranch(String name , Double amount){
        return new Branch(name , amount);
    }
}
