package org.example.Lesson39_Inheritance;

public class Parent {
    protected double income = 100_000;

    public double getIncome() {
        return income;
    }

    public void expense(double amount) {
        income -= amount;
    }

    public void deposit(double amount) {
        income += amount;
    }

    public void showMyIncome() {
        System.out.printf("Parent income is %.2f%n", income);
    }
}
