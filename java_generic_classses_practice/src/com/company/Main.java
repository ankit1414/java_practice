package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Team<CricketPlayer> myteam = new Team<>("CSK");
        CricketPlayer Dhoni = new CricketPlayer("Dhoni");
        CricketPlayer Sachin = new CricketPlayer("Sachin");
        FootballPlayer ronaldo = new FootballPlayer("ronaldo");
        FootballPlayer neymar = new FootballPlayer("neymar");
        CricketPlayer gautam = new CricketPlayer("gautam");
        CricketPlayer raina = new CricketPlayer("suresh raina");
        myteam.addPlayer(Dhoni);
        myteam.addPlayer(Sachin);
        //myteam.addPlayer(ronaldo);
        //myteam.addPlayer(neymar);
        myteam.addPlayer(gautam);
        myteam.addPlayer(raina);
        myteam.displayTeam();
//====================================================================================================================//
        //Team<String> exceptionTeam = new Team<>("program will crash without using T extends Player");
        //exceptionTeam.addPlayer("ankit");
        //exceptionTeam.displayTeam();
//====================================================================================================================//


        System.out.println("--------------------------------------------------------------------");
        Team<FootballPlayer> footballteam = new Team<>("Argentina");
        footballteam.addPlayer(ronaldo);
        //footballteam.addPlayer(Dhoni);
        footballteam.addPlayer(neymar);

        footballteam.displayTeam();
    }
}
