package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CricketTeam cteamm = new CricketTeam("mumbai indians" , 14);
        CricketTeam cteamc = new CricketTeam("chennai super kings" , 20);
        CricketTeam cteamd = new CricketTeam("delhi daredevils" , 11);
        CricketTeam cteamk = new CricketTeam("kolkata knight riders" , 12);

        FootballTeam fteamb = new FootballTeam("barselona " , 24);
        FootballTeam fteamr = new FootballTeam("realmedrie" , 19);

        TennisTeam tteam = new TennisTeam("tennis_team" , 17);

        LeagueTable<CricketTeam> cricketTeamLeagueTable = new LeagueTable<>();

        cricketTeamLeagueTable.addinorder(cteamm);
        cricketTeamLeagueTable.addinorder(cteamc);
        //cricketTeamLeagueTable.addinorder(fteamb);//cant be added to cricket league table
        cricketTeamLeagueTable.addinorder(cteamd);
        cricketTeamLeagueTable.addinorder(cteamk);

        //cricketTeamLeagueTable.addinorder(tteam);

        cricketTeamLeagueTable.display();
    }
}
