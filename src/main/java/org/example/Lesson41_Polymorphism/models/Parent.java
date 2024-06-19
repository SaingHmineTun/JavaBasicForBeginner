package org.example.Lesson41_Polymorphism.models;

public class Parent {
    protected double income = 1000;
    public void expense(double amount) {
        income -= amount;
    }
    public void deposit(double amount) {
        income += amount;
    }

    public void printIncome() {
        System.out.println("Parent income - " + income);
    }

}
