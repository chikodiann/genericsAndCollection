package org.example.collectionsExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sally");
        names.add("Peter");
        names.add("Tim");
        names.add("Ann");
        names.add("Steve");

        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("***************************************");
        Collections.sort(names);

        for (String name: names) {
            System.out.println(name);
        }

    }
}
