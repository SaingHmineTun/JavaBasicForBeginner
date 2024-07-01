package org.example.Lesson50_StaticInnerClass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().setAge(18).setName("Sai Mao").create();
        System.out.println(person);
    }
}
