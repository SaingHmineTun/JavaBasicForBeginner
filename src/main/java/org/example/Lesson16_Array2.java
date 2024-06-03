package org.example;

public class Lesson16_Array2 {
    public static void main(String[] args) {
        // String to String[]
        String introduction = "How are you?";
        String[] strings = introduction.split("");
        System.out.println(strings[0] + " : " + strings[4]);
    }
}
