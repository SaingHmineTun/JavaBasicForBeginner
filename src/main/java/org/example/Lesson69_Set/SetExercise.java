package org.example.Lesson69_Set;

import java.util.*;

public class SetExercise {
    public static void main(String[] args) {

        Set<String> footballers = new TreeSet<>();

        // Add element to Set
        footballers.add("Cristiano Ronaldo");
        footballers.add("Lionel Messi");
        footballers.add("Cesc Fabregas");
        footballers.add("Olivier Giroud");
        footballers.add("Lamine Yamal");
        footballers.add("Bukayo Saka");
        footballers.add("Jack Wilshire");

        // Remove element from Set
//        footballers.remove("Jack Wilshire");

//        Iterator<String> it = footballers.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        List<String> youngerGen = new ArrayList<>();
        youngerGen.add("Bukayo Saka");
        youngerGen.add("Lamine Yamal");
        youngerGen.add("Gabrial Martinelli");
        youngerGen.add("Cole Palmer");

        // Union (addAll)
        footballers.addAll(youngerGen);
        for (String footballer : footballers) {
            System.out.println(footballer);
        }

        // Intersection (retainAll)
        footballers.addAll(youngerGen);
        for (String footballer : footballers) {
            System.out.println(footballer);
        }

        // Difference (removeAll)
        footballers.removeAll(youngerGen);
        for (String footballer : footballers) {
            System.out.println(footballer);
        }
    }
}
