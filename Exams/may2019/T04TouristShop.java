package Exams.may2019;

import java.util.Scanner;

public class T04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int clothesCount = 0;
        double totalSpent = 0.0;
        boolean isBudgetNotEnough = false;
        int everyThirdDay = 0;

        while (!input.equals("Stop")) {
            String clothes = input;
            double price = Double.parseDouble(scanner.nextLine());
            clothesCount++;
            if (clothesCount % 3 == 0) {
                price = price / 2;
            }
            totalSpent += price;
            budget -= price;


            if (budget < 0) {
                isBudgetNotEnough = true;
                break;

            }

            input = scanner.nextLine();
        }
        if (isBudgetNotEnough) {
            System.out.printf("You don't have enough money!%n");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", clothesCount, totalSpent);
        }
    }
}
