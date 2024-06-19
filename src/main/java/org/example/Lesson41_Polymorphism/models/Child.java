package org.example.Lesson41_Polymorphism.models;

public class Child extends Parent {

    public void multiplyDeposit(int times, double amount) {
        income += (amount * times);
    }

    public void printIncome() {
        System.out.println("Child income - " + income);
    }
}
