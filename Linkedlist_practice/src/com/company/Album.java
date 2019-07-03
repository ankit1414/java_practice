package com.company;

import java.util.LinkedList;

public class Album {
    private String albumname;
    private LinkedList<Song> songs;

    public Album(String albumname) {
        this.albumname = albumname;
        this.songs = new LinkedList<Song>();
    }

    public String getAlbumname() {
        return albumname;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }
    public static Album createalbum(String albumname){
        return new Album(albumname);
    }
}
