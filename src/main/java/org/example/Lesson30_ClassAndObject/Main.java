package org.example.Lesson30_ClassAndObject;

/*
Class is a blueprint for creating objects!
 */
public class Main {
    public static void main(String[] args) {

        Person person2 = new Person();
        person2.id = 50;
        person2.name = "Sai Sai";
        System.out.printf("ID - %d%n", person2.id);
        System.out.println(person2.name);

        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.id);

        System.out.println(person2);

    }
}
