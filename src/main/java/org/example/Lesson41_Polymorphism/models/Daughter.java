package org.example.Lesson41_Polymorphism.models;

public class Daughter extends Parent {

    public void expenseAll() {
        income -= income;
    }

    @Override
    public void printIncome() {
        System.out.println("Daughter income - " + income);
    }
}
