package org.example.Lesson48_Record;


import org.example.Lesson48_Record.after.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sai", 18);
        User user2 = new User("Sai", 18);
        System.out.println("Name - " + user1.name());
        boolean isSameUser = user1.equals(user2);
        System.out.println(user1);
        System.out.println(isSameUser);
    }
}
