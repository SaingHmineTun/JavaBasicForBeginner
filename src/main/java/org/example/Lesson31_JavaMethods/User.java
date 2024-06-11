package org.example.Lesson31_JavaMethods;

/*
4 Rules for creating method in java
1. Return Type
2. Method Name
3. Method Parameter
4. Method Body
 */
public class User {
    String email;
    int password;

    void printInfo() {
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
    }

}
