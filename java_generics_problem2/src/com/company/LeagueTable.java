package com.company;

import java.util.ArrayList;

public class LeagueTable<T extends Team> {

    private ArrayList<T>  leaguetable = new ArrayList<>();

    public void addinorder(T obj){
        for(int i=0; i<this.leaguetable.size(); i++){
            if(obj.getScore()>=this.leaguetable.get(i).getScore()){
                leaguetable.add(i,obj);
                return ;
            }
        }
        leaguetable.add(obj);
    }

    public void display(){
        System.out.println("-------------------------------------------------------------------");
        for(int i=0; i<this.leaguetable.size(); i++){
            System.out.println(i+1 + ") " + leaguetable.get(i).getName() + " -> " + this.leaguetable.get(i).getScore());
        }
        System.out.println("-------------------------------------------------------------------");

    }

}
