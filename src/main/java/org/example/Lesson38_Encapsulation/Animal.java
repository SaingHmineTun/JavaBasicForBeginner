package org.example.Lesson38_Encapsulation;

public class Animal {
    private String name;

    // Read-only access
    public String getName() {
        if (name == null) return "";
        return name;
    }

    // Write-only access
    public void setName(String name) {
        if (!name.isBlank())
            this.name = name;
    }

}
