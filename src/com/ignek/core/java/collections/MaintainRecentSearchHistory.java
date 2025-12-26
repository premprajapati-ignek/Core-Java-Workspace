package com.ignek.core.java.collections;

import java.util.LinkedList;

public class MaintainRecentSearchHistory {
    public static void addToHistory(String query, LinkedList<String> recentSearchHistory){
        recentSearchHistory.add(query);
    }

    public static void removeToHistory(String query, LinkedList<String> recentSearchHistory){
        recentSearchHistory.remove(query);
    }

    public static void main(String[] args) {
        LinkedList<String> recentSearchHistory = new LinkedList<>();
        addToHistory("Core java", recentSearchHistory);
        addToHistory("Data structure", recentSearchHistory);
        addToHistory("w3 schools", recentSearchHistory);
        addToHistory("Geeks for geeks", recentSearchHistory);
        System.out.println(recentSearchHistory);

        removeToHistory("Geeks for geeks", recentSearchHistory);
        System.out.println(recentSearchHistory);
    }
}
