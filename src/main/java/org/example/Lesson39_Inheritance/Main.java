package org.example.Lesson39_Inheritance;

public class Main {
    public static void main(String[] args) {
        Child1 mgmg = new Child1();
        mgmg.doubleDeposit(50_000);
        mgmg.showMyIncome();

        Child2 kyaw = new Child2();
        kyaw.expense(90_000);
        kyaw.showMyIncome();

    }
}
