package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0,count=0;
        for(int i=1 ; i<=1000 ; ++i){
            if(i%3==0 && i%5==0){
                if(count>=5){
                    break;
                }
                sum= sum + i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println("the sum of the numbers is : "+ sum);
    }
}
