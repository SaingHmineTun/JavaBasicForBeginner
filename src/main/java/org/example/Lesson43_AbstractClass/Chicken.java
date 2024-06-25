package org.example.Lesson43_AbstractClass;

public class Chicken extends Animal{
    @Override
    void makeSound() {
        System.out.println("Kee Kee");
    }

    @Override
    void move() {
        System.out.println("Move with 2 legs");
    }
}
