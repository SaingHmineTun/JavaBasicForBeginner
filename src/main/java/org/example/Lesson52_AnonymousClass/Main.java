package org.example.Lesson52_AnonymousClass;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Anonymous - Woof Woof");
            }
        };

        speak(dog);
    }


    public static void speak(Animal animal) {
        animal.makeSound();
    }

}
