package com.example.entities;

import java.util.LinkedList;
import java.util.List;

public class UserProfile implements SocialNetworkProfile{

    private List<SocialNetworkProfile> following;
    private String userName;
    private int age;

    public UserProfile(String userName, int age){
        this.following = new LinkedList<>();
        this.userName = userName;
        this.age = age;
    }

    public void addFollowing(SocialNetworkProfile...profiles){
        for (SocialNetworkProfile profile : profiles) {
            this.following.add(profile);
        }
    }

    @Override
    public String toString() {
        return "I'm " + userName + " and I'm " + age + " years old";
    }
}
