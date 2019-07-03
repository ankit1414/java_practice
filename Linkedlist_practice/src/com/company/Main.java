package com.company;

import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Playlist myplaylist = new Playlist();

        boolean quit = false;
        int choice ;

        System.out.println("please select as per the given options: " +
                "\n0. print the options available" +
                "\n1. add album" +
                "\n2. add songs to album" +
                "\n3. add song to your playlist" +
                "\n4. remove song from your playlist" +
                "\n5. see your playlist" +
                "\n6. exit");

        //i havnt added validation for album name;


        while(!quit){
            System.out.println("___________________________________________________________________________");
            System.out.print("\n(press 0 for available options)\n>> ");
            choice = scanner.nextInt();
            scanner.nextLine();
            String album_name ;
            String song_name;
            String duration;

            switch (choice){

                case 0:
                    System.out.println("please select as per the given options: " +
                            "\n0. print the options available" +
                            "\n1. add album" +
                            "\n2. add songs to album" +
                            "\n3. add song to your playlist" +
                            "\n4. remove song from your playlist" +
                            "\n5. see your playlist" +
                            "\n6. exit");
                    break;

                case 1:
                    System.out.print("enter the album name : ");
                    album_name = scanner.nextLine();
                    myplaylist.getAlbums().add(Album.createalbum(album_name));

                    break;



                case 2:
                    System.out.print("enter the album name : ");
                    album_name = scanner.nextLine();
                    System.out.print("enter the song name :");
                    song_name = scanner.nextLine();
                    System.out.print("enter the song duration :");
                    duration = scanner.nextLine();
                    myplaylist.add_song_to_album(album_name , song_name , duration);

                    break;

                case 3:
                    System.out.print("enter the album name : ");
                    album_name = scanner.nextLine();
                    System.out.print("enter the song name : ");
                    song_name = scanner.nextLine();
                    myplaylist.add_song_to_playlist(album_name,song_name);

                    break;

                case 4:
                    System.out.print("enter the song name :");
                    song_name = scanner.nextLine();
                    myplaylist.remove_song_from_playlist(song_name);

                    break;
                case 5:
                    System.out.println("your playlist is as follows: ");
                    myplaylist.printplaylist();
                    break;

                case 6:
                    quit = true;
                    System.out.println("exiting the music player");

                    break;

                default:
                    System.out.println("invalid choice!!!\n(press 0 for available choices)");
                    break;




            }




        }
    }
}
