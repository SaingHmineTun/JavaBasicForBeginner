package org.example.Lesson41_Polymorphism;

import org.example.Lesson41_Polymorphism.models.Child;
import org.example.Lesson41_Polymorphism.models.Daughter;
import org.example.Lesson41_Polymorphism.models.Parent;

public class Main {
    public static void main(String[] args) {
        printIncome(new Child());
    }
    public static void printIncome(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent; // Downcast
            child.multiplyDeposit(2, 1000);
        } else {
            Daughter daughter = (Daughter) parent;
            daughter.expenseAll();
        }

        parent.printIncome();
    }
}
