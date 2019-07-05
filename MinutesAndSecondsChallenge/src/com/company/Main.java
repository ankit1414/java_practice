package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ans=getDurationString(3999);
        System.out.println(ans);
        System.out.println(getDurationString(178,67));
    }
    public static String getDurationString(int minutes , int seconds){
        if( minutes>=0 && (seconds >=0 && seconds<=60)){
            String duration = "";
            duration= duration + minutes/60 + "h " + minutes%60 + "m " + seconds + "s" ;
            return  duration;

        }else{
            return "invalid value";
        }

    }
    public static String getDurationString(int seconds){
        if(seconds >=0){
            int minutes = seconds/60;
            seconds = seconds%60;
            return getDurationString(minutes, seconds);

        }else{
            return "invalid value";
        }
    }
}
