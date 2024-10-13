package com.example.iteratorPattern;

import com.example.entities.SocialNetworkProfile;
import com.example.entities.UserProfile;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ProfileIteratorUsers implements ProfileIterator{

    private Stack<SocialNetworkProfile> visited;
    private ArrayDeque<SocialNetworkProfile> toVisit;
    SocialNetworkProfile entryPoint;

    public ProfileIteratorUsers(SocialNetworkProfile entryPoint){
        this.entryPoint = entryPoint;
        visited = new Stack<>();
        toVisit = new ArrayDeque<>();
    }

    @Override
    public UserProfile getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return !toVisit.isEmpty();
    }
}
