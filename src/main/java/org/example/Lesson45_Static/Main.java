package org.example.Lesson45_Static;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    private void init() {
        var sai = new User("Sai", 18);
        System.out.println(sai.getName());
        User.setNumber(5);
        System.out.println(sai.getNumber());

        var nan = new User("Nan", 22);
        System.out.println(nan.getName());
        System.out.println(nan.getNumber());

        int max = Math.max(0, 10);

    }
}
