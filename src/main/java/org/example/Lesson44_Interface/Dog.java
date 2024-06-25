package org.example.Lesson44_Interface;

public class Dog implements LandAnimal {
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void run() {
        System.out.println("With 4 legs");
    }
}
