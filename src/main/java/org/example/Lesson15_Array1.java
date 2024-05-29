package org.example;

public class Lesson15_Array1 {
    public static void main(String[] args) {
        int[] prices = {0, 0, 3456};
        prices[0] = 100;
        System.out.printf("Length of my array - %d%n", prices.length);
        System.out.printf("Last value in my array is %d", prices[prices.length - 1]);
    }
}
/*
Grocery List - 5 types
Enter the price of apple
500
Enter the price of orange
800
banana
500
strawberry
1500
watermelon
700


Your total expense is 3900 (3900/5)
Average item price is 770.5

 */
