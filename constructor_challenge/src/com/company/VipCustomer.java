package com.company;

public class VipCustomer {
    private String name;
    private String email;
    private long credit_limit;


    public VipCustomer() {
        this("Ankit", "bhardwajankit1414@gmail.com",50000);
    }

    public VipCustomer(String name, String email) {
        this(name,email,20000);
    }

    public VipCustomer(String name, String email, long credit_limit) {
        this.name = name;
        this.email = email;
        this.credit_limit = credit_limit;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getCredit_limit() {
        return credit_limit;
    }
}
