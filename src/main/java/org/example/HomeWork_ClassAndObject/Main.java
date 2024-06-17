package org.example.HomeWork_ClassAndObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Hero("Ironman", "Man with iron"),
                new Hero("Batman", "Man likes bat"),
                new Hero("Hulk", "Strong man"),
                new Hero("Spiderman", "Spider man")
        };

        boolean loop = true;
        while (loop) {


            String description = """
                    1. View all heroes
                    2. Update hero name
                    3. Update hero description
                    4. Update hero info
                    5. Exit
                    """;
            System.out.println(description);
            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();
            switch (selection) {
                case 1 -> {
                    int index = 0;
                    for (Hero hero : heroes) {
                        System.out.printf("(%d) HERO NAME : %s%nHERO DESC : %s%n",index, hero.getName(), hero.getDescription());
                        index ++;
                    }
                }
                case 2 -> {
                    System.out.println("Please select hero index you want to update its name");
                    Scanner sc2 = new Scanner(System.in);
                    int heroIndex = Integer.parseInt(sc2.nextLine());
                    System.out.println("Please enter your new name");
                    String heroName = sc2.nextLine();
                    heroes[heroIndex].setName(heroName);
                    System.out.println("Update success!");
                }
                case 3 -> {
                    System.out.println("Please select hero index you want to update its description");
                    Scanner sc2 = new Scanner(System.in);
                    int heroIndex = Integer.parseInt(sc2.nextLine());
                    System.out.println("Please enter your new description");
                    String heroDescription = sc2.nextLine();
                    heroes[heroIndex].setDescription(heroDescription);
                    System.out.println("Update success!");
                }
                case 4 -> {
                    System.out.println("Please select hero index you want to update its name and description");

                    Scanner sc2 = new Scanner(System.in);
                    int heroIndex = Integer.parseInt(sc2.nextLine());

                    System.out.println("Please enter your new name");
                    String heroName = sc2.nextLine();

                    System.out.println("Please enter your new description");
                    String heroDescription = sc2.nextLine();


                    heroes[heroIndex].setName(heroName);
                    heroes[heroIndex].setDescription(heroDescription);
                    System.out.println("Update success!");

                }
                case 5 -> {
                    loop = false;
                }
            }
        }

    }
}
