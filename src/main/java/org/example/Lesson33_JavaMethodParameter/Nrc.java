package org.example.Lesson33_JavaMethodParameter;

public class Nrc {
    String name;
    int age;
    boolean male;

    void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        } else {
            this.age = age;
        }
    }

    void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Invalid Name");
        } else {
            this.name = name;
        }
    }

    void setMale(boolean male) {
        this.male = male;
    }

    void printInfo() {
        System.out.printf("Hello %s, you're %d years old and your gender is %s%n", name, age, male ? "Male" : "Female");
    }

    void setData(String name, int age, boolean male) {
        setName(name);
        setAge(age);
        setMale(male);
    }

}
