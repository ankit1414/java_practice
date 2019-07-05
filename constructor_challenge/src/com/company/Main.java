package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vipCustomer = new VipCustomer();
        VipCustomer v2 = new VipCustomer("deepak","dpkbhardwaj2580@gmail.com", 80000);
        VipCustomer v3 = new VipCustomer("rakesh", "rakeshvashisht@gmail.com");
        display(vipCustomer);
        display(v2);
        display(v3);

    }

    public static void display(VipCustomer v) {
        System.out.println("==============================================================================");

        System.out.println("Name : " + v.getName() + "  email : " + v.getEmail() + "    credit limit : "
                            + v.getCredit_limit());
        System.out.println("==============================================================================");

    }
}
