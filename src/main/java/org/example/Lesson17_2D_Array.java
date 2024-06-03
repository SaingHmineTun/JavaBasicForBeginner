package org.example;

public class Lesson17_2D_Array {
    public static void main(String[] args) {
        String[][] table = {
                {"ka", "kha", "ga", "ga", "nga"},
                {"Sa", "Sa", "Za", "Za", "Nya"},
                {"Ta", "Hta", "Da", "Da", "Na"},
                {"Pa", "Pha", "Ba", "Ba", "Ma"},
                {"Ya", "Ra", "La", "Wa", "Tha"},
                {"Ha", "La", "A"}
        };
        // Accessing array value
        String ka = table[3][1];
        System.out.println(ka);
    }
}
