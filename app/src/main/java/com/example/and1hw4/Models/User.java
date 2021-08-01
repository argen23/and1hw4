package com.example.and1hw4.Models;

public class User {
    private String number;
    private String name;
    private String musicName;
    private String musicDuration;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicDuration() {
        return musicDuration;
    }

    public void setMusicDuration(String musicDuration) {
        this.musicDuration = musicDuration;
    }

    public User(String number, String name, String musicName, String musicDuration) {
        this.number = number;
        this.name = name;
        this.musicName = musicName;
        this.musicDuration = musicDuration;
    }
}
