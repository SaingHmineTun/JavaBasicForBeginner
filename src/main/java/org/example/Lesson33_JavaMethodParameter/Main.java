package org.example.Lesson33_JavaMethodParameter;

public class Main {
    public static void main(String[] args) {
        Nrc nrc = new Nrc();
        nrc.setAge(28);
        nrc.setName("Ying Ying");
        nrc.setMale(false);
        nrc.printInfo();
        System.out.println("#############################");

        Nrc nrc2 = new Nrc();
        nrc2.setData("Sai Sai", 23, true);
        nrc2.printInfo();

    }
}
