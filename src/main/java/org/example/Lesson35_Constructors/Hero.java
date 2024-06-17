package org.example.Lesson35_Constructors;

public class Hero {
    String name; // global variable
    String description;

    Hero(String name, String description) {
        setName(name);
        setDescription(description);
    }

    void setName(String name) {
        if (!name.isBlank()) this.name = name;
    }

    void setDescription(String description) {
        if (!description.isBlank()) this.description = description;
    }


}
