package org.example.Lesson68_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise {
    public static void main(String[] args) {
        Map<String, String> captains = new TreeMap<>();

        // Add element into map
        captains.put("portugal", "cristiano ronaldo");
        captains.put("argentina", "leonel messi");
        captains.put("england", "harry kane");
        captains.put("spain", "alvaro morata");
        captains.put("french", "kylian mbappe");

        System.out.println(captains.size());

        // Retrieve value from map
        String captainOfPortugal = captains.get("portugal");
        System.out.println(captainOfPortugal);

        // Update element in map
        captains.replace("french", "olivia giroud");
        System.out.println(captains.get("french"));

        // Delete element from map
        captains.remove("spain", "morata");

        System.out.println("#######################");
        for (String key : captains.keySet()) {
            System.out.println(key);
        }

        System.out.println("#####################");
        for (String value : captains.values()) {
            System.out.println(value);
        }

        System.out.println("#####################");
        for (Map.Entry<String, String> entry : captains.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
