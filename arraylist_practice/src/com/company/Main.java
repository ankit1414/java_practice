package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //IntClass intclass = new IntClass(12);
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();

        for(int i=0; i<20; i++){

            intClassArrayList.add(new IntClass(i));

        }

        for(int i=0; i<intClassArrayList.size(); i++){

            System.out.println(i + "--> " + intClassArrayList.get(i).getIntvalue());
        }
        System.out.println("___________________________________________________________");

        ArrayList<Integer> integerclassarraylist = new ArrayList<Integer>();

        for(int i = 0; i<20; i++) {

            integerclassarraylist.add(Integer.valueOf(i));
            System.out.println(i + "--> " + integerclassarraylist.get(i).intValue());

        }
        System.out.println("___________________________________________________________");

        for(int i = 0; i<10; i++) {

            integerclassarraylist.add(i);
            System.out.println(i + "--> " + integerclassarraylist.get(i));

        }


    }
}
