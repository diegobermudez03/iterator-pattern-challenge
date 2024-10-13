package com.example.iteratorPattern;

import com.example.entities.SocialNetworkProfile;
import com.example.entities.UserProfile;

import java.util.*;

public class ProfileIteratorUsers implements ProfileIterator{

    private Set<SocialNetworkProfile> visited;
    private ArrayDeque<SocialNetworkProfile> toVisit;

    public ProfileIteratorUsers(SocialNetworkProfile entryPoint){
        visited = new HashSet<>();
        toVisit = new ArrayDeque<>();
        addToVisit(entryPoint);
    }

    private void addToVisit(SocialNetworkProfile profile){
        if(profile instanceof UserProfile user){
            user.getFollowing().stream()
                    .filter((follower)->!visited.contains(follower))
                    .filter((follower)-> !toVisit.contains(follower))
                    .filter((follower)->follower instanceof UserProfile)
                    .forEach((follower)->toVisit.add(follower));
        }
    }

    @Override
    public SocialNetworkProfile getNext() {
        if(toVisit.isEmpty()) return null;

        final var next = toVisit.pollFirst();
        addToVisit(next);
        visited.add(next);
        return next;
    }

    @Override
    public boolean hasNext() {
        return !toVisit.isEmpty();
    }
}
