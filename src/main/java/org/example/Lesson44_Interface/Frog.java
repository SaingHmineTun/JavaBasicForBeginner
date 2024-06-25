package org.example.Lesson44_Interface;

import java.io.Serializable;

public class Frog implements AquaticAnimal, LandAnimal{
    @Override
    public void makeSound() {
        System.out.println("O ap");
    }

    @Override
    public void swim() {
        System.out.println("Swim with legs");
    }

    @Override
    public void run() {
        System.out.println("Jump with legs");
    }
}
