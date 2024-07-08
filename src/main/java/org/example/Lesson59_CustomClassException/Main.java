package org.example.Lesson59_CustomClassException;

public class Main {
    public static void main(String[] args) throws EmptyNameException {
        String name = "";
        if (name.isBlank()) throw new EmptyNameException("Name must not be empty!");
    }
}
