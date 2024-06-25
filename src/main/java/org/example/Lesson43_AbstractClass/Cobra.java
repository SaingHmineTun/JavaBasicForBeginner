package org.example.Lesson43_AbstractClass;

public class Cobra extends Animal {
    @Override
    void makeSound() {
        System.out.println("Shh Shh");
    }

    @Override
    void move() {
        System.out.println("Crawling...");
    }
}
