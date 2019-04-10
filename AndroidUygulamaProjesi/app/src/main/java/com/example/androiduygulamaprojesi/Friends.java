package com.example.androiduygulamaprojesi;

public class Friends {
    public int photo;
    public String name;
    public String username;

    public Friends(int photo, String name, String username){
        this.photo = photo;
        this.name = name;
        this.username = username;
    }
    public Friends(String name, String username){
        this.name = name;
        this.username = username;
    }
}
