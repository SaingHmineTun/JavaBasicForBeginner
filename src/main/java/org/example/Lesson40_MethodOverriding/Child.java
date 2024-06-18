package org.example.Lesson40_MethodOverriding;

public class Child extends Parent {
    public void showMyIncome() {
        System.out.printf("Child income is %.2f%n", income);
    }

    public void showInfo() {
        showMyIncome();
    }
}
