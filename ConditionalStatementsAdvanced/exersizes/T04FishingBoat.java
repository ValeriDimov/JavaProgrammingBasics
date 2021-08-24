package ConditionalStatementsAdvanced.exersizes;

import java.util.Scanner;

public class T04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Цената за наем на кораба през пролетта е  3000 лв.
        //•	Цената за наем на кораба през лятото и есента е  4200 лв.
        //•	Цената за наем на кораба през зимата е  2600 лв.

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishers = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (season) {
            case "Spring":
                if (numberFishers <= 6) {
                    price = 3000 - (3000 * 0.1);
                } else if (numberFishers <= 11) {
                    price = 3000 - (3000 * 0.15);
                } else {
                    price = 3000 - (3000 * 0.25);
                }
                break;
            case "Summer":
            case "Autumn":
                if (numberFishers <= 6) {
                    price = 4200 - (4200 * 0.1);
                } else if (numberFishers <= 11) {
                    price = 4200 - (4200 * 0.15);
                } else {
                    price = 4200 - (4200 * 0.25);
                }
                break;
            case "Winter":
                if (numberFishers <= 6) {
                    price = 2600 - (2600 * 0.1);
                } else if (numberFishers <= 11) {
                    price = 2600 - (2600 * 0.15);
                } else {
                    price = 2600 - (2600 * 0.25);
                }
                break;
        }
        if (!"Autumn".equals(season) && numberFishers % 2 == 0) {
            price *= 0.95;
            if (budget >= price) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        } else {
            if (budget >= price) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }

        }
    }
}
