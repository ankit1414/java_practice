package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {//imp
    private  String teamName;
    private ArrayList<T> team= new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer(T  player){

        if(team.contains(player)){
            System.out.println("player is already in the team");
            return false;
        }
        else {
            team.add(player);
            System.out.println(player.getName() + " is selected for the team : " + this.teamName);//no need to cast
            return true;
        }
    }
    public void displayTeam(){
        System.out.println("The player in team : " + this.teamName + " are :::" );
        for(int i=0; i<team.size(); i++){
            //System.out.println(i+1 + ". " + ((Player)team.get(i)).getName());
            System.out.println(i+1 + ". " + team.get(i).getName()); // now this will also work as we specified that T extends Player
        }
    }
}
