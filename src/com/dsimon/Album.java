package com.dsimon;

import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private SongList songs;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs.getAllSongs();
    }

    public Song getSong(int songIndex) {
        return songs.getSong(songIndex);
    }

    public void displayList() {
        songs.displayList();
    }

    public void addSOng(Song song) {
        songs.addSong(song);
    }

    private class SongList {
        private LinkedList<Song> songs;

        public SongList() {
            this.songs = new LinkedList<Song>();
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public LinkedList<Song> getAllSongs() {
            return songs;
        }

        public Song getSong(int songIndex) {
            return songs.get(songIndex);
        }

        public void displayList() {
            Iterator songIterator = songs.listIterator();
            int counter = 0;
            while (songIterator.hasNext()) {
                Song currentSong = (Song) songIterator.next();
                System.out.println("   " + counter + ". " + currentSong.getTitle() + " - " + currentSong.getDuration());
                counter++;
            }
        }
    }
}
