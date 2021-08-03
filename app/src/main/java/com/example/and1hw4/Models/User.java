package com.example.and1hw4.Models;
public class User {
    private String number;
    private String name;
    private String musicName;
    private String musicDuration;

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }


    public String getMusicName() {
        return musicName;
    }

    public String getMusicDuration() {
        return musicDuration;
    }

    public User(String number, String name, String musicName, String musicDuration) {
        this.number = number;
        this.name = name;
        this.musicName = musicName;
        this.musicDuration = musicDuration;
    }
}
