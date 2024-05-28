package org.example;

public class Lesson14_StringClass {
    public static void main(String[] args) {
        String name = "Hello Muse";
        String user = new String("Sai");
        String lower = name.toUpperCase();

        boolean isEmpty = name.isEmpty();
        boolean isBlank = name.isBlank();


        boolean isEqual = name.equals(user);
        boolean startsWith = name.startsWith("Helo");
        boolean endsWith = name.endsWith("se");
        boolean contains = name.contains("lo");
        System.out.println(contains);
    }
}
