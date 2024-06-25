package org.example.Lesson44_Interface;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        makeSound(frog);
        swim(frog);
        run(frog);
    }

    private static void makeSound(Animal animal) {
        animal.makeSound();
    }

    private static void swim(AquaticAnimal animal) {
        animal.makeSound();
        animal.swim();
    }

    private static void run(LandAnimal animal) {
        animal.makeSound();
        animal.run();
    }

}
