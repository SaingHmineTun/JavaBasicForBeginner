package org.example.Lesson37_AccessModifiers;

public class User {
    // Can only access in this class
    private String name;
    // Can access anywhere
    public String email;
    // Can access in the same package
    String password;

    private void setName(String name) {
        this.name = name;
    }
}
