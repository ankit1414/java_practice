package com.company;

public class Song {
    private String song_name;
    private String duration;

    public Song(String song_name, String duration) {
        this.song_name = song_name;
        this.duration = duration;
    }

    public static Song createsong(String song_name , String duration){

        return new Song(song_name , duration);
    }

    public String getSong_name() {
        return song_name;
    }

    public String getDuration() {
        return duration;
    }
}
