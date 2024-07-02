package org.example.Lesson54_Enumeration;

public enum Priority {
    // public static final
    HIGH("High"), MEDIUM("Medium"), LOW("Low");

    Priority(String name) {
        this.name = name;
    }

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
