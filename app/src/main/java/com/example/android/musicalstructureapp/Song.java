package com.example.android.musicalstructureapp;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class Song implements Comparable<Song>, Serializable {

    private String song;
    private String artist;
    private int cover;

    public Song(String song, String artist, int cover) {

        this.song = song;
        this.artist = artist;
        this.cover = cover;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    @Override
    public int compareTo(@NonNull Song song) {
        return this.artist.compareTo(song.getArtist());
    }
}
