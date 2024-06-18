package org.example.Lesson39_Inheritance;
/*
Public or Protected members in parent is visible to its children
But no method in child is visible to the parent
 */
public class Child1 extends Parent {

    public void doubleExpense(double amount) {
        expense(amount);
        expense(amount);
    }

    public void doubleDeposit(double amount) {
        income += amount * 2;
    }
}
