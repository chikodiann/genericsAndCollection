package org.example.mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<>();
        Person ann = new Person("Ann", "ann@gmial.com");
        Person steve = new Person("Steve","steve@gmail.com");
        Person john = new Person("John", "john@gmial.com");
        Person phil = new Person("Phil", "phil@gmial.com");
        Person louis = new Person("Louis", "louis@gmial.com");


        ArrayList<Person> people = new ArrayList<>();
         people.add(ann);
         people.add(steve);
         people.add(john);
         people.add(phil);
         people.add(louis);

        for (Person person: people) {
            MapExercise.addToMap(mapOfPeople, person);
        }
        for (String email: mapOfPeople.keySet()) {
            System.out.println(email);
        }
        for (Person person: mapOfPeople.values()) {
            System.out.println(person);
        }


        System.out.println("Get Ann: " + mapOfPeople.get("ann@gmial.com"));
        System.out.println("Get Steve " + mapOfPeople.get("steve@gmial.com"));
        System.out.println("Contains Ann " + mapOfPeople.containsKey("ann@gmial.com"));
        System.out.println("Contains Steve " + mapOfPeople.containsKey("steve@gmial.com"));
    }

    private static void addToMap(Map<String, Person> map, Person person) {
        map.put(person.getEmail(), person);
    }

}
