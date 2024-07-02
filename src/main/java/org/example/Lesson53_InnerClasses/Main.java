package org.example.Lesson53_InnerClasses;

public class Main implements Animal {
    public String name;

    public static void main(String[] args) {

        Main main = new Main();
        main.init();
    }


    public void init() {
        // 1. Class and Object
        Cat cat = new Cat();
        speak(cat);


        // 2. Normal inner class
        Dog dog = new Dog();
        speak(dog);


        // 3. Static inner class
        Chicken chicken = new Chicken();
        speak(chicken);

        // 4. Method Local Inner Class
        class Fish implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Method Local Inner Class");
            }
        }
        speak(new Fish());

        // 5. Anonymous Inner Class
        Animal mouse = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Anonymous Class");
            }
        };
        speak(mouse);

        // 6. Current this object
        speak(this);


    }

    @Override
    public void makeSound() {
        System.out.println("This class");
    }

    static class Chicken implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Static Inner class");
        }
    }


    class Dog implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Normal Inner Class");
        }
    }


    public static void speak(Animal animal) {
        animal.makeSound();
    }

}
