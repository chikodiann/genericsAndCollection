package org.example.collectionsExample;

import java.util.LinkedList;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List<String> listOfItems = new LinkedList<>();

        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        for (String name: listOfItems) {
            System.out.println(name);
        }
    }
}
