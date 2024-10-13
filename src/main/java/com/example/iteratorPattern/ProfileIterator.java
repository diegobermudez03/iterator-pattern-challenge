package com.example.iteratorPattern;

import com.example.entities.UserProfile;

public interface ProfileIterator {
    UserProfile getNext();
    boolean hasNext();
}
