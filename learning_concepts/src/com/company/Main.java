package com.company;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class Main{

    public static void main(String []args){
        LinkedList<String> linkedlist  = new LinkedList<String>();
        // linkedlist.add("ankit");
        // linkedlist.add("mahi");
        // linkedlist.add("dev");
        // linkedlist.add("anki");
        // linkedlist.add("akhil");
        // linkedlist.add("johny");
        add_in_order(linkedlist , "rakesh");
        add_in_order(linkedlist , "ankit");
        add_in_order(linkedlist , "ramit");
        add_in_order(linkedlist , "abhishek");
        add_in_order(linkedlist , "johny");
        add_in_order(linkedlist , "arvind");
        add_in_order(linkedlist , "amit");
        add_in_order(linkedlist , "anil");
        add_in_order(linkedlist , "deepak");
        //add_in_order(linkedlist , "deepak");
        printlinkedlist(linkedlist);
    }
    private static void printlinkedlist(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){

            System.out.println("iterator is at >> " + i.next());
        }
    }
    private static int add_in_order(LinkedList<String> linkedlist , String newitem){

        ListIterator<String> stringlistiterator = linkedlist.listIterator();

        while(stringlistiterator.hasNext()){

            int compare = stringlistiterator.next().compareTo(newitem);

            if(compare == 0){
                System.out.println("duplicate entry");
                return -1;
            }
            else if(compare > 0){

                stringlistiterator.previous();
                stringlistiterator.add(newitem);
                return 0;

            }
            //  else if(compare < 0){


            //  }

        }
        stringlistiterator.add(newitem);
        return 0;
    }
}