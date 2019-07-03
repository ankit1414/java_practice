package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {

    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;

    public Playlist() {
        this.albums = new ArrayList<Album>();
        this.playlist = new LinkedList<Song>();
    }

    public boolean add_song_to_playlist(String album_name ,String song_name){
        int album_no = get_album_number(album_name);

        if(album_no == -1){
            System.out.println("album not found :( .... try again with valid album name");
            return false;
        }
        else {
            int check_in_album = does_song_exists_in_album(album_no, song_name);
            if(check_in_album == -1){
                System.out.println("song does not exists in the album");
                return false;
            }
            else {
                int check = does_exist_in_playlist(this.albums.get(album_no).getSongs().get(check_in_album).getSong_name());

                if (check == -1) {
                    int index = get_song_number(album_no,song_name);
                    Song songtoadd = this.albums.get(album_no).getSongs().get(index);
                    playlist.add(songtoadd);
                    System.out.println("song added to playlist :)");
                    return true;
                } else {
                    System.out.println("OOPS!!! song already exists in the playlist");
                    return false;
                }
            }
        }
    }

    public void add_song_to_album(String albumname , String songname ,String duration){

        int checkalbum = get_album_number(albumname);
        if(checkalbum == -1){
            System.out.println("ERROR : wrong album name");
        }
        else {
            int check_song_exits = does_song_exists_in_album(checkalbum , songname);
            if(check_song_exits == -1){
                this.albums.get(checkalbum).getSongs().add(Song.createsong(songname , duration));
                System.out.println("song successfully added into the playlist!");
            }
            else{
                System.out.println("ERROR : song already exits in the album!");

            }
        }
    }

    private int does_song_exists_in_album(int album_no ,String song_name){
        LinkedList<Song> songslinkedlist = albums.get(album_no).getSongs();
        for(int i=0; i<songslinkedlist.size(); i++){
            if(songslinkedlist.get(i).getSong_name().equals(song_name)){
                return i;
            }
        }
        return -1;
    }
    private  int does_exist_in_playlist(String song_name){

        for(int i=0; i<playlist.size(); i++){
            if(playlist.get(i).getSong_name().equals(song_name)){
                //System.out.println("OOPS!!! song already exists in the playlist");
                return i;
            }

        }
        return -1;
    }

    private  int get_album_number(String album_name){

        for(int i=0; i<this.albums.size(); i++){
            //checking whether album exists.
            if(this.albums.get(i).getAlbumname().equals(album_name)){

                return i;
            }
        }
        return  -1;
    }

    private  int get_song_number(int albumno , String songname){
        LinkedList<Song> songLinkedList = this.albums.get(albumno).getSongs();
        for(int i=0; i<songLinkedList.size(); i++){
            if(songLinkedList.get(i).getSong_name().equals(songname)){
                return i;
            }
        }

        return -1;

    }
    public  void remove_song_from_playlist(String songname){

        int check = does_exist_in_playlist(songname);
        if(check >=0) {
            this.playlist.remove(check);
            System.out.println("song has been removed from your playlist");
        }
        else{
            System.out.println("song does not exit in the playlist");
        }
    }
    public  void printplaylist(){

        for(int i=0 ; i<this.playlist.size(); i++){
            System.out.println(i+1 + ") --> " + playlist.get(i).getSong_name() + " ( duration = " + playlist.get(i).getDuration()+" )");
        }
    }

    //---------------------------------------------getter and setters------------------------------------------------------//
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(LinkedList<Song> playlist) {
        this.playlist = playlist;
    }
}
