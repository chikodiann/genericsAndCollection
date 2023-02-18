package org.example.setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
    //set is used to eliminate multiple identical entries in a code base
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("08134378725");
        numbers.add("08060074418");
        numbers.add("08134378725");
        numbers.add("08037462576");
        numbers.add("07086861616");
        numbers.add("08134378725");
        numbers.add("08060074418");

        Set<String> uniqueNumbers = new HashSet<>(numbers);

        for (String number: uniqueNumbers) {
            System.out.println(number);
        }
    }
}
