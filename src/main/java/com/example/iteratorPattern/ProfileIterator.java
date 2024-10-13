package com.example.iteratorPattern;

import com.example.entities.SocialNetworkProfile;
import com.example.entities.UserProfile;

public interface ProfileIterator {
    SocialNetworkProfile getNext();
    boolean hasNext();
}
