package org.example.Lesson43_AbstractClass;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Chicken();
        makeSound(dog);
    }

    static void makeSound(Animal animal) {
        animal.makeSound();
    }

}
