package org.example.Lesson65_GenericClass;

public class Main {
    public static void main(String[] args) {
        // Double type
        var user1 = new User3();
        user1.password = 1.5;

        // Parameterized type
        User<String, Integer> user = new User<>();
        user.password = "Sai Sai";
        user.bankNumber = 1234;
    }
}
