package com.example.changelevel.User;

import com.example.changelevel.Task;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    @SerializedName("email")
    private String mail;

    private String password;

    @SerializedName("name")
    private String userName;

    private ArrayList<Task> tasks = new <Task> ArrayList();
    private int sportLevel;
    private int mindLevel;
    private int creativityLevel;
    public User(String mail, String userName, String password){
        this.mail=mail;
        this.userName=userName;
        this.password=password;

    }

    public User(String name,String email) {
        this.mail = email;
        this.userName = name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public int getSportLevel() {
        return sportLevel;
    }

    public int getMindLevel() {
        return mindLevel;
    }

    public int getCreativityLevel() {
        return creativityLevel;
    }
}
