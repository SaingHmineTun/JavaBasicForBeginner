package org.example.Lesson51_MethodLocalInnerClass;

import org.example.Lesson43_AbstractClass.Chicken;

public class Main {
    public static void main(String[] args) {

        class Chicken implements Animal {
            @Override
            public void makeSound() {
                System.out.println("KeKeKe");
            }
        }
        speak(new Chicken());

    }

    public static void speak(Animal animal) {
        animal.makeSound();
    }

}
