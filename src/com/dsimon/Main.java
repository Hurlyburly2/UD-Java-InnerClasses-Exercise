package com.dsimon;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Playlist");

        playlist.addAlbum("AlbumOne");
        playlist.addSongToAlbum("AlbumOne", new Song("SongOne", 123));
        playlist.addSongToAlbum("AlbumOne", new Song("SongTwo", 345));
        playlist.addSongToAlbum("AlbumOne", new Song("SongThree", 567));
        playlist.addSongToAlbum("AlbumOne", new Song("SongFour", 890));
        playlist.addSongToAlbum("AlbumOne", new Song("SongFive", 012));

        playlist.addAlbum("AlbumTwo");
        playlist.addSongToAlbum("AlbumTwo", new Song("AlbumTwo-One", 123));
        playlist.addSongToAlbum("AlbumTwo", new Song("AlbumTwo-Two", 123));
        playlist.addSongToAlbum("AlbumTwo", new Song("AlbumTwo-Three", 123));
        playlist.addSongToAlbum("AlbumTwo", new Song("AlbumTwo-Four", 123));
        playlist.addSongToAlbum("AlbumTwo", new Song("AlbumTwo-Five", 123));
        playlist.addSongToAlbum("AlbumTwo", new Song("AlbumTwo-Six", 123));

        playlist.runPlayList();
    }
}
